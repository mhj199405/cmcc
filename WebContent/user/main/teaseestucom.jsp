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
	<div class="col-sm-12" >
		<div class="ibox-content">
	        <div class="row" style="border-bottom: 1px solid #1660de; padding: 5px 0">
	       <div class="col-sm-6">
					    <div class="input-group col-sm-4">
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
	        </div>
	        <div class="table-responsive"  style="border-color: #00b895;">
	        <form id="batchDelForm" action="Batchdele?ids=checkedList" method="get">
	            <table class="table table-striped">
	                <thead>
	                    <tr style="border-color: #00b895;">
	                        <th>上诉用户</th>
	                        <th>被诉讼者</th>
	                        <th>隶属单位</th>
	                        <th>上诉日期</th>
	                        <th>详情查看</th>
	                    </tr>
	                </thead>
	                <tbody>
	                <c:forEach items="${users}" var="user">
	                    <tr>
	                        <td>${user.comname}</td>
	                        <td><span class="pie">${user.complaint}</span>
	                        </td>
	                        <td>${user.publish}</td>
	                        <td><fmt:formatDate value="${user.dob}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                        <td style="color:#337ab7">
	                        	&nbsp;&nbsp;&nbsp;&nbsp;<a href="ListIdComs?id=${user.id}"><i class="fa fa-pencil" style="cursor:pointer;" ></i></a>
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
									<a href="TeaSeeStuCom?pageIndex=1&name=${name}"><img src="assets/img/first.gif"/></a>
									<a href="TeaSeeStuCom?pageIndex=${pageIndex-1}&name=${name}"><img src="assets/img/back.gif"/></a>
									<a href="TeaSeeStuCom?pageIndex=${pageIndex+1}&name=${name}"><img src="assets/img/next.gif"/></a>
									<a href="TeaSeeStuCom?pageIndex=${pageCount}&name=${name}"><img src="assets/img/last.gif"/></a>
								</div>
							</div>
							<div id="foot_right"></div>
			</div>
	            </form>
	        </div>
	    </div>
	</div>
	<script type="text/javascript">
	
	 $('.summernote').summernote({
        height: 400,
        tabsize: 2,
        lang: 'zh-CN'
    });
  	 function goBack(){
  		 window.location.href="Listeapage?pageIndex=1";
  	 }
  	function reFreshs(){
  	  	//此处填写要处理的逻辑代码
  	  	    window.location.href="TeaSeeStuCom?pageIndex=${pageIndex}&name=${name}";//刷新
  	  	} 
  </script>
</body>
</html>