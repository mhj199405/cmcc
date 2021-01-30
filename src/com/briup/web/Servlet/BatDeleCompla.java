package com.briup.web.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.service.Impl.UserComplaintServiceImpl;
@WebServlet("/BatDeleCompla")
public class BatDeleCompla extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String[]  id= request.getParameterValues("id");
	   	 //由于从jsp页面获取的参数均是String类型，必须将其转化为bean里面对应的类型
	   	 Integer [] ids= new Integer[id.length];
	   	 for(int i = 0, len = id.length; i < len; i++){
	   	         ids[i] =Integer.parseInt(id[i]);
	   	 }
	   	 List<Integer> list=new ArrayList<Integer>();
	     list = Arrays.asList(ids);
		 if(id!=null&&id.length>0){
			UserComplaintServiceImpl ucls=new UserComplaintServiceImpl();
			ucls.batDeleCompla((ArrayList<Integer>) list);
			 response.sendRedirect("Delelistid?&pageIndex=1");
		 }else{
			 response.sendRedirect("Delelistid?&pageIndex=1");
		 }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
