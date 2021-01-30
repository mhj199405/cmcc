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
@WebServlet("/SelebrowseId")
public class SelebrowseId extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  int id=Integer.parseInt(request.getParameter("id"));
		  String name=request.getParameter("username");
	       UserComplaintServiceImpl  ucsi=new UserComplaintServiceImpl();
	       ArrayList<UserComplaint> list2 = ucsi.listIdCompl(name,id);
	       request.setAttribute("list2", list2);
	       request.getRequestDispatcher("/user/main/updatebrowse_1.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request, response);	
	}
}
