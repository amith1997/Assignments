package com.assignments;

public class arrayPrice {

public static void main(String[] args) {
		
		int[] petrolPrices = {102, 104, 101, 105, 103, 106};
 
        int sum = 0;
        
       
        for (int i = 0; i < petrolPrices.length; i++) {
            sum += petrolPrices[i];
        }
 
       
        int averagePrice = sum / petrolPrices.length;
 
        
        System.out.printf("The average petrol price in the 6 metro cities is: ", averagePrice);
    }

}
