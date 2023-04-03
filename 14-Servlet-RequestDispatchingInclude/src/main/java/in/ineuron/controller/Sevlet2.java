package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sevlet2")
public class Sevlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Control in Servlet 2");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Servlet 2 Response</h1>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");
		requestDispatcher.forward(request, response);
	}

}
