<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isThreadSafe="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单</title>
<link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="font/font-awesome/css/font-awesome.css" rel="stylesheet">
<link href="assets/dist/summernote.css" rel="stylesheet"/>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/dist/summernote.js"></script>
<script src="assets/dist/lang/summernote-zh-CN.js"></script>
</head>
<body>
	<style>
		.text{ width: 100%; margin-left: auto; margin-right: auto; }
		.modal{
			background-color: rgba(0,0,0,0.4);
			overflow-y: scroll;
		}
		.modal-dialog{
			width: 95%;
			margin: -2px auto 0;
		}
		.backDiv{
			float: left;
			cursor: pointer;
		}
		.messageSpan{
			color: red;
		}
	</style>
	<div class="col-sm-12" style="margin-top:20px " >
		<div class="ibox-content">
	        <div class="table-responsive"  style="border-color: #00b895;">
	         <div class="col-sm-6">
					    <div class="input-group col-sm-4">
					      <input type="text" class="form-control"  name="name" value="   公告如下 :" style="height:28px;color:#337ab7;font-weight:bold;font-family: monospace; " readonly="readonly">
					      <span class="input-group-btn">
					        <button class="btn btn-default" type="submit" ><i class="fa fa-thumbs-o-down"></i></button>
					      </span>
					    </div>
		  		 </div>
		  	  
	  			<div class="col-sm-6">
	  				<div class=" btn-group col-sm-2.5 pull-right">
	  					<button type="button" class="btn btn-outline btn-default" >
	                    <i class="fa fa-reply-all" onclick='goBack()'></i>
			            </button>
			            <button type="button" class="btn btn-outline btn-default addBtn">
			                <i class="fa fa-refresh"  onclick='reFreshs()'></i>
			            </button>
			            <button type="button" class="btn btn-outline btn-default batchDel">
			                <i class="fa fa-delicious" onclick='getRequest()'></i>
			            </button>
	  				</div>
	        	</div>
	            <table class="table table-striped">
	                <thead>
	                    <tr style="border-color: #00b895;">
	                        <th></th>
	                        <th>公告标题</th>
	                        <th>发布者</th>
	                        <th>发布日期</th>
	                        <th>查看内容</th>
	                    </tr>
	                </thead>
	                <tbody>
	                <c:forEach items="${users}" var="user">
	                    <tr>
	                        <td>
	                            <div  class="i-checks"></div>
	                        </td>
	                        <td>${user.name}</td>
	                        </td>
	                        <td>${user.people}</td>
	                        <td><fmt:formatDate value="${user.time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                        <td style="color:#337ab7">
	                        	<a href="ListteaIdContent?id=${user.id}"><i class="fa fa-file" style="cursor:pointer;margin-left:20px " ></i></a>
	                        </td>
	                    </tr>
	                 </c:forEach>
	                </tbody>
	            </table>
	               总共${total}条公告
	        </div>
	    </div>
	</div>	
	<script type="text/javascript">
  	 function goBack(){
  		 window.location.href="user/main/teatable.jsp";
  	 }
  	function reFreshs(){
  	  	//此处填写要处理的逻辑代码
  	  	    window.location.href="TeaNotice?pageIndex=1&type=${requestScope.type}";//刷新
  	  	} 
  	function getRequest(){
  		window.location.href="";
  	}
    </script>
</body>
</html>