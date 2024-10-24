package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,4,5,7,9,3,6,56,37,87);
		List<Integer> r = li.stream()
				.map(e->e*e)  //lambda expression
				.collect(Collectors.toList());
		System.out.println(r);
		
	}

}
