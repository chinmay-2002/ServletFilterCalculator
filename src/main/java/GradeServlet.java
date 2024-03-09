

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GradeServlet
 */
@WebServlet("/GradeServlet")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String grade = (String) request.getAttribute("grade");
		 // Writing response
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<html><body bgcolor='lightblue'><center>");
		 out.println("<h1>Your Grade For this is: " + grade + "</h1>");
		 out.println("</center></body></html>");

	}
}
