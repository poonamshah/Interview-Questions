package com.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForLoop {
	
	
	public static void main(String args[]) {
		//loopoing arraylist with forloop + lamabafunction 
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
	    List<String> b = new ArrayList<>(); 
		items.forEach(item->b.add(item));
		
		b.forEach(a->System.out.println(a));
		
		items.forEach(item -> {
			if(item.equals("C")) {
				System.out.println(item);
			}
			
		});
		
		
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a", 1);
		m.put("b", 2);
		m.forEach((k,v)->System.out.println("The key is "+ k+ " & The value is "+v));
		
		m.forEach((k,v)-> {
		if("a".equals(k))	{
			System.out.println("The key is "+ k+ " & The value is "+v);
		}
			
		});
			
		
	}

}
