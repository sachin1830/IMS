package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.org.model.TeacherReturnBookDao;
import com.org.model.TeacherReturnBookModel;


@WebServlet("/TeacherReturnBookController")
public class TeacherReturnBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("Teacherbookid"));
		TeacherReturnBookModel rbm=new TeacherReturnBookModel();
		rbm.setBookid(bookid);
		TeacherReturnBookDao rbd=new TeacherReturnBookDao();
		try {
			String result=rbd.returnTeachersBook(rbm);
			System.out.println(result);
			if(result.equals("success"))
			{
				request.getRequestDispatcher("TeachersBooktab.html").forward(request, response);
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
