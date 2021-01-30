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
		        	 <form action="LikeNameCom?comname=${sessionScope.user.username}&pageIndex=1" method="post">
					    <div class="input-group col-sm-4">
					      <input type="text" class="form-control" placeholder="搜索" name="name" style="height:28px;">
					      <span class="input-group-btn">
					        <button class="btn btn-default" type="submit" ><i class="fa fa-search"></i></button>
					      </span>
					    </div>
					  </form>
		  		 </div>
		  	  
	  			<div class="col-sm-6">
	  				<div class=" btn-group col-sm-2.5 pull-right">
	  					<button type="button" class="btn btn-outline btn-default addBtn" >
	                    <i class="fa fa-plus"></i>
			            </button>
			            <button type="button" class="btn btn-outline btn-default addBtn">
			                <i class="fa fa-heart"></i>
			            </button>
			            <button type="button" class="btn btn-outline btn-default batchDel">
			                <i class="fa fa-trash"></i>
			            </button>
	  				</div>
	        	</div>
	        </div>
	        <div class="table-responsive"  style="border-color: #00b895;">
	        <form id="batchDelForm" action="BatDeleCompla" method="get">
	            <table class="table table-striped">
	                <thead>
	                    <tr style="border-color: #00b895;">
	                        <!-- <th></th> -->
	                        <th>事件名称</th>
	                        <th>隶属单位</th>
	                        <th>被诉讼者</th>
	                        <th>上诉日期</th>
	                        <th>操作</th>
	                    </tr>
	                </thead>
	                <tbody>
	                <c:forEach items="${lists}" var="list">
	                    <tr>
	                        <td>${list.name}</td>
	                        <td><span class="pie">${list.publish}</span>
	                        </td>
	                        <td>${list.complaint}</td>
	                        <td><fmt:formatDate value="${list.dob}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	                        <td style="color:#337ab7" >
	                        	<a href="Lisuseunamecom?comname=${sessionScope.user.username}&name=${list.name}"><i class="fa fa-pencil" style="cursor:pointer;margin-left:-15px " ></i></a>
	                        	&nbsp;&nbsp;<a style="color:red"><i class="fa fa-trash-o" style="cursor:pointer;" onclick='dele(${list.id},${sessionScope.user.username})'></i></a>
	                        	&nbsp;&nbsp;&nbsp;<a href="StuListNamSitu?name=${list.name}"><i class="fa fa-file-text-o" style="cursor:pointer;" ></i></a>
	                        </td>
	                    </tr>
	                 </c:forEach>
	                </tbody>
	            </table>
	            </form>
	                            <div style="position:relative; margin-left:30px;color:#282830;font-weight: bolder;"> 总共${total}条事件,当前第${pageIndex }/${pageCount }页</div>  
	                            <div id="foot_button" style="position:relative; margin-left:900px;margin-top:-20px" >
	                                <a href="Delelistid?comname=${sessionScope.user.username}&pageIndex=1"><img src="assets/img/first.gif"/></a>
									<a href="Delelistid?comname=${sessionScope.user.username}&pageIndex=${pageIndex-1}"><img src="assets/img/back.gif"/></a>
									<a href="Delelistid?comname=${sessionScope.user.username}&pageIndex=${pageIndex+1}"><img src="assets/img/next.gif"/></a>
								    <a href="Delelistid?comname=${sessionScope.user.username}&pageIndex=${pageCount}"><img src="assets/img/last.gif"/></a>
								</div>
	        </div>
	    </div>
	</div>
	<!-- 添加模态框开始 -->
	<form action="Add?comname=${sessionScope.user.username}" method="post">
	<div class="modal" id="categoryModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header text-center">
					<div class="backDiv">
						<i class="fa fa-chevron-left"></i>
						<span>返回</span>
					</div>
					<div class="modal-title">
						添加事件
					</div>
				</div>
				<div class="modal-body">
					<form  class="form">
						<div class="form-group">
							<label for="">公告名称</label>
							<input type="text" name="name" class="form-control">
						</div>
						<div class="form-group">
							<label for="">公告类型</label>
							<select name="type" class="form-control">
								<option value="">请选择公告类型</option>
								<option value="校级公告">校级公告</option>
								<option value="院级公告">院级公告</option>
								<option value="班级公告">班级公告</option>
							</select>
						</div>
						<div class="form-group">
							<label for="">公告发布者</label>
							<input type="text" name="people" class="form-control">
						</div>
						<div class="form-group">
							<label for="">内容</label>
							<div class="text">
								<textarea class="summernote" name="content">请输入内容...</textarea>
							</div>
						</div>
						<div class="form-group hide">
							<button type="reset">重置</button>
						</div>	
					</form>
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
	/* $(function(){
		 $('.batchDel').click(function(){
			var checkedNum = $("input[name='id']:checked").length;
			 if(checkedNum>0){
				 //  确认是否删除
				var flag=window.confirm("您确定要删除吗?");
				 if(flag){
				// 提交表单
				$("#batchDelForm").submit();
				 }
			 }else{
				alert("请选择要删除的内容！");
			 }
		 });
	  	var msg="${requestScope.msg}";
	  	if(msg.trim().length!=0){
	  		alert(msg);
	  	}
	}); */
	
  	$(function(){
		var option = "新增";
			// 设置modal-content的高度，为视口区的高度
		// 新增
		$('.addBtn').click(function(){
			option = "新增";
			// 清空表单，清空提示信息，清空select里面的内容(除了第一行)，从后台获取所有的栏目，追加option，显示模态框
			$('button[type=reset]').trigger('click');
			window.location.href="user/main/add.jsp";
			
		});
		// 返回
		$('.backDiv').click(function(){
			$('button[type=reset]').trigger('click');
			window.location.href="Delelistid?comname=${sessionScope.user.username}&pageIndex=1";
		
		});
		// 提交
		$('.saveBtn').click(function(){
			// 获取数据，表单验证，不通过提示用户，如果通过封装对象，传递给后台，保存成功，提示用户，刷新数据，关闭模态框
			var categoryName = $('input[name=categoryName]').val();
			var categoryParent = $('select[name=categoryParent]').val();
			var categoryComment = $('.summernote[name=categoryComment]').val();
			if(categoryName&&categoryComment){
				// 封装数据，保存
				var obj = {
					name:categoryName,
					comment:categoryComment,
					no:'',
					parentId:categoryParent,
				};
				if(option=="修改"){
					obj.id = currentId;
				}
				$.post(baseURL+'/manager/category/saveOrUpdateCategory',obj,function(res){
					console.log(res,'保存或更新成功');
					alert('保存或更新成功');
					loadData();
					$('#categoryModal').hide();
				})
			}else{
				$('.messageSpan').html('请输入完整的信息');
			}
		});
	})

	 $('.summernote').summernote({
        height: 400,
        tabsize: 2,
        lang: 'zh-CN'
    });
  	function dele(ids,comname){
		  var flag=confirm("确定删除吗?");
		  var one = document.createElement('input');     
			one.name = 'ids';                         
			one.value = ids;
		  var two = document.createElement('input');     
			two.name = 'comname';                         
			two.value = comname;
		
		  if(flag){
			 var tmp =document.createElement("form");
		    	tmp.action="Delebrowse?";
		    	tmp.method="post";
		    	document.body.appendChild(tmp);
		    	tmp.appendChild(one);
		    	tmp.appendChild(two);
		    	tmp.submit();
	   }
	  }
  </script>
</body>
</html>