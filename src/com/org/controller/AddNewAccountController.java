package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.NewAccountDao;
import com.org.model.NewAccountModel;


@WebServlet("/AddNewAccountController")
public class AddNewAccountController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int regno=Integer.parseInt(request.getParameter("regno"));
		 String branch=request.getParameter("Branch");
		 int peryear=Integer.parseInt(request.getParameter("peryear"));
		 int firstyear=Integer.parseInt(request.getParameter("Firstyear"));
		 int secondyear=Integer.parseInt(request.getParameter("Secondyear"));
		 int thiredyear=Integer.parseInt(request.getParameter("Thiredyear"));
		 int fourthyear=Integer.parseInt(request.getParameter("Fourthyear"));
		 NewAccountModel nam=new NewAccountModel();
		 nam.setRegno(regno);
		 nam.setBranch(branch);
		 nam.setPeryear(peryear);
		 nam.setFirstyear(firstyear);
		 nam.setSecondyear(secondyear);
		 nam.setThiredyear(thiredyear);
		 nam.setFourthyear(fourthyear);
		 NewAccountDao nad=new NewAccountDao();
		 try {
			String result=nad.newAccount(nam);
			System.out.println(result);
			if(result.equals("success"))
			{
				request.getRequestDispatcher("AddnewAccountSuccess.html").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("AddnewAccountFailed.html").forward(request, response);	
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
