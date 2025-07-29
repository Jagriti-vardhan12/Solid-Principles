
import java.io.*;
import jakarta.servlet.http.*;

public class welcomepracservlet  extends HttpServlet 

{


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            
 {


       try{

        HttpSession session = request.getSession(false);
        

        String name = (String) session.getAttribute("name");
        String age = (String) session.getAttribute("age");
        String password = (String) session.getAttribute("password");
        String gender = (String) session.getAttribute("gender");
        String address = (String) session.getAttribute("address");

        // Step 3: Show the result to user
        //response.setContentType("text/html");
 
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome, " + name + "</h1>");
        out.println("<h2>Your age is: " + age + "</h2>");
        out.println("<h3>your password is: " + password + "</h3>");
        out.println("<h4>Your gender is: " + gender + "</h4>");
        out.println("<h5>Your address is: " + address + "</h5>");

        
        }
        catch(Exception e)
        {
        }



    }
}
