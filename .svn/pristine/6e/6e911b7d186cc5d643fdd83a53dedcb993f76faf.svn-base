package com.briup.web.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.User;
import com.briup.common.util.AddMyInfo;
import com.briup.service.Impl.UserServiceImpl;
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	        	String username=request.getParameter("username");
		        String password=request.getParameter("password");
	        	String phone=request.getParameter("phone");
		        String email=request.getParameter("email");
		        UserServiceImpl usi=new UserServiceImpl();
		        ArrayList<User> list = usi.listallUser();
				User user=new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setPhone(phone);
				user.setEmail(email);
				user.setDob(new Date());
				HttpSession session = request.getSession();
			    boolean flag=false;
				  for (User u:list) {
						if(u.getUsername().equals(username)){
							flag=false;
							break;
						}else{
							flag=true;
							continue;
						}
				 }
				 if(flag){
				     usi.registerUser(user);
			         session.setAttribute("msg", "注册成功!");
			         AddMyInfo.addmyinfo(username);
			         response.sendRedirect("login.jsp");
				    	      
				  }else{
			         response.sendRedirect("regerror.jsp"); 
				     }
			}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
