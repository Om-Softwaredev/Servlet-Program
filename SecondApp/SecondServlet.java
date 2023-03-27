import java.io.*;
import javax.servlet.*;
public class SecondServlet implements Servlet
{
	static
	{
		System.out.println("SecondServlet.class file is loading...");
	}
	public SecondServlet()
	{
		System.out.println("SecondServlet Object is instantiated...");
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
		response.setContentType("text/html");

		System.out.println("Servlet Request Processing ...");

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red;'><marquee>Welcome 2 Advanced Java...</marquee></h1>");
		out.println("</body>");
		out.println("</html>");

		out.close();

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