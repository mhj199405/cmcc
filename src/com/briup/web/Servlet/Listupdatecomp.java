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

/**
 * Servlet implementation class Listupdatecomp
 */
@WebServlet("/Listupdatecomp")
public class Listupdatecomp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listupdatecomp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		UserComplaintServiceImpl usi=new UserComplaintServiceImpl();
		ArrayList<UserComplaint> lists = usi.listAllCompl(name);
		request.setAttribute("lists", lists);
		request.getRequestDispatcher("/user/main/updatebrowse.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
