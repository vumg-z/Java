package com.helloworldmvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helloworldMVC.model.User;


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
		int iid = 0;
		String sname = "";
		
		
		sid = request.getParameter("id");
		iid = Integer.parseInt(sid);
		sname = request.getParameter("edad");

		
		User myUser = new User(iid,sname);
	
		
		response.getWriter().append("The input ID is: "+myUser.getId());
		response.getWriter().append("The input name is: "+myUser.getNombre());
		
	}
    
    

}
