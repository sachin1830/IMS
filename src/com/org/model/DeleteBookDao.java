package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBookDao {
	public String deleteBook(DeleteBookModel dm) throws ClassNotFoundException, SQLException
	{
		int i=0;
		int bookid=dm.getBookid();
		
		int librarianid=dm.getLibrarianid();
		
		String password=dm.getPassword();
		
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		
		String fetchquerry="select password from Registeruser where Regno="+librarianid+"";
		ResultSet res=statement.executeQuery(fetchquerry);
		
		res.next();
		String actualpass=res.getString(1);
		System.out.println(actualpass);
		
		if(password.equals(actualpass))
		{
			String query="delete from book where bookId="+bookid+"";
			
			i=statement.executeUpdate(query);
			
			if(i>0)
			{
				return "success";
			}
			else
			{
				return "fail";
			}
		}
		else
		{
			return "fail";
		}
		
	}
}
