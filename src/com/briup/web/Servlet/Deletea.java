package com.briup.web.Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.service.Impl.UserAdmissibilityServiceImpl;
@WebServlet("/Deletea")
public class Deletea extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("ids");
		String name = new String(username.getBytes("ISO-8859-1"),"utf-8");
		UserAdmissibilityServiceImpl ser=new UserAdmissibilityServiceImpl();
		ser.deleUser(name);
		response.sendRedirect("Teacher?pageIndex=1");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doGet(request, response);
	}
}
