package in.ineuron.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

public class DemoFilter extends HttpFilter implements Filter {
	
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("DemoFilter.class file is loading.....");
	}
	
	public DemoFilter() {
		System.out.println("DemoFilter Object is instantiated.....");
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("DemoFilter is initialized....");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.println("<h1>This line is added by demoFilter before processing the request...</h1>");
		
		chain.doFilter(request, response);
		out.println("<h1>This line is added by demoFilter after processing the request...</h1>");
	}

	
	public void destroy() {
		System.out.println("DemoFilter DeInitialized...");
	}
}
