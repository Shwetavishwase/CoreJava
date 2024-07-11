package com.csi.core;

class Employee {

	int empId=121;
	
	private String empName="SHWETA";   //private have scope within class
}

public class AccessModifierBasics {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		System.out.println(employee.empId );
	}
}
