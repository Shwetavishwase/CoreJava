package com.csi.oops;

class Employee {

	private int empId;

	private String empName;

	private String empAddress;

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

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContactNumber() {
		return empContactNumber;
	}

	public void setEmpContactNumber(long empContactNumber) {
		this.empContactNumber = empContactNumber;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	private long empContactNumber;

	private double empSalary;

}

public class EncapsulationCoreConcept {
	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setEmpId(121);
		employee.setEmpName("SHWETA");
		employee.setEmpAddress("PUNE");
		employee.setEmpContactNumber(9862435575L);
		employee.setEmpSalary(65000.99);

		System.out.println("\n Employee Id: " + employee.getEmpId() + "\n Employee Name: " + employee.getEmpName()
				+ "\n Employee Address: " + employee.getEmpAddress() + "\n Employee Contact Number: "
				+ employee.getEmpContactNumber() + "\n Employee Salary: " + employee.getEmpSalary());

	}
}
