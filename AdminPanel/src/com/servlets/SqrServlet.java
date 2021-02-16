package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class SqrServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{	
		
		HttpSession session = req.getSession();
		
		int k = (int) session.getAttribute("k");
		
//		int k = Integer.parseInt(req.getParameter("k"));
		
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The square of number is " + k);
		
		System.out.println("sq called");
		
	}
	
}
