package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.AdminDeleteServiceDao;
import com.org.model.AdminDeleteServiceModel;


@WebServlet("/AdminDeleteServiceController")
public class AdminDeleteServiceController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("inputid"));
		
		String pass=request.getParameter("password");
		HttpSession session=request.getSession(false);
		int adminregno=(int) session.getAttribute("regno");
		AdminDeleteServiceModel adsm=new AdminDeleteServiceModel();
		adsm.setAdminpass(pass);
		adsm.setRegno(regno);
		adsm.setAdminregno(adminregno);
		AdminDeleteServiceDao adsd=new AdminDeleteServiceDao();
		try {
			String result=adsd.deleteService(adsm);
			System.out.println(result);
			if(result.equals("success"))
			{
				request.getRequestDispatcher("AdminDeleteServiceSuccess.html").forward(request, response);
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
