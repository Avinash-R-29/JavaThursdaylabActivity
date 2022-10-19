package com.arrayspackage;

public class ArrayExample {
	 static void add(int arr[])//called method
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int a[]= {10,20};
		add(a);//calling method
	}

}
