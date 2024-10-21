package com.example.employee;

public class Employee {
	
	int employeeId;
	int salary;
	String dept;
	
	public Employee(int employeeId, int salary, String dept) {
	
		this.employeeId = employeeId;
		this.salary = salary;
		this.dept = dept;
	}

	public static void main(String[] args) {
		
		
		Employee durga = new Employee(100,3000,"IT");
		System.out.println(durga.employeeId+" "+durga.salary+" "+durga.dept);
		
		Employee pavani=new Employee(2, 5000, "Telecom");
		System.out.println(pavani.employeeId+" "+pavani.salary+" "+pavani.dept);
	}
	
	

}
