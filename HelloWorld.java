package com.javabrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) {

		/*HashMap<Character,Integer> map= new HashMap<>();
		map.put('v',2);
		map.put('i',1);
		map.put('e',3);
		map.put('k',1);
		int min=0;
		char ch='a';
		for(Character ks:map.keySet())
		{
			if(map.get(ks)>min)
			{
				min=map.get(ks);
				ch=ks;
			}
		}
		System.out.println(ch);*/
		/*List s=new ArrayList<>();
		String str="Yash";
		String k=str+"6";
		System.out.println(str);*/
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

	
}
