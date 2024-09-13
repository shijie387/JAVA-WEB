package com.atshijie.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class TimerFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        long s = System.currentTimeMillis();

        filterChain.doFilter(request, servletResponse);

        long e = System.currentTimeMillis();

        System.out.println("total time consumed of "+ request.getRequestURI() +(e - s));
    }
}
