package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(12,-44,19,21,-55,77);
		
		List<Integer> r = n.stream().filter(e->e<0).collect(Collectors.toList());
		System.out.println(r);
		
		List<Integer> re = n.stream().filter(e->e>0).collect(Collectors.toList());
		System.out.println("\n"+re);
		
		List<Object> list = Arrays.asList(true, 100, "hello", 200, false, "welcome", 300, true, false);
		
		List<Integer> res=list.stream().filter(e-> e instanceof Integer).map(e-> (Integer)e).collect(Collectors.toList());
		System.out.println("\n"+res);
		
		List<Object> resu=list.stream().filter(e-> e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
		System.out.println("\n"+res);
		
		list.forEach(m->{
			System.out.println("\n"+m+" - "+m.getClass().getSimpleName());
		});
		
		int totalInt = (int)list.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).count();
		System.out.println("\nTotal "+totalInt);
		
		List<String> colors = Arrays.asList("red","green","violet","blue","orange","green");
		List<String> r1= colors.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
		System.out.println("\n"+r1);
	}

}
