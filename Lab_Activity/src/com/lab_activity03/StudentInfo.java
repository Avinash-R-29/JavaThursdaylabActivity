package com.lab_activity03;
import java.util.*;

 class Student {

		 String name;
	     int age;
	      Float weight;
		 static int count=0;
		 Student()
		{
			count++;
		}
	  void getInfo()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student's Name:");
			name =sc.next();
			System.out.println("Enter Student's Age:");
			age=sc.nextInt();
			System.out.println("Enter Student's Weight:");
			weight=sc.nextFloat();
			
		}
		void displayInfo()
		{
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Weight:"+weight);
			
		}
		static int getCount()
		{
			return Student.count;
		}
		
	}
	public class StudentInfo {

		public static void main(String[] args) 
		{
		
			Student st1=new Student();
			Student st2=new Student();
			System.out.println("Student 1");
			st1.getInfo();
			System.out.println("Student 2");
			st2.getInfo();
			System.out.println("Display Information");
			System.out.println("Student 1");
			st1.displayInfo();
			st2.displayInfo();
			System.out.println("Number of Student Enrolled:"+Student.getCount());
			
		

		}

	}