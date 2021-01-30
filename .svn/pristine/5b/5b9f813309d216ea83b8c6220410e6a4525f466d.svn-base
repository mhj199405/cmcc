package com.briup.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Notice;
import com.briup.service.Impl.UserNoticeServiceImpl;

/**
 * Servlet implementation class ListteaIdContent
 */
@WebServlet("/ListteaIdContent")
public class ListteaIdContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String  ids=request.getParameter("id");
         long id = Long.parseLong(ids);
         UserNoticeServiceImpl unsi=new UserNoticeServiceImpl();
         Notice nots= unsi.lookidNotice(id);
         request.setAttribute("nots", nots);
         request.getRequestDispatcher("user/main/stt.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
