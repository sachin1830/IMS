package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SearchDao {
	public ArrayList<SearchModel> search(SearchModel sm) throws ClassNotFoundException, SQLException
	{
		ArrayList<SearchModel>arr=new ArrayList<SearchModel>();
		String enteredtext=sm.getTextentred();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String query="select * from book where bookname ='"+enteredtext+"'";
		ResultSet res=statement.executeQuery(query);
		//System.out.println("resultset"+res.next());
		int i=0;
		if(res!=null)
		{
			while(res.next())
			{
				SearchModel smi=new SearchModel();
				smi.setBookid(res.getInt(2));
				smi.setBookname(res.getString(3));
				smi.setBookauther(res.getString(4));
				smi.setBookpublisher(res.getString(5));
				System.out.println("object added");
				arr.add(smi);
				i++;
			}
			return arr;
		}
		else
		{
			return arr;
		}
		
	}
}
