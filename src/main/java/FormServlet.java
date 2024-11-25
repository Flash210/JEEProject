import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Map the servlet to the URL pattern "/submitForm"
@WebServlet("/submitForm")
public class FormServlet extends HttpServlet {

    // Handle POST requests from the form
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response content type to HTML
        response.setContentType("text/html;charset=UTF-8");

        // Retrieve form data from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");

        // Generate HTML response
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Form Submission Result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Form Submission Result</h2>");
        out.println("<p><strong>First Name:</strong> " + firstName + "</p>");
        out.println("<p><strong>Last Name:</strong> " + lastName + "</p>");
        out.println("<p><strong>Gender:</strong> " + gender + "</p>");
        out.println("<br>");
        out.println("<a href=\"index.html\">Back to Form</a>"); // Link to return to the form
        out.println("</body>");
        out.println("</html>");
    }
}
