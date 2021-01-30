package com.briup.web.Servlet;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.CopyRight;
import com.briup.service.Impl.UserCopyServiceImpl;
@WebServlet("/Copy")
public class Copy extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Copy() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserCopyServiceImpl ucs=new UserCopyServiceImpl();
		ArrayList<CopyRight> alc = ucs.listAllcopy();
		request.setAttribute("alc", alc);
		request.getRequestDispatcher("/user/detail/copyright.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
