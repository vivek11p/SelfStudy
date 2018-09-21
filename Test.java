package com.javabrains;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		/*String[] a= {"App","BYy","Hello","CAt","Way"};
		ArrayList<String> al=new ArrayList<>();
		for(String x:a)
		{
			for(int i=0;i<x.length()-1;i++)
			{
				if(x.substring(i,i+1).equalsIgnoreCase(x.substring(i+1,i+2)))
				{
					al.add(x);
					break;
				}
			}
		}
		System.out.println(al);*/
		String s1="Hello";
		String s2=new String("Hello");
		String s3=s1;
		System.out.println(s3);
		s1="new"+s1;
		System.out.println(s3);
		//System.out.println(s1==s2);
		//System.out.println(s1==s3);
	}

}
