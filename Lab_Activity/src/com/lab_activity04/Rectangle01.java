package com.lab_activity04;

import java.util.*;
class Rectangle
	{
		double length;
		double breadth;
		float side;
		Rectangle(float s)
		{
			this.side=s;
		}
		
		Rectangle(double l,double b)
		{
			this.length=l;
			this.breadth=b;
			
		}
		
		void Area()
		{
			 double AreaofRec=length*breadth;
			 System.out.println("Area of Rectangle is :"+AreaofRec+"cm^2");
		}
		void Perimeter()
		{
			double PerimeterofRec=2*(length+breadth);
			 System.out.println("Perimeter of Rectangle is: "+PerimeterofRec+"cm^2");
		}
	}
	class Square extends Rectangle
	{
		Square(float s)
		{
			super(s);
		}
		void Area()
		{
			float AreaofSquare=side*side;
			System.out.println("Area of Square is :"+AreaofSquare+"cm^2");
		}
		void Perimeter()
		{
			float PerimeterofSquare=4*side;
			System.out.println("Perimeter of Square is :"+PerimeterofSquare+"cm^2");
		}
		
	}

	public class Rectangle01 {

		public static void main(String[] args)
		{
			Rectangle r=new Rectangle(10.0,20.0);
			r.Area();
			r.Perimeter();
			Square sq=new Square(15);
			sq.Area();
			sq.Perimeter();
			
			
			
		}

	}