package com.assignments;

abstract class Animal{
	String animalname;
	abstract void move ();
	public Animal(String animalname)
	{
		this.animalname=animalname;
	}
	void eat() {
		
	}
	public void displaye() {
		System.out.println("Animal name"+animalname);
		}
}
// Concrete class

class Snake extends Animal {
	public Snake(String animalname) {
		super(animalname);
		// TODO Auto-generated constructor stub
	}
	@Override
	void move() {
		System.out.println("Crawling...");
	}
	}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj =new Snake("Snake");
		 obj.move();
		 obj.displaye();
	}

}