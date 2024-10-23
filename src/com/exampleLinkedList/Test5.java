package com.exampleLinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		for(int i=0;i<5;i++) {
			String s = sc.nextLine();
			m.put(s, s.length());
		}
		System.out.println(m);
		sc.close();
	}

}
