package com.Firstservlet.Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddingInt")
public class AddingInt extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{

            response.setContentType("text/html"); 
	    int a=Integer.parseInt(request.getParameter("num1"));
            int b=Integer.parseInt(request.getParameter("num2"));
	    int k;
	    k=a+b;
	    PrintWriter out= response.getWriter();
	    out.println("The addition of two numbers" +k);
	}

}
