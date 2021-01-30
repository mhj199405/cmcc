package com.briup.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/Lisuseunamecom")
public class Lisuseunamecom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String comname=new String( request.getParameter("comname").getBytes("ISO-8859-1"), "UTF-8");
	 String name=new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
	 UserComplaintServiceImpl ucsi=new UserComplaintServiceImpl();
	  try {
		UserComplaint list2 = ucsi.lisusenamecom(comname, name);
		request.setAttribute("list2", list2);
		request.getRequestDispatcher("/user/main/detailuser.jsp").forward(request, response);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
