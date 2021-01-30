package com.briup.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Situation;
import com.briup.service.Impl.UserSituationServiceImpl;

/**
 * Servlet implementation class TeaNameSitu
 */
@WebServlet("/TeaNameSitu")
public class TeaNameSitu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
		UserSituationServiceImpl ussi=new UserSituationServiceImpl();
		Situation sit = ussi.listSituations(name);
		request.setAttribute("sit", sit);
		request.setAttribute("name", name);
		request.getRequestDispatcher("user/main/teaccep.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
