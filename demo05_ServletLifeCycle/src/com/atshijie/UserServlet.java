package com.atshijie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/UserServlet",
            urlPatterns = {"/UserServlet1", "/UserServlet2"},
            initParams = {@WebInitParam(name="encoding", value="UTF-8")},
            loadOnStartup = 6)
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String encoding = getServletConfig().getInitParameter("encoding");
        System.out.println(encoding);

        String username = req.getParameter("username");

        PrintWriter writer = resp.getWriter();
        if("atguigu".equals(username)) {
            writer.write("no");
        }else {
            writer.write("yes");
        }
    }
}
