package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.DeleteBookForTeacherDao;
import com.org.model.DeleteBookForTeacherModel;

@WebServlet("/DeleteBookForTeacherController")
public class DeleteBookForTeacherController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		String password=request.getParameter("password");
		HttpSession session=request.getSession(false);
	    int librarianid=(int) session.getAttribute("regno");
	    DeleteBookForTeacherModel dbtm=new DeleteBookForTeacherModel();
	    dbtm.setBookid(bookid);
	    dbtm.setPassword(password);
	    dbtm.setRegno(librarianid);
	    
	    DeleteBookForTeacherDao dbtd=new DeleteBookForTeacherDao();
	    
	    try {
			String result=dbtd.deleteBook(dbtm);
			if(result.equals("success"))
			{
				System.out.println("successfully deleted");
				request.getRequestDispatcher("DeleteBookForTeacherSuccess.html").forward(request, response);
			}
			else
			{
				System.out.println("Not deleted");
				request.getRequestDispatcher("DeleteBookForTeacherFail.html").forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
