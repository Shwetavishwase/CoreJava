package com.core.basicaccessmodifiers;

class Employee{

	protected int empId=121;
	
	 String empName="Shweta";
}

public class AccessModifiersBasic {
	
	public static void main(String[] args) {
		
	Employee employee=new Employee();
	
	System.out.println(employee.empId + employee.empName);
		
	}
}
