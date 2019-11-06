package com.sessions.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sessions
 */
@WebServlet("/Sessions")
public class Sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		
		String username = request.getParameter("txtUserName");
		String userpassword = request.getParameter("txtPassword");
		
		
		if(username.equalsIgnoreCase("admin") && userpassword.equalsIgnoreCase("admin")) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("user: ", username);
			sesion.setAttribute("password", userpassword);		
			output.println("exitoso");
			response.sendRedirect("welcome.jsp");
		}else {
			output.println("no admin");
		}
		
				
		output.close();	
	}

}
