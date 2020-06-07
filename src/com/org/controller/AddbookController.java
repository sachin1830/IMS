package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.AddbookDao;
import com.org.model.AddbookModel;



@WebServlet("/AddbookController")
public class AddbookController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		String bookname=request.getParameter("bookname");
		String bookauther=request.getParameter("bookauther");
		String bookpublisher=request.getParameter("bookpublisher");
		AddbookModel adm=new AddbookModel();
		adm.setBookid(bookid);
		adm.setBookname(bookname);
		adm.setBookauther(bookauther);
		adm.setBookpublisher(bookpublisher);
		AddbookDao add=new AddbookDao();
		try {
			String result=add.addBook(adm);
			if(result.equals("successfull"))
			{
				request.getRequestDispatcher("bookaddsuccess.html").forward(request, response);
				System.out.println("book added");
			}
			else
			{
				request.getRequestDispatcher("addbookfailed.html").forward(request, response);
				System.out.println("not added book");
			}
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
}
