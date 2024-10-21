package com;
//this keyword
public class Test1 {

	int arg=5;
	
	Test1(){
		System.out.println("Hi ! i am default constructor");
	}
	
	Test1(int arg) {
		this();
		this.arg=arg;
	}
	
	public static void main(String[] args) {
		int arg=10; //local variable
		Test1 t1=new Test1(10);
		System.out.println(t1.arg);//instance variable
	}
}
