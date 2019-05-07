<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>index</title>
<%@include file="/commons/head.jsp"%>
<style type="text/css">
html, body {
	width: 100%;
	height: 100%;
	margin: 0;
	padding: 0;
	overflow: hidden;
}

.menuDivOut>ul>li>a:hover {
	color: #000000;
	background-color: #bffdfb;
	border-bottom: 1px solid;
	border-color: #99CCFF;
	display: block;
}

.menuDivIn>ul>li>a:hover {
	color: #000000;
	background-color: #bffdfb;
	border-bottom: 1px solid;
	border-color: #99CCFF;
	display: block;
}
</style>
</head>
<body style="background-color: #f8f8f8;">
	<div>
		<!-- 顶部的背景图 -->
		<div>
			<img alt="" src="../commons/image/index/ban3.jpg"
				style="background-size: 100% 100%; margin-top: -10px; border-bottom: 5px solid #006d69">
		</div>

		<!-- 左上角标题 -->
		<div>
			<img alt="" src="../commons/image/index/LOGO.png"
				style="background-size: 100% 100%; margin-top: -120px; margin-left: 20px">
		</div>
		<!-- 工程名 -->
		<div style="margin-left: 230px; margin-top: -95px">
			<font
				style="font-family: 'Microsoft YaHei'; color: #f0fffe; font-size: 40px;">数据治理及服务维护平台</font>
		</div>
	</div>
	<%-- 	<!-- 导航条strat -->
	<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">数据治理及接口维护平台</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<!--   <li class="active"><a href="#">首页</a></li> -->
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">更多 <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<!-- <li><a href="#">登陆</a></li>
							<li class="divider"></li> -->
							<li><a
								href="${pageContext.request.contextPath}/pages/commons/login.jsp">退出</a></li>
						</ul></li>
				</ul>
			</div>

		</div>

	</nav> --%>
	<!-- 导航条 end -->
	<br />
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"
				style="width: auto; height: 800px; margin-left: -15px; margin-top: -1.5px; background-color: #ecffff; border-right: 2px solid #bffdfb; padding-right: 0;">
				<div style="width: auto; background-color: #006d69; height: 34px;">
					<div
						style="color: #ffffff; text-align: center; margin-left: -65px;border-top:5px solid #006d69 ">>省公司数据服务</div>
				</div>
				<div class="menuDivOut"
					style="background-color: #ecffff; width: 200px;">
					<ul style="padding: 0px;">
						<!--  -->
						<li><a href="../pages/module/out/pms.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								PMS2.0系统</a></li>
						<!--  -->

						<li><a href="../pages/module/out/ddjc.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								带电检测</a></li>

						<!--  -->
						<li><a href="../pages/module/out/sbdzxjc.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								输变电在线监测</a></li>
						<!--  -->
						<li><a href="../pages/module/out/qxzhyj.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								气象灾害预警</a></li>
						<!--  -->
						<li><a href="../pages/module/out/qxlys.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								气象六要素</a></li>
						<!--  -->
						<li><a href="../pages/module/out/tqyb.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								天气预报</a></li>
						<!--  -->
						<li><a href="../pages/module/out/ld.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								雷电</a></li>
						<!--  -->
						<li><a href="../pages/module/out/gzlb.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								故障录波</a></li>
						<!--  -->
						<li><a href="../pages/module/out/ems.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								EMS省调数据</a></li>
						<!--  -->
						<li><a href="../pages/module/out/gis.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								GIS服务数据</a></li>
						<!--  -->
						<li><a href="../pages/module/out/fdc.jsp" target="et"
							style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
								发电厂服务数据</a></li>
						<!--  -->
					</ul>
					<!-- 对外 -->
					<div style="background-color: #006d69; width: auto; height: 34px;">
						<div
							style="color: #ffffff; text-align: center; margin-left: -65px;">>电科院数据服务</div>
					</div>
					<div class="menuDivIn" style="background-color: #ecffff;">
						<ul style="padding: 0px;">
							<!--  -->
							<li><a href="../pages/module/in/pms.jsp" target="et"
								style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
									PMS2.0系统:动态定期评价</a></li>
							<!--  -->
							<li><a href="../pages/module/in/sbdzxjc.jsp" target="et"
								style="text-decoration: none; line-height: 2.5; color: #000000;">&nbsp;&nbsp;&nbsp;·
									输变电在线监测:预警信息</a></li>
							<!-- 		
					<a href="../pages/module/in/ddjc.jsp" target="et"
						class="list-group-item list-group-item-warning">带电检测：预警信息</a>
					
					<a href="../pages/module/in/qx.jsp" target="et"
						class="list-group-item list-group-item-warning">气象</a>
					
					<a href="../pages/module/in/ld.jsp" target="et"
						class="list-group-item list-group-item-warning">雷电</a>
					
					<a href="../pages/module/in/gzlb.jsp" target="et"
						class="list-group-item list-group-item-warning">故障录波</a>
					
					<a href="../pages/module/in/ems.jsp" target="et"
						class="list-group-item list-group-item-warning">EMS省调数据</a> -->
						</ul>
					</div>
				</div>
			</div>
			<!--  background-color: #f8f8f8-->
			<div class="col-md-10" style="width: 85%; height: auto">
				<!-- 首页按钮 -->
				<div style="margin-left: 25px; margin-top: 20px;">
					<img alt="" src="../commons/image/index/sy.png">&nbsp; <font
						color="#006d69"><a href="../pages/commons/charts.jsp"
						style="text-decoration: none;">首页</a></font>
				</div>
				<!-- 展示内容 -->
				<div
					style="width: auto; height: 600px; margin-left: 10px; margin-top: 20px">
					<iframe src="../pages/commons/charts.jsp" frameborder="0"
						width="100%" height="100%" name="et"></iframe>
				</div>
			</div>
		</div>
	</div>
</body>
</html>