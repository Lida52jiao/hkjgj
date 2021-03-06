<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="wrapper wrapper-content animated fadeInRight"
	style="height: 100%">
	<div class="ibox float-e-margins">
		<div class="ibox-content">
			<div class="doc-buttons">
				<c:forEach items="${res}" var="key">
					 ${key.description}  
				</c:forEach>
			</div>
			<form role="form" class="form-inline" id="BasePriceSearchForm">
			</form>
			<div class="table-responsive">
				<table id="basePriceTable" data-toolbar="#toolbar"
					data-show-refresh="true" data-show-toggle="true"
					data-show-columns="true" data-show-export="true"
					data-show-footer="false" data-mobile-responsive="true">
				</table>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript">
	function getBaseIdSelectionsmerCode() {
		return $.map($("#basePriceTable").bootstrapTable('getSelections'), function(
				row) {
			return row.id
		});
	}
	 function editBasePrice() {
		var cbox = getBaseIdSelectionsmerCode();
		if (cbox == "") {
			layer.msg("请选择编辑项！！");
			return;
		}
		if (cbox.length > 1) {
			layer.msg("只能选中一个");
			return;
		}
		battcn.ajaxOpen({
			title : '调整',
			href : rootPath + '/AgentBasePrice/editBasePrice.shtml?id=' + cbox,
			width : '40%',
			height : '80%',
			okhandler : function() {
				save();
			}
		});
	} 
	
	//查询:目前只用一个参数,如果多个 请用 $("#A").val() !='' ||$("#B").val() !=''....
	function BasePriceSearchForm() {
		$('#basePriceTable').bootstrapTable('refresh');
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
	$('#basePriceTable').bootstrapTable({
		url : rootPath + '/AgentBasePrice/getRewardList.shtml',
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
		columns : [ {
			checkbox : true
		}, {
			field : 'agentlevel',
			title : '代理商级别',
			align : 'center',
			valign : 'middle',
		}, {
			field : 'repayfee',
			title : '还款费率(%)',
			align : 'center',
			valign : 'middle',
			formatter:function (value) {
				return parseFloat((value/10)).toFixed(2);
			}
		}, {
			field : 'nocardintegralfee',
			title : '无卡无积分费率(%)',
			align : 'center',
			valign : 'middle',
			formatter:function (value) {
				return parseFloat((value/10)).toFixed(2);
			}
		}, {
			field : 'nocardintegraldfee',
			title : '无卡无积分笔数费(元/笔)',
			align : 'center',
			valign : 'middle',
			formatter:function (value) {
				return value/100;
			}
		}, {
			field : 'hcardintegralfee',
			title : '无卡有积分费率(%)',
			align : 'center',
			valign : 'middle',
			formatter:function (value) {
				return parseFloat((value/10)).toFixed(2);
			}
		}, {
			field : 'hcardintegraldfee',
			title : '无卡有积分笔数费(元/笔)',
			align : 'center',
			valign : 'middle',
			formatter:function (value) {
				return value/100;
			}
		}]
	});
</script>