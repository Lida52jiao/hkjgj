<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
	.sp {
		color: red;
	}
</style>
<div class="wrapper wrapper-content animated fadeInRight"
	style="height: 100%">
	<div class="ibox float-e-margins">
		<div class="ibox-content">
			<div class="doc-buttons">
				<c:forEach items="${res}" var="key">
					 ${key.description}  
				</c:forEach>
			</div>
			<form role="form" class="form-inline" id="integrateRule">
			</form>
			<div class="table-responsive">
				<table id="integrateRuleTable" data-toolbar="#toolbar"
					data-show-refresh="true" data-show-toggle="true"
					data-show-columns="true" data-show-export="true"
					data-show-footer="false" data-mobile-responsive="true">
				</table>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
function getRuleIngreate() {
	return $.map($("#integrateRuleTable").bootstrapTable('getSelections'), function(
			row) {
		return row.id
	});
}
function RuleUpdate() {
	var cbox = getRuleIngreate();
	if (cbox == "") {
		layer.msg("请选择编辑项！！");
		return;
	}
	if (cbox.length > 1) {
		layer.msg("只能选中一个");
		return;
	}
	battcn.ajaxOpen({
		title : '规则设定',
		href : rootPath + '/Integrage/IntegrateRuleEdit.shtml?id='+cbox,
		width : '40%',
		height : '80%',
		okhandler : function() {
			save();
		}
	});
} 
	//查询:目前只用一个参数,如果多个 请用 $("#A").val() !='' ||$("#B").val() !=''....
	function integrateRuleSearchForm() {
		$('#integrateRuleTable').bootstrapTable('refresh');
	}
	//重写参数传递
	 function queryBaseParamsmer(params) {
		var pageSize = params.limit;
		var sort = params.sort;
		var offset = params.offset;
		var order = params.order;
		var pageNum = offset / pageSize + 1;
		return {
			pageSize : pageSize,
			pageNum : pageNum,
			sort : sort,
			order : order
		}
	} 
	$('#integrateRuleTable').bootstrapTable({
		url : rootPath + '/Integrage/IntegrateRuleList.shtml',
		height : '100%',
		sortName : 'id',
		sortOrder : 'desc',
		ajaxOptions: {async:true,timeout:50000},
		showColumns : true,
		showExport : true,
		striped : true,
		pagination : true,
		pageNumber : 1,
		pageSize : 10,
		pageList : "[10,20,30,All]",
		search : false,
		sidePagination : 'server',//服务端分页  client //客户端分页
		idField : 'id',
		uniqueId : 'id',
		responseHandler : responseHandler, //处理分页函数
		queryParams : queryBaseParamsmer,//参数处理函数
		minimumCountColumns : 2,
		columns : [{
			checkbox : true
		}, {
			field : 'pay',
			title : '交易满多少元获得1积分',
			align : 'center',
			valign : 'middle',
		}, {	
			field : 'realName',
			title : '实名认证获得积分数',
			align : 'center',
			valign : 'middle'
		}, {	
			field : 'checkin',
			title : '签到获得积分数(基数)*天',
			align : 'center',
			valign : 'middle'
		}, {	
			field : 'appId',
			title : '归属app',
			align : 'center',
			valign : 'middle',
			formatter:function (value) {
				if(value == "0000"){
					return "精彩生活";
				}
			}
		}, {	
			field : 'remarks',
			title : '积分规则说明',
			align : 'center',
			valign : 'middle'
		}]
	});
</script>