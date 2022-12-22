package com.lab_activity11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookDetails01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//path of driver,
		String url="jdbc:mysql://localhost:3306/customerdb";
		String username="root";
		String password="@vinash29";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		int select;
		System.out.println("1. Insert Book-Details table  | 2.Retrive Book-Details");
		System.out.println("3.Update Book-Details details | 4.Display Book details in order");
		System.out.println("5.Delete customer details");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		select=sc.nextInt();
		switch(select)
		{
		case 1:
			try {
			int b_id,b_price;
			String b_name,b_author;
			System.out.println("enter the book id");
			b_id=sc.nextInt();
			System.out.println("enter the book name");
			b_name=sc.next();
			System.out.println("enter the book Author name");
			b_author=sc.next();
			System.out.println("enter the book Price");
			b_price=sc.nextInt();
			String query1="insert into Book value('"+b_id+"','"+b_name+"','"+b_author+"','"+b_price+"')";
			st.executeUpdate(query1);
		
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			break;
			
		case 2:
			try
			{
			int b_id01;
			System.out.println("enter the book id");
			b_id01=sc.nextInt();
			String query2="Select * from book where book_id="+b_id01+"";
			ResultSet re2=st.executeQuery(query2);
			re2.next();
			String BookData=re2.getInt(1)+ " "+re2.getString(2)+" " +re2.getString(3)+" "+re2.getInt(4);
			System.out.println(BookData);
			}
			catch (SQLException e)
			{
				System.out.println("Ooh No data found");
			}
			break;
			
		case 3:
			try 
			{
			int b_id02;
			String change;
			System.out.println("enter the book id");
			b_id02=sc.nextInt();
			System.out.println("enter the book Author");
			change=sc.next();

			String query3="update Book set Book_Author="+change+" where Book_id="+b_id02+" ";
			ResultSet re3=st.executeQuery(query3);
			
			System.out.println("Updated sucessfully");
			}
			catch(Exception e)
			{
				System.out.println("Ooh No data found");
			}
			break;
			
		case 4:
		{
			try
			{
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		case 5:
			System.out.println("Enter the Book id to Delete in Table");
			try {
					int delete;
					delete=sc.nextInt();
					String query05="Delete from Book where Book_id="+delete+"";
					int re5=st.executeUpdate(query05);
					System.out.println("Data deleted sucessfully from table");
					
				}
			catch (SQLException e)
			{
				System.out.println("Ooh No data found");
			}
			break;
			
		}
		
	}

}
