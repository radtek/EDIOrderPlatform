<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.css">
<script
	src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.js"></script>
<script
	src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/locale/bootstrap-table-zh-CN.min.js"></script>
</head>



<body>
	<div id="toolbar" class="btn-group">
		<button id="btn_add" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
		</button>
		<button id="btn_edit" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
		</button>
		<button id="btn_delete" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
		</button>
	</div>
	<table id="table"></table>
</body>
<script type="text/javascript">
	$('#table').bootstrapTable({
		toolbar : '#toolbar', //工具按钮用哪个容器
		striped : true, //是否显示行间隔色
		cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination : true, //是否显示分页（*）
		sortable : true, //是否启用排序
		sortOrder : "asc", //排序方式
		pageNumber : 1, //初始化加载第一页，默认第一页
		pageSize : 10, //每页的记录行数（*）
		pageList : [ 5, 10, 25 ], //可供选择的每页的行数（*）
		search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
		strictSearch : true,
		showColumns : true, //是否显示所有的列
		showRefresh : true, //是否显示刷新按钮
		minimumCountColumns : 2, //最少允许的列数
		clickToSelect : true, //是否启用点击选中行
		height : 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId : 'id', //每一行的唯一标识，一般为主键列
		showToggle : true, //是否显示详细视图和列表视图的切换按钮
		cardView : false, //是否显示详细视图
		detailView : false, //是否显示父子表
		sortName : '1',
		columns : [ {
			checkbox : true
		}, {
			field : 'id',
			title : 'Item ID'
		}, {
			field : 'name',
			title : 'Item Name'
		}, {
			field : 'price',
			title : 'Item Price'
		} ],
		data : [ {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 1,
			name : 'Item 1',
			price : '$1'
		}, {
			id : 2,
			name : 'Item 2',
			price : '$2'
		} ]
	});
</script>


</html>
