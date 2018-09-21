package com.javabrains;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List l=new ArrayList<>();
		l.add("1");
		l.add(2);
		l.add("1");
		l.add(3);
		l.add("5");
		l.add(2);
		l.add("6");
		l.add(3);
		/*List l1=new ArrayList<>();
		long startTime=System.nanoTime();
		for(int i=0;i<l.size();i++)
		{
			boolean found=false;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					found=true;
					l.remove(i);
					System.out.println("List size = "+l.size());
					System.out.println("l[0] = "+l.get(0));
					System.out.println("List = " +l);
					break;
				}
			}
			if(!found)
			l1.add(l.get(i));
		}
		long elapsedTime=System.nanoTime()-startTime;		
		System.out.println(l1);
		System.out.println("Total time = "+elapsedTime);*/
		long startTime2=System.nanoTime();
		Set s=new LinkedHashSet<>(l);
		long elapsedTime2=System.nanoTime()-startTime2;	
		System.out.println(s);
		System.out.println("Total time = "+elapsedTime2);
	}

}
