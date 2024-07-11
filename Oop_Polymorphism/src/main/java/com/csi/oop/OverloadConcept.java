package com.csi.oop;

class Customer{
	
	static void get(int custId, String custName) {
		System.out.println("\n Customer Id: "+ custId +"\n Customer Name: "+ custName);
	}
	
	void get(double accBalance) {
		
		System.out.println("\n Customer Account Balance: "+ accBalance );

	}
}
public class OverloadConcept {
	
	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
	customer.get(101, "Shweta");
//		customer.get(6854231.254);
	
	main(1);
	}
	
	public static void main(int i) {

		System.out.println("This is overloaded main method");
	}

}
