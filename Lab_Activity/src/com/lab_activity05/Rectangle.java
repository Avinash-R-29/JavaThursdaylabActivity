package com.lab_activity05;

public class Rectangle {
	public void draw(ShapeMain s)
	{
		System.out.println("The drawn shape is : "+s.getShape());
	}
	
	public void erase()
	{
		System.out.println("Erase the drawn shape");
	}
	
public static void main(String[] args)
{
	
	ShapeMain s=new ShapeMain("Rectangle");
	Rectangle R= new Rectangle();
     R.draw(s);
	R.erase();
}
}