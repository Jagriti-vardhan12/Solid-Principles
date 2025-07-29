
import java.io.*;
import jakarta.servlet.http.*;

public class pracservlet extends HttpServlet 
{
    public void service(HttpServletRequest request, HttpServletResponse response)
       {
       
        try {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        HttpSession session = request.getSession();

        session.setAttribute("name", name); //Jagriti
        session.setAttribute("age", age); //24
        session.setAttribute("password", password); //kinder
        session.setAttribute("gender", gender); //female
        session.setAttribute("address", address); //Patna,Bihar

        response.sendRedirect("welcome");
        }
        catch(Exception e)
        {
        }


    }
}
