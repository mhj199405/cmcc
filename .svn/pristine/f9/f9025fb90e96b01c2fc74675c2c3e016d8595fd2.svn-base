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
 <title>Login form shake effect</title>
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="assets/css/login.css">
</head>
<!-- 登录界面 -->
<body>
	<div class="wrapper">
		<form action="Login" method="post">
		  <div class="login-form">
		     <div class="form-group ">
		         <select class="form-control1" name="role">
		            <option class="one" value="学生" selected="true">学生</option>
		             <option></option>
		              <option class="one" value="老师">老师</option>
		             <option></option>
		            <option  class="one" value="管理员" >管理员</option>
		         </select>
		     </div>
		     <div class="form-group ">
		       <input type="text" class="form-control1" placeholder="Username " id="UserName" name="username" ">
		       <i class="fa fa-user"></i>
		     </div>
		     <div class="form-group log-status">
		       <input type="password" class="form-control1" placeholder="Password" id="Passwod" name="password">
		       <i class="fa fa-lock"></i>
		     </div>
		     <a class="link" href="" data-toggle="modal" data-target="#exampleModal" style="text-decoration:none;color:#fff;font-size:15px">用户注册</a>
		     <div class="auto1">
		     <input type="checkbox" name="auto" value="1"/><a style="color:#fff;">记住密码</a>
		     </div>
		     <button type="submit" class="log-btn" >登录</button>
		     </div>
		</form>
</div>	

<!-- 注册界面 -->

<div class="modal fade " id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button id="#myModal2" type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">×</span></button>
                <h2 class="text-center" id="exampleModalLabel">用户注册</h2>
            </div>
 
            <div class="modal-body">
                    <form  id="submitform" action="Register" method="post">
                            <div class="form-group">
                                <label for="username" class="control-label">用户名:</label>
                                <input class="form-control" type="text" placeholder="学号注册" id="username" name="username">
                            </div>
                            <div class="form-group">
                                <label for="password" class="control-label">密码</label>
                                <input class="form-control" type="password" placeholder="至少6位字母或数字" id="password" name="password">
                            </div>
                            <div class="form-group">
                                <label for="checkPwd" class="control-label">再次输入密码</label>
                                <input class="form-control" type="password" placeholder="至少6位字母或数字" id="checkPwd" name="checkPwd">
                            </div>
                             <div class="form-group">
                                <label for="phone" class="control-label">联系方式</label>
                                <input class="form-control" type="text" placeholder="电话号码" id="phone" name="phone">
                            </div>
                            <div class="form-group">
                                <label for="email" class="control-label">邮箱</label>
                                <input class="form-control" type="email" placeholder="例如:123@123.com" id="email" name="email">
                            </div>
                            <div class="text-right">
                                <button id="submitBtn" class="btn btn-primary" type="submit">注册</button>
                                <button id="myModal" class="btn btn-danger" data-dismiss="modal">取消</button>
                            </div>
                            <a href="login.jsp" data-toggle="modal" data-dismiss="modal" data-target="#login">已有账号？点我登录</a>
                    </form>
                </div>
        </div>
    </div>
</div>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/js/bootstrapValidator.js"></script>
	<script src="assets/js/form.js"></script>
	<script type='text/javascript'>
    	$("#myModal").click(function() {
		    document.getElementById("submitform").reset();
		    window.location.reload();
		});
		$("#myModal2").click(function() {
		    document.getElementById("submitform").reset();
		    
		});
	</script>
	
</body>
</html>