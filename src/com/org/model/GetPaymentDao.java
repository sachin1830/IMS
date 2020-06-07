package com.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetPaymentDao {
	public PaymentModel getPayment(PaymentModel pm) throws ClassNotFoundException, SQLException
	{
		
		System.out.println("getpayment");
		String year=pm.getYear();
		int regno=pm.getRegno();
		Connection con=DBConnection.createConnection();
		String query="select "+year+",peryear from account where Regno="+regno+";";
		Statement statement=con.createStatement();
		ResultSet res=statement.executeQuery(query);
		if(res!=null)
		{
		res.next();
		pm.setReturnamount(res.getInt(1));
		pm.setReturnperyearamount(res.getInt(2));
		}
		else
		{
			System.out.println("res is zero");
		}
		
		return pm;
	}
}
