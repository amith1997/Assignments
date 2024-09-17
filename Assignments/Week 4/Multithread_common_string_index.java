package com.cmap;
class PrintOdd extends Thread {

    @Override
    public void run() {
        try {
            while (MultiThreadDemo.getIndex() < MultiThreadDemo.getString().length()) {
                System.out.println("Child Thread: " + MultiThreadDemo.getString().charAt(MultiThreadDemo.getIndex()));
                MultiThreadDemo.incrementIndex();
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadingEg {
    private static String text = "ahshididididoooooketeh";
    private static int currentIndex = 0;

    public static String getString() {
        return text;
    }

    public static int getIndex() {
        return currentIndex;
    }

    public static void incrementIndex() {
        currentIndex++;
    }

    public static void main(String[] args) {
        try {
            OddCharacterPrinter oddPrinter1 = new OddCharacterPrinter();
            OddCharacterPrinter oddPrinter2 = new OddCharacterPrinter();
            
            oddPrinter1.start();
            oddPrinter2.start();
            
            for (; currentIndex < text.length(); currentIndex++) {
                System.out.println("Parent Thread: " + text.charAt(currentIndex));
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
