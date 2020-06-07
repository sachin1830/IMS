package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.AccountSearchDao;
import com.org.model.AccountSearchModel;


@WebServlet("/AccountSearchController")
public class AccountSearchController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   int regno=Integer.parseInt(request.getParameter("search"));
	   AccountSearchModel asm=new AccountSearchModel();
	   asm.setRegno(regno);
	   ArrayList<AccountSearchModel>arr=new ArrayList<AccountSearchModel>();
	   AccountSearchDao asd=new AccountSearchDao();
	   try {
		arr=asd.search(asm);
		if(arr.isEmpty())
		{
			System.out.println("not found");
			request.getRequestDispatcher("searchnotfound.html").forward(request, response);
		}
		else
		{
			request.setAttribute("search",arr);
			request.getRequestDispatcher("AccountSearchResult.jsp").forward(request, response);
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
