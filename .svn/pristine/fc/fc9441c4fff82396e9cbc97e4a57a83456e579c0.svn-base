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
		        	 <form action="LikeNameAllCom?pageIndex=${pageIndex}" method="post">
					    <div class="input-group col-sm-4">
					      <input type="text" class="form-control" placeholder="搜索" name="name1" style="height:28px;">
					      <span class="input-group-btn">
					        <button class="btn btn-default" type="submit" ><i class="fa fa-search"></i></button>
					      </span>
					    </div>
					  </form>
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
	                        <th>序号</th>
	                        <th>投诉事件</th>
	                        <th>操作</th>
	                    </tr>
	                </thead>
	                <tbody>
	                <c:forEach items="${lists}" var="list" varStatus="x">
	                    <tr>
	                        <td><a style="margin-left:8px;color:#333353 ">${x.count}</a></td>
	                        <td><span class="pie">${list.name}</span>
	                        </td>
	                        <td style="color:#337ab7">
	                        	<a href="TeaSeeStuCom?name=${list.name}&pageIndex=1"><i class="fa fa-pencil" style="cursor:pointer;margin-left:-10px " ></i></a>
	                        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="TeaNameSitu?name=${list.name}" style="color:#337ab7;"><i class="fa fa-file" style="cursor:pointer;"></i></a>
	                        </td>
	                    </tr>
	                 </c:forEach>
	                </tbody>
	            </table>
	            </form>
	                            <div style="position:relative; margin-left:30px;color:#282830;font-weight: bolder;"> 总共${total}条事件,当前第${pageIndex }/${pageCount }页</div>  
	                            <div id="foot_button" style="position:relative; margin-left:900px;margin-top:-20px" >
	                                <a href="Listeapage?pageIndex=1"><img src="assets/img/first.gif"/></a>
									<a href="Listeapage?pageIndex=${pageIndex-1}"><img src="assets/img/back.gif"/></a>
									<a href="Listeapage?pageIndex=${pageIndex+1}"><img src="assets/img/next.gif"/></a>
								    <a href="Listeapage?pageIndex=${pageCount}"><img src="assets/img/last.gif"/></a>
								</div>
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
  	  	    window.location.href="Listeapage?pageIndex=1";//刷新
  	  	} 
  	function getRequest(){
  		window.location.href="";
  	}
  </script>
</body>
</html>