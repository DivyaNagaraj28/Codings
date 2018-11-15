package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginDetails")
public class LoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String user=request.getParameter("user");
		int password=Integer.parseInt(request.getParameter("pass"));
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<b><i>Welcome!!!!!<i><b>");
		out.println("</html>");
		out.println("</body>");
		out.println(user);
		
		
		
	}

}
