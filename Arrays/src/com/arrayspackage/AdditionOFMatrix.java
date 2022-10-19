package com.arrayspackage;

public class AdditionOFMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,1,1},{1,1,1}};
		int sum[][]=new int[2][3];
		for(int i=0;i<2;i++)//also we can use "i<a.length"
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.println(sum[i][j]);
			}
		}
	}

}
