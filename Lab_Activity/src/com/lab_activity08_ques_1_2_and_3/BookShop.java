package com.lab_activity08_ques_1_2_and_3;

import java.util.ArrayList;
import java.util.Scanner;
class Book {

	String title;
	String author;
	double price;
	public Book(String title, String author, double price)
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	

}

public class BookShop {

	public static void main(String[] args) {
		ArrayList<Book> b=new ArrayList<Book>();
		b.add(new Book("JAVA","James Gosling",99.01));
		b.add(new Book("C","Dennis Ritchie",199.50));
		b.add(new Book("C++","Dennis Ritchie",599.35));
		b.add(new Book("PYTHON","Guido van Rossum",399.00));
		b.add(new Book("JAVASCRIPT","Brendan Eich",999.49));
		
		System.out.println("The Available Book's are : ");
		for(Book bb:b)
		{
			System.out.println(bb.title+" "+bb.author+" "+bb.price);
		}
		System.out.println(" ");
		
		System.out.println("Enter the Title");
		Scanner sc=new Scanner(System.in);
		String findtitle=sc.next();
		
		for(Book bb2:b)
		{
			if(bb2.title.contains(findtitle))
			{
				System.out.println("Book is avialable and details are:");
				System.out.println("Title: "+bb2.title+" "+"Author Name: "+bb2.author+" "+" Price: "+bb2.price);
			}
			else
			//{
				//for(int j=0;j<=bb2.title.length();j++)
				{
				System.out.println("Book is not avialable in row :");
				}
			//System.out.print("Available Titles are:"+bb2.title);
		//}
		}
		System.out.println("Enter the Author");
		Scanner sc1=new Scanner(System.in);
		String find_auth=sc1.next();
		
		for(Book bb3:b)
		{
			if(bb3.author.contains(find_auth))
			{
				System.out.println("Book is avialable and details are:");
				System.out.println(bb3.title+","+bb3.author+","+bb3.price);
			}
			else {
				System.out.println("Book is not avialable");
		}	
		}
	}
}



