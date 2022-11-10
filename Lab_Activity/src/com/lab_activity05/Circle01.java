package com.lab_activity05;

public class Circle01 {

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
	
	ShapeMain s=new ShapeMain("Circle");
	Circle01 c= new Circle01();
	c.draw(s);
	c.erase();
}
}