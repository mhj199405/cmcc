<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isThreadSafe="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>">
<head>
  <title>学生首页</title>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link href="font/font-awesome/css/font-awesome.css" rel="stylesheet">
   <link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
  <link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
   <link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
 </head>
 <body>
  <div class="header">
  	<div style="height:60px;background:#3d556d;float:left;width:180px;"><img alt="图片加载失败" src="assets/img/ts.png" style="width:40px;height:40px;margin-top:-8px;"> <span style="color:#fff;font-size:22px; font-weight:600;margin-left:8px;line-height:48px;">投诉社区</span> </div>
    <div   class="backDiv" style="height:60px;float:left;width:180px;margin-left:30px;"><img title="返回首页" alt="图片加载失败" src="assets/img/home.png" style="width:25px;height:25px;margin-top:12px;cursor:pointer;"></div>
    <div style="padding-right:15px; float:right">
    <img style="width:40px;height:40px;margin-top:-12px;margin-right:5px;border-radius:50%;" alt="" src="assets/img/head.jpg" >
    <span style="margin-right:80px;margin-top:-8px;" class="dl-log-user">${sessionScope.logname}</span>
    <a href="login.jsp" title="退出系统" class="fa fa-sign-out" style="font-size:25px;padding-top:15px;text-decoration:none "></a>
    </div>
  </div>
   <div class="content">
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">
    </ul>
  <script type="text/javascript" src="assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="assets/js/bui.js"></script>
  <script type="text/javascript" src="assets/js/config.js"></script>
  <script type="text/javascript">
  $(function(){
		$('.backDiv').click(function(){
			$('button[type=reset]').trigger('click');
			window.location.href="user/main/index.jsp";
		});
		// 提交
		
	})
  
  </script>
  <script>
    BUI.use('common/main',function(){
      var config = [{
          id:'menu', 
          homePage : 'code',
          menu:[{
              text:'事件操作',
              items:[
                {id:'code',text:'浏览专栏',href:'Browse?pageIndex=1&pageIndex1=1&pageIndex2=1&comname=${sessionScope.user.username}'},
              /*   {id:'main-menu',text:'事件更新',href:'Listupdatecomp?username=${sessionScope.user.username}'}, */
                /* {id:'second-menu',text:'增添事件',href:'user/main/add.jsp'}, */
                {id:'dyna-menu',text:'操作专栏',href:'Delelistid?comname=${sessionScope.user.username}&pageIndex=1&name1='}
              ]
            },{
              text:'个人中心',
              items:[
                {id:'operation',text:'完善信息',href:'MyInfo?stuid=${sessionScope.user.username}'},
                {id:'quick',text:'修改密码',href:'user/search/uppasswd.jsp'}  
              ]
            },{
                text:'系统介绍',
                items:[
                  {id:'code',text:'关于系统',href:'user/detail/system.jsp'},
                  {id:'example',text:'版权归属',href:'user/detail/copyright.jsp'}
                ]
              },{
                  text:'公告通知',
                  items:[
                   
                    {id:'remote',text:'公告',href:'user/main/stutable.jsp'},
                    /* {id:'group',text:'公告2',href:'user/form/group.html'},
                    {id:'depends',text:'公告3',href:'user/form/depends.html'},
                    {id:'valid',text:'公告4',href:'user/form/basicValid.html'},
                    {id:'advalid',text:'公告5',href:'user/form/advalid.html'} */
                  ]
                }]
          }];
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
 </body>
</html>
