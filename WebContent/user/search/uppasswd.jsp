<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stuindex.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap/font/font-awesome/css/font-awesome.css" rel="stylesheet"	type="text/css">
    <script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>

  </head>
  
  <body style="background-image:url('assets/img/uppasswd.png'); ">
    <div class="wrapper">
    <divclass="modal fade" >
        <div class="modal-dialog">
            <div class="modal-content" style="width:100%;height:480px ">
              <div class="modal-body">
                    <button class="close"   data-dismiss="modal">
                        <span onclick='goBack()'>&times;</span>
                    </button>
                </div>
                <div class="modal-title">
                    <h2 class="text-center">修改密码</h2>
                </div>
                <div class="modal-body">
                   <form  id="submitform" action="Updpawd" method="post">
                            <div class="form-group">
                                <label for="username" class="control-label">用户名:</label>
                                <input class="form-control" type="text" placeholder="学号注册" id="username" name="username" value="${sessionScope.user.username}" readonly="readonly">
                            </div>
                            <div class="form-group">
                                <label for="password" class="control-label">原密码</label>
                                <input class="form-control" type="password" placeholder="至少6位字母或数字" id="password" name="password">
                            </div>
                            <div class="form-group">
                                <label for="checkPwd" class="control-label">新密码</label>
                                <input class="form-control" type="password" placeholder="至少6位字母或数字" id="checkPwd" name="checkPwd">
                            </div>
                            <div class="form-group">
                                <label for="checkPwd" class="control-label">再次输入新密码</label>
                                <input class="form-control" type="password" placeholder="至少6位字母或数字" id="checkPwd" name="checkPwd1">
                            </div>
                            <div class="text-right">
                                <button id="submitBtn" class="btn btn-primary" type="submit">修改</button>
                                <button  class="btn btn-danger" data-dismiss="modal" type="reset">取消</button>
                            </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="assets/js/bootstrapValidator.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/form.js"></script>
    <script type='text/javascript'>
		var msg="${requestScope.msg}";
	  	if(msg.trim().length!=0){
	  		alert(msg);
	  	}
	  function goBack(){
		  window.location.href="Browse?pageIndex=1&pageIndex1=1&pageIndex2=1&comname=${sessionScope.user.username}";
	  }
	</script>
  </body>
</html>