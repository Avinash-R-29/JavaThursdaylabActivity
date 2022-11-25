package com.lab_activity07_amount;

import java.util.*;
import java.util.Scanner;

class NoSufficientFundException extends Exception
{
	 public NoSufficientFundException(String str)
	  {
	  	super(str);
		
	}
}