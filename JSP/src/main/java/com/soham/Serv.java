package com.soham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Serv")
public class Serv extends HttpServlet{
    public Serv(){
        System.out.println("Servlet Object is Created");
    }

    @Override 
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        PrintWriter writer= response.getWriter();

        response.sendRedirect("/ServetsAP/index.jsp");
//This is a Bad Practice of Writing the code as Java is writing the response code via HTML

        // writer.println("Hello "+name);
        // writer.println("I know you are from "+city);
        // writer.println("<html>-- </html>");
        // writer.println("<table> --- </table>");
        // writer.println("<body> -- </body>");
        // writer.println("--etc---");

        writer.close();
    }
}
