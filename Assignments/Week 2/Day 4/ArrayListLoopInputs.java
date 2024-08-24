package com.assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CityClassTwo {
    private String name;
    private long pincode;
    private String state;

    // Constructor
    public CityClassTwo(String name, long pincode, String state) {
        this.name = name;
        this.pincode = pincode;
        this.state = state;
    }

    // toString method
    @Override
    public String toString() {
        return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
    }
}



public class ArrayListLoopInputs {
    public static void main(String[] args) {
        // Create List
        List<City> cities = new ArrayList<City>();
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("How many cities do you want to enter?");
        int numberOfCities = scnr.nextInt();

     // Loop to input details of multiple cities
        for (int i = 0; i < numberOfCities; i++) {
            System.out.println("Please enter details for city " + (i + 1) + ":");

            System.out.println("Please enter city name:");
            String icity = scnr.next();

            System.out.println("Please enter pincode:");
            long ipincode = scnr.nextLong();

            System.out.println("Please enter State name:");
            String istate = scnr.next();

            // Add City object to the List
            cities.add(new City(icity, ipincode, istate));
        }

        
        System.out.println("enhanced for loop:");
        for (City city : cities) {
            System.out.println(city);
        }

        
        System.out.println("normal for loop:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        scnr.close();
    }
}
