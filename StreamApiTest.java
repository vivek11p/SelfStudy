package com.javabrains;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest {

	public static void main(String[] args) {

		List<String> items=new ArrayList<>();
		items.add("vivek");
		items.add("praanjali");
		items.add("jagrati");
		items.add("saransh");
		String prefix="j";
		List<String> filteredList = items.stream().filter(e -> (!e.startsWith(prefix))).collect(Collectors.toList());
		System.out.println(filteredList);
		Hashtable h=new Hashtable();
		h.put(null,null);
		System.out.println(h.get("str"));
	}

}
