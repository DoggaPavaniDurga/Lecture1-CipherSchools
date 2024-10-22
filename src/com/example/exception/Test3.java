package com.example.exception;

public class Test3 {
	
	int getNextNo(int n) {
		try {
		if(n==5) {
			return  n+1;
		}
	}
		finally {
		System.out.println("Important Code");
		}
		return n-1;
	}
	public static void main(String[] args) {
		Test3 t3=new Test3();
		System.out.println(t3.getNextNo(4));
		
	}

}
