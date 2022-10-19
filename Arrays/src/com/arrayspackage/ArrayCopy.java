package com.arrayspackage;

public class ArrayCopy {

	public static void main(String[] args) {
		char[]a= {'h','a','n','i'};
		char[]b= new char[4];
		System.arraycopy(a, 0, b, 0, 4);
		System.out.println(String.valueOf(b));
	}

}
