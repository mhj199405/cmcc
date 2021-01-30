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
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel='stylesheet' href='font/font-awesome/css/font-awesome.min.css'>
    <link rel="stylesheet" href="assets/css/common1.css">
    <link rel="stylesheet" type="text/css" href="assets/css/animate.css">
    <link rel="stylesheet" href="assets/css/myinfo.css">
    <script src="assets/js/jquery.min.js"></script>
<title></title>
</head>
<body>
<style>
  		.home{
  			position: fixed;
  			border-radius: 50%;
  			width: 35px;
  			height: 35px;
  			right:20px;
  			top: 15px;
  			background:rgba(0,0,0,0.4);
  			color:#fff;
  			text-align: center;
  			cursor: pointer;
  			z-index: 1000;
  		}
  		.home:hover{
  			background:rgba(0,0,0,0.6);
  		}
  	</style>
  		<!-- <div class="home animated bounceInUp" title="返回首页"><a class="fa fa-home" href="student/stuindex.jsp" style="line-height: 35px; color:#fff; text-decoration: none; font-size:16px;"></a></div> -->
        <div class="container">
	        <div class="content">
	            <div class="header clearfix">
	                <div class="top fl">当前位置>个人信息</div>
	                <div class="bottom fr">
	                    <a id="emit" href="javascript:;">编辑</a>
	                    <a id="keep" href="javascript:;">保存</a>
	                </div>
	            </div>
		            <div class="main">
		                <!--基础信息-->
		                <div class="BasicInformation">
		                    <div class="title">
		                       	基础信息
		                    </div>
		                </div>
		                <div class="content clearfix">
		                    <div class="left fl">
		                        <div>
		                            <label for="">姓名：</label>
		                            <input id="stuname" type="text" value="${requestScope.info.stuname}" disabled />
		                        </div>
		                        <div>
		                           <label for="">性别：</label>
						                            男：<input type="radio" name="sex" value="0" ${requestScope.info.stusex=="0"?"checked='checked'":""} style="width: 20px; margin-top: 12px;">
						                            女：<input type="radio" name="sex" value="1" ${requestScope.info.stusex=="1"?"checked='checked'":""} style="width: 20px;">
		                        </div>
		                        <div>
		                            <label for="">出生日期：</label>
		                            <input id="birthday" type="text" name="stubirth" value="${requestScope.info.stubirth}" placeholder="1995-3-20" disabled>
		                        </div>
		                        <div>
		                            <label for="">身份证号：</label>
		                            <input id="idNumber" class="id oInp" name="idcard" type="text" value="${requestScope.info.idcard}" disabled>
		                        </div>
		                        <div>
		                            <label for="">所在班级：</label>
		                            <input id="class" type="text" name="stuclass" value="${requestScope.info.stuclass}" disabled />
		                        </div>
		                    </div>
		                    <div class="right fr">
		                        <div>
		                            <label for="">学号：</label>
		                            <input id="stuid" type="number" name="stuid" value="${sessionScope.user.username}" disabled>
		                        </div>
		                        <div>
		                            <label for="">民族：</label>
		                            <input id="national_name" type="text" name="stunation" value="${requestScope.info.stunation}" disabled>
		                        </div>
		                        <div class="label">
		                            <label for="">政治面貌：</label>
		                            <input id="politics" type="text" name="stunation" value="${requestScope.info.status}" disabled>
		                        </div>
		                        <div>
		                            <label for="">所在院系：</label>
		                            <input id="faculty" type="text" value="${requestScope.info.faculty}" disabled />
		                        </div>
	                    	</div>
	                	</div>
		                <!--联系方式-->
		                <div class="BasicInformation">
		                    <div class="title">联系方式</div>
		                </div>
		                <div class="content clearfix">
		                    <div class="left fl">
		                        <div>
		                            <label for="">手机号码：</label>
		                            <input id="phone" type="number" value="${requestScope.info.phone}" disabled>
		                        </div>
		                        <div>
		                            <label for="">QQ号码：</label>
		                            <input id="qq" type="number" value="${requestScope.info.qq}" disabled>
		                        </div>
		                    </div>
		                    <div class="right fr">
		                        <div>
		                            <label for="">电子邮箱：</label>
		                            <input id="e_mail" type="text" value="${requestScope.info.email}" class="mailbox" disabled>
		                        </div>
		                    </div>
		                </div>
		            </div>
	        </div>
    	</div>
        <script>
        var status = '${sessionScope.info.status}';
        $('#pl_name').text(status);
        $('#politics i').on('click', function() {
            $(this).siblings('ul').show();
        });
        $('#politics ul li').on('click', function() {
            var selTxt = $(this).text();
            $('#politics a').text(selTxt);
            $('#politics ul').hide();
        });
       
        $('#emit').on('click',function(){
			$('input').removeAttr('disabled');
		});
		$('#keep').on('click',function(){
			$('input').attr('disabled','disabled');
			var stuname = $('#stuname').val();
			var one = document.createElement('input');     
			one.name = 'stuname';                         
			one.value = stuname;
			var stusex = $("input[name='sex']:checked").val();
			var two = document.createElement('input');     
			two.name = 'sex';                         
			two.value = stusex;
      		var stubirth = $('#birthday').val();
      		var three = document.createElement('input');     
			three.name='stubirth';                         
			three.value=stubirth;
      		var idcard = $('#idNumber').val();
      		var four = document.createElement('input');     
			four.name='idcard';                         
			four.value=idcard;
      		var stuclass = $('#class').val();
      		var five = document.createElement('input');     
			five.name='stuclass';                         
			five.value=stuclass;
      		var stuid = $('#stuid').val();
      		var six = document.createElement('input');     
			six.name='stuid';                         
			six.value=stuid;
      		var stunation = $('#national_name').val();
      		var seven = document.createElement('input');     
			seven.name='stunation';                         
			seven.value=stunation;
      		var status = $('#politics').val();
      		var eight = document.createElement('input');     
			eight.name='status';                         
			eight.value=status;
      		var faculty = $('#faculty').val();
      		var nine = document.createElement('input');     
			nine.name='faculty';                         
			nine.value=faculty;
      		var phone = $('#phone').val();
      		var ten = document.createElement('input');     
			ten.name='phone'; 
			ten.value=phone; 
      		var qq = $('#qq').val();
      		var eleven = document.createElement('input');     
			eleven.name='qq'; 
			eleven.value=qq; 
      		var email = $('#e_mail').val();
      		var twelve = document.createElement('input');     
			twelve.name='email'; 
			twelve.value=email; 
	    	var tmp =document.createElement("form");
	    	tmp.action="PermyInfo";
	    	tmp.method="post";
	    	document.body.appendChild(tmp);
	    	tmp.appendChild(one);
	    	tmp.appendChild(two);
	    	tmp.appendChild(three);
	    	tmp.appendChild(four);
	    	tmp.appendChild(five);
	    	tmp.appendChild(six);
	    	tmp.appendChild(seven);
	    	tmp.appendChild(eight);
	    	tmp.appendChild(nine);
	    	tmp.appendChild(ten);
	    	tmp.appendChild(eleven);
	    	tmp.appendChild(twelve);
	    	tmp.submit();
	    	return tmp;
		});
    </script>
</body>
</html>