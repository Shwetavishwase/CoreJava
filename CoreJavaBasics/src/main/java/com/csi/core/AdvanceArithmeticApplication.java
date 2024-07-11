package com.csi.core;

public class AdvanceArithmeticApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvanceArithmeticApplication aa = new AdvanceArithmeticApplication();
		aa.add(24, 5);
		
		aa.sub(6, 2);
		
		System.out.println("Multiplication Result: "+ aa.mul(2, 4));
		
		System.out.println("Division Result: " + div(10, 5));
	}

	void add(int n1, int n2) {
		int result = n1 + n2;

		System.out.println("Addition Result:" + result);
	}

	void sub(int n1, int n2) {

		System.out.println("Substract Result:" + (n1 - n2));
	}

	int mul(int n1, int n2) {
		return n1 * n2;
	}

	static double div(double n1, double n2) {
		return n1 / n2;
	}
	
	boolean isActive() {
		return true;
	}
}
