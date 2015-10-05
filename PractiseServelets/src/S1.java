

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet(
		urlPatterns = { "/S1" }, 
		initParams = { 
				@WebInitParam(name = "x", value = "3", description = "initpara")
		})
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  @Override
	    public void service(HttpServletRequest request, 
	                        HttpServletResponse response)
	                        throws ServletException,
	                        IOException 
	    {
	        response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet S1</title>");
	            out.println("</head>");
	            out.println("<body>");
	            
	            out.println("<h1> Welcome to the World Of Servlet</h1>");
	            out.println("</body>");
	            out.println("</html>");
	        }
	    }
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

}
