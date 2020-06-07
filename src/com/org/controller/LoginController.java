package com.org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.LoginDao;
import com.org.model.LoginModel;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("yourregno"));
		String password=request.getParameter("your_pass");
		LoginModel lm=new LoginModel();
		lm.setRegno(regno);
		lm.setPassword(password);
		LoginDao ld=new LoginDao();
		try {
			//PrintWriter out=response.getWriter();
			String result=ld.loginUser(lm);
			
			if(result.equals("success"))
			{
				HttpSession session=request.getSession();
				session.setAttribute("regno",regno);
				System.out.println("session set");
				String resultregno=Integer.toString(lm.getRegno());
				if(resultregno.startsWith("111"))
				{
					request.getRequestDispatcher("admin.html").forward(request, response);
				}
				else if(resultregno.startsWith("222"))
				{
					request.getRequestDispatcher("AccountAdminDashboard.html").forward(request, response);
				}
				else if(resultregno.startsWith("333"))
				{
					request.getRequestDispatcher("LibreryAdminDashBoard.html").forward(request, response);
				}
				else if(resultregno.startsWith("444"))
				{
					request.getRequestDispatcher("TeacherDashBoard.html").forward(request, response);
				}
				else {
				//ld.getloginuser();
				request.getRequestDispatcher("StudentDashBoard.html").forward(request, response);
				}
			}
			else
			{
				System.out.println("not set session");
				request.getRequestDispatcher("Errorsignin.html").forward(request, response);
			}
				
				
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
