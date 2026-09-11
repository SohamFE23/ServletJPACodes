package com.soham;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletLife")
public class LifeCycleSer extends HttpServlet{
    static{
        System.out.println("Servlet is Created");
    }

    public LifeCycleSer(){
        System.out.println("Servlet Object is Created");
    }

    public void init(ServletConfig config) throws ServletException{
        System.out.println("Servlet Initiazed !");
    }

    public void service(HttpServletRequest req, HttpServletResponse respo) throws ServletException,IOException{
        System.out.println("Service method to handle the response back and http request");
    }

    public void destroy(){
        System.out.println("Servlet is destroyed");
    }

}
