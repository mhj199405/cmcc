package com.briup.web.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Myinfo;
import com.briup.common.util.GetConntion;
import com.briup.common.util.ListAllId;
@WebServlet("/PermyInfo")
public class PermyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String stuname = request.getParameter("stuname");
		 String stusex = request.getParameter("sex");
		 String stubirth =request.getParameter("stubirth");
		 String idcard = request.getParameter("idcard");
		 String stuclass =request.getParameter("stuclass");
		 String stuid =request.getParameter("stuid");
		 String stunation =request.getParameter("stunation");
		 String status =request.getParameter("status");
		 String faculty =request.getParameter("faculty");
		 String phone =request.getParameter("phone");
		 String qq =request.getParameter("qq");
		 String email =request.getParameter("email");
		 System.out.println(stuname+stusex+idcard+stuid+status);
		 Connection conn = GetConntion.getconn();
		 HttpSession session = request.getSession();
		 try {
			PreparedStatement ps=
				conn.prepareStatement("update myinfo set stuname=?,idcard=?,stusex=?,stunation=?" +
						",stubirth=?,status=?,faculty=?,stuclass=?,phone=?,email=?,qq=? where stuid=?");
			ps.setString(1, stuname);
			ps.setString(2, idcard);
			ps.setString(3, stusex);
			ps.setString(4, stunation);
			ps.setString(5, stubirth);
			ps.setString(6, status);
			ps.setString(7, faculty);
			ps.setString(8, stuclass);
			ps.setString(9, phone);
			ps.setString(10, email);
			ps.setString(11, qq);
			ps.setString(12, stuid);
			ps.executeUpdate();
			ps.close();
			conn.close();
			Myinfo info = ListAllId.listallid(stuid);
			System.out.println(info);
			request.setAttribute("info", info);
		    session.setAttribute("stuid", stuid);
			request.getRequestDispatcher("user/search/myinfo.jsp").forward(request, response);
  	  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

