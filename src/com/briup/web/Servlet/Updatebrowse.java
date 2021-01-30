package com.briup.web.Servlet;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/Updatebrowse")
public class Updatebrowse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   int id=Integer.parseInt(request.getParameter("id"));
		   String comname=request.getParameter("comname");
		   String name =request.getParameter("name");
		   String complaint = request.getParameter("complaint");
		   String publish = request.getParameter("publish");
		   String content = request.getParameter("content");
		   HttpSession session = request.getSession();
		   try {
			UserComplaint uc=new UserComplaint();
			   uc.setId(id);
			   uc.setName(name);
			   uc.setComplaint(complaint);
			   uc.setPublish(publish);
			   uc.setContent(content);
			   uc.setDob(new Date());
			   uc.setComname(comname);
			   UserComplaintServiceImpl ucsi=new UserComplaintServiceImpl();
			   ucsi.updateUserCompl(uc);
			   session.setAttribute("msg", "更新成功");
			   response.sendRedirect("Delelistid?pageIndex=1&name1=&comname="+comname);
		} catch (Exception e) {
			session.setAttribute("msg", "更新失败");
			response.sendRedirect("Delelistid?pageIndex=1&name1=&comname="+comname);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request, response);	
	}
}
