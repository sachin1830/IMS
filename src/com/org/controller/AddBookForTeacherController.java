package com.org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.AddBookforTeacherDao;
import com.org.model.AddBookforTeacherModel;
import com.org.model.AddbookDao;
import com.org.model.AddbookModel;

@WebServlet("/AddBookForTeacherController")
public class AddBookForTeacherController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		String bookname=request.getParameter("bookname");
		String bookauther=request.getParameter("bookauther");
		String bookpublisher=request.getParameter("bookpublisher");
		AddBookforTeacherModel adm=new AddBookforTeacherModel();
		adm.setBookid(bookid);
		adm.setBookname(bookname);
		adm.setBookauther(bookauther);
		adm.setBookpublisher(bookpublisher);
		AddBookforTeacherDao add=new AddBookforTeacherDao();
		try {
			String result=add.addBook(adm);
			if(result.equals("successfull"))
			{
				request.getRequestDispatcher("bookaddsuccess.html").forward(request, response);
				System.out.println("book added in teacher table");
			}
			else
			{
				request.getRequestDispatcher("addbookfailed.html").forward(request, response);
				System.out.println("not added book teacher table");
			}
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

}
