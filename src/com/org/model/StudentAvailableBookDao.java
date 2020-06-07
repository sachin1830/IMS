package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentAvailableBookDao {
	public ArrayList<StudentAvailableBookModel> StudentAvailbeBook(int regno) throws ClassNotFoundException, SQLException
	{
		int regno1=regno;
		ArrayList<StudentAvailableBookModel>arr=new ArrayList<StudentAvailableBookModel>();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String query="select * from issuebook where regno='"+regno1+"'";
		ResultSet rs=statement.executeQuery(query);
		System.out.println("query execute student");
		int i=1;
		while(rs.next())
		{
			StudentAvailableBookModel sabi=new StudentAvailableBookModel();
			sabi.setBookid(rs.getInt(2));
			sabi.setBookname(rs.getString(3));
			arr.add(sabi);
			i++;
		}
		return arr;
		
	}
}
