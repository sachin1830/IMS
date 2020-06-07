package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.TeachersBookUpdateDao;
import com.org.model.TeachersBookUpdateModel;



@WebServlet("/TeachersBookUpdateController")
public class TeachersBookUpdateController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		String bookname=request.getParameter("bookname");
		String auther=request.getParameter("authername");
		String publisher=request.getParameter("publisher");
		TeachersBookUpdateModel um=new TeachersBookUpdateModel();
		um.setBookid(bookid);
		um.setAuther(auther);
		um.setBookname(bookname);
		um.setPublisher(publisher);
		TeachersBookUpdateDao ud=new TeachersBookUpdateDao();
		try {
			String result=ud.updateBook(um);
			if(result.equals("success"))
			{
				System.out.println("Successfully updated");
				request.getRequestDispatcher("updatesuccess.html").forward(request, response);
			}
			else
			{
				System.out.println("faled updated");
				request.getRequestDispatcher("updatefailed.html").forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		}
	}


