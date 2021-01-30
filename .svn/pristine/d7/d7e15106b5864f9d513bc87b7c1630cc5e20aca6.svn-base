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
 * Servlet implementation class Admlistacc
 */
@WebServlet("/Admlistacc")
public class Admlistacc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admlistacc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String name = request.getParameter("param");
				String ucpname=new String(name.getBytes("ISO-8859-1"), "utf-8");
				UserSituationServiceImpl ussi=new UserSituationServiceImpl();
				Situation stt= ussi.listSituations(ucpname);
				request.setAttribute("stt",stt);
				request.setAttribute("ucpname", ucpname);
				request.getRequestDispatcher("/user/main/Admlisteaccep.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
