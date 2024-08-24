package com.assignments;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

class City {
    private String name;
    private long pincode;
    private String state;

    // Constructor
    public City(String name, long pincode, String state) {
        this.name = name;
        this.pincode = pincode;
        this.state = state;
    }

    // toString method
    @Override
    public String toString() {
        return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
    }
    



public class CityObject {
    public static void main(String[] args) {
        // Create List
        List<City> cities = new ArrayList<City>();
        Scanner scnr = new Scanner(System.in);

        // Ask user how many cities they want to input
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

        // 1. Add a City object at a specific position
        System.out.println("add a city at a specific position? (yes/no)");
        String addCity = scnr.next();

        if (addCity.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the position (index)to add the city:");
            int position = scnr.nextInt();

            System.out.println("enter the details city to add:");

            System.out.println("Please enter city name:");
            String newCityName = scnr.next();

            System.out.println("Please enter pincode:");
            long newPincode = scnr.nextLong();

            System.out.println("Please enter State name:");
            String newState = scnr.next();

            // Add the new City object at the specified position
            if (position >= 0 && position <= cities.size()) {
                cities.add(position, new City(newCityName, newPincode, newState));
            } else {
                System.out.println("Invalid position");
            }
        }

        // 2. Remove a City object
        System.out.println("remove a city from the list? (yes/no)");
        String removeCity = scnr.next();

        if (removeCity.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the position (index) of the city you want to remove:");
            int removePosition = scnr.nextInt();

            if (removePosition >= 0 && removePosition < cities.size()) {
                cities.remove(removePosition);
            } else {
                System.out.println("Invalid position. No city removed.");
            }
        }

        // Display the final list of cities
        System.out.println("Final list of cities:");

        // 1. Iterate and display using an enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (City city : cities) {
            System.out.println(city);
        }

        // 2. Iterate and display using a normal for loop without iterator
        System.out.println("Using normal for loop:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        scnr.close(); // Close the scanner to prevent resource leak
    }
}
}

