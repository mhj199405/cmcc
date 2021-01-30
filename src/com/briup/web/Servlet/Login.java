package com.briup.web.Servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.User;
import com.briup.common.exception.UserException;
import com.briup.common.util.LogName;
import com.briup.service.Impl.UserAdminServiceImpl;
import com.briup.service.Impl.UserAdmissibilityServiceImpl;
import com.briup.service.Impl.UserServiceImpl;
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String role = request.getParameter("role");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String auto= request.getParameter("auto");
		if(role.equals("管理员")){
			  UserAdminServiceImpl ser= new UserAdminServiceImpl();
				HttpSession session = request.getSession();
			    try {
			    	//判断用户是否存在
					User user =ser.loginUser(username, password);
					//若存在，将信息保存在session容器，并带给浏览器
					User user1 = ser.seleUser(username);
					session.setAttribute("user1", user1);
					session.setAttribute("user", user);	
					//跳转到下一个成功的页面
					request.getRequestDispatcher("/user/main/manager.jsp").forward(request, response);
			    } catch (UserException e) {
					// TODO Auto-generated catch block
					response.sendRedirect("logerror.jsp");
				}   
		}else if(role.equals("学生")){
			    
			    HttpSession session = request.getSession();
			    try {
			        UserServiceImpl ser= new UserServiceImpl();
			    	//判断用户是否存在
					User user = ser.loginUser(username, password);
					session.setAttribute("user", user);
					String logname = LogName.logname(username);
					if("1".equals(auto)){
						Cookie cookie=
								new Cookie("username", username);
						cookie.setMaxAge(10);
						Cookie cookie1=
								new Cookie("password", password);
						cookie1.setMaxAge(10);
						response.addCookie(cookie);
						response.addCookie(cookie1);
					}
					User user1 = ser.seleUser(username);
					session.setAttribute("logname",logname);
					//若存在，将信息保存在session容器，并带给浏览器
					session.setAttribute("user1", user1);
					//跳转到下一个成功的页面
					request.getRequestDispatcher("/user/main/index.jsp").forward(request, response);
			    } catch (UserException e) {
					// TODO Auto-generated catch block
					//如果用户或者密码不存在或者密码错误，则将此错误带
					response.sendRedirect("logerror.jsp");
				}
		}else{
			 UserAdmissibilityServiceImpl ser= new UserAdmissibilityServiceImpl();
				HttpSession session = request.getSession();
			    try {
			    	//判断用户是否存在
					User user =ser.loginUser(username, password);
					User user1 = ser.seleUser(username);
					//若存在，将信息保存在session容器，并带给浏览器
					session.setAttribute("user1", user1);
					session.setAttribute("user", user);
					//跳转到下一个成功的页面
					request.getRequestDispatcher("/user/main/teamain.jsp").forward(request, response);
				} catch (UserException e) {
					//并进行页面的跳转
					response.sendRedirect("logerror.jsp");
				}   
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}