package com.briup.web.Servlet;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/Listnameallcomp")
public class Listnameallcomp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1 = request.getParameter("name");
		String name=new String(name1.getBytes("ISO-8859-1"), "UTF-8");
	   UserComplaintServiceImpl ucsi=new UserComplaintServiceImpl();
	   ArrayList<UserComplaint> lists = ucsi.listallCompimpl(name);
	   int count = ucsi.countCompl(name);
			request.setAttribute("lists",lists);
			request.setAttribute("count",count);
				//8.跳转到我们要进行数据显示的页面，并把request中存放的数据带过去。
		request.getRequestDispatcher("/user/main/listcomimpl.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
