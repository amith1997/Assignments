package com.p2;


public class Employee{
	int eid;
	String name;
	
	 Employee() {
		System.out.println("Employee()");
			}
	 
	 protected Employee(int id,String name) {
			this.eid=id;
			this.name=name;
				}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected void displaye()
	{
		System.out.println("Employee ID: "+eid+" Employee name:"+name);
	}
	
	
	
}

class PermEmployee extends Employee {
	
	
	float salary;
	String Hname;
	
	public PermEmployee(int id, String name, int salary, String Hname) {
		super(id,name);
		this.salary=salary;
		this.Hname= Hname;
		
	}

	



	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getHname() {
		return Hname;
	}

	public void setHname(String hname) {
		Hname = hname;
	}
	
	void display()
	{
		displaye();
		System.out.println("Employee salary:"+salary+" Employee hname:"+Hname);
	}
	
	
	
	

}


