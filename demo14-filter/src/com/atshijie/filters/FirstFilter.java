package com.atshijie.filters;


import jakarta.servlet.*;

import java.io.IOException;

public class FirstFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFilter before releasing");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("FirstFilter after releasing");
    }
}
