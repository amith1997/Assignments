package com.assignments;

class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void start() {
        System.out.println(name + " is starting.");
    }
}


class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " (Bus) is starting.");
    }
}


class Train extends Vehicle {
    Train(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " (Train) is starting.");
    }
}


class Jeep extends Vehicle {
    Jeep(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " (Jeep) is starting.");
    }
}

public class AbstratcVehicle {

    public static void main(String[] args) {
        
        Vehicle[] vehicles = new Vehicle[3];

       
        vehicles[0] = new Bus("Ashoke ");
        vehicles[1] = new Train("Chennai express");
        vehicles[2] = new Jeep("Thar");
        
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
