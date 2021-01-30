<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isThreadSafe="true"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
 <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="font/font-awesome/css/font-awesome.css" rel="stylesheet">
<link href="assets/dist/summernote.css" rel="stylesheet"/>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/dist/summernote.js"></script>
<script src="assets/dist/lang/summernote-zh-CN.js"></script>
  </head>
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
  <body style="background-color:#ccc;">
 
 <!-- 添加模态框开始 -->
	<form action="Updanotify?id=${requestScope.nots.id}"  method="post">
	<div >
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header text-center">
					<div class="backDiv">
						<i class="fa fa-chevron-left"></i>
						<span>返回</span>
					</div>
					<div class="modal-title">
						修改公告
					</div>
				</div>
				<div class="modal-body">
						<div class="form-group">
							<label for="">公告名称</label>
							<input type="text" name="name" class="form-control" value="${requestScope.nots.name}">
						</div>
						<div class="form-group">
							<label for="">公告类型</label>
							<select name="type" class="form-control">
								<option value="${requestScope.nots.type}">${requestScope.nots.type}</option>
								<option value="校级公告">校级公告</option>
								<option value="院级公告">院级公告</option>
								<option value="班级公告">班级公告</option>
							</select>
						</div>
						<div class="form-group">
							<label for="">公告发布者</label>
							<input type="text" name="people" class="form-control"  value="${requestScope.nots.people}">
						</div>
						<div class="form-group">
							<label for="">内容</label>
							<div class="text">
								<textarea class="summernote" name="content">${requestScope.nots.content}</textarea>
						</div>
						<div class="form-group hide">
							<button type="reset">重置</button>
						</div>	
				</div>
				<div class="modal-footer">
					<span class="messageSpan"></span>
					<button class="btn btn-success btn-sm saveBtn">提交</button>
				</div>
			</div>
		</div>
	</div>
	</form>
    <script type="text/javascript">
    $(function(){
		 $('.batchDel').click(function(){
			var checkedNum = $("input[name='id']:checked").length;
			 if(checkedNum>0){
				 //  确认是否删除
				window.confirm("您确定要删除吗?");
				// 提交表单
				$("#batchDelForm").submit();
			 }else{
				alert("请选择要删除的内容！");
			 }
		 });
	  	var msg="${requestScope.msg}";
	  	if(msg.trim().length!=0){
	  		alert(msg);
	  	}
	});
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
				window.location.href="Notice?pageIndex=1";
			});
			// 提交
			
		})

		 $('.summernote').summernote({
	        height: 400,
	        tabsize: 2,
	        lang: 'zh-CN'
	    });
	  
    </script>
</body>
</html>
