package com.briup.web.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Myinfo;
import com.briup.common.util.GetConntion;
@WebServlet("/MyInfo")
public class MyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Myinfo info=new Myinfo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stuid = request.getParameter("stuid");
		Connection conn =GetConntion.getconn();
		HttpSession session = request.getSession();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from myinfo where stuid=?");
			ps.setString(1, stuid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
			 info.setStuname(rs.getString("stuname"));
			 info.setStuid(rs.getString("stuid"));
			 info.setStusex(rs.getString("stusex"));
			 info.setStunation(rs.getString("stunation"));
			 info.setStubirth(rs.getString("stubirth"));
			 info.setStatus(rs.getString("status"));
			 info.setFaculty(rs.getString("faculty"));
			 info.setStuclass(rs.getString("stuclass"));
			 info.setPhone(rs.getString("phone"));
			 info.setEmail(rs.getString("email"));
			 info.setQq(rs.getString("qq"));
			 info.setIdcard(rs.getString("idcard"));
			}
			ps.close();
			conn.close();
		  request.setAttribute("info", info);
		  session.setAttribute("stuid", stuid);
		  request.getRequestDispatcher("user/search/myinfo.jsp").forward(request, response);
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(null, response);
	}

}
