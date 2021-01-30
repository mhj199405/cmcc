package com.briup.web.Listener;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.briup.bean.CopyRight;
import com.briup.bean.Notice;
import com.briup.bean.Sys;
import com.briup.bean.UserComplaint;
import com.briup.service.Impl.UserComplaintServiceImpl;
import com.briup.service.Impl.UserCopyServiceImpl;
import com.briup.service.Impl.UserNoticeServiceImpl;
import com.briup.service.Impl.UserSysServiceImpl;
@WebListener
public class AppListener implements ServletContextListener {
	public void contextDestroyed(ServletContextEvent arg0) {
    }
    public void contextInitialized(ServletContextEvent arg0) {
    	//获取application容器，将查询出来的数据带回给
    	//请求页面
    	ServletContext app = arg0.getServletContext();
    	UserSysServiceImpl uss=new UserSysServiceImpl();
    	UserCopyServiceImpl ucs=new UserCopyServiceImpl();
    	UserNoticeServiceImpl uns=new UserNoticeServiceImpl();
    	try {
			ArrayList<Sys> al = uss.listAllsys();
	    	app.setAttribute("al",al);
	    	ArrayList<CopyRight> alc = ucs.listAllcopy();
	    	app.setAttribute("alc", alc);
	    	ArrayList<Notice> noti=uns.listallNotice();
	    	app.setAttribute("noti", noti);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
    }
	
}
