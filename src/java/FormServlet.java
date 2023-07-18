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
@WebServlet(urlPatterns = {"/FormServlet"})
public class FormServlet extends HttpServlet {


     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
      PrintWriter out=response.getWriter();
     // PrintWriter ou=response.getWriter();
      String n=request.getParameter("username");
      out.println("Wellcome "+n);
        out.println("<html>");
        out.println("<body>");
        out.println("<center>");
         out.println("<form action='FinalServlet' method='post'>");
         out.println("Name  <input type='text' name='nm' required><br><br>");
         out.println("Phone <input type='tel' name='ph' required><br><br>");
         out.println("Email <input type='email' name='em' required><br><br>");
         out.println("Age   <input type='number' name='ag' required><br><br>");
         out.println("Gender &nbsp;&nbsp; Male <input type='radio' name='gr'  checked>&nbsp&nbsp");
         out.println("Female <input type='radio' name='gr'><br><br>");
         out.println(" Address <textarea name='add' placeholder='Enter your address here'></textarea><br><br>");
         out.println("Pincode   <input type='text' name='pnc' required><br><br>");
         out.println(" City &nbsp&nbsp&nbsp<select name='ct'><option value=''>Select City</option><option value='Surat'>Surat</option><option value='Ahemdabad'>Ahemdabad</option> <option value='Gandhinagar'>Gandhinagar</option><option value='Vadodra'>Vadodra</option></select><br><br>");
         out.println(" Profession &nbsp&nbsp&nbsp<select name='desig'><option value=''>Select a Profession</option><option value='Student'>Student</option><option value='Faculty'>Faculty</option> <option value='Other'>Other</option></select><br><br>");
         out.println("Highest Qualification <select name='qlfy'><option value=''>Select Qualification</option><option value='Diploma'>Diploma</option><option value='Btech'>Btech</option></select><br><br>");
         out.println("year Graduation <input type='number'  name='yy'  placeholder='YYYY' min='1900' max='2023' required><br><br>");
         out.println("<input type='checkbox' name='checkbox' required> I Agreed To Swayam T&c.<br><br>");
         out.println("<input type='checkbox' name='checkbox' required> I Agreed To Follow the Honor Code.<br><br>");
         out.println("<input type='submit' name='btn'>");
         out.println("</form");

        out.println("</center>");

      
        out.println("</body>");
        out.println("</html>");
        
//          RequestDispatcher rd=request.getRequestDispatcher("/FinalServlet");
//          rd.forward(request, response);
    
      
      
      
      
    }

  
}
