package com.exampleLinkedList;

import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push("ironman");
		list.push("hulk");
		list.push("thanos");
		System.out.println(list.poll());
	}
}
