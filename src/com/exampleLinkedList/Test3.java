package com.exampleLinkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add("Orange");
		s.add("red");
		s.add("Orange");
		s.add("Blue");
		s.add("green");
		System.out.println(s);
		
		LinkedHashSet sh=new LinkedHashSet();
		sh.add("Orange");
		sh.add("red");
		sh.add("Orange");
		sh.add("Blue");
		sh.add("green");
		System.out.println(sh);
		
		TreeSet ts=new TreeSet();
		ts.add("Orange");
		ts.add("Red");
		ts.add("Orange");
		ts.add("Blue");
		ts.add("Green");
		System.out.println(ts);
	}

}
