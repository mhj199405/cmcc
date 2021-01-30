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
  <title>管理员首页</title>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
  <link href="font/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
   <link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
 </head>
 <body>
  <div class="header">
  	<div style="height:60px;background:#3d556d;float:left;width:180px;"><img alt="图片加载失败" src="assets/img/ts.png" style="width:40px;height:40px;margin-top:-8px;"> <span style="color:#fff;font-size:22px; font-weight:600;margin-left:8px;line-height:48px;">投诉社区</span> </div>
    <div class="backDiv" style="height:60px;float:left;width:180px;margin-left:30px;"><img title="返回首页" alt="图片加载失败" src="assets/img/home.png" style="width:25px;height:25px;margin-top:12px;cursor:pointer;"></div>
    <div style="padding-right:15px; float:right"><img style="width:40px;height:40px;margin-top:-12px;margin-right:5px;border-radius:50%;" alt="" src="assets/img/manger.png"><span style="margin-right:80px;margin-top:-8px;" class="dl-log-user">${sessionScope.user.username}</span><a href="login.jsp" title="退出系统" class="fa fa-sign-out" style="font-size:25px;padding-top: 15px;"></a></div>
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
			window.location.href="user/main/manager.jsp";
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
              text:'首页内容',
              items:[
              {id:'code',text:'事件社区',href:'Browseadm?pageIndex=1&pageIndex1=1&pageIndex2=1&comname=20150804050500',closeable : false},
              /* {id:'main-menu',text:'受理情况',href:'user/main/update1.jsp'} */
              ]
            },/* {
                text:'投诉证明',
                items:[
                  {id:'operation',text:'上传证明',href:'user/main/uproof.jsp'},
                  {id:'quick',text:'删除证明',href:'user/main/deroof.jsp'}  
                ]
              },{
                text:'事件性质',
                items:[
                  {id:'resource',text:'紧急事件',href:'user/main/urgent.jsp'},
                  {id:'loader',text:'一般事件',href:'user/main/usual.jsp'}  
                ]
              }, */{
                  text:'角色管理',
                  items:[
               {id:'code',text:'学生',href:'Student?pageIndex=1'},
               {id:'example',text:'老师',href:'Teacher?pageIndex=1'}
                  ]
                },/* {
                    text:'系统介绍',
                    items:[
                        {id:'code',text:'关于系统',href:'user/detail/system.jsp'},
                      {id:'example',text:'版权归属',href:'user/detail/copyright.jsp'}
                    ]
                  }, */{
                      text:'公告管理',
                      items:[
                         {id:'remote',text:'公告',href:'Notice?pageIndex=1'},
                        
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
