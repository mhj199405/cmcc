package com.briup.web.Servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/Delebrowse")
public class Delebrowse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  int id=Integer.parseInt(request.getParameter("ids"));
		  String name=request.getParameter("comname");
	       UserComplaintServiceImpl  ucsi=new UserComplaintServiceImpl();
	       try {
			 ucsi.deleUserCompl(name,id); 
		     response.sendRedirect("Delelistid?&pageIndex=1&comname="+name);
		} catch (Exception e) {
		     response.sendRedirect("Delelistid?&pageIndex=1&comname="+name);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doGet(request, response);
	}
}
