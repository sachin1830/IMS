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

import com.org.model.StudentAvailableBookDao;
import com.org.model.StudentAvailableBookModel;

@WebServlet("/StudentAvailabeBookController")
public class StudentAvailabeBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<StudentAvailableBookModel> arr=new ArrayList<StudentAvailableBookModel>();
		HttpSession session=request.getSession(false);
		int regno=(int) session.getAttribute("regno");
		System.out.println(regno);
		StudentAvailableBookDao sabd=new StudentAvailableBookDao();
		try {
	       arr= sabd.StudentAvailbeBook(regno);
	       request.setAttribute("bookresult",arr);
	       request.getRequestDispatcher("StudentAvailablebook.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
