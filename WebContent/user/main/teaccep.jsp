<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isThreadSafe="true"%>
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
<link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="font/font-awesome/css/font-awesome.css" rel="stylesheet">
<link href="assets/dist/summernote.css" rel="stylesheet"/>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/dist/summernote.js"></script>
<script src="assets/dist/lang/summernote-zh-CN.js"></script>
<title>个人信息</title>
</head>
<body style="background-color:#ccc">
		<style>
		.text{ width: 100%; margin-left: auto; margin-right: auto; }
		/* .modal{
			background-color: rgba(0,0,0,0.4);
			overflow-y: scroll;
		} */
		.modal-dialog{
			width:99%;
			margin: 15px auto 0;
		}
		.backDiv{
			float: left;
			cursor: pointer;
		}
		.messageSpan{
			color: red;
		}
	</style>
	<form action="TeaAccCom" method="post">
	<div>
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header text-center">
					<div class="backDiv">
						<i class="fa fa-chevron-left"></i>
						<span>返回</span>
					</div>
					<div class="modal-title">
						受理事件
					</div>
				</div>
				<div class="modal-body">
					<form  class="form">
						<div class="form-group">
							<label for="">受理事件</label>
							<input type="text" name="ucpname" class="form-control" value="${name}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">受理人员</label>
						    <input type="text" name="situpeople" class="form-control" value="${sit.situpeople}">
						</div>
						<div class="form-group">
							<label for="">受理原因</label>
							<input type="text" name="reason" class="form-control" value="${sit.reason}" placeholder="必须填写" >
						</div>
						<div class="form-group">
							<label for="">受理状态</label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;未处理:<input type="radio" name="accsituation"  value="null" ${sit.accsituation==null?"checked='checked'":""}  >
						    &nbsp;&nbsp;已处理:<input type="radio" name="accsituation"  value="已处理" ${sit.accsituation=="已处理"?"checked='checked'":""}>
						</div>
						<div class="form-group">
							<label for="">事件说明</label>
							<div class="text">
								<textarea class="summernote" name="situevidence">${sit.situevidence}</textarea>
							</div>
						</div>
						<div class="form-group hide">
							<button type="reset">重置</button>
						</div>	
					</form>
				</div>
				<div class="modal-footer">
					<span class="messageSpan"></span>
					<button class="btn btn-success btn-sm saveBtn">开始受理</button>
				</div>
			</div>
		</div>
	</div>
	</form>
	<script type="text/javascript">
  	$(function(){
		// 返回
		$('.backDiv').click(function(){
			$('button[type=reset]').trigger('click');
			window.location.href="Listeapage?pageIndex=1";
		});
	})
	 $('.summernote').summernote({
        height: 400,
        tabsize: 2,
        lang: 'zh-CN'
    });
  </script>
</body>
</html>