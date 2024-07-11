package com.csi.core;

class Department {
	int deptId;
	String deptName;
	String deptCode;

	public Department() {
		// TODO Auto-generated constructor stub

		System.out.println("\n Department Id: " + deptId + "\n Depatment Name:" + deptName);

	}

	public Department(int deptId, String deptName, String deptCode) {
		super();
		this.deptId = deptId;        //this refers to current class variable or reference
		this.deptName = deptName;
		this.deptCode = deptCode;
	}

	void show() {
		System.out.println(
				"\n Department Id: " + deptId + "\n Department Name: " + deptName + "\n Department Code: " + deptCode);

	}
//	public Department(String deptCode) {
//		
//		System.out.println("Department code: "+ deptCode);
//	}
}

public class ConstructorBasics {
	public static void main(String[] args) {

		Department department = new Department();

		Department department2 = new Department(101, "HR", "ZZ45");
		
		department2.show();

	}
}
