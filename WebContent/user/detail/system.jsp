<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script type="text/javascript">
  function jump(){
		 alert("注销成功!");
  }
</script>
<style>
	.container3{
		height:130px;
		padding: 10px
	}
	.container3 div{
		width: 60%;
		margin:10px 0 20px 300px;
		background-color: #C5131E;

	}
	.container3 div span{
		margin-left: 70px;
		font-size: 14px;
		color:#fff;
	}
	.container3 h1{
		font-size: 18px;
		text-align: center
	}
	.container3  pre{
		width: 100%;
		 white-space: pre-wrap;
		 font-size: 14px;
		 line-height: 30px
	}
</style>
</head>
<body>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
           
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<div class="h3_center"></div>
        <div class="h3_right"></div>
    </div>
    <div class="container3">
    <c:forEach items="${applicationScope.al}" var="ak">
    	<h1 style="color:#1b3160;font-weight: bolder;">${ak.name}</h1>
    	<pre>
    	  ${ak.content}
    	</pre>
    	</c:forEach>
    </div>
</body>
</html>







