/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Sujal
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
         String us = request.getParameter("username");
         String pwd = request.getParameter("password");
         PrintWriter ou=response.getWriter();
         response.setContentType("text/html");
 
         if (us.equals("Homelender") && pwd.equals("super7")) {
              
            //response.sendRedirect("home.jsp");
            RequestDispatcher rd=request.getRequestDispatcher("/FormServlet");
           rd.forward(request, response);
               
         
        } else {
        
             ou.print("<center><h4>Invalid Credential!</h4></center>");  
             RequestDispatcher rd=request.getRequestDispatcher("login.html");  
             rd.include(request,response);  
             
        }
        
         
    }
         
         
    }

