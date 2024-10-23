package com.exampleLinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(int i=0;i<5;i++) {
		int s = sc.nextInt();
			m.put(s,s>45?"Pass":"Fail" );
		}
		System.out.println(m);
		sc.close();
	}

}
