package com.assignments;

import java.util.Scanner;

public class Reversenumber {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	       
	        reverseAndPrintDigits(number);

	        scanner.close();
	    }

	    
	    public static void reverseAndPrintDigits(int number) {
	        System.out.println("The digits in reverse order are:");

	        
	        while (number != 0) {
	            int digit = number % 10;  
	            System.out.println(digit); 
	            number = number / 10;      
	        }
	    }

}
