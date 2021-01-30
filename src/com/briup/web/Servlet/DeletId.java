package com.briup.web.Servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.service.Impl.UserNoticeServiceImpl;
@WebServlet("/DeletId")
public class DeletId extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ids = request.getParameter("ids");
		long id=Long.parseLong(ids);
		UserNoticeServiceImpl  unsi=new UserNoticeServiceImpl();
		unsi.deleNotice(id);
		response.sendRedirect("Notice?pageIndex=1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
