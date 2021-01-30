package com.briup.web.Servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/ListIdComp")
public class ListIdComp extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id=Integer.parseInt(request.getParameter("id"));
		 UserComplaintServiceImpl ucsi=new UserComplaintServiceImpl();
		 UserComplaint list2 = ucsi.listcomp(id);
		request.setAttribute("list2", list2);
		request.getRequestDispatcher("/user/main/listcomimpl.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
