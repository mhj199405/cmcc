package com.briup.web.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Notice;
import com.briup.service.Impl.UserNoticeServiceImpl;
@WebServlet("/Addnotify")
public class Addnotify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String people = request.getParameter("people");
		String content = request.getParameter("content");
		long id=(long) Math.random();
		Notice  not=new Notice();
		not.setId(id);
		not.setName(name);
		not.setType(type);
		not.setPeople(people);
		not.setContent(content);
		not.setTime(new Date());
		UserNoticeServiceImpl  unsi=new UserNoticeServiceImpl();
		if(name!=""){
		try {
			unsi.addNotice(not);
			ArrayList<Notice> users = unsi.listallNotice();
			int total = UserNoticeServiceImpl.getCount();
			request.setAttribute("users", users);
			request.setAttribute("total", total);
			  request.setAttribute("msg", "添加公告成功!");
		   request.getRequestDispatcher("user/main/table.jsp?pageIndex=1").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			  request.setAttribute("msg", "此公告已发布!");
			  ArrayList<Notice> users = unsi.listallNotice();
			  int total = UserNoticeServiceImpl.getCount();
			  request.setAttribute("users", users);
			  request.setAttribute("total", total);
			  request.getRequestDispatcher("user/main/table.jsp?pageIndex=1").forward(request, response);
		}
		}else{
			request.setAttribute("msg", "请输入合法的公告标题?");
			 ArrayList<Notice> users = unsi.listallNotice();
			  int total = UserNoticeServiceImpl.getCount();
			  request.setAttribute("users", users);
			  request.setAttribute("total", total);
			  request.getRequestDispatcher("user/main/table.jsp?pageIndex=1").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
