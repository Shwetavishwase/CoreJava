package com.csi.coreconcept;

class Customer{
	
	private int custId;
	
	private String custName;
	
	private String custAddress;

	/*
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
		// TODO Auto-generated method stub
		return "Customer [Customer Id: "+custId+", Customer Name: "+ custName+", Customer Address: "+custAddress+"]";
	}
	
}

public class SetterEx {
	
	public static void main(String[] args) {
		
		//Customer customer=new Customer(101, "Shweta", "ABC");
		
		//System.out.println(customer);
		
		Customer customer=new Customer();
		
		customer.setCustId(101);
		customer.setCustName("Shweta");
		customer.setCustAddress("ABC");

		System.out.println(customer);
	}

}
