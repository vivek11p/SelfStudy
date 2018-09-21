package com.javabrains;

public class Singleton {
	
	private int id;
	private String name;
	private static Singleton ts=null;
	
	private Singleton(int id,String name)
	{
		this.id=id;
		this.name=name;
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

	public static Singleton getInstance()
	{
		if(ts==null)
		{
			ts=new Singleton(1,"vivek");
		}
		return ts;
	}

}
