package com.assignments;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
 
        
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
 
        scanner.close();
    }
 
  
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
