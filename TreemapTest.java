package com.javabrains;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreemapTest {

	public static void main(String[] args) {

		Customer c1=new Customer(1,"Vivek");
		Customer c2=new Customer(2,"Praanjali");
		/*TreeMap hm=new TreeMap();
		hm.put(c1,1);
		hm.put(c2, 2);
		System.out.println(hm);*/
		/*System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		c2.setName("Rohan");
		System.out.println(c2.hashCode());
		c2=new Customer(5,"Naman");
		System.out.println(c2.hashCode());
		
		hm.put(null, 3);
		hm.put(null, 4);*/
		/*System.out.println(hm.get(c1.getId()));*/
		TreeSet ts=new TreeSet();
		/*ts.add(c1);
		ts.add(c2);*/
		ts.add(1);
		System.out.println(ts);
		System.out.println(2.1);
	}
}
