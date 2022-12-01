package com.lab_activity08_ques_1_2_and_3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Divide01 extends Thread {
	float a,b,c;
	void data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		a=sc.nextInt();
		System.out.println("Enter the Second number");
		b=sc.nextInt();
	}
	void divide() {
		try
		{
			c=a/b;
			System.out.println(c);
		}
		
		catch(InputMismatchException i1)
		{
			System.out.println("Only Number should enter"+i1);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("zero can't be divided: ");
		}
		
		
	}
	
	public static void main(String[] args) {
		Divide01 d=new Divide01();
		d.data();
		d.divide();

	}

}
