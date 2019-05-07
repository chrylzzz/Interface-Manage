<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>输变电在线监测</title>
<%@include file="/commons/eqsyui-head.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/pages/commons/js/out/sbdzxjcOut.js"></script>
</head>

<body class="app sidebar-mini rtl">
	<div class="col-md-12">

		<table id="sbdzxjc-list"></table>
		<!-- 列表工具栏 -->
		<!-- 		<div id="user-list-toolbar">
			<a href="javascript:void(0);" class="easyui-linkbutton"
				data-options="iconCls:'icon-search',plain:true"
				onclick="objEvent.query()">查询</a> <a href="javascript:void(0);"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-add',plain:false"
				onclick="objEvent.add()">新增</a> <a href="javascript:void(0);"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-edit',plain:true"
				onclick="objEvent.update()">修改</a> <a href="javascript:void(0);"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-remove',plain:true"
				onclick="objEvent.remove()">删除</a>
		</div> -->
		<!-- 弹出窗口 -->
		<div id="sbdzxjc-dialog"></div>

	</div>
</body>
</html>