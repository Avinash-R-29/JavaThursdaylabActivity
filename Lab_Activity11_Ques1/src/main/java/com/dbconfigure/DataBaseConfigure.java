package com.dbconfigure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfigure 
{
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//path of driver,
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
	public static Connection makeConnection()throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","@vinash29");
	}
}
