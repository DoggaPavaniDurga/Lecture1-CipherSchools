package com.example.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
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
		states.add("California");
		states.add("Alabama");
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
		
		//update element
		states.set(2, "Texas");
		System.out.println("After Updation : "+states);
//		for(String s:states) {
//			System.out.println(s);
//		}
		
		//remove element
		String t =states.remove(3);
		System.out.println("State Removed : "+t);
		System.out.println("ArrayList after Deletion "+states);
		
		//sort element
		states.sort(Comparator.naturalOrder());
		System.out.println("Arraylist After Sorting : "+states);
		
		// .contains() Method
		System.out.println("Is Newyork There ? "+states.contains("newyork"));
		
		System.out.println("Texas is at "+states.indexOf("Texas")+" index");
		
		//isEmpty 
		System.out.println("Is List Empty ? "+states.isEmpty());
		states.removeAll(states);
		System.out.println("Is List Empty ? "+states.isEmpty());
		
	}

}
