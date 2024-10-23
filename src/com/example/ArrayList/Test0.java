package com.example.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test0 {
	public static void main(String[] args) {
		ArrayList cart0 = new ArrayList();
		
		List cart1=new ArrayList();
		//non generic 
		cart0.add("Apple");
		cart0.add(50);
		cart0.add('c');
		
		//generic - type safe
		ArrayList<Integer> cart2 = new ArrayList<Integer>();
		cart2.add(50);
		cart2.add(100);
		
		ArrayList<String> states= new ArrayList<String>();
		states.add("california");
		states.add("alabama");
		states.add("Alaska");
		states.add("Arkansas");
		System.out.println("States : "+states);
		
		//Access elements using get() method
		String st = states.get(0);
		System.out.println("i got "+st);
		
		System.out.println("Size : "+states.size());
		
		for(int i=0;i<states.size();i++) {
			System.out.println(states.get(i));
		}
		
		states.set(2, "Texas");
		System.out.println("After Updation : "+states);
//		for(String s:states) {
//			System.out.println(s);
//		}
		
		
		
	}

}
