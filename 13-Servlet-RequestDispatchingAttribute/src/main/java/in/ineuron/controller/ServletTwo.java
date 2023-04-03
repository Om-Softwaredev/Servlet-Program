package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Control in Servlet 2");
		PrintWriter out = response.getWriter();
		out.println("<h1>Lets print Attributes</h1>");
		
		Enumeration<String> cursor = request.getAttributeNames();
		while (cursor.hasMoreElements()) {
			String name = (String) cursor.nextElement();
			out.println(name);
		}
		String object = (String)request.getAttribute("java");
	
	}

}
