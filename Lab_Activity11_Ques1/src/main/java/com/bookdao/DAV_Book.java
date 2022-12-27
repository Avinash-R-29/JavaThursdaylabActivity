package com.bookdao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bookdav.BookDav;
import com.dbconfigure.DataBaseConfigure;
import com.mysql.cj.xdevapi.Statement;

public class DAV_Book implements BookDav
{
	static Connection con;
	static Statement st;
	static
	{
		try
		{
			con=DataBaseConfigure.makeConnection();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void Book() throws SQLException
	{
		int select;
		java.sql.Statement st=con.createStatement();

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
		System.out.println("Book Added sucessfully");
		
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

		String query3="update Book set Book_Author='"+change+"' where Book_id='"+b_id02+"' ";
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
			String query4="Select * from Book order by Book_price desc";
			ResultSet re4=st.executeQuery(query4);
			while(re4.next())
			{
			String BookData=re4.getInt(1)+ " "+re4.getString(2)+" " +re4.getString(3)+" "+re4.getInt(4);
			System.out.println(BookData);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	break;
	
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
