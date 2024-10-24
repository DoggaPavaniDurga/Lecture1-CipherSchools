package com.example.stream;

import java.util.ArrayList;

public class Test0 {
	
	public static void change(String m ) {
		System.out.println(m);
	}
	public static void main(String[] args) {
		ArrayList<String> lang= new ArrayList<>();
		lang.add("Java");
		lang.add("C#");
		lang.add("Python");
		lang.add("PHP");
		//stream
		lang.forEach(Test0::change);
		//enchaced for loop
		for(String t :lang) {
			change(t);
		}
		
		
		change(lang.get(0));
		change(lang.get(1));
		change(lang.get(2));
		change(lang.get(3));
	}

}
