package com.example;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your current speed:");
		int speed=sc.nextInt();
		
		System.out.println("Today is your Birthday : ");
		boolean isBirthday = sc.nextBoolean();
		
		if(isBirthday==true) {
			speed=speed-5;
		}
		
		if(speed>80) {
			System.out.println("hight ticket");
		} else if(speed>=60){
			System.out.println("Mid ticket");
		}
		if(speed<60) {
			System.out.println("No ticket");
			
		}
		
	}

}
