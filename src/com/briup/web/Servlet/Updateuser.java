package com.briup.web.Servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.User;
import com.briup.service.Impl.UserServiceImpl;

/**
 * Servlet implementation class Updateuser
 */
@WebServlet("/Updateuser")
public class Updateuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		String phone= request.getParameter("phone");
		String email= request.getParameter("email");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setEmail(email);
		user.setDob(new Date());
		UserServiceImpl ser=new UserServiceImpl();
		ser.updateUser(user);
		//重定向再次请求浏览器，跳转到了分页的第一页
		response.sendRedirect("Student?pageIndex=1");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
