package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.SearchDao;
import com.org.model.SearchModel;


@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String textentered=request.getParameter("search");
		System.out.println(textentered);
		SearchModel sm=new SearchModel();
		sm.setTextentred(textentered);
		ArrayList<SearchModel>arr=new ArrayList<SearchModel>();
		SearchDao sd=new SearchDao();
		try {
			arr=sd.search(sm);
			if(arr.isEmpty())
			{
				System.out.println("not found");
				request.getRequestDispatcher("searchnotfound.html").forward(request, response);
			}
			else
			{
				request.setAttribute("search",arr);
				request.getRequestDispatcher("Searchresult.jsp").forward(request, response);
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
