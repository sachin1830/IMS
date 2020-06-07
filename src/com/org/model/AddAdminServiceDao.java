package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddAdminServiceDao 
{
	public String addAdminService(AddAdminServiceModel aam) throws ClassNotFoundException, SQLException
	{
		int id=aam.getId();
		String name=aam.getName();
		String email=aam.getEmail();
		String pass=aam.getPassword();
		Connection con=DBConnection.createConnection();
		String query="insert into RegisterUser(RegNo,name,email,password) values(?,?,?,?)";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setInt(1,id);
		statement.setString(2,name);
		statement.setString(3,email);
		statement.setString(4,pass);
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
