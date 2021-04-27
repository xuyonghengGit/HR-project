package com.ck.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginInterceptor implements HandlerInterceptor {
    private List<String> url;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
       //获取session
        Object user = request.getSession().getAttribute("userLoginSucceed");
        //判读不需要拦截的url
        if (!(url.contains(request.getServletPath())||
                url.contains(request.getServletPath()+"?page="+request.getParameter("page")))
        ){
           if(user==null){

               response.sendRedirect("topage?page=login");
               return false;
           }
        }
        return true;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }
}
