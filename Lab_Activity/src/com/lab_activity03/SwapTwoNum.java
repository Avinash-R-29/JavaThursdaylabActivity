package com.lab_activity03;

import java.util.*;
class Swap
{
	int a,b;

	void swap(Swap sw)
	{
		int tmp=sw.a;
		sw.a=sw.b;
		sw.b=tmp;
	}
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
public class SwapTwoNum {


	public static void main(String[] args) {
		Swap sw=new Swap();
		sw.display();
		sw.swap(sw);
		System.out.println(sw.a+" "+sw.b);

	}

}
