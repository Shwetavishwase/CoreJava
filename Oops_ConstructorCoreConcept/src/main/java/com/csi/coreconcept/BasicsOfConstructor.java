package com.csi.coreconcept;

class Department {

	int deptId ;
	String deptName;
	int deptCode;

	public Department() {
		// TODO Auto-generated constructor stub
		System.out.println("\n Department Id: " + deptId + "\n Deparment Name: " + deptName);
	}
	
	public Department(String deptCode) {
		
		System.out.println("\n Department Code: "+ deptCode);
	}

	public Department(int deptId, String deptName, int deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptCode = deptCode;
	}
	
	void show() {
		
		System.out.println("\n Department Id: "+deptId+"\n Department Name: "+deptName+"\n Department code: "+deptCode);
	}
	
}


public class BasicsOfConstructor {

	public static void main(String[] args) {

		Department department = new Department();
		
		Department department2=new Department(101, "SHWETA", 10);
		
		department2.show();
	}
}
