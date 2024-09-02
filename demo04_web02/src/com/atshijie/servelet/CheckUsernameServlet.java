package com.atshijie.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/checkUsername")
public class CheckUsernameServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        String info = "<font color='green'>yes</font>";

        if("atguigu".equals(username)) {
            info = "<font color='red'>no</font>";
        }

        resp.setHeader("Content-Type", "text/html;charset=utf-8");
        resp.getWriter().write(info);
    }
}
