package com.lab_activity07_password;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class IDFC
{
	 //int length=8;
	static int CardNum;
	void getCard() 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the card number");
		CardNum=sc.nextInt();
	}
	
	static char[] Generate_Code(int length)
	{
		//int code;
			String LChars = "abcdefghijklmnopqrstuvwxyz";
     	   	String CChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
    	   	String symbols = "@#*";
     	   	String numbers = "0123456789";
	
		String value= LChars + CChars + symbols + numbers ;
		Random rdm_method = new Random();
	
		char[] Code = new char[length];
		
		
		for(int i=0; i<length ; i++)
		{
			Code[i]=value.charAt(rdm_method.nextInt(value.length()));
		}
		try
		{
			if(CardNum < 10)
				//System.out.println(Generate_Code(8));
				System.out.println("card Number should be 10:");
			
			/*else if(CardNum > 10)
				System.out.println("card Number should be :10");*/
			
		else 
				System.out.println("Your password is :"+Code );
		}
		catch (InputMismatchException e)
		{
			System.out.println("card Number should be 14"+e);
		}
		
			return null;
	}

public static void main(String []args)
{
	IDFC id= new IDFC();
	id.getCard();
	//id.Generate_Code(8);
	System.out.println(Generate_Code(8));
}
}  //  0123456789
