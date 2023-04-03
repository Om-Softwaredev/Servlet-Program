package in.ineuron.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {
	
	private FilterConfig config;
       
	static {
		System.out.println("LogFilter.class file is loading...");
	}

	
    public LogFilter() {
    	System.out.println("LogFilter object is instatiated...");
    }

    public void init(FilterConfig Config) throws ServletException {
    	this.config=Config;
    	System.out.println("LogFilter object is initiazed... ");
    }
    
	

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.println("<h1>This line is added by LogFilter before processing the request...</h1>");
		
		ServletContext context = config.getServletContext();
		HttpServletRequest req = (HttpServletRequest) request;
		context.log("A request is coming from :: "+request.getRemoteHost()+" for URL :: "+req.getRequestURL()+" at "+ new Date());
		
		chain.doFilter(request, response);
		out.println("<h1>This line is added by LogFilter after processing the request...</h1>");
	}
	public void destroy() {
		System.out.println("LogFilter object is DeInstantiated...");
	}

}
