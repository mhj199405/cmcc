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
<link rel="stylesheet" type="text/css" href="assets/css/stuindex.css">
	<link rel="stylesheet" type="text/css" href="css/animate.css">
	<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap/font/font-awesome/css/font-awesome.css" rel="stylesheet"	type="text/css">
    <script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>

  </head>
  
  <body>
  	<script type="text/javascript">
        $().ready(function()
            {
                $(".myTab,i").on('click',function ()
                {
                    if($('.topSub-nav')[0].style.display =='none'){
                        $('.topSub-nav')[0].style.display = 'block';
                    }else{
                        $('.topSub-nav')[0].style.display = 'none';
                    }
                });
                var msg="${requestScope.msg}";
	            if(msg.trim().length!=0){
		        	$('.alertDiv').addClass('animated slideInRight');
                	$('.alertDiv').show();
                	setTimeout(function(){
		    		$('.alertDiv').fadeOut();
		    		},2000);
	            }
                $(".one").on('click',function(){
                    window.location.href = "StuNotice?pageIndex=1&type="+校级公告;
                });
                $(".two").on('click',function(){
                    window.location.href = "student/data.jsp";
                });
                $(".three").on('click',function(){
                    window.location.href = "ListIdCertify?idcard=${sessionScope.idcard}";
                });
           })
     </script>
    <div class="wrapper">
        <div class="top">
            <div class="top_left"><img src="assets/img/notice.jpg" alt="" class="login"></div>
            <div class="top_right">
                <i class="fa fa-user user"></i>&nbsp;&nbsp;<span class="myTab"></span>&nbsp;&nbsp;<i class="fa fa-sort-down down"></i>
                <ul class="topSub-nav" >
                    <li class="modify-pwd"><i class="fa fa-unlock" ></i>&nbsp;&nbsp;<a data-toggle="modal" data-dismiss="modal" data-target="#register">修改密码</a>
                    </li>
                    <li class="user-center exit"><i class="fa fa-power-off"></i>&nbsp;&nbsp;&nbsp;<a>退出系统</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="content">
            <ul>
               <a href="StuNotice?pageIndex=1&type=校级公告"><li class="one">校级公告</li></a>
                 <a href="StuNotice?pageIndex=1&type=院级公告"><li class="two">院级公告</li></a>
                 <a href="StuNotice?pageIndex=1&type=班级公告"><li class="three">班级公告</li></a>
            </ul>
        </div>
        <div class="bottom">
            <p><span>学校地址：甘肃省兰州市安宁区街坊路11号 兰州城市学院本部</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <span>邮政编码：730070</span></p>
        </div>
    </div>
    <script src="js/bootstrapValidator.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/form.js"></script>
    <script type="text/javascript"></script>
  </body>
</html>