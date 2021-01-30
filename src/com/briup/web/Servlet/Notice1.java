package com.briup.web.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Notice;
import com.briup.service.Impl.UserNoticeServiceImpl;
@WebServlet("/Notice1")
public class Notice1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int total=0,pageCount=0, pageIndex=0;
	int pageItems=8;//代表每页中显示多少条
	//定义了一个集合，集合中存放的就是每一页要显示的记录情况
	ArrayList<Notice> users=new ArrayList<Notice>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String name1=request.getParameter("name");
		   String name="%"+name1+"%";
		   UserNoticeServiceImpl unsi=new UserNoticeServiceImpl();
		   ArrayList<Notice> users = unsi.listcom(name);
		   int total=unsi.getItem(name);
		   request.setAttribute("users", users);
		   request.setAttribute("total", total);
		request.getRequestDispatcher("user/main/table.jsp?Notice?pageIndex=1").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
