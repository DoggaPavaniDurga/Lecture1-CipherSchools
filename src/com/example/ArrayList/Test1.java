package com.example.ArrayList;

import java.util.Iterator;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("texas");
		v.add("pavani");
		v.add("newyork");
		
		Iterator p=v.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		System.out.println(v);
	}

}
