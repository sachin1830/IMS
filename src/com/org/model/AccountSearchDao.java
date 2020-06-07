package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccountSearchDao {
	public ArrayList<AccountSearchModel>search(AccountSearchModel asm) throws ClassNotFoundException, SQLException
	{
		ArrayList<AccountSearchModel>arr=new ArrayList<AccountSearchModel>();
		int regno=asm.getRegno();
		Connection con=DBConnection.createConnection();
		String query="select * from account where Regno="+regno+"";
		Statement statement=con.createStatement();
		ResultSet res=statement.executeQuery(query);
		int i=0;
		if(res!=null)
		{
			while(res.next())
			{
				AccountSearchModel assi=new AccountSearchModel();
				assi.setRegno(res.getInt(2));
				assi.setFirstyear(res.getInt(4));
				assi.setSecondyear(res.getInt(5));
				assi.setThiredyear(res.getInt(6));
				assi.setFourthyear(res.getInt(7));
				assi.setPeryear(res.getInt(8));
				arr.add(assi);
				i++;
				System.out.println("added");
			}
			return arr;
		}
		return arr;
		
	}

}
