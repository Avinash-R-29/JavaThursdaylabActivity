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
	 void productCheck(int weigth) throws MyException
	{
		//int weigth =0;
		if(weigth < 100)
			{
				throw new MyException ("not valid product");
			}
			else{
				System.out.println("product valid"+weigth);
			}	
		}
	public static void main(String args[]) throws MyException
		{
			Product p=new Product();
			try
			{
				p.productCheck(10);
			}
			catch(MyException e)
			{
				System.out.println("Cought My Exception");
				System.out.println(e.getMessage());
			}
		}
}
