package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	public String registerUser(RegisterModel rm) throws ClassNotFoundException, SQLException
	{
		System.out.println("DAO call");
		int regno=rm.getRegno();
		String name=rm.getName();
		String email=rm.getEmail();
		String password=rm.getPassword();
		Connection con=DBConnection.createConnection();
		String query="insert into RegisterUser(RegNo,name,email,password) values(?,?,?,?)";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setInt(1,regno);
		statement.setString(2,name);
		statement.setString(3,email);
		statement.setString(4,password);
		int i=statement.executeUpdate();
		if(i>0)
		{
			System.out.println("successfull");
			return "success";
		}
		else
		{
			System.out.println("faild");
			return "fail";
		}
		
	}
}
