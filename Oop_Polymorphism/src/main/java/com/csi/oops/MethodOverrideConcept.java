package com.csi.oops;

import java.io.ObjectInputStream.GetField;

class Department {

	void get(int deptId, String deptName) {
		System.out.println("\n Department Name: " + deptId + "\n Depatment Name: " + deptName);
	}
}

class Employee extends Department {
	void get(int deptId, String deptName) {
		System.out.println("\n Department Name: " + deptId + "\n Depatment Name: " + deptName);
	
		super.get(121, "SWARA");
	}
}

public class MethodOverrideConcept {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.get(111, "SHWETA");   //This get will call only child class parameters To access parent class methos we will use super keyword

	}
}
