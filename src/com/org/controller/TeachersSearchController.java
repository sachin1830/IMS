package com.org.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.model.TeachersSearchDao;
import com.org.model.TeachersSearchModel;


@WebServlet("/TeachersSearchController")
public class TeachersSearchController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String textentered=request.getParameter("search");
		System.out.println(textentered);
		TeachersSearchModel sm=new TeachersSearchModel();
		sm.setTextentred(textentered);
		ArrayList<TeachersSearchModel>arr=new ArrayList<TeachersSearchModel>();
		TeachersSearchDao sd=new TeachersSearchDao();
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
				request.getRequestDispatcher("TeachersSearchResult.jsp").forward(request, response);
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
