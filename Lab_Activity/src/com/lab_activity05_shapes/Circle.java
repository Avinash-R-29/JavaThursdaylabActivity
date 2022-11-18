package com.lab_activity05_shapes;

public class Circle {

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
	Circle c= new Circle();
	c.draw(s);
	c.erase();
}
}
