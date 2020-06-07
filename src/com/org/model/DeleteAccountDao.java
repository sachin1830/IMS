package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

public class DeleteAccountDao {
	public String deleteAccount(DeleteAccountModel dam) throws ClassNotFoundException, SQLException
	{
		System.out.println("dao call");
		
		int regno=dam.getRegno();
		int regnoaccountant=dam.getRegnoaccountant();
		String pass=dam.getPass();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String fetchquerry="select password from Registeruser where Regno="+regnoaccountant+"";
		ResultSet res=statement.executeQuery(fetchquerry);
		res.next();
		String actualpass=res.getString(1);
		System.out.println(actualpass);
		if(pass.equals(actualpass))
		{
			String query="delete from account where RegNo="+regno+"";
			int i=statement.executeUpdate(query);
			if(i>0)
			{
				return "success";
			}
			else
			{
				return "failed";
			}
		}
		else
		{
			return "failed";
		}
		
	}
}
