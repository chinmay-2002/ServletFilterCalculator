

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/Filter")
public class Filter implements javax.servlet.Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		int marks1 = Integer.parseInt(request.getParameter("marks1"));
		 int marks2 = Integer.parseInt(request.getParameter("marks2"));
		 int marks3 = Integer.parseInt(request.getParameter("marks3"));
		 // Calculating average marks
		 double average = (marks1 + marks2 + marks3) / 3.0;
		 // Assigning grade based on average marks
		 String grade;
		 if (average >= 90) {
		 grade = "A";
		 } else if (average >= 80) {
		 grade = "B";
		 } else if (average >= 70) {
		 grade = "C";
		 } else if (average >= 60) {
		 grade = "D";
		 }else if (average >= 50) {
		 grade = "E";
		 }
		 else {
		 grade = "Error: Average marks below 50";
		 
		 }
		 // Setting grade attribute in request
		 request.setAttribute("grade", grade);
		 // Forwarding request to servlet
		 chain.doFilter(request, response);

	}

}
