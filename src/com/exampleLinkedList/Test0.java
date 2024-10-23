package com.exampleLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Test0 {
	public static void main(String[] args) {

		LinkedList myList=new LinkedList();
		myList.add("Ironman");
		myList.add("Loki");
		myList.add("Hulk");
		myList.add("Thor");
		//System.out.println(myList.get(1));
		myList.addLast("CaptainAmerica");
		myList.addFirst("AntMan");
		
		myList.add(2, "Natasha");
		Iterator t = myList.iterator();
		// t.remove();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		System.out.println("\n top "+myList.peek());
		System.out.println("first "+myList.poll());
		System.out.println("standing at last "+myList.pop());
		

		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
