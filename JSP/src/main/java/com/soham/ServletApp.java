package com.soham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h1>Welcome " + name + "</h1>");
        out.println("<h2>Your city is " + city + "</h2>");

        out.println("</body>");
        out.println("</html>");
    }
}