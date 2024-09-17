package com.egjson;

import java.util.Arrays;

public class Person {
    private String name;
    
    private Address[] addresses;
	private int agee;
public Person() {}
    // Constructor
    public Person(String name, int age, Address[] addresses) {
    	super();
        this.name = name;
        this.agee = age;
        this.addresses = addresses;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return agee;
    }

    public void setAge(int age) {
        this.agee = age;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + agee + ", addresses=" + Arrays.toString(addresses) + "]";
    }
}
