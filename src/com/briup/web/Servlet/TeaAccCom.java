package com.briup.web.Servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Situation;
import com.briup.service.Impl.UserSituationServiceImpl;
@WebServlet("/TeaAccCom")
public class TeaAccCom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ucpname = request.getParameter("ucpname");
		String reason=request.getParameter("reason");
		String situpeople=request.getParameter("situpeople");
		String situevidence=request.getParameter("situevidence");
		String accsituation=request.getParameter("accsituation");
		System.out.println(ucpname+reason+situpeople+situevidence+accsituation);
		Situation   stt=new Situation();
		stt.setUcpname(ucpname);
		stt.setReason(reason);
		stt.setSitutime(new Date());
		stt.setSitupeople(situpeople);
		stt.setSituevidence(situevidence);
		stt.setAccsituation(accsituation);
		UserSituationServiceImpl ussi=new UserSituationServiceImpl();
			ussi.addSituation(stt);
			response.sendRedirect("Listeapage?pageIndex=1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
