package com.soham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServ {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        System.out.println("Control in First Servlet");

        RequestDispatcher requestDispatcher= request.getRequestDispatcher("/SecondServ");
        requestDispatcher.forward(request,response);

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Response from Servlet One </h1>");
        writer.close();
    }
}
