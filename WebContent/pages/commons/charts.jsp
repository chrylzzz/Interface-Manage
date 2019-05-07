<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">

<link rel="shortcut icon"
	href="${pageContext.request.contextPath }/commons/test2/asset/ico/favicon.png">

<link
	href="${pageContext.request.contextPath }/commons/test2/asset/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/commons/test2/asset/css/bootstrap.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/commons/test2/asset/css/carousel.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/commons/test2/asset/css/echartsHome.css"
	rel="stylesheet">
<%@include file="/commons/head.jsp"%>
<script
	src="${pageContext.request.contextPath }/commons/test2/asset//js/echarts.js"></script>
<script
	src="${pageContext.request.contextPath }/commons/test2/asset/js/codemirror.js"></script>
<script
	src="${pageContext.request.contextPath }/commons/test2/asset/js/javascript.js"></script>

<link
	href="${pageContext.request.contextPath }/commons/test2/asset/css/codemirror.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/commons/test2/asset/css/monokai.css"
	rel="stylesheet">

<style type="text/css">
html, body {
	width: 100%;
	height: 100%;
}
</style>
</head>
<body>
	<div class="container-fluid"
		style="margin-top: 5%; margin-left: 10%;">
		<div class="col-md-10">
			<div class="row">
				<div class="col-md-6" style="width:460px;height:auto;">
					<div class="tile">
						<h3 class="tile-title">数据访问量统计</h3>
						<br />
						<br />
						<div class="embed-responsive embed-responsive-16by9">
							<canvas class="embed-responsive-item" id="lineChartDemo"></canvas>
						</div>
					</div>
				</div>
				<div class="col-md-6" style="width:450px;height:auto;margin-top: -350px;margin-left: 50%;">
					<div class="tile">
						<h3 class="tile-title" style="margin-left:20%;">数据访问频率统计</h3>
						<br />
						<br />
						<div class="embed-responsive embed-responsive-16by9"
							style="margin-left: 40%;">
							<canvas class="embed-responsive-item" id="pieChartDemo"></canvas>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 为 ECharts 准备一个具备大小（宽高）-->
	<!-- 	<div id="main3" style="height: 350px"></div> -->

	<!-- =================vali==================================== -->
	<!-- Essential javascripts for application to work-->
	<script
		src="${pageContext.request.contextPath }/commons/test1/js/jquery-3.2.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/commons/test1/js/popper.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/commons/test1/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/commons/test1/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script
		src="${pageContext.request.contextPath }/commons/test1/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/commons/test1/js/plugins/chart.js"></script>
	<!-- ===============echarts========================================= -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="${pageContext.request.contextPath }/commons/test2/asset/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/commons/test2/asset/js/echartsHome.js"></script>
	<script
		src="${pageContext.request.contextPath }/commons/test2/asset/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/commons/test2/asset/js/echartsExample.js"></script>
	<!-- ======================================================================================== -->
	<script type="text/javascript">
		$.ajax({
					type : "post",
					url : contextPath + '/im/setCharts2',
					dataType : "json",
					success : function(msg) {
						//返回的是map，i是key，items是key对应的values
						//返回的是list，i是下标，item是下标对应的值
						//var names = {};
						var total = {};
						for (var i = 0; i < msg.data.length; i++) {
							//names[i] = msg.data[i].ENAME;
							total[i] = msg.data[i];
						}
						/*饼图*/
						var pdata = [ {
							value : total[0],
							color : "#d87a80",
							highlight : "#00a39d",
							label : "PMS"
						}, {
							value : total[1],
							color : "#ffb980",
							highlight : "#00a39d",
							label : "EMS"
						}, {
							value : total[2],
							color : "#5ab1ef",
							highlight : "#00a39d",
							label : "带电检测"
						}, {
							value : total[3],
							color : "#00b4ff",
							highlight : "#00a39d",
							label : "雷电"
						}, {
							value : total[4],
							color : "#b6a2de",
							highlight : "#00a39d",
							label : "气象灾害预警"
						} , {
							value : total[5],
							color : "#8d98b3",
							highlight : "#00a39d",
							label : "输变电在线监测"
						}, {
							value : total[6],
							color : "#dc69aa",
							highlight : "#00a39d",
							label : "故障录播"
						}]

						var ctxp = $("#pieChartDemo").get(0).getContext("2d");
						var pieChart = new Chart(ctxp).Pie(pdata);				
					}
				});
		$.ajax({
					type : "post",
					url : contextPath + '/im/setCharts1',
					dataType : "json",
					success : function(msg) {
						//返回的是map，i是key，items是key对应的values
						//返回的是list，i是下标，item是下标对应的值
						//var names = {};
						var total = {};
						for (var i = 0; i < msg.data.length; i++) {
							//names[i] = msg.data[i].ENAME;
							total[i] = msg.data[i];
						}
						/*折线图*/
						var data = {
							labels : [ "PMS", "EMS", "带电检测","雷电", 
									"气象灾害预警","输变电在线检测" ,"故障录播" ],
							datasets : [
									{
										label : "My First dataset",
										fillColor : "rgba(220,220,220,0.2)",
										strokeColor : "rgba(220,220,220,1)",
										pointColor : "rgba(220,220,220,1)",
										pointStrokeColor : "#fff",
										pointHighlightFill : "#fff",
										pointHighlightStroke : "rgba(220,220,220,1)",
										data : [ total[0], total[1], total[2],
												total[3], total[4], total[5], total[6] ]
									},
									{
										label : "My Second dataset",
										fillColor : "rgba(151,187,205,0.2)",
										strokeColor : "rgba(151,187,205,1)",
										pointColor : "rgba(151,187,205,1)",
										pointStrokeColor : "#fff",
										pointHighlightFill : "#fff",
										pointHighlightStroke : "rgba(151,187,205,1)",
										data : [total[0], total[1], total[2],
											total[3], total[4], total[5], total[6] ]
									} ]
						};

						var ctxl = $("#lineChartDemo").get(0).getContext("2d");
						var lineChart = new Chart(ctxl).Line(data);

					}
				});
	</script>
</body>

</html>