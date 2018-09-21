package com.javabrains;

public class Customer implements Comparable<Customer>{

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	
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
	@Override
	public int compareTo(Customer arg0) {
		return +1;
	}
}
