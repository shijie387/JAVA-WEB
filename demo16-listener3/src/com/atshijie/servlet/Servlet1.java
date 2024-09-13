package com.atshijie.servlet;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();

        servletContext.setAttribute("msg","reqMeg");
        servletContext.setAttribute("msg","reqMessage");
        servletContext.removeAttribute("msg");





        req.setAttribute("msg","reqMeg");
        req.setAttribute("msg","reqMessage");
        req.removeAttribute("msg");


        HttpSession session = req.getSession(); // 包含了创建操作

        session.setAttribute("msg","sessionMeg");
        session.setAttribute("msg","sessionMessage");
        session.removeAttribute("msg");

        session.invalidate();





    }
}


