package com.csi.core;

public class BaseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1 = 20, n2 = 10, result = 0;
//
//		result = n1 + n2;
//
//		System.out.println("Addition Result: " + result);
//
//		result = n1 - n2;
//
//		System.out.println("  result: " + result);
//
//		result = n1 * n2;
//
//		System.out.println("Multiplication result: " + result);
//
//		result = n1 / n2;
//
//		System.out.println("Division result: " + result);
		

		BaseApplication bobj= new BaseApplication();
		
		bobj.add(20, 10);
		
		int ans=BaseApplication.subtraction(20, 10);
		System.out.println("Subtraction result: "+ ans);
		
		System.out.println(showData());
		
		System.out.println("Rate of Interest of Bank: "+ bobj.rateOfInterest());
	}
	
	void add(int n1, int n2)
	{
		int result= n1+n2;
		
		System.out.println("Addition result: "+ result);
	}
	static int subtraction(int n1, int n2)
	{
		int result= n1- n2;
		return result;
	}
	static String showData()
	{
		return "Welcome";
	}
	double rateOfInterest()
	{
		return 11.5;
	}
}
