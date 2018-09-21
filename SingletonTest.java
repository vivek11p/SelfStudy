package com.javabrains;

public class SingletonTest {

	public static void main(String[] args) {

		Singleton s=Singleton.getInstance();
		System.out.println(s.getId());
	}

}
