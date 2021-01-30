package com.briup.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Situation;
import com.briup.service.Impl.UserSituationServiceImpl;
@WebServlet("/StuListNamSitu")
public class StuListNamSitu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ucpname =new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(ucpname);
		UserSituationServiceImpl ussi=new UserSituationServiceImpl();
		Situation sit = ussi.listSituations(ucpname);
		request.setAttribute("sit", sit);
		request.getRequestDispatcher("user/main/stusituaion.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
