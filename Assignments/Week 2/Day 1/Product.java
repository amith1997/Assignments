package com.p2;

public class Product{
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
	String name;
	static int totalnum=10;
	
	public Product(int pid,String pname)
	{
		id=pid;
		name=pname; 
	}
	
	public static void gettotal()
	{
		System.out.println(totalnum);
	}
}
