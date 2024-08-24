package com.assignments;

abstract class Car {
    
    String make;
    String model;
    int year;
 
    
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
 
   
    void start() {
        System.out.println(year + " " + make + " " + model + " is starting.");
    }
 
    
    void displayDetails() {
        System.out.println("Car Details: " + year + " " + make + " " + model);
    }
}
 

class ElectricCar extends Car {
 
    
    int batteryCapacity;
 
    
    ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year); // Calls the Car constructor
        this.batteryCapacity = batteryCapacity;
    }
 
    
    void chargeBattery() {
        System.out.println("Charging the battery to " + batteryCapacity + " kWh.");
    }
}
 
public class AbstractExample {
 
    public static void main(String[] args) {
        
        ElectricCar tesla = new ElectricCar("Tesla", "Model ", 2023, 100);
        
        tesla.start();          
        tesla.displayDetails(); 
        tesla.chargeBattery();  
    }
}
