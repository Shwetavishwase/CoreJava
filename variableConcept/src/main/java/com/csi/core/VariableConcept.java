package com.csi.core;

public class VariableConcept {

	int empId = 121; // Instance variable

	static String empName = "SHWETA"; // Static variable

	public static void main(String[] args) {

		VariableConcept vobj= new VariableConcept();
		
		show();
	}

	// if our method is static then we can't access instace variable in static method 
	
	static void show() {
		double empSalary = 565665.65; // local variable
		
		System.out.println("\n Name: "+ empName+ "\n Salary: "+empSalary);   
	}
}
