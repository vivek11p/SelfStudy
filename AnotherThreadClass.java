package com.javabrains;

public class AnotherThreadClass implements Runnable{

	@Override
	public void run() {

		System.out.println("In AnotherThreadClass");
	}

}
