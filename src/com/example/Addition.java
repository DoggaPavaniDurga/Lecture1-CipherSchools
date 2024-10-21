package com.example;

//method overloading
public class Addition {
		
		void sum (int n1,int n2) {
			System.out.println(n1+n2);
		}
		
		void sum (int n1,int n2,int n3) {
			System.out.println(n1+n2+n3);
		}
		
		void sum (int n1,float n2) {
			System.out.println(n1+n2);
		}
		
		public static void main(String[] args) {
			Addition add = new Addition();
			add.sum(12, 12.43f);
			add.sum(23, 54);
			add.sum(12, 23,60);
		}

}
