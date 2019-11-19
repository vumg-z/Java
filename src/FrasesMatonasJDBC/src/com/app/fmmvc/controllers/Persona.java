package com.app.fmmvc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Persona extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String txtNombre = req.getParameter("txtNombre");
		String txtEdad = req.getParameter("txtEdad");
		String txtCarrera = req.getParameter("txtCarrera");
		
		
	}
	
}
