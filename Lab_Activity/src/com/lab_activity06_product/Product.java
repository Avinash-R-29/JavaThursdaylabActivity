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
	static void productCheck(int i)
	{
		int weigth;
		if(weigth < 100)
			{
				throw new MyException ("not valid");
			}
			else{
				System.out.println("product valid");
			}	
		}
		public static void main(String args[])
		{
		try	{
				productCheck(100);
			}
		catch(MyException  e)
			{
				System.out.println("Cought the exception");
				System.out.println("Exception occur"+e);
			}

		}
	}
}
