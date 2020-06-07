package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDeleteServiceDao 
{
	public String deleteService(AdminDeleteServiceModel adsm) throws ClassNotFoundException, SQLException
	{
		System.out.println("AdminDeleteServiceDao call");
		int regno=adsm.getRegno();
		int adminregno=adsm.getAdminregno();
		String inputpass=adsm.getAdminpass();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String fetchquerry="select password from Registeruser where Regno="+adminregno+"";
		ResultSet res=statement.executeQuery(fetchquerry);
		res.next();
		
		String actualpass=res.getString(1);
		
		if(actualpass.equals(inputpass))
		{
			String query="delete from Registeruser where RegNo="+regno+" ";
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
