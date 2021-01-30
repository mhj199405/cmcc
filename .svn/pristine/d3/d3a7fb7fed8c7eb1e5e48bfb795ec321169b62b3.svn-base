package com.briup.web.Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.bean.User;
import com.briup.service.Impl.UserServiceImpl;
@WebServlet("/Finduser")
public class Finduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Finduser() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("param");
		String username= new String(name.getBytes("ISO-8859-1"),"utf-8");
		UserServiceImpl ser=new UserServiceImpl();
		User user = ser.seleUser(username);
	   request.setAttribute("username", username);
	   request.setAttribute("password", user.getPassword());
	   request.setAttribute("phone", user.getPhone());
	   request.setAttribute("email", user.getEmail());
	   request.getRequestDispatcher("user/search/updateuser.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
