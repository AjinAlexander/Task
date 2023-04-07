package org.company;

public class EmployeeDetails {
	public void empName() {
		System.out.println("Enter Name:");
	}
	public void empId() {
		System.out.println("Enter Id:");
	}
	public void empAddress() {
		System.out.println("Enter Address:");
	}
 
	public static void main(String[] args) {
		EmployeeDetails details=new EmployeeDetails();
		details.empName();
		details.empId();
		details.empAddress();
	}
}
