<%@page import="com.sun.corba.se.spi.activation.Repository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isThreadSafe="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>">
<head>
<title></title>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" href="assets/css/browse.css" />
 <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
 <script type="text/javascript" src="assets/js/browse.js"></script>
 <script type="text/javascript">
	var msg="${requestScope.msg}";
	if(msg.trim().length!=0){
		alert(msg);
	}
</script>
</head>
<body>
    <div class="developer-con">
            <div class="developer-inner">
                <div class="developer-tit">
                    <h3><i class="fa fa-tv" style="font-size:28px;"></i>&nbsp;&nbsp;投诉者社区</h3>
                </div>
                <div class="developer-box">
                    <ul class="developer-list">
                        <li class="developer-list-item">  
                            <dl>
                                <dt class="group-title">
                                    <a  class="group-header" > <i class="fa fa-vcard my" style="font-size:25px;"></i>个人投诉专栏</a>
                                    <a href="Browse?pageIndex2=${pageIndex2-1}&comname=${sessionScope.user.username}&pageIndex1=${pageIndex1}&pageIndex=${pageIndex}"><i class="fa fa-angle-left" style="font-size:20px;"></i></a>
                                    &nbsp;&nbsp;<a href="Browse?pageIndex2=${pageIndex2+1}&comname=${sessionScope.user.username}&pageIndex1=${pageIndex1}&pageIndex=${pageIndex}"><i class="fa fa-angle-right style="font-size:20px;"></i></a>
                                </dt>
                             <c:forEach items="${requestScope.lists2}" var="list2" varStatus="x">
                                <dd class="group-content">
                                    <a href="Lisuseunamecom?comname=${sessionScope.user.username}&name=${list2.name}" class="group-content-item">
                                        <p>${list2.name}</p>
                                        <ul class="group-content-info">
                                            <li>
                                                <i class="fa fa-eye"></i>
                                            </li>
                                        </ul>
                                    </a>
                                </dd>
                            </c:forEach>
                            </dl>
                        </li>
                        <li class="developer-list-item">
                            <dl>
                                <dt class="group-title">
                                    <a  class="group-header"> <i class="fa fa-envelope-open my" style="font-size:25px;"></i>反馈投诉专栏</a>
                                    <a href="Browse?pageIndex1=${pageIndex1-1}&pageIndex=${pageIndex}&pageIndex2=${pageIndex2}&comname=${sessionScope.user.username}"><i class="fa fa-angle-left" style="font-size:20px;"></i></a>
                                    &nbsp;&nbsp;<a href="Browse?pageIndex1=${pageIndex1+1}&pageIndex=${pageIndex}&pageIndex2=${pageIndex2}&comname=${sessionScope.user.username}"><i class="fa fa-angle-right style="font-size:20px;"></i></a>
                                </dt>
                                <c:forEach items="${requestScope.lists1}" var="list1" varStatus="x">
                                  <dd class="group-content">
                                     <a href="Accstuname?param=${list1.ucpname}" class="group-content-item">
                                         <p>${list1.ucpname}</p>
                                         <ul class="group-content-info">
                                             <li>
                                                 <i class="fa fa-eye"></i>
                                             </li>
                                        </ul>
                                    </a>
                                </dd>
                                </c:forEach>
                            </dl>
                        </li>
                        <li class="developer-list-item">
                            <dl>
                                <dt class="group-title">
                                    <a class="group-header"> <i class="fa fa-navicon my" style="font-size:25px;"></i>所有投诉专栏</a>
                                    <a href="Browse?pageIndex=${pageIndex-1}&pageIndex1=${pageIndex1}&pageIndex2=${pageIndex2}&comname=${sessionScope.user.username}"><i class="fa fa-angle-left" style="font-size:20px;"></i></a>
                                    &nbsp;&nbsp;<a href="Browse?pageIndex=${pageIndex+1}&pageIndex1=${pageIndex1}&pageIndex2=${pageIndex2}&comname=${sessionScope.user.username}"><i class="fa fa-angle-right style="font-size:20px;"></i></a>
                                </dt>
                                <c:forEach items="${requestScope.lists}" var="list" varStatus="x">
                                <dd class="group-content">
                                    <a href="ListIdComp?id=${list.id}" class="group-content-item">
                                        <p>${list.name}</p>
                                        <ul class="group-content-info">
                                            <li>
                                                <i class="fa fa-eye"></i>
                                            </li>   
                                        </ul>
                                    </a>
                                </dd>
                                </c:forEach>
                            </dl>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
		
</body>
</html>   
   
   
   
  