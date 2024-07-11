package com.csi.exceptioncore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

public class ExceptionCore {

	public static void main(String[] args) throws EmployeeRocordNotFoundException {

		/*
		 * try { int res = 10 / 0;
		 * 
		 * } catch (ArithmeticException e) { // TODO: handle exception
		 * e.printStackTrace(); } System.out.println("Pune");
		 */
		/*
		 * String companyName = null; try { System.out.println(companyName.length()); }
		 * catch (NullPointerException e) { // TODO: handle exception
		 * e.printStackTrace(); } System.out.println("Pune");
		 */

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(101, "Shweta", 95675.35));
		employees.add(new Employee(102, "Swara", 55000.35));
		employees.add(new Employee(103, "Akshay", 65000.35));
		employees.add(new Employee(104, "Nishikat", 75000.35));
		employees.add(new Employee(105, "Rahul", 25000.35));

		boolean flag = false;

		System.out.println("\n Please enter #EMPLOYEE ID to check our DB record: ");

		Scanner scanner = new Scanner(System.in);
		
		int empId=scanner.nextInt();

		for (Employee employee : employees) {

			if (employee.getEmpId() == 121) {
				flag = true;

				System.out.println("Yes, Record Availaable");
			}
		}
		if (!flag) {
			throw new EmployeeRocordNotFoundException("Employee id does not exists!!!");
		}

	}
}
