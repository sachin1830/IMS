package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.RegisterDao;
import com.org.model.RegisterModel;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt( request.getParameter("rgdno"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("pass");
		RegisterModel rm=new RegisterModel();
		rm.setRegno(regno);
		rm.setName(name);
		rm.setEmail(email);
		rm.setPassword(password);
		System.out.println("values set");
		RegisterDao rd=new RegisterDao();
		try {
			String result=rd.registerUser(rm);
			if(result.equals("success"))
			{
				request.getRequestDispatcher("signin.html").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("SignUp.html").forward(request, response);
			}
		} catch (Exception e) {
			System.out.println(e);
		} 
		}
		//System.out.println("call servlet");
	}


