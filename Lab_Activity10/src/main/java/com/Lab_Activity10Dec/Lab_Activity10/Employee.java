package com.Lab_Activity10Dec.Lab_Activity10;

import java.util.Scanner;

class EmpDetails
{
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String EmployeeName;
	int salary,age;
}

public class Employee {

	public static void main(String[] args) {
		EmpDetails emp=new EmpDetails();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the employee name");
		emp.setEmployeeName(sc.next());
		
		System.out.println("Enter the employee age");
		emp.setAge(sc.nextInt());
		
		System.out.println("Enter the employee Salary");
		emp.setSalary(sc.nextInt());	
		
		
		System.out.println("Employee name : "+emp.getEmployeeName());
		System.out.println("Employee age : "+emp.getAge());
		System.out.println("Employee salary : "+emp.getSalary());
		
	}

}
