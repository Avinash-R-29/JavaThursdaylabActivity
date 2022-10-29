package com.lab_activity01;

import java.util.Scanner;
public class TrianglePattern 
{
 public static void main(String[] args)
			{
   	     int i,j,k;
         System.out.print("Enter the number of: ");
         Scanner sca = new Scanner(System.in);
		     k = sca.nextInt();
         for(i=1;i<=k;i++)
         {
	         for(j=1;j<=i;j++)
	         System.out.print(j);
	         System.out.println("");
          }
      }
} 
