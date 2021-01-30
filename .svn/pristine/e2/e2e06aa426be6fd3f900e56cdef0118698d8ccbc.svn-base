package com.briup.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.UserComplaint;
import com.briup.common.util.ComNameAlls;

/**
 * Servlet implementation class ListIdComs
 */
@WebServlet("/ListIdComs")
public class ListIdComs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id")) ;
		UserComplaint list2= new ComNameAlls().listidcoms(id);
		request.setAttribute("list2", list2);
		request.getRequestDispatcher("user/main/teaidcomp.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
