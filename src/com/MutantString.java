package com;

public class MutantString {
	public static void main(String[] args) {
	   
	     C objC = new C();

	     objC.methodA(); 
	     objC.methodB(); 
	     objC.methodC(); 
	 }
}

class A {
 A() {
     System.out.println("Constructor of Class A");
 }

 void methodA() {
     System.out.println("Method in Class A");
 }
}


class B extends A {
 B() {
     System.out.println("Constructor of Class B");
 }

 void methodB() {
     System.out.println("Method in Class B");
 }
}


class C extends B {
 C() {
     System.out.println("Constructor of Class C");
 }

 void methodC() {
     System.out.println("Method in Class C");
 }
}

