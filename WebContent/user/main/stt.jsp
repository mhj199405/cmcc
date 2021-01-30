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
			width:80%;
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
	<div >
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header text-center">
					<div class="backDiv">
						<i class="fa fa-chevron-left"></i>
						<span>返回</span>
					</div>
					<div class="modal-title">
						查看公告
					</div>
				</div>
				<div class="modal-body">
						<div class="form-group">
							<label for="">公告名称</label>
							<input type="text" name="name" class="form-control" value="${requestScope.nots.name}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">公告类型</label>
							<input name="type" class="form-control" value="${requestScope.nots.type}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">公告发布者</label>
							<input type="text" name="people" class="form-control"  value="${requestScope.nots.people}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="">内容</label>
							<div class="text">
								<textarea class="summernote" name="content">${requestScope.nots.content}</textarea>
						</div>
				</div>
			</div>
		</div>
	</div>
    <script type="text/javascript">
    	$(function(){
			// 返回
			$('.backDiv').click(function(){
				$('button[type=reset]').trigger('click');
				window.location.href="TeaNotice?pageIndex=1&type=${requestScope.nots.type}";
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
