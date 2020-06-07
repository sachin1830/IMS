package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.AccountDao;
import com.org.model.AccountModel;

@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<AccountModel>arr=new ArrayList<AccountModel>();
		HttpSession session=request.getSession(false);
		int regno=(int)session.getAttribute("regno");
		AccountDao ad=new AccountDao();
		try {
			arr=ad.studentAccount(regno);
			request.setAttribute("account",arr);
			request.getRequestDispatcher("StudentAccount.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
