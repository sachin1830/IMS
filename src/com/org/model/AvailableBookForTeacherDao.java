package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AvailableBookForTeacherDao {
	public ArrayList<AvailableBookForTeacherModel> availablebook() throws ClassNotFoundException, SQLException
	{
		ArrayList<AvailableBookForTeacherModel> arr=new ArrayList<AvailableBookForTeacherModel>();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String query="select * from teacherbook";
		ResultSet res=statement.executeQuery(query);
		System.out.println("querry execute");
		int i=1;
		while(res.next())
		{
			AvailableBookForTeacherModel abi=new AvailableBookForTeacherModel();
			abi.setBookid(res.getInt(2));
			abi.setBookname(res.getString(3));
			abi.setBookauter(res.getString(4));
			abi.setBookpublisher(res.getString(5));
			arr.add(abi);
			i++;
		}
		return arr;
		
	}

}
