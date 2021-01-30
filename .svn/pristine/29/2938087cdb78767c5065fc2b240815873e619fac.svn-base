package com.briup.web.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.User;
import com.briup.service.Impl.UserServiceImpl;
@SuppressWarnings("serial")
@WebServlet("/Student")
public class Student extends HttpServlet {
	int total=0,pageCount=0, pageIndex=0;
	int pageItems=16;//代表每页中显示多少条
	//定义了一个集合，集合中存放的就是每一页要显示的记录情况
	ArrayList<User> users=new ArrayList<User>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
		
		//2.判断当前页是否到达第一页之前，如果到了，还是认为第一页
		if(pageIndex<=0){
			pageIndex=1;
		}
		//3.查询数据库，得到总共有多少条记录
		total=UserServiceImpl.getCount();
		//4.通过总的记录数计算出有多少页
		pageCount=(total+(pageItems-1))/pageItems;
		//5.判断当前页是否到达最后一页，如果到了，还是认为是最后一页
		if(pageIndex>=pageCount){
			pageIndex=pageCount;
		}
		//6.查询数据库，得到当前页面中要显示的记录。
		users=UserServiceImpl.getPageShowItems(pageIndex,pageItems);
		//7.将所有在客户端页面使用用的数据存放到request中
		request.setAttribute("total", total);
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("users",users);
		//8.跳转到我们要进行数据显示的页面，并把request中存放的数据带过去。
		request.getRequestDispatcher("user/search/student.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
