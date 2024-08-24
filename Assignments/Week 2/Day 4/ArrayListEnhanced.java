package com.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CityClass{
	private String name;
	private long pincode;
	private String state;
	//constructor
	public CityClass(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}
	//getter, setter - TBD
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}
}


public class ArrayListEnhanced {
	   public static void main(String[] args) {
		//create List
		List<City> cities = new ArrayList<City>();
		Scanner scnr = new Scanner(System.in);
		//add City objects to List
		cities.add(new City("city1", 1234, "capital1"));
		cities.add(new City("city2", 3456, "capital2"));
		System.out.println("Please enter city name");
		String icity = scnr.next();
		System.out.println("Please enter pincode");
		long ipincode = scnr.nextLong();
		System.out.println("Please enter State name");
		String istate = scnr.next();
		cities.add(new City(icity, ipincode, istate));
		System.out.println("Iterator/n");
		
		//iterate and display
		Iterator<City> itr = cities.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Using enhanced for loop:");
	        for (City city : cities) {
	            System.out.println(city);
	        }
  // 2. Iterate and display using a normal for loop without iterator
	        System.out.println("Using normal for loop:");
	        for (int i = 0; i < cities.size(); i++) {
	            System.out.println(cities.get(i));
	        }
	}	
	}
