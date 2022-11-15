package Lab_Activity05_Shapes;

public class Square {
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
	
	ShapeMain s=new ShapeMain("Square");
	Square s1= new Square();
	s1.draw(s);
	s1.erase();
}
}
