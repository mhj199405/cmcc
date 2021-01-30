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
@WebServlet("/Teaccept")
public class Teaccept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
	    String ucpname=request.getParameter("ucpname");
	    String reason=request.getParameter("reason");
	    String situpeople=request.getParameter("situpeople");
	    String situevidence=request.getParameter("situevidence");
	    String accsituation=request.getParameter("accsituation");
	    Situation  stt=new Situation();
	    stt.setUcpname(ucpname);
	    stt.setReason(reason);
	    stt.setSitutime(new Date());
	    stt.setSitupeople(situpeople);
	    stt.setSituevidence(situevidence);
	    stt.setAccsituation(accsituation);
	    UserSituationServiceImpl ussi=new UserSituationServiceImpl();
	    ussi.addSituation(stt);
	   /* String state=null;
	    Situation list= ussi.listSituations(ucpname);
	    if(list!=null&&list.getAccsituation().equals(accsituation)){
	          state=list.getAccsituation();
	      }else{
	    	  state="未受理";
	      }
	     request.setAttribute("state",state);
			try {
				request.getRequestDispatcher("/user/main/teamain.jsp").forward(request, response);
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doGet(request, response);
	}
}
