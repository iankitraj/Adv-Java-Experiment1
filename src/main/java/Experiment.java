

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Experiment")
public class Experiment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Experiment() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Setting the content type of the response to HTML
        response.setContentType("text/html");
       
        // Sending an HTML response to the client with a styled message
        response.getWriter().println("<html><head><style>" + getCSS() + "</style></head><body>");
        response.getWriter().println("<div class='form-container'>Welcome to Servlet tutorial</div>");
        response.getWriter().println("</body></html>");

		
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	 // Setting the content type of the response to HTML
        response.setContentType("text/html");
       
        // Sending an HTML response to the client with a styled message
        response.getWriter().println("<html><head><style>" + getCSS() + "</style></head><body>");
        response.getWriter().println("<div class='form-container'>Welcome to J2EE tutorial</div>");
        response.getWriter().println("</body></html>");
    }
	       
	    // Method to provide inline CSS for styling the response
	       private String getCSS() {
	           return """
	               body {
	                   font-family: Arial, sans-serif;
	                   background-color: #f4f4f9;
	                   margin: 0;
	                   display: flex;
	                   justify-content: center;
	                   align-items: center;
	                   height: 100vh;
	               }
	               .form-container {
	                   background: white;
	                   color: #4CAF50;
	                   padding: 20px 30px;
	                   border-radius: 10px;
	                   box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	                   text-align: center;
	                   font-size: 24px;
	               }
	           """;
	}

}


Experiment1 Done!
