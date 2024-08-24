package com.p2;

import p3.TemporaryEmployee;

public class MainProgram {

	public static void main(String[] args) {
		PermEmployee obj= new PermEmployee(10,"rajesh",12, "h123");
		obj.display();
		
		TemporaryEmployee obj1 = new TemporaryEmployee(13, "SAM", 432, "hp");
		obj1.display();
		
		

	}

}
