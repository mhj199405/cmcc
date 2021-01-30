<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>校园投诉系统-详情页</title>
<link rel="stylesheet" href="assets/css/common.css"/>
<link rel="stylesheet" href="assets/css/style.css" />
<link rel="stylesheet" href="assets/css/icons.css" />
<link rel="stylesheet" href="assets/css/table.css" />
<link rel="stylesheet" href="assets/css/newmain.css" />
<script type="text/javascript">
  function jump(){
		 alert("退出成功!");
  }
</script>
</head>
<body>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
                <li><a style="color:#5a6463;font-weight:bolder">当前用户:&nbsp&nbsp${sessionScope.user.username}</a>|</li>
                <li><a href="user/main/manager.jsp">首页<span class="jt_down"></span></a>|</li>
                <li><a href="http://www.lzcu.edu.cn/"target="_parent">关注城院<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
        <div class="h3_right">
             <div class="myyy">
            	<a style="color:#a296a2">${ucpname}</a>
                <span class="sj_down"></span>
             </div>
             <div class="myyy">
            	<a style="color:#a296a2">${stt.accsituation}</a>
                <span class="sj_down"></span>
             </div>
             <div class="tsc">
           	  <a href="login.jsp" onclick=" return jump()">退出系统</a>
              <span class="sj_right"> </span>
            </div>
        </div>
    </div>
    <div class="container4">
    	<div class="register_box">
    			<div class="security">
    				<form action="Teaupdacc" method="post">
    					<ul class="list">
    						<li>
    								<input id="J_euserName" class="long"  name="ucpname"  type="text" readonly="readonly"  value="${ucpname}"/>
    								<div class="name">受理事件:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>
    						<li>
    								<input id="J_euserName" class="long"   name="reason"  type="text" value="${stt.reason}" />
    								<div class="name">受理原因:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>
    						<li>
    								<input id="J_euserName" class="long"    name="situtime"  type="text"  value="<fmt:formatDate value="${stt.situtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" />
    								<div class="name">受理时间:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>
    						<li>
    								<input id="J_euserName" class="long" name="situpeople" type="text"  value="${stt.situpeople}"/>
    								<div class="name">受理人员:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>
    						<li>
    								<input id="J_euserName" class="long"  name="situevidence"  type="text"   value="${stt.situevidence}"/>
    								<div class="name">受理证据:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>
    						<li>
    						       <!--  <div class="name">受理状态:</div>
    								<select name="accsituation" id="J_euserName" class="long" style="width:237px;height:36px;cursor:pointer;color: rgb(153,153,153) ">
		                             <option value="未受理" selected="true">未受理</option>
		                             <option  value="已受理">已受理</option>
		                            </select> -->
		                            <input id="J_euserName" class="long"  name="accsituation"  type="text"   value="${stt.accsituation}"/>
    								<div class="name">受理状态:</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>
    						<!-- <li>
    								<input id="J_euserName" class="long"  value="修改受理"   style="width:90px;font-size: large;cursor:pointer;text-align:center;line-height:40px;color:#5f6561; font-weight: bold;"  type="submit" />
    								<div class="name">&nbsp;</div>
    								<span id="J_eUserNameTipImg" class="icon"></span>
    								<div id="J_eUserNameTipInfo" class="ltip"></div>
    								<span class="placeholder" style="position: absolute;z-index: 20;color: rgb(153,153,153);top: 14px;left: 345px;line-height: 37px;"></span>
    						</li>	 -->
    					</ul>
    				</form>
    			</div>
    	</div>
    </div>
</body>
</html>







