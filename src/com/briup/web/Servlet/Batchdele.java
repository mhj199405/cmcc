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
import com.briup.service.Impl.UserNoticeServiceImpl;
@WebServlet("/Batchdele")
public class Batchdele extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String[]  id= request.getParameterValues("id");
	   	 //由于从jsp页面获取的参数均是String类型，必须将其转化为bean里面对应的类型
	   	 Long [] ids= new Long[id.length];
	   	 for(int i = 0, len = id.length; i < len; i++){
	   	         ids[i] = new Long(id[i]);
	   	 }
	   	 List<Long> list=new ArrayList<Long>();
	     list = Arrays.asList(ids);
		 if(id!=null&&id.length>0){
			 UserNoticeServiceImpl unsi=new UserNoticeServiceImpl();
			 unsi.batchDelByids(list);
			 response.sendRedirect("Notice?pageIndex=1");
		 }else{
			 response.sendRedirect("Notice?pageIndex=1"); 
		 }
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
