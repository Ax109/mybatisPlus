package com.swjd.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //放行条件
       String uri=request.getRequestURI();
       //1、不需要登录就可以访问的页面
       if (uri.indexOf("login")>=0||uri.indexOf("Login")>=0){
           return true;
       }
       //2、
        HttpSession session=request.getSession();
        if (session.getAttribute("activeName")!=null){
            return true;
        }
        request.getRequestDispatcher("/toLogin").forward(request,response);
        return false;
    }
}
