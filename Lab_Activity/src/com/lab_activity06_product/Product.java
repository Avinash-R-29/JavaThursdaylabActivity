package com.lab_activity06_product;
import java.util.*;

class MyException extends Exception
{
	public MyException(String str)
	{
		super(str);
	}
}
class Product
{
	//int weight;
	static void productCheck(int i) throws MyException
	{
		int weigth = 0;
		if(weigth < 100)
			{
				throw new MyException ("not valid");
			}
			else{
				System.out.println("product valid");
			}	
		}
		public static void main(String args[]) throws MyException
		{
		productCheck(100);

		}
	}
