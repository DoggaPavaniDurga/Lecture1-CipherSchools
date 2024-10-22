package com.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	int n1,n2,res;
	Scanner sc = new Scanner(System.in);
	
	void calculate() {
		try {
			
		System.out.println("Enter First Number :");
		n1=sc.nextInt();
		
		System.out.println("Enter Second Number :");
		n2=sc.nextInt();
		
		res=n1/n2;
		if(n2==0) {
			throw new ArithmeticException();
		}
		}
		catch(InputMismatchException ime){
			System.out.println("InputMismatchException Detectied!"+ime.getMessage());
			ime.printStackTrace();
		}catch(ArithmeticException ae){
			System.out.println("ArithmeticException Detectied!"+ae.getMessage());
			ae.printStackTrace();
		}catch(Exception e){
			System.out.println("Exception Detectied!"+e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("The Division is "+res);
		}	
	}
	
	
	public static void main(String[] args) {
		Test2 obj=new Test2();
		obj.calculate();
	}

}
