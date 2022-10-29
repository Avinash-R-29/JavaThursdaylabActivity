package com.lab_activity01;

import java.util.Scanner;
public class Cube
{
   public static void main(String[] args)
  {
    int num,j;
    System.out.print("Enter the number of terms ");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

     for(j=1;j<=num;j++)
     {
     System.out.println("Number is : " +num+" and cube of " +num+" is : "+(num*num*num));
     return;
    }
 }
}
