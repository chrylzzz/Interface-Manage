$(function() {
	// 初始化列表
	$("#ld-list").datagrid({
		// 引进工具栏
		toolbar : "#user-list-toolbar",
		url : contextPath + '/itcpt/ldVisit',
		// rows page
		// fit:true,
		fitColumns : true,
		sortable : true,
		method : 'post',
		striped : true,
		loadMsg : '检查网线、调制解调器和路由器',
		rownumbers : true,
		pagination : true,
		singleSelect : false,
		pageNumber : 1,
		pageSize : 20,
		// pageList:[3,4,5],中必须包含pageSize:3,的参数
		pageList : [ 20, 30, 45 ],
		showPageInfo : true,
		// fieid是后台传过来的数据，不能随便写，与数据库一致
		columns : [ [
		// {field:'requestpath',title:'请求地址',width:40,align:'center',checkbox:true},
		{
			field : 'starttime',
			title : '开始时间',
			width : 40,
			align : 'center'
		}, {
			field : 'iphost',
			title : '用户地址',
			width : 40,
			align : 'center'
		}, {
			field : 'endtime',
			title : '结束时间',
			width : 40,
			align : 'center'
		}, {
			field : 'requestcount',
			title : '请求次数',
			width : 20,
			align : 'center'
		}, {
			field : 'executetime',
			title : '执行时间(单位:ms)',
			width : 40,
			align : 'center'
		}, {
			field : 'status',
			title : '状态',
			width : 40,
			align : 'center',
			formatter : function(value, row, index) {
				if (row.status == 0) {
					return "访问成功";
				} else {
					return "访问失败";
				}
			}
		}, ] ]
	})
});