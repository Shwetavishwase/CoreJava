package com.csi.core;

public class TypeCastCoreConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int to string type casting
		int empCode = 555;
		
		String employeeCode = String.valueOf(empCode);
		
		System.out.println("Employee Code: " + employeeCode);
		
		//String to int type casting
		
		String branchCode = "999";
		
		int bCode = Integer.valueOf(branchCode);
						//OR
		// int bCode = Integer.parseInt(branchCode);
		
		System.out.println("Branch Code: "+ bCode);
	}

}
