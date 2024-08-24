package com.assignments;

public class assignments {

	public static void main(String[] args) {
		int n1=0; int n2=1; int n3;
		System.out.println(n1+"\n"+n2);
		for (int i=2;i<100;i++)
		{
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
		
		
		int Multiple=0;
		
		for (int i=1;i<=10;i++)
		{
			System.out.println("Table of "+i+" is");
			for(int j=1;j<=10;j++)
			{
				Multiple = i*j;
				System.out.println(Multiple);
			}
		}

	}

}
