package com.exampleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
	public static void main(String[] args) {
		HashMap<String, String> states= new HashMap<String, String>();
		
		//put()
		states.put("D", "Durga");
		states.put("L", "Lucky");
		states.put("A", "Apple");
		states.put("B", "Ball");
		
		System.out.println(states);
		
		for(Map.Entry<String, String> e : states.entrySet()) {
			System.out.println(e.getKey()+" - "+e.getValue());
		}
	}
}
