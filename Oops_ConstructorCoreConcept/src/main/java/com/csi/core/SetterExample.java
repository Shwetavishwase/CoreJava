package com.csi.core;

class Customer{
	
	private int custId;
	
	private String custName;
	
	private String custAddress;

	
	/*  This is constructor - it will reduce the line of code, if we have thound variable and we are going to use it then we can use constructor
	 * 
	 * public Customer(int custId, String custName, String custAddress) { super();
	 * this.custId = custId; this.custName = custName; this.custAddress =
	 * custAddress; }
	 */

	
	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustAddress() {
		return custAddress;
	}


	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}

}


public class SetterExample {
	public static void main(String[] args) {

		Customer customer=new Customer();
		
		customer.setCustId(101);
		customer.setCustName("Swara");
		customer.setCustAddress("Pune");
		
		System.out.println();
		
	}
}
