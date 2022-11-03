package com.lab_activity04;

import java.util.*;
class Employee01
{
	String specialization;
	String Department;
}
class Member extends Employee01
{
	String Name;
	int Age;
    int PhoneNumber;
	String Address;
	float Salary;
	void getInfo()
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Name:");
		Name=sc.next();
		System.out.println("Enter Age:");
		Age=sc.nextInt();
		System.out.println("Enter Phone num:");
		PhoneNumber=sc.nextInt();
		System.out.println("Enter Address:");
		Address=sc.next();
		System.out.println("Enter Salary:");
		Salary=sc.nextInt();
		System.out.println("Enter Specicialization:");
		specialization=sc.next();
		System.out.println("Enter Department:");
		Department=sc.next();
	}
	void Display()
	{
		System.out.println("Employee details");
		System.out.println("Employee Name is:"+Name);
		System.out.println("Employee Age is:"+ Age);
		System.out.println("Employee Phone Num is:"+PhoneNumber);
		System.out.println("Employee Address is:"+Address);
		/**/
		
	}
	void empdetails()
	{
	    	System.out.println("Enter the Employee details");
	}
	void printSalary()
	{
		System.out.println("Employee Salary is:"+Salary);
		System.out.println("....................................................");
	}
		
}

class Manager extends Member
{
    void managerdetails()
	{
	    	System.out.println("Enter the Managere details");
	}
	void manager()	
	{
		System.out.println(" Manager details");
		System.out.println(" Manager Name is:"+Name);
		System.out.println(" Manager Age is:"+ Age);
		System.out.println(" Manager Phone Num is:"+PhoneNumber);
		System.out.println(" Manager Address is:"+Address);
		System.out.println(" Manager Salary is:"+Salary);
		System.out.println("...................................................");
	}	
		
}

public class EmployeeDetails {

	public static void main(String[] args) 
	{

	Member mm=new Member();
	Manager m=new Manager();
	mm.empdetails();
	mm.getInfo();

	m.managerdetails();
	m.getInfo();

	mm.Display();
	mm.printSalary();

	m.manager();

	}

}

		
