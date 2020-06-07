package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.IssueBookDao;
import com.org.model.TeacherIssueBookDao;
import com.org.model.TeacherIssueBookModel;


@WebServlet("/TeacherIssueBookController")
public class TeacherIssueBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		String bookname=request.getParameter("bookname");
		int regno=Integer.parseInt(request.getParameter("regno"));
		String teachername=request.getParameter("name");
		TeacherIssueBookModel tbm=new TeacherIssueBookModel();
		tbm.setBookId(bookid);
		tbm.setBookname(bookname);
		tbm.setRegno(regno);
		tbm.setTeachername(teachername);
		TeacherIssueBookDao tbd=new TeacherIssueBookDao();
		
	
			String result;
			try {
				result = tbd.issueBook(tbm);
				if(result.equals("success"))
				{
					System.out.println("Successfully issued");
					request.getRequestDispatcher("teacherissuebooksuccess.html").forward(request, response);
				}
				else
				{
					System.out.println("some problem ");
					request.getRequestDispatcher("teacherissuebookfailed.html").forward(request, response);;
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
