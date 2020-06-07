package com.org.model;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

public class PaymentDao {
	public String addPayment(PaymentModel pm) throws ClassNotFoundException, SQLException
	{
		String year=pm.getYear();
		int regno=pm.getRegno();
		int amount=pm.getAmount();
		GetPaymentDao gp=new GetPaymentDao();
		pm=gp.getPayment(pm);
		System.out.println(pm.getReturnamount());
		System.out.println(pm.getReturnperyearamount());
		int totalamount=pm.getReturnamount()+amount;
		int i=0;
		if(pm.getReturnperyearamount()>=totalamount)
		{
		Connection con=DBConnection.createConnection();
		String query="UPDATE account SET "+year+" = "+totalamount+" WHERE RegNo = "+regno+";";
		Statement statement=con.createStatement();
		i=statement.executeUpdate(query);
		}
		else
		{
			System.out.println("excedamount");
			return "excedamount";
		}
		if(i>0)
		{
			System.out.println("success");
			return "success";
		}
		else
		{
			System.out.println("failed");
			return "failed";
		}
		
	}
}
