package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlate
 */
@WebServlet("/register")
public class RegisterServlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String str=request.getParameter("username");
		String strid=request.getParameter("studentId");
		int id=Integer.parseInt(strid);
		String strcity=request.getParameter("city");
		
		String langstr=request.getParameter("language");
		String[] hobby=request.getParameterValues("hobby");
		
		
		
		
		
		out.print("<html><body>");
		out.print("<strong>Welcome"+str+"</strong><br>");
		out.print("your id is "+strid);
		out.print("your city is "+strcity);
		out.print("your language is "+langstr);
		
		Stream.of(hobby).forEach(out::print);
		
		
		out.print("</html></body>");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
