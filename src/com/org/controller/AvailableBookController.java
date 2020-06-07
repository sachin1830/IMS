package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.AvailableBookDao;
import com.org.model.AvailableBookModel;

@WebServlet("/AvailableBookController")
public class AvailableBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("availabe controller call");
		ArrayList<AvailableBookModel> arr=new ArrayList<AvailableBookModel>();
		try {
			arr=new AvailableBookDao().availablebook();
			System.out.println("Object return");
			request.setAttribute("result",arr);
			request.getRequestDispatcher("availabebook.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
