package jsp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
public class ExamRegistrationServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 String name = request.getParameter("name");
 String rollNumber = request.getParameter("rollNumber");
 response.setContentType("text/html");
 String htmlResponse = "<html><body>";
 htmlResponse += "<h2>Exam Registration Successful</h2>";
 htmlResponse += "<p>Name: " + name + "</p>";
 htmlResponse += "<p>Roll Number: " + rollNumber + "</p>";
 htmlResponse += "</body></html>";
 response.getWriter().println(htmlResponse);
 }
}
