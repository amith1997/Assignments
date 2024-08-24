package com.assignments;

abstract class AnimalClass{
	abstract void move ();
	void eat() {
		System.out.println("Animal.eat()");
	}
}
// Concrete class

class Snakeclass extends AnimalClass
{
	@Override
	void move() {
		System.out.println("Crawling...");
	}
	}

public class AbstractClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AnimalClass obj = new Snakeclass();
       obj.move();
	}

}
