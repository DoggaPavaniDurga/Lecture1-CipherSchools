package com.example;

import java.util.Scanner;

public class EmployeePayroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic Pay");
		double basicPay = sc.nextInt();
		double hra=0;
		double da=0;
		if(basicPay>=5000) {
			hra=basicPay*0.2;
			da=basicPay*0.1;
		} else {
			hra=basicPay*0.2;
			da=basicPay*0.3;
		}
		
		System.out.println(hra+" "+da);
		
		System.out.println(basicPay+hra+da);
	}

}
