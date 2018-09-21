package com.javabrains;

public class TripletonSubClass extends Tripleton{

	public TripletonSubClass(int id, String name) throws Throwable {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	public TripletonSubClass() {
		// TODO Auto-generated constructor stub
	}

	public static void display()
	{
		System.out.println("In subclass");
	}
	
	public static void main(String[] args) {
		
		Tripleton t=new Tripleton();
		Tripleton t1=new TripletonSubClass();
		t.display();
		t1.display();
	}
}
