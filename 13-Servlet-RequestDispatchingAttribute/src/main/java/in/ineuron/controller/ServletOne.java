package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Control in Servlet 1");
		request.setAttribute("Hyder", "java");
		request.setAttribute("NavinReddy", "telusko");
		request.setAttribute("NItin", "API");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");
		requestDispatcher.forward(request, response);
		System.out.println("Dispatch is success");
	
	}

}
