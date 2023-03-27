import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns="/disp")
public class FourthServlet  extends GenericServlet
{
	public  void service(ServletRequest request, ServletResponse response) throws 
		ServletException,IOException
	{
			PrintWriter out = response.getWriter();
			out.println("<h1 style='color:blue;'>Writing Servlet using Generic Servlet is easy....</h1>");
			out.close();
	}
}
