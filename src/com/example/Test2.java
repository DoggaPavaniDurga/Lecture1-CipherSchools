package com.example;

public class Test2 {
	public static void main(String[] args) {
		ClassRoom cr=new ClassRoom();
		cr.setRollNo(1);
		cr.setSection("A");
		cr.setStandard("5th");
		
		System.out.println(cr);
		
		System.out.println(cr.getRollNo());
	}
	

}
