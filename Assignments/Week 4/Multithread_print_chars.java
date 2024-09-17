package com.cmap;


	

	class PrintOdd extends Thread{
		
		String strc = "uhdsuhfhfhfhiuiuekk";
		@Override
		public void run() { 
			try {
		for (int i=0;i<strc.length();i++) {
			System.out.println("Child Thread"+strc.charAt(i));	
			Thread.sleep(50);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

	public class MultiThreadingEg {
		
		public static void main(String arg[])
		{
			
			
			try {
			String str = "ahshididididoooooketeh";
			
			
			
			PrintWait printodd = new PrintWait();
			printodd.start();
		
			for (int i=0;i<str.length();i++) {
				System.out.println("Parent Thread"+str.charAt(i));	
				Thread.sleep(50);
			}
		
			
			}catch (Exception e) {
				e.printStackTrace();
		}
		}
	}


