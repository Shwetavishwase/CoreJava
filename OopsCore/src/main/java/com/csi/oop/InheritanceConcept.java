package com.csi.oop;

class Department {

	void get(int deptId, String deptName) {

		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}

	void set() {
		System.out.println("I am from set");
	}

}

class Employee extends Department {

	void show(int empId, String empName) {

		System.out.println("\n Employee id: " + empId + "Employee Name: " + empName);
	}

	void display(String empAddress) {

		System.out.println("\n Employee Address: " + empAddress);
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.get(1, "SHWETA");

		employee.set();

		employee.show(12, "jduhd");

		employee.display("PUNE");

		/*
		 * System.out.println(--------------------------------------------------------);
		 * Department department=new Employee();
		 * 
		 * department.get(1, "SHWETA"); department.set(); ((Employee)
		 * department).show(101,"SWARA"); ((Employee)
		 * department).display("MAHARASHTRA");
		 */
		/*
		 * System.out.println("---------------------------------------------"); Employee
		 * employee=(Employee) new Department();
		 * 
		 * employee.display("sdnj"); employee.set(); employee.show(13, "SHWETA");
		 * employee.show(121, "SWARA");
		 */
	}

}
