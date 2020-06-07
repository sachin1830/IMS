package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddLibrerianController")
public class AddLibrerianController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("LibrerianId"));
		String name=request.getParameter("Librerianname");
		String email=request.getParameter("email");
		String pass=request.getParameter("Password");
	}

}
