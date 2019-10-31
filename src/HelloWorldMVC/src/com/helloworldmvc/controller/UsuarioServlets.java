package com.helloworldmvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UsuarioServlets")
public class UsuarioServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid = "";
		String sname = "";
		String slmao = "";
		
		sid = request.getParameter("id");
		sname = request.getParameter("edad");
		slmao = request.getParameter("lmao");
		
		response.getWriter().append("The id input is: "+sid);
		response.getWriter().append("The input name is: "+sname);
		response.getWriter().append("The lmao input is: "+slmao);
	}

}
