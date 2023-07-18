/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

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
@WebServlet(urlPatterns = {"/FinalServlet"})
public class FinalServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              PrintWriter ot=response.getWriter();
              String name=request.getParameter("nm");
              String phone=request.getParameter("ph");
              String eml=request.getParameter("em");
              String ag=request.getParameter("ag");
              String add=request.getParameter("add");
              String pn=request.getParameter("pnc");
              String yy=request.getParameter("yy");
              String qlfy=request.getParameter("qlfy");
              String pro=request.getParameter("desig");
              String ct=request.getParameter("ct");


              ot.println("Name "+name);
              ot.println("Phone "+phone);
              ot.println("Email "+eml);
              ot.println("Age "+ag);
              ot.println("Gender "+eml);
              ot.println("Addres "+add);
              ot.println("Pincode "+pn);
              ot.println("City "+ct);
              ot.println("Profession "+pro);
              ot.println("Qualification "+qlfy);
              ot.println("Year of Graduation "+yy);
              


    }

   
}
