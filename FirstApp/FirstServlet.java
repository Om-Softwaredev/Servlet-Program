import java.io.*;
import javax.servlet.*;

public class FirstServlet implements Servlet
{
	static
	{
		System.out.println("FirstServlet.class file is loading...");
	}

	public FirstServlet()
	{
		System.out.println("FirstServlet Object is instantiated...");
	}

	//For Servlet Initialization container calls this method
	public  void init(ServletConfig config) throws ServletException
	{
		System.out.println("Servlet initialziation...");
	}

  	public ServletConfig getServletConfig()
	{
		return null;
	}

	//Request Processing logic
  	public  void service(ServletRequest request,ServletResponse response) 
		throws ServletException, IOException
	{
		System.out.println("Servlet Request Processing ...");
	}

  	public  String getServletInfo()
	{
		return null;
	}

	//Servlet DeInstantion logic
  	public  void destroy()
	{
		System.out.println("Servlet De-Instantiation...");
	}
}
