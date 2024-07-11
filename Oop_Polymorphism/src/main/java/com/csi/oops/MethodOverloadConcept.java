package com.csi.oops;

class Customer {

	void get(int custId, String custName) {
		System.out.println("\n Customer ID: " + custId + "\n Customer Name: " + custName);
	}

	void get(double accBalance) {
		System.out.println("\n Customer Account Balance: " + accBalance);
	}
}

public class MethodOverloadConcept {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.get(121, "SWARA");
		customer.get(4566.78);
		;

	}

	void main() {
		// we can create a main method in a single class but we have to provide
		// different parameters
		// If we will provide same parameters it will comes under overriding and method
		// overriding is not allow in a single class, it will give compile time error
	}
}
