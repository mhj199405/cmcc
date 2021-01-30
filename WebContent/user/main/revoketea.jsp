<%@ page language="java" import="java.util.*,com.briup.bean.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isThreadSafe="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>">
<head>
    <title>表单代码结构</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="../assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/page-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/prettify.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/student.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript">
        function jumpto(){
            var page = document.getElementById("page").value;
            if(page==""){
                page=1;
                location.href="Teacher?pageIndex="+page;
            }
            else{
                location.href="Teacher?pageIndex="+page;
            }
        }
        function jump(){
            var param = document.getElementById("param").value;
            location.href="Deleuser?params="+param;
            if(page==""){
                page=1;
                location.href="Teacher?pageIndex="+page;
            }
            else{
                location.href="Teacher?pageIndex="+page;
            }
        }
    </script>
</head>
<body>
<div id="container">
    <div id="content">
        <div id="table_center">
            <table border="0" width="99%" cellpadding="6" cellspacing="1" bgcolor="#bee3fb" style="margin-left:7px;border-radius:3px">
                <tr height="33px">
                    <td width="10%" style="background-color:#e8e9ee;color:#000">用户账号</td><td width="15%" style="background-color:#e8e9ee;color:#000">事件名称</td><td width="10%" style="background-color:#e8e9ee;color:#000">被投诉者</td><td width="10%"style="background-color:#e8e9ee;color:#000">上诉时间</td><td width="10%"style="background-color:#e8e9ee;color:#000">事件操作</td>
                </tr>
                <tr height="33px">
                    <td width="10%" style="background-color:#e8e9ee;color:#000">20150804050537</td><td width="15%" style="background-color:#e8e9ee;color:#000">励志奖学金事件</td><td width="10%" style="background-color:#e8e9ee;color:#000">祁建宏</td><td width="10%"style="background-color:#e8e9ee;color:#000">2019-03-01 15:02:02</td><td width="10%"style="background-color:#e8e9ee;color:#000">开始受理</td>
                </tr>
                <c:forEach var="user" items="${users}" varStatus="x">
                    <tr height="33px">
                        <td>${user.username}</td><td>${user.phone}</td><td>${user.email}</td><td><fmt:formatDate value="${user.dob}" pattern="yyyy-MM-dd HH:mm:ss"/></td><td>老师</td><td><a href="/Demo/Deletea?params=${user.username}" style="color:red;text-decoration:none">删除</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="/Demo/Findtea?param=${user.username}" style="color:blue;text-decoration:none">修改</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div id="table_foot">
            <div id="foot_left"></div>
            <div id="foot_center">
                <div id="foot_count">
                    共有${total }条记录，当前第${pageIndex }/${pageCount }页
                </div>
                <div id="foot_button">
                    <a href="Student?pageIndex=1"><img src="assets/img/first.gif"/></a>
                    <a href="Student?pageIndex=${pageIndex-1}"><img src="assets/img/back.gif"/></a>
                    <a href="Student?pageIndex=${pageIndex+1}"><img src="assets/img/next.gif"/></a>
                    <a href="Student?pageIndex=${pageCount}"><img src="assets/img/last.gif"/></a>
                    转到第<input type="text" id="page"/>页<img src="assets/img/go.gif" onclick="jumpto()"/>
                </div>
            </div>
            <div id="foot_right"></div>
        </div>
    </div>
</div>
</body>
</html>
