package com.atguigu.springmvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**

The problem is that when you return a view name from your controller method, 
the Spring DispatcherServlet will do a forward to the given view, preserving the original PUT method.

On attempting to handle this forward, Tomcat will refuse it, 
with the justification that a PUT to a JSP could be construed to mean "replace this JSP file on the server with the content of this request."

Really you want your controller to handle your PUT requests and then to subsequently forward to your JSPs as GET. 
Fortunately Servlet 3.0 provides a means to filter purely on the FORWARD dispatcher.

 */
public class GetMethodConvertingFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
		// do nothing
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(wrapRequest((HttpServletRequest) request), response);
	}

	@Override
	public void destroy() {
		// do nothing
	}

	private static HttpServletRequestWrapper wrapRequest(HttpServletRequest request) {
		return new HttpServletRequestWrapper(request) {
			@Override
			public String getMethod() {
				return "GET";
			}
		};
	}
}