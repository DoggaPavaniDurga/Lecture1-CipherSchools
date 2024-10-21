package com.example;

public class Poly {
	
	void add (int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	void add (int n1,int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
	
	void add (float n1,float n2) {
		System.out.println(n1+n2);
	}
	
	void add (int n1,float n2) {
		System.out.println(n1+n2);
	}
	void add (float n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		Poly p = new Poly();
		p.add(12.3f, 500);
	}

}
