package com.lab_activity06_range;
import java.util.Scanner;

class Range
{
	void Square(int a)throws OutOfRangeException
	{
		//int num;
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		if(num1 > 10 && num1 < 50)
		
			throw new OutOfRangeException("Out Of range");
			//System.out.println("Out of range");
		
		else
			
			throw new OutOfRangeException("Square range is: "+num1*num1);
		
	}
		public static void main(String []args) throws OutOfRangeException
		{
			Range e=new Range();
			try
			{
				e.Square(1);
			}
			catch(Exception e1)
			{
			System.out.println(e1);
			}
		}
}

