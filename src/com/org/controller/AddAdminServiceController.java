package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.AddAdminServiceDao;
import com.org.model.AddAdminServiceModel;


@WebServlet("/AddAccountant")
public class AddAdminServiceController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("call");
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String pass=request.getParameter("Password");
		AddAdminServiceModel aam=new AddAdminServiceModel();
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(pass);
		aam.setId(id);
		aam.setEmail(email);
		aam.setName(name);
		aam.setPassword(pass);
		AddAdminServiceDao aad=new AddAdminServiceDao();
		try {
			String result=aad.addAdminService(aam);
			System.out.println(result);
			if(result.equals("success"))
			{
				request.getRequestDispatcher("AdminAddServiceSuccessfull.html").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("AdminAddServiceFailed.html").forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
