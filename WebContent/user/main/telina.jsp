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
	<div>
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header text-center">
					<div class="backDiv">
						<i class="fa fa-chevron-left"></i>
						<span>返回</span>
					</div>
					<div class="modal-title">
						查看事件
					</div>
				</div>
				<div class="modal-body">
						<div class="form-group">
							<label for="">账户</label>
							<input type="text" name="comname" class="form-control" value="${requestScope.list2.comname}" readonly="readonly" >
						</div>
						<div class="form-group">
							<label for="">事件名称</label>
							<input type="text" name="name" class="form-control" value="${requestScope.list2.name}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">隶属单位</label>
							<input name="publish" class="form-control" value="${requestScope.list2.publish}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">被诉讼者</label>
							<input type="text" name="complaint" class="form-control" value="${requestScope.list2.complaint}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">事件证明</label>
							<div class="text">
								<textarea class="summernote" name="content"  >${requestScope.list2.content}</textarea>
							</div>
						</div>
						<div class="form-group hide">
							<button type="reset">重置</button>
						</div>	
				</div>
				<div class="modal-footer">
					<span class="messageSpan"></span>
					<button class="btn btn-success btn-sm saveBtn">受理情况</button>
					<button class="btn btn-success btn-sm saveBtn">开始受理</button>
				</div>
				
			</div>
		</div>
	</div>
	<script type="text/javascript">
  	$(function(){
		var option = "新增";
			// 设置modal-content的高度，为视口区的高度
		// 新增
		$('.addBtn').click(function(){
			option = "新增";
			// 清空表单，清空提示信息，清空select里面的内容(除了第一行)，从后台获取所有的栏目，追加option，显示模态框
			$('button[type=reset]').trigger('click');
			$('.messageSpan').html('');
			$('#categoryModal').show();
		});
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