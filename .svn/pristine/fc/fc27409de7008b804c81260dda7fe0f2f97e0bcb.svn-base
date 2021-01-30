package com.briup.web.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.User;
@WebFilter("/user/*")
public class LoginFilter implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		  HttpServletResponse resp = (HttpServletResponse)response;
	        HttpServletRequest req = (HttpServletRequest)request;
	        HttpSession session = req.getSession();
	        User user = (User)session.getAttribute("user");
	        String uri = req.getRequestURI();
	        //简单判断缓存中是否有用户
	        if(user==null){//没有用户
	            //判断用户是否是选择跳到登录界面
	            if(uri.endsWith("login.jsp")){
	                chain.doFilter(request, response);
	            }else{
	            	//req.getContextPath指的是/项目名称
	                resp.sendRedirect(req.getContextPath()+"/login.jsp");
	            }    
	        }else{//有用户
	            chain.doFilter(request, response);
	        }
	        }
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
