package com.briup.web.Servlet;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  String name = request.getParameter("name");
			  String complaint = request.getParameter("complaint");
			  String publish = request.getParameter("publish");
			  String content = request.getParameter("content");
			  String comname=request.getParameter("comname");
			  int id= (int) Math.random();
			  if(name!=""){
				  try {
						UserComplaint ucl=new UserComplaint();
						   ucl.setName(name);
						      ucl.setId(id);
							  ucl.setComplaint(complaint);
							  ucl.setContent(content);
							  ucl.setPublish(publish);
							  ucl.setDob(new Date());
							  ucl.setContent(content);
							  ucl.setComname(comname);
							 UserComplaintServiceImpl ucsi=new UserComplaintServiceImpl();
							 ucsi.addUserCompl(ucl);
						response.sendRedirect("Browse?pageIndex=1&pageIndex1=1&pageIndex2=1&comname="+comname);
							
					} catch (Exception e) {
						// TODO Auto-generated catch block
						response.sendRedirect("Browse?pageIndex=1&pageIndex1=1&pageIndex2=1&comname="+comname);
					}
			  }else{
				  response.sendRedirect("Browse?pageIndex=1&pageIndex1=1&pageIndex2=1&comname="+comname);
			  }
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
