package com.arrayspackage;

public class Arrays {
	 static void add(int arr[])//called method
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array element is"+sum);
	}
	 static int[] input()
	 {
		 return new int[] {20,10};
	 }
	public static void main(String[] args) {
		int a[]= {10,20};
		int b[]= input();
		for(int j=0;j<b.length;j++)
		{
			System.out.println("Element of arrays b are"+b[j]);
		}
		/*int a[]= new int[1];
		a[0]=10;
		a[1]=20;*/
		add(a);//calling method
	}

}
