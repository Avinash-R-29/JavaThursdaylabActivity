package com.lab_activity07_amount;

import java.util.Scanner;

class Account
{
	int AmtD;
	int AmtW;
	void Deposite()
	{
		//int AmtD;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount to Deposite");
		AmtD=sc.nextInt();
	}
	void Withdraw()
	{
		//int AmtW;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount to Withdraw");
		AmtW=sc.nextInt();
	}
	void Display()throws NoSufficientFundException
	{
	    int blnc = AmtD - AmtW;
		if(AmtW>AmtD)
		{
			throw new NoSufficientFundException("InSuficient balance   " + AmtD +" Available balance");
			//throw  NoSufficientFundException("Available Balance: "+AmtD);
		}
		else
		{
		System.out.println("Amount withdraw sucessfully Rupes " + AmtW);
		System.out.println("Balance in Your Accunt: " + blnc);
		}
	}
}