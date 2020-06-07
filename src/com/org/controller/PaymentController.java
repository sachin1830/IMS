package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.GetPaymentDao;
import com.org.model.PaymentDao;
import com.org.model.PaymentModel;

@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String year=request.getParameter("year");
		int regno=Integer.parseInt(request.getParameter("regnumber"));
		int amount =Integer.parseInt(request.getParameter("amount"));
		PaymentModel pm=new PaymentModel();
		pm.setAmount(amount);
		pm.setRegno(regno);
		pm.setYear(year);
		System.out.println(year);
		System.out.println(amount);
		PaymentDao pd=new PaymentDao();
		try {
			String result=pd.addPayment(pm);
			System.out.println(result);
			if(result.equals("failed") || result.equals("excedamount"))
			{
				request.getRequestDispatcher("Paymentfailed.html").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("PaymentSuccess.html").forward(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
