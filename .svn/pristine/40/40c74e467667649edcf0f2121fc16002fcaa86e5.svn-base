package com.briup.web.Servlet;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Situation;
import com.briup.bean.UserComplaint;
import com.briup.common.util.AllComPage;
import com.briup.common.util.AllSituaionPage;
import com.briup.common.util.MyinfoComPage;
import com.briup.service.Impl.UserComplaintServiceImpl;
import com.briup.service.Impl.UserSituationServiceImpl;
@WebServlet("/Browseadm")
public class Browseadm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int total=0,total1=0,total2=0,pageCount=0,pageCount1=0,pageCount2=0,
			pageIndex=0,pageIndex1=0,pageIndex2=0;
	int pageItems=4;//代表每页中显示多少条
	//定义了一个集合，集合中存放的就是每一页要显示的记录情况
	ArrayList<UserComplaint> lists=new ArrayList<UserComplaint>();
	ArrayList<Situation> lists1=new ArrayList<Situation>();
	ArrayList<UserComplaint> lists2=new ArrayList<UserComplaint>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
		      pageIndex1=Integer.parseInt(request.getParameter("pageIndex1"));
		      pageIndex2=Integer.parseInt(request.getParameter("pageIndex2"));
		      String comname=request.getParameter("comname");
				if(pageIndex<=0){
					pageIndex=1;
					}
				if(pageIndex1<=0){
					pageIndex1=1;
				}
				if(pageIndex2<=0){
					pageIndex2=1;
				}
				total= AllComPage.getcoun();
				total1=AllSituaionPage.getcoun();
				total2=MyinfoComPage.getcount(comname);
				//3.查询数据库，得到总共有多少条记录
				//4.通过总的记录数计算出有多少页
				pageCount=(total+(pageItems-1))/pageItems;
				pageCount1=(total1+(pageItems-1))/pageItems;
				pageCount2=(total2+(pageItems-1))/pageItems;
				//5.判断当前页是否到达最后一页，如果到了，还是认为是最后一页
				if(pageIndex>pageCount){
					pageIndex=pageCount;
				}
				if(pageIndex1>=pageCount1){
					pageIndex1=pageCount1;
				}
				if(pageIndex2>=pageCount2){
					pageIndex2=pageCount2;
				}
				//6.查询数据库，得到当前页面中要显示的记录。
				lists=AllComPage.getPageShowComplaint(pageIndex, pageItems);
				lists1=AllSituaionPage.getPageShowComplaint(pageIndex1, pageItems);
				lists2=MyinfoComPage.getPageShowComplaint(comname, pageIndex2, pageItems);
				//7.将所有在客户端页面使用用的数据存放到request中
				request.setAttribute("pageIndex", pageIndex);
				request.setAttribute("pageIndex1", pageIndex1);
				request.setAttribute("pageIndex2", pageIndex2);
				request.setAttribute("lists",lists);
				request.setAttribute("lists1",lists1);
				request.setAttribute("lists2",lists2);
				request.setAttribute("comname",comname);
				//8.跳转到我们要进行数据显示的页面，并把request中存放的数据带过去。
				request.getRequestDispatcher("user/main/browseadm.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
