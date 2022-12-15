package com.Lab_Activity10Dec.Lab_Activity10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	EmpDetails emp=new EmpDetails();
	
	@Test
	public void testCalculateAppricial()
	{
		emp.setEmployeeName("Avinash");
		emp.setAge(23);
		emp.setSalary(2000);
		
		
		double appricial;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		appricial=sc.nextDouble();
		
		double calculate_appricial;
		
		
		double appr;
		if(appricial >= 12000)
		{
			calculate_appricial= appricial * 20 / 100;
			appr=appricial*12;

			/*
			 * System.out.println("Employee name"+emp.getEmployeeName());
			System.out.println("Monthly appricial "+calculate_appricial);
			System.out.println("Yearly total appricial "+appricial);
			*/
		}
		else
			calculate_appricial= appricial * 10 / 100;
			appr=appricial*12;
/*
			System.out.println("Employee name"+emp.getEmployeeName());
			System.out.println("Monthly appricial "+calculate_appricial);
			System.out.println("Yearly total appricial "+appricial);
		*/
		
	}

}
