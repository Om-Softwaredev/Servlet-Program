package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("TestServlet.class file is loading...");
	}
	
	public TestServlet() {
		System.out.println("TestServlet Object is instatiated...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("TestServlet Object is initialized...");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		request.setAttribute("hyder", "java");
		request.setAttribute("navinreddy", "jee");
		request.removeAttribute("navinreddy");
		request.setAttribute("hyder", "react");
		out.println("<h1>Demonstration of ServletRequestAttributeListener</h1>");
		out.close();
	}

}
