package com.csi.core;

class Department{  //outer class
	
	static class Employee{  //inner class
		
	}
	
}

public class VariableBasics {

	int empId = 121; // instance variable

	static String empName = "Shweta"; // Static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableBasics basics = new VariableBasics();
		basics.show();

	}

	void show() {
		double empSalary = 5656.56; // local variable

		System.out.println("\n Id: " + empId + "\n Name: " + empName + "\n Salary: " + empSalary);

		// static int=55;
		// if we try to declare static variable inside the block then it will generates
		// complier time error
	}

}
