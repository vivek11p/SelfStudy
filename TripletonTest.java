package com.javabrains;

public class TripletonTest {

	public static void main(String[] args) {

		try {
			Tripleton t1=new Tripleton(1,"vivek");
			Tripleton t2=new Tripleton(2,"rohan");
			Tripleton t3=new Tripleton(3,"praanjali");
			Tripleton t4=new Tripleton(4,"astha");
			System.out.println(t1.getId());
			System.out.println(t4.getId());
		} catch (Throwable e) {
			System.err.println(e);
		}
		System.out.println("Moving on in life");
	}

}
