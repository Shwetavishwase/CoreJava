package com.csi.core;

public class AdArithmeticApplication {

	public static void main(String[] args) {
		
		AdArithmeticApplication adArithmeticApplication=new AdArithmeticApplication();
		
		adArithmeticApplication.add(10, 5);
						
		System.out.println("\n Subtraction result: "+ adArithmeticApplication.sub(10, 5));
		
		System.out.println("\n Multiplication result: "+ mul(10, 5));
		
		System.out.println("\n Division result: "+ adArithmeticApplication.div(10, 5));
		
	}
	
	void add(int n1, int n2) {
		
		System.out.println("\n Addition result: "+n1+n2);
	}
	
	int sub(int n1, int n2) {
		
		return n1-n2;
	}
	
	static float mul(int n1, int n2) {
		
		return n1*n2;
				
	}
	
	double div(int n1, int n2) {
		
		return n1/n2;
	}
}
