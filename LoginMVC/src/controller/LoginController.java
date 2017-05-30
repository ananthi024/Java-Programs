package controller;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.*;
import dao.*;


/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String username=request.getParameter("uname");
			String password=request.getParameter("passwd");
		
		Login loginobj=new Login();
		loginobj.setLogin(username);
        loginobj.setPassword(password);
		
		try
		{
					
		if(loginobj.isValidUser())
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("Success.jsp");
			dispatch.forward(request,response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("Failure.jsp");
			dispatch.forward(request,response);
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
