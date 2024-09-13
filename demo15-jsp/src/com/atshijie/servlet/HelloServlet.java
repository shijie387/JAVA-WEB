package com.atshijie.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg","reqMSG");
        req.getSession().setAttribute("msg","sessionMSG");
        req.getServletContext().setAttribute("msg","applicationMSG");

        req.getRequestDispatcher("hello.jsp").forward(req,resp);
    }
}
