package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.IssueBookDao;
import com.org.model.IssueBookModel;


@WebServlet("/IssueBookController")
public class IssueBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"))    ;
		String bookname=request.getParameter("bookname");
		int regno=Integer.parseInt(request.getParameter("regno"));
		String studentname=request.getParameter("studentname");
		IssueBookModel ibm=new IssueBookModel();
		ibm.setBookId(bookid);
		ibm.setBookname(bookname);
		ibm.setRegno(regno);
		ibm.setStudentname(studentname);
		IssueBookDao ibd=new IssueBookDao();
		try {
			String result=ibd.issueBook(ibm);
			if(result.equals("success"))
			{
				System.out.println("Successfully issued");
				request.getRequestDispatcher("issuebooksuccess.html").forward(request, response);
			}
			else
			{
				System.out.println("some problem ");
				request.getRequestDispatcher("issuebookfailed.html").forward(request, response);;
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
