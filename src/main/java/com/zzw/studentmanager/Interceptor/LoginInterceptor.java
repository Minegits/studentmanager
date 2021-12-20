package com.zzw.studentmanager.Interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object teacher = request.getSession().getAttribute("teacher");
        if(teacher != null){
            return true;
        }
        String requestURI = request.getRequestURI();
        log.info("当前拦截的请求是,{}",requestURI);
        request.getSession().setAttribute("msg","请先登录");
        response.sendRedirect("/");
        return false;
    }
}
