package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddbookDao {
	public String addBook(AddbookModel ad) throws ClassNotFoundException, SQLException
	{
		System.out.println("DAo call");
		int bookid=ad.getBookid();
		String bookname=ad.getBookname();
		String bookauther=ad.getBookauther();
		String bookpublisher=ad.getBookpublisher();
		Connection con=DBConnection.createConnection();
		String query="insert into book(bookId,bookname,bookauthor,bookpublisher)values(?,?,?,?)";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setInt(1,bookid);
		statement.setString(2,bookname);
		statement.setString(3,bookauther);
		statement.setString(4,bookpublisher);
		int i=statement.executeUpdate();
		if(i>0)
		{
			return "successfull";
		}
		else
		{
			return "failed";
		}
		
	}
}
