package com.csi.core;

public class AutoBoxConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AutoBoxing: Primitive to Wrapper class

		int empId = 121;

		Integer employeeId = empId; // auto boxing

		System.out.println(" Employee Id: " + employeeId);

		Double productPrice = 22.55;

		double pPrice = productPrice; // unboxing

		System.out.println("\n Product Price: " + pPrice);

	}

}
