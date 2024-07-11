package com.core.basicaccessmodifiers;

public class DefaultAccessModifier {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		System.out.println("Employee Id: "+ employee.empId + "\n EmployeeName: "+ employee.empName);
	}
}
