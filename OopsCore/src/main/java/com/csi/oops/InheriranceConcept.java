package com.csi.oops;

class Department {

	void get(int deptId, String deptName) {

		System.out.println("\n Department Id: " + deptId + "\n DepartmentName: " + deptName);
	}

	void set() {
		System.out.println("I am from set");
	}
}

class Employee extends Department {

	void show(int empId, String empName) {
		System.out.println("\n Employee Id: " + empId + "\n Employee Name: " + empName);
	}

	void display(String empAddress) {
		System.out.println("\n Employee Address: " + empAddress);
	}
}

class Product extends Employee {

	void net(int productId, String productName, double productprice) {
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName + "\n Product Price: "
				+ productprice);
	}
}

class Company extends Product {

	void showCompanyInfo(int cId, String cName, String cAddress) {
		System.out.println("\n Company Id: " + cId + "\n Company Name: " + cName + "\n Company Address: " + cAddress);
	}
}

public class InheriranceConcept {
	public static void main(String[] args) {
		
		//single inhen

		/*
		 * Employee employee = new Employee();
		 * 
		 * employee.get(101, "HR"); employee.set(); employee.show(121, "SHWETA");
		 * employee.display("PUNE");
		 */

		// Department department = new Employee(); // employee is a child class

		/*
		 * department.get(101, "SHWETA"); department.set(); ((Employee)
		 * department).show(100,"VISHWASE"); //here we have done type casting concept
		 * ((Employee) department).display("USA"); //here we have done type casting
		 * concept
		 */

		/*
		 * Employee employee = (Employee) new Department(); // here while creating
		 * object we have done type casting // In this above statement we will get run
		 * time exception because parent class // i.e department class can not aquire
		 * the properties of child class i.e // Employee class employee.get(22, "QA");
		 * employee.set(); employee.show(33, "Vikrant"); employee.display("NAGAR");
		 */
		
		Company company=new Company();
		
		company.get(101, "HR");
		company.set();
		company.show(121, "Shweta");
		company.display("pune");
		company.net(1001, "Apple Phone", 989898.78);
		company.showCompanyInfo(12345,"Infosystem", "Pune");
		
		
		
		
		
		
		
		

	}
}
