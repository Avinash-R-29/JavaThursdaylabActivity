package com.Lab_Activity10Dec.Lab_Activity10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Calculator {
	//Calculator c=new Calculator();
	int a=5,b=3;
	@BeforeAll
	static void callFirst()
	{
		System.out.println("@before All is ecexuted only once before method");	
	}

	@Test
	 /*void testAdd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st num");
		a=sc.nextInt();
		b=sc.nextInt();
		int expected,result;
		expected=a+b;
		result=0;
		if(a+b > 0)
		System.out.println("Addition of two number"+expected);
		else
			System.out.println("Addition of two number"+result);
	
	}*/
	void testAddition()
	{
		int expected=8;
		int result=8;
		assertEquals(expected,result);
	}
	
	@Test
	void testSubtraction()
	{
		int expected1=2;
		int result1=a-b;
		assertEquals(expected1,result1);
	}
	@Test
	void testMultiplication()
	{
		int expected=a*b;
		int result=15;
		assertEquals(expected,result);

	}
	@Test
	void testDivide()
	{
		int expected=a/b;
		int result=a/b;
		assertEquals(expected,result);

	}
	@Test
	void testReminder()
	{
		int expected=a%b;
		int result=a%b;
		assertEquals(expected,result);
		System.out.println("percent of given num is"+expected);

	}
	
		

}
