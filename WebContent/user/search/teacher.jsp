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
					      <input type="text" class="form-control"  name="name" value="   用户如下 :" style="height:28px;color:#337ab7;font-weight:bold;font-family: monospace; " readonly="readonly">
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
	                        <th>用户账号</th>
	                        <th>联系方式</th>
	                        <th>注册时间</th>
	                        <th>注销</th>
	                    </tr>
	                </thead>
	                <tbody>
	                <c:forEach items="${users}" var="user">
	                    <tr>
	                        <td>
	                            <div  class="i-checks"></div>
	                        </td>
	                        <td>${user.username}</td>
	                        </td>
	                        <td>${user.phone}</td>
	                        <td><fmt:formatDate value="${user.dob}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                        <td style="color:#337ab7">
	                        	<!-- <a href=""><i class="fa fa-file" style="cursor:pointer;" ></i></a> -->
	                        	&nbsp;&nbsp;<a href="/Demo/Deletea?ids=${user.username}" style="color:red;"><i class="fa fa-trash-o" style="cursor:pointer;" onclick='Delet(${user.username})'></i></a>
	                        </td>
	                    </tr>
	                 </c:forEach>
	                </tbody>
	            </table>
	            <div id="table_foot">
							<div id="foot_left"></div>
							<div id="foot_center">
								<div id="foot_count" style="margin-left:20px">
									共有${total }条记录，当前第${pageIndex }/${pageCount }页
								</div>
								<div id="foot_button" style="margin-left:880px;margin-top:-22px">
									<a href="Teacher?pageIndex=1"><img src="assets/img/first.gif"/></a>
									<a href="Teacher?pageIndex=${pageIndex-1}"><img src="assets/img/back.gif"/></a>
									<a href="Teacher?pageIndex=${pageIndex+1}"><img src="assets/img/next.gif"/></a>
									<a href="Teacher?pageIndex=${pageCount}"><img src="assets/img/last.gif"/></a>
								</div>
							</div>
							<div id="foot_right"></div>
			</div>
	        </div>
	    </div>
	</div>	
	<script type="text/javascript">
  	 function goBack(){
  		 window.location.href="Teacher?pageIndex=1";
  	 }
  	function reFreshs(){
  	  	//此处填写要处理的逻辑代码
  	  	    window.location.href="Teacher?pageIndex=1";//刷新
  	  	} 
	  function Delet(ids){
		  var flag=confirm("确定删除吗?");
		  var one = document.createElement('input');     
			one.name = 'ids';                         
			one.value = ids;
		
		  if(flag){
			 var tmp =document.createElement("form");
		    	tmp.action="Deletea";
		    	tmp.method="post";
		    	document.body.appendChild(tmp);
		    	tmp.appendChild(one);
		    	tmp.submit();
	   }
	  }
    </script>
</body>
</html>