package com.csi.oops;

class Employee1 {

	public static int getEmpId;

	private int empId;

	private String empName;

	private String empAddress;

	private long empContactNumber;

	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class CoreConceptEncapsulation {

	public static void main(String[] args) {

		Employee1 employee1 = new Employee1();

		employee1.setEmpId(101);
		employee1.setEmpName("Shweta");
		employee1.setEmpAddress("Pune");
		employee1.setEmpContactNumber(65429455121L);
		employee1.setSalary(685435.22);

		System.out.println("\n Employee Id: " + employee1.getEmpId() + "\n Employee Name: " + employee1.getEmpName()
				+ "\n Employee Address: " + employee1.getEmpAddress() + "\n Employee Contact number: "
				+ employee1.getEmpContactNumber() + employee1.getSalary());
	}
}
