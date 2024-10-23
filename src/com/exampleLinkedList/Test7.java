package com.exampleLinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		showNumbers(limit);
		sc.close();
	}
	
	public static void showNumbers(int  limit) {
		 Map<Integer, String> numMap = new HashMap<>();

	        for (int i = 0; i <= limit; i++) {
	            if (i % 2 == 0) {
	                numMap.put(i, "Even");
	            } else {
	                numMap.put(i, "Odd");
	            }
	        }

	        for (Map.Entry<Integer, String> entry : numMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	        
}
}
