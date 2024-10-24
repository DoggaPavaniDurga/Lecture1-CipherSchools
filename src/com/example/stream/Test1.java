package com.example.stream;

import java.util.Arrays;
import java.util.List;


public class Test1 {
	public static void main(String[] args) {
		Program obj = new Program();
		obj.doAction();
		
	}

}

class Program{
	void doAction() {
		List<Integer> num=Arrays.asList(5,-2,6,-7,3,8,-1);
		num.forEach(Program::Coverter);
	}
	
	static void Coverter(int arg) {
		System.out.println(Math.abs(arg));
	}
}