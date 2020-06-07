package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.model.DeleteBookDao;
import com.org.model.DeleteBookModel;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int bookid=Integer.parseInt(request.getParameter("bookid"));
			String password=request.getParameter("password");
			DeleteBookModel dm=new DeleteBookModel();
			HttpSession session=request.getSession(false);
			int librarianid=(int) session.getAttribute("regno");
			dm.setLibrarianid(librarianid);
			dm.setBookid(bookid);
			dm.setPassword(password);
			
			DeleteBookDao dd=new DeleteBookDao();
			
			try {
				
				String result=dd.deleteBook(dm);
				
				if(result.equals("success"))
				{
					System.out.println("successfully deleted");
					request.getRequestDispatcher("deletesuccess.html").forward(request, response);
				}
				else
				{
					System.out.println("Not deleted");
					request.getRequestDispatcher("deletefailed.html").forward(request, response);
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
