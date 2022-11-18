package com.lab_activity06_longest_word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LongestWord
{
public String Longestword()throws FileNotFoundException {
String longestword="";
String current;
Scanner sc=new Scanner(new File("C:\\Avinash\\input02.txt"));
//FileReader file = new FileReader(new File("C:\\Avinash\\input02.txt"));
  while( sc.hasNext()) 
  {
	  current =sc.next();
	  if(current.length() > longestword.length())
	  {
		  longestword = current;
	  }
	  System.out.println(longestword);
  }
	  return longestword;
  
  }
}
