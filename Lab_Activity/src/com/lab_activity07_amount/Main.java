package com.lab_activity07_amount;

class Main
{
	public static void main(String [] args)throws NoSufficientFundException
	{
	Account ac= new Account();
	ac.Deposite();
	ac.Withdraw();
	ac.Display();
	}
}