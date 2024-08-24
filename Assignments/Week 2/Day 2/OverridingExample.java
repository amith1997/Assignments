package p3;

class Product{
	
	void display()
	{
		
	System.out.println("Product");
	}
}

class Electric extends Product{
	void display()
	{
		
	System.out.println("Electric");
	}
}

public class OverridingExample {
	
	public static void main(String[] args) {
		
		Product obj = new Electric();
		obj.display();
		obj= new Product();
		obj.display();
	}

}
