package com.atshijie;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class ServletA extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletConfig
        //getServletName; getServletContext
        //getInitParameter; getInitParameterName

        ServletConfig servletConfig = getServletConfig();
        String paramA = servletConfig.getInitParameter("paramA");
        System.out.println(paramA);
    }
}
