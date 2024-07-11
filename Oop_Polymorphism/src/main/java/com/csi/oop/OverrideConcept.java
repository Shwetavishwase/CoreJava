package com.csi.oop;

class Department{
	
	 void get(int deptId, String deptName)  {
		
		System.out.println("\n Department Id: "+ deptId+ "\n Department Name: "+deptName);
	}
}

class Employee extends Department{
	
	@Override
	void get(int deptId, String deptName)  {
		// TODO Auto-generated method stub
		super.get(102, "hjhfv");
		
		System.out.println("\n Department Id: "+ deptId+ "\n Department Name: "+deptName);

	}
}
public class OverrideConcept {
 
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		 
		
		employee.get(101,"SHWETA");
	}
}
