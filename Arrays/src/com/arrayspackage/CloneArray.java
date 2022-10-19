package com.arrayspackage;

public class CloneArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		System.out.println("content of original array");
		for(int i:a)
		{
			System.out.println(i);
		}
		int clo[]=a.clone();//clone is used to copy the content in a
		System.out.println("Content of clo array copied");
		for(int i:clo)
		{
			System.out.println(i);
		}
	}

}
