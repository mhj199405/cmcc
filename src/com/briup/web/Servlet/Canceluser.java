package com.briup.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.service.Impl.UserServiceImpl;
@WebServlet("/Canceluser")
public class Canceluser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Canceluser() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("name");
		String name = new String(username.getBytes("ISO-8859-1"),"utf-8");
		UserServiceImpl ser=new UserServiceImpl();
		ser.deleUser(name);
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
