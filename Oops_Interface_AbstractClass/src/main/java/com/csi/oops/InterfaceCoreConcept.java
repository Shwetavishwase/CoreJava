package com.csi.oops;

interface Department {

	void get(int deptId, String deptName);

	default void set() {

		System.out.println("\n I am from default");
	}

	static void net() {

		System.out.println("\n I am from static ");
	}

}

interface Employee extends Department {

	void show(int empId, String empName, double empSalary);
}

class ABC {

}

abstract class Product {

	abstract void display(int productId, String productName);

	void ProductInfo(String productCode, double productPrice) {

		System.out.println("\n Product Code: " + productCode + "\n Product Price: " + productPrice);
	}

}

class Customer extends Product implements Department, Employee {

	@Override
	void display(int productId, String productName) {
		// TODO Auto-generated method stub
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName);

	}

	@Override
	public void show(int empId, String empName, double empSalary) {
		// TODO Auto-generated method stub

		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee salary: " + empSalary);

	}

	@Override
	public void get(int deptId, String deptName) {
		// TODO Auto-generated method stub
		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
		;

	}
}

public class InterfaceCoreConcept {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.get(101, "SHWETA");

		customer.set();

		customer.show(1, "Shwetu", 123);

		customer.display(121, "Phone");

		customer.ProductInfo("AAZZ", 9922.33);

		Department.net();

	}
}
