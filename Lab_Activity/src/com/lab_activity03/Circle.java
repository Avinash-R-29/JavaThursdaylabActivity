package com.lab_activity03;
import java.util.Arrays;
class Circle
{
double center;
double radius;
  static int count=0;
	Circle()
	{
		System.out.println(" ");
	}
Circle(double center,double radius)
{
	this.center=center;
	this.radius=radius;
	count++;
	
}
	public static void main(String[] args) 
	{
		Circle c=new Circle(12.1,14.5);
		Circle c1=new Circle(13.1,15.6);
		System.out.println("Circle 1-center is: "+c.center+ "Radius is:" +c.radius);
		System.out.println("Circle 2-center is: "+c1.center+ "Radius is:" +c1.radius);
		System.out.println("No of circle:"+Circle.count);
}
}

	
	
	
	
	
	