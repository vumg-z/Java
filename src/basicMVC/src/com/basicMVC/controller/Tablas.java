package com.basicMVC.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tablas
 */
@WebServlet("/Tablas")
public class Tablas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//configurar el mime
		response.setContentType("text/html");
		//crear un objeto raro que sirve de output y ahorrar codigo
		PrintWriter output = response.getWriter();
		//obtener los parametros
		long tabla = Integer.parseInt(request.getParameter("txtTabla"));
		long rango = Integer.parseInt(request.getParameter("txtRango"));
		
		for(long i = 1; i<rango+1; i++) {
			output.append("<p>");
			output.append(String.format("%d X %d = %d", tabla, i, tabla*i));
			output.append("</p>");
		}
		
		//cerrar el output
		output.close();
	}

}
