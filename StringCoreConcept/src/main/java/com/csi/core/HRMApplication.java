package com.csi.core;

public class HRMApplication {
	public static void main(String[] args) {

		System.out.println("\n Employee Id: " + HRMConstats.EMP_ID);

		System.out.println("\n Employee Name: " + HRMConstats.EMP_NAME);

		System.out.println("\n Employee Address: " + HRMConstats.EMP_ADDRESS);
		
		if(HRMConstats.EMP_ID == 121)
		{
			System.out.println("\n Eligible for loan");
		}
		
	}

}
