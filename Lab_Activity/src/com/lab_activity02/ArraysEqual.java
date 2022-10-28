package com.lab_activity02;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		int a[]= {20,78,90,80,50};
		int b[]= {20,78,90,50,80};
		boolean result=Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Two arrays are equal");
		}else
		{
			System.out.println("Two arrays are not equal");
		}

	}

}