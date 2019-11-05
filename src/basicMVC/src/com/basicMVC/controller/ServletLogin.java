package com.basicMVC.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter output = response.getWriter();
		
		//obtengo los parametros
		String userName = request.getParameter("txtUser");
		String userPassword = request.getParameter("txtPassword");
		
		output.append("<html>");
		
		output.append("<head>");
			output.append("<title>");
				output.append("hello");
			output.append("</title>");
			output.append("<link ");
			output.append("href=");
				output.append("../WebContent/css/bootstrap.min.css>");
			
		output.append("</head>");
		
		
		output.append("<body>");
		
			output.append("<h2>");
				output.append("Credenciales del usuario");
			output.append("</h2>");
			
			output.append("<p>");
				output.append("user: "+userName);
			output.append("</p>");
			
			output.append("<p>");
				output.append("user: "+userPassword);
			output.append("</p>");
			
		output.append("</body>");		
		
		output.append("</html>");
		
		
		output.close();
	}

}
