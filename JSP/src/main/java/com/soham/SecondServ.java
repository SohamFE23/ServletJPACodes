package com.soham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SecondServ")
public class SecondServ {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>  Responded from Second Servlet");
        writer.close();
    }
}
