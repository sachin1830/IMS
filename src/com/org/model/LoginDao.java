package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	LoginModel lm1;
	public String loginUser(LoginModel lm) throws ClassNotFoundException, SQLException
	{
		int rgno=lm.getRegno();
		String password=lm.getPassword();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String query="select * from registeruser where Regno='"+rgno+"' and password='"+password+"'";
		ResultSet rs=statement.executeQuery(query);
		System.out.println("statement executed");
		if(rs.next())
		{
			lm1=lm;
			return "success";
		}
		else
		{
		   return "failed";
		}
	}
	public LoginModel getloginuser()
	{
		
		System.out.println("hiii"+lm1.getRegno());
		return lm1;
	}
}
