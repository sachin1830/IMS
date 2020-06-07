package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.DeleteAccountDao;
import com.org.model.DeleteAccountModel;


@WebServlet("/DeleteAccountController")
public class DeleteAccountController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int regno=Integer.parseInt(request.getParameter("regno"));
		String pass=request.getParameter("password");
		DeleteAccountModel dam=new DeleteAccountModel();
		HttpSession session=request.getSession(false);
		int regnoaccountant=(int) session.getAttribute("regno");
		dam.setRegno(regno);
		dam.setPass(pass);
		dam.setRegnoaccountant(regnoaccountant);
		
			System.out.println("right");
			DeleteAccountDao dao=new DeleteAccountDao();
			
			try {
				String result=dao.deleteAccount(dam);
				if(result.equals("success"))
				{
					request.getRequestDispatcher("AccountDeleteSuccess.html").forward(request, response);
				}
				else
				{
					request.getRequestDispatcher("AccountDeleteFailed.html").forward(request, response);
				}
				System.out.println(result);
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		
	}

}
