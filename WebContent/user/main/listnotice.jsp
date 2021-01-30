<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>校园投诉公告</title>
<link rel="stylesheet" href="assets/css/common.css"/>
<link rel="stylesheet" href="assets/css/style.css" />
<link rel="stylesheet" href="assets/css/icons.css" />
<link rel="stylesheet" href="assets/css/table.css" />
<script type="text/javascript">
  function jump(){
		 alert("退出成功!");
  }
</script>
<style>
	.container3{
		border:1px solid #ccc;
		height:400px;
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
            <ul class="top_bars">
                <li><a style="color: maroon;font-weight:bolder">当前用户:&nbsp&nbsp${sessionScope.user.username}</a>|</li>
                <li><a>公告<span class="jt_down"></span></a>|</li>
                <li><a href="http://www.lzcu.edu.cn/"target="_parent">关注城院<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<div class="h3_center">
        </div>
        <div class="h3_right">
             <%-- <div class="myyy">
            	<a href="Accteaname?param=${requestScope.list2.name}" target="_parent">开始受理</a>
                <span class="sj_down"></span>
             </div>
             <div class="myyy">
            	<a href="Listeaccsituion?param=${requestScope.list2.name}" target="_parent">受理状况</a>
                <span class="sj_down"></span>
             </div> --%>
        	<!-- <div class="myyy">
            	<a href="userinfoadm.jsp" target="_parent">个人信息</a>
                <span class="sj_down"></span>
             </div> -->
            <div class="tsc">
           	  <a href="login.jsp" onclick=" return jump()">退出系统</a>
              <span class="sj_right"> </span>
            </div>
        </div>
    </div>
    <div class="container3">
    	<h1 style="font-weight:bolder ">${requestScope.noti.name}</h1>
    	<div style="background-color:#5a6463;font-weight:bolder; height:20px ">
    		<span>发布时间：${requestScope.time}</span>
    		<span>发布者：${requestScope.noti.people}</span>
    		<span>发布单位：${requestScope.noti.publish}</span>
    	</div>
    	<pre>
    		${requestScope.noti.content}
    	</pre>
    </div>
     <div class="c20"></div>
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1"></div>
            </div>
        </div>
    </div>
</body>
</html>







