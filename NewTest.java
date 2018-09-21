package com.javabrains;

public class NewTest {
	
	public static void main(String[] args) {
		
		display(null);
	}

	public static void display(Object a)
	{
		System.out.println("In object");
	}
	
	public static void display(String a)
	{
		System.out.println("In string");
	}
	
	/*public static void display(Employee a)
	{
		System.out.println("In employee");
	}*/

}
