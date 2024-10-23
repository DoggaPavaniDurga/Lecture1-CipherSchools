package com.exampleLinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		for(int i=1;i<=5;i++) {
			String item = sc.next();
			if(list.contains(item)) {
				continue;
			}
			list.add(item);
		}
		System.out.println(list);
	}
}
