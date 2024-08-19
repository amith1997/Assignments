package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int[] array = {3, 1, 4, 1, 5, 9};

	        System.out.print("Enter 'asc' to sort in ascending order or 'desc' to sort in descending order: ");
	        String sortOrder = scanner.nextLine().trim().toLowerCase();

	        boolean ascending;
	        if (sortOrder.equals("asc")) {
	            ascending = true;
	        } else if (sortOrder.equals("desc")) {
	            ascending = false;
	        } else {
	            System.out.println("Invalid input. Defaulting to ascending order.");
	            ascending = true;
	        }

	        sort(array, ascending);

	        System.out.println("Sorted array: " + Arrays.toString(array));

	        scanner.close();
	    }

	    public static void sort(int[] array, boolean ascending) {
	        if (ascending) {
	            Arrays.sort(array); 
	        } else {
	            Arrays.sort(array); 
	            reverse(array); 
	        }
	    }

	    
	    public static void reverse(int[] array) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left < right) {
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;

	            left++;
	            right--;
	        }
	    }

}
