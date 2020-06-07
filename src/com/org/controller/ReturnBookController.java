package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.ReturnBookDao;
import com.org.model.ReturnBookModel;


@WebServlet("/ReturnBookController")
public class ReturnBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		ReturnBookModel rbm=new ReturnBookModel();
		rbm.setBookid(bookid);
		ReturnBookDao rbd=new ReturnBookDao();
		try {
			String result=rbd.returnBook(rbm);
			System.out.println(result);
			if(result.equals("success"))
			{
				request.getRequestDispatcher("LibreryAdminDashBoard.html").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("returnbookfailed.html").forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
