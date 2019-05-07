<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<%@include file="/commons/hplus-head.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/pages/commons/js/login.js"></script>
<script>
	if (window.top !== window.self) {
		window.top.location = window.location;
	}
</script>
<style type="text/css">
div.login {
	width: 250px;
	height: 250px;
	margin-top: -300px;
	margin-left: 1050px;
	margin-right: 100px;
}

button#sub {
	color: #FFFFFF;
	background: #FFCB3B;
	margin-top: 30px;
}

div.remember-box {
	color: #FFFFFF;
}
</style>
</head>
<body
	style="background: url('commons/image/login/dbj.png'); background-size: 100% 100%;"
	onresize="setDivLeftPosition();">
	<!-- 左上角标题 -->
	<div>
		<img alt="" src="./commons/image/login/zsjLOGO.png"
			style="background-size: 100% 100%; margin-top: 23px; margin-left: 25px">
	</div>
	<!-- 文字宣传 -->
	<div>
		<img alt="" src="./commons/image/login/wzxc.png"
			style="background-size: 100% 100%; margin-top: 10%; margin-left: 25%">
	</div>
	<!-- 登录大框 -->
	<div id="dldk">
		<img alt="" src="./commons/image/login/dlbj.png"
			style="width: 350px; height: 350px; margin-top: -270px; margin-left: 65%; z-index: 1;">

		<!-- 登陆文本框 -->
		<div class="login" data-animation="rollIn" style="margin-left: 68%">
			<!-- style="background: url('./commons/image/login/dlbj.png'); background-size: 100% 100%;" -->
			<div>
				<div>
					<h3 style="margin-top: -10px;">欢迎使用</h3>
				</div>
				<form class="m-t" role="form" id="login-form"
					action="${pageContext.request.contextPath}/im/login" method="post"
					onsubmit="return checkAll()">
					<div class="form-group-user">
						<!-- 用户名 -->
						<img alt="" src="commons/image/login/yhmxz.png"
							style="width: 250px;"> <input id="email" name="email"
							type="email" class="form-control" placeholder="请输入用户名"
							required="" onblur="checkEmail()"
							style="z-index: 2; position: absolute; height: 33px; width: 217px; margin-top: -33px; margin-left: 33px;" />
						<!-- <input name="email" height="35" width="35" type="email"
						class="form-control" placeholder=" 请输入用户名" required=""
						style="background: url('./commons/image/login/yhmxz.png') no-repeat; background-size: 100% 100%; padding-left: 40px; border-radius: 6px; z-index: 2; position: absolute; width: 250px;" /> -->
					</div>
					<br /> <br />
					<div class="form-group-pwd">
						<!-- 密码 -->
						<img alt="" src="commons/image/login/mmxz.png"
							style="width: 250px;"> <input id="password" name="password"
							type="password" class="form-control" placeholder="请输入密码"
							required="" onblur="checkPass()"
							style="z-index: 2; position: absolute; height: 32.5px; width: 217px; margin-top: -33px; margin-left: 33px;" />
						<!-- <input name="password" type="password" class="form-control"
						placeholder="请输入密码" required=""
						style="background: url('./commons/image/login/mmxz.png'); background-size: 100% 100%; padding-left: 40px; border-radius: 6px; z-index: 2; position: absolute; width: 250px;"> -->
					</div>
					<br /> <br />
					<div class="remember-box" style="z-index: 2; position: relative;">
						<div id="jzmm">
							<input type="checkbox" checked="checked"
								style="color: #FFFFFF; display: inline-block; vertical-align: middle; margin-bottom: 2px;">记住密码</input>
						</div>
						<div id="wjmm"
							style="margin-top: -21px; margin-left: 180px; z-index: 2; position: relative;">
							<a href="#" style="color: #FFFFFF">忘记密码？</a>
						</div>
					</div>
					<button id="sub" type="submit"
						class="btn btn-yellow block full-width m-b"
						style="width: 250px; z-index: 2; position: relative;">登 录</button>
					<!--  <button type="button" class="btn btn-primary block full-width m-b" onclick="login()">登 录</button> -->
					<!-- <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a> -->
					</p>
				</form>
			</div>
		</div>
	</div>
	<!-- <script type="text/javascript">
		var dom_name = document.getElementById("email");
		var dom_password = document.getElementById("password");

		var email = false;
		var password = false;

		function checkEmail() {
			var email_val = $("#email").val();
			$.ajax({
				type : "post",
				url : contextPath + "/im/checkEmail",
				data : "email=" + email,
				dataType : "json",
				success : function(data) {
					debugger;
					email=true;
					return ;
				},
			});
			email = false;
			return ;
		};

		function checkPass() {
			var password_val = $("#password").val();
			$.ajax({
				type : "post",
				url : contextPath + "/im/checkPass",
				data : "password=" + password,
				dataType : "json",
				success : function(data) {
					debugger;
					password=true;
					return ;
				},
			});
			password = false;
			return ;
		};
		function checkAll() {
			return name && pass;
		}
		debugger;
	</script> -->
</body>
</html>