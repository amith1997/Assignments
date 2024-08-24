package com.assignments;

class Product{
	final int id = 1; //Final Variable as Data Members
	String name;
	
	void display() {
		
		System.out.println("Product.display()");
	}
}

class electronicproduct extends Product{
	float voltage;
	void display() {
		final int localVar = 5; //Final Variable as Local Variables
		System.out.println("electronicproduct.display() " + localVar);
		}
}


public class OverridingEgFinal {

	public static void main(String[] args) {
		final Product obj = new electronicproduct(); //object be declared as final
		obj.display();//display of derived  method overriding dynamic polymorphism
		
		// obj = new Product();
		// obj.display();//display base
		

	}

}
