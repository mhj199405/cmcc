package com.briup.web.Servlet;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/Browsetea")
public class Browsetea extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    int id=Integer.parseInt(request.getParameter("param"));
		    String name1=request.getParameter("name");
		    String name=new String(name1.getBytes("ISO-8859-1"), "UTF-8");
	        UserComplaintServiceImpl ucsi=new UserComplaintServiceImpl();
			UserComplaint  lists=ucsi.listcomp(id);
			int count = ucsi.countCompl(name);
			ucsi.countCompl(name);
	        UserComplaint ids=null;
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String date = sdf.format(ids.getDob());
	        request.setAttribute("date", date);
	        request.setAttribute("list2", ids);
	        request.setAttribute("count", count);
		    request.getRequestDispatcher("/user/main/detailtea.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
