package com.org.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ReturnBookDao {
	public String returnBook(ReturnBookModel rbm) throws ClassNotFoundException, SQLException
	{
		int bookid=rbm.getBookid();
		//System.out.println(bookid);
		Connection con=DBConnection.createConnection();
		String query="delete from issuebook where bookid="+bookid+"";
		Statement statement=con.createStatement();
		int i=statement.executeUpdate(query);
		//System.out.println(i);
		if(i>0)
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}

}
