package com.assignments;

import java.util.Scanner;

public class Assignements2 {

	
		 public static void main(String[] args) {
		        Scanner scn = new Scanner(System.in);
		 
		        
		        System.out.print("Enter a number to check if it is prime: ");
		        int number = scn.nextInt();
		        boolean isPrime = true;
		 
		        if (number <= 1) {
		            isPrime = false; 
		        } else if (number == 2 || number == 3) {
		            isPrime = true; 
		        } else if (number % 2 == 0 || number % 3 == 0) {
		            isPrime = false; 
		        } else {
		            for (int i = 5; i * i <= number; i += 6) {
		                if (number % i == 0 || number % (i + 2) == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }
		 
		        
		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		        
		        
		              
		     

		     		        scn.close();
		    }

	

}
