package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class weight {
	public static void main(String[] args) {
			List<Integer> list = Arrays.asList(110, 136, 178, 142, 190);
			List<Double> kg = list.stream()
					.map(e->e*0.453592)  //lambda expression
					.collect(Collectors.toList());
			System.out.println(kg);
	}

}
