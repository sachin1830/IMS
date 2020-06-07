package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccountDao {
	public ArrayList<AccountModel>studentAccount(int regno) throws ClassNotFoundException, SQLException
	{
		System.out.println("account dao call");
		int regno1=regno;
		ArrayList<AccountModel>arr=new ArrayList<AccountModel>();
		Connection con=DBConnection.createConnection();
		Statement statement=con.createStatement();
		String query="select * from account where RegNo='"+regno1+"'";
		ResultSet res=statement.executeQuery(query);
		int i=0;
		int totalamount=0;
		float percentage=0.0f;
		while(res.next())
		{
			AccountModel ami=new AccountModel();
			ami.setBranch(res.getString(3));
			ami.setFirstyear(res.getInt(4));
			ami.setSecondyear(res.getInt(5));
			ami.setThiredyear(res.getInt(6));
			ami.setFourthyear(res.getInt(7));
			ami.setPeryear(res.getInt(8));
			totalamount=res.getInt(4)+res.getInt(5)+res.getInt(6)+res.getInt(7);
			ami.setTotalamount(totalamount);
			percentage=(totalamount/(float)(res.getInt(8)*4))*100;
			ami.setPercentage(percentage);
			arr.add(ami);
			i++;
		}
		System.out.println(percentage);
		System.out.println(totalamount);
		return arr;
	}
}
