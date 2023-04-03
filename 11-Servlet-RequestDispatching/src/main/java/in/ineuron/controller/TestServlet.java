package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("Control in Test Servlet");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Welcome to Servlet</h1>");
		RequestDispatcher reqDis = request.getRequestDispatcher("/SecondServlet");
		reqDis.forward(request, response);
	}

}
