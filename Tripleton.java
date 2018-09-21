package com.javabrains;

public class Tripleton {

	private int id;
	private String name;
	public static int count=0;
	
	public Tripleton(int id, String name) throws Throwable{
		super();
		count++;
		if(count>3)
			throw new CustomException("Only 3 objects can be created");
		this.id = id;
		this.name = name;
	}
	
	public Tripleton() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void display()
	{
		System.out.println("Hi in Tripleton");
	}
	
}
