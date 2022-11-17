package com.lab_activity06_range;
import java.util.Scanner;

class Range
{
	void Square()throws OutOfRangeException
	{
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num < 10 && num > 50)
		{
			throw new OutOfRangeException("Out Of range");
			//System.out.println("Out of range");
		}
		else
		{
			System.out.println("Square range is: "+num*num);
		}
	}
		public static void main(String []args) throws OutOfRangeException
		{
			Range e=new Range();
			try
			{
				e.Square();
			}
			catch(OutOfRangeException e1)
			{
			System.out.println(e1);
			}
		}
}

