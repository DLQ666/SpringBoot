package com.dlq.crud.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-05 14:08
 */
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process。。。。。");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
