package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection=null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER loaded successfully....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void init() throws ServletException{
		System.out.println("CONFIG object created and got thevalues from config object...\n\n");
		
		String url=getInitParameter("url");
		String username=getInitParameter("username");
		String password=getInitParameter("password");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		try {
			connection= DriverManager.getConnection(url,username,password);
			if (connection != null) {
				System.out.println("CONNECTION established successfully....");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Request Type is :: "+request.getMethod()+"</h1>");
		
		Statement statement=null;
		ResultSet resultSet=null;
		try {
			statement = connection.createStatement();
			resultSet=statement.executeQuery("select sid,sname,sage,saddress from student");
			System.out.println("ID\tNAME\tAGE\tADDRESS");
			while (resultSet.next()) {
				//use the resultSet and process it...
				System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
