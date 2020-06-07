package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewAccountDao {
	public String newAccount(NewAccountModel nam) throws ClassNotFoundException, SQLException
	{
		 int regno=nam.getRegno();
		 String branch=nam.getBranch();
		 int peryear=nam.getPeryear();
		 int firstyear=nam.getFirstyear();
		 int secondyear=nam.getSecondyear();
		 int thiredyear=nam.getThiredyear();
		 int fourthyear=nam.getFourthyear();
		 Connection con=DBConnection.createConnection();
		 String query="insert into account(RegNo,branch,firstyear,secondyear,thiredyear,fourthyear,peryear)values(?,?,?,?,?,?,?)";
		 PreparedStatement statement=con.prepareStatement(query);
		 statement.setInt(1,regno);
		 statement.setString(2,branch);
		 statement.setInt(3,firstyear);
		 statement.setInt(4,secondyear);
		 statement.setInt(5,thiredyear);
		 statement.setInt(6,fourthyear);
		 statement.setInt(7,peryear);
		 int i=statement.executeUpdate();
		 if(i>0)
		 {
			 return "success";
		 }
		 else
		 {
			 return "failed";
		 }
		
		
	}
}
