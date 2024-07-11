package com.csi.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Customer {

	private int custId;

	private String name;

	private Date custDOB;

	private long custContactNumber;

	private boolean isActive;

	
	
	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getCustDOB() {
		return custDOB;
	}



	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}



	public long getCustContactNumber() {
		return custContactNumber;
	}



	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", custDOB=" + custDOB + ", custContactNumber="
				+ custContactNumber + ", isActive=" + isActive + "]";
	}
	
	
}

public class EncapsulationConcept {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		customer.setCustId(1);
		customer.setName("SHWETA");
		customer.setCustContactNumber(685423157L);
		customer.setActive(true);
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");
		Date dobDate=null;
		
		try {
			dobDate=simpleDateFormat.parse("10-03-2024");
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		customer.setCustDOB(dobDate);
		
		String custDOBDate=simpleDateFormat.format(customer.getCustDOB());

		System.out.println(customer);
		
		System.out.println("\n Customer Id: "+ customer.getCustId());
	}
}
