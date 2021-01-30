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
import com.briup.bean.User;
import com.briup.common.util.GetConntion;
import com.briup.common.util.MD5;
import com.briup.service.Impl.UserServiceImpl;
@WebServlet("/Updpawd")
public class Updpawd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String oldpwd=request.getParameter("password");
		String newpwd1=request.getParameter("checkPwd");
		String newpwd = MD5.getMD5Str(newpwd1);
		UserServiceImpl usi=new UserServiceImpl();
		User user = usi.seleUser(username);
		if(user.getPassword().equals(MD5.getMD5Str(oldpwd))){
			try {
				Connection conn = GetConntion.getconn();
				PreparedStatement ps = conn.prepareStatement("update users set password=? where username=?");
				ps.setString(1, newpwd);
				ps.setString(2, username);
				ps.executeUpdate();
				ps.close();
				conn.close();
				response.sendRedirect("Browse?pageIndex=1&pageIndex1=1&pageIndex2=1&comname="+username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			request.setAttribute("msg", "原密码不正确!");
			request.getRequestDispatcher("user/search/uppasswd.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
