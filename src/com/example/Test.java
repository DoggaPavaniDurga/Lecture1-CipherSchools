package com.example;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number !");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("+ve");
		} else if(n==0) {
			System.out.println("Neutral");
		}else {
			System.out.println("-ve");
		}
	}

}
