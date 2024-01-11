package com.encapsulation;

import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private String empDept;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return this.empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
}

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int empId = sc.nextInt();
		
		System.out.println("Enter Employee Department");
		String empDept = sc.next();
		
		System.out.println("Enter Employee Name");
		String empName = sc.next();
		
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpDept(empDept);
		
		System.out.println("Displaying the Details :");
		System.out.println("Employee Id :"+emp.getEmpId());
		System.out.println("Employee Name :"+emp.getEmpName());
		System.out.println("Employee Dept :"+emp.getEmpDept());
	}

}
