package com.org.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDao {
	public String updateBook(UpdateModel um) throws ClassNotFoundException, SQLException
	{
		int bookid=um.getBookid();
		String bookname=um.getBookname();
		String auther=um.getAuther();
		String publisher=um.getPublisher();
		Connection con=DBConnection.createConnection();
		String query="UPDATE book SET bookname = '"+bookname+"' , bookauthor ='"+auther+"' , bookpublisher='"+publisher+"' WHERE bookId ='"+bookid+"'";
		Statement statement=con.createStatement();
		int i=statement.executeUpdate(query);
		if(i>0)
		{
			System.out.println("success");
			return "success";
		}
		else
		{
			System.out.println("faild");
			return "fail";
		}
	
		
	}
}
