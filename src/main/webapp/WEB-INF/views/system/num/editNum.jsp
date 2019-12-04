<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="ibox float-e-margins">
	<div class="ibox-content">
		<form class="form-horizontal m-t required-validate" id="roleFormalterNum">
		<input id="id" name="id"  class="form-control" type="hidden" value="${num.id}" >
			<div class="form-group">
				<label class="col-sm-3 control-label">金额：</label>
				<div class="col-sm-8">
					<input id="num" name="num"  class="form-control" onblur="numAll()" type="text" value="${num.num/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">有效期（天）：</label>
				<div class="col-sm-8">
					<input id="validtime" name="validtime"  class="form-control" type="text" value="${num.validtime}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">游客分润：</label>
				<div class="col-sm-8">
					<input id="visitor" name="visitor"  class="form-control" type="text" value="${num.visitor/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">初级用户分润：</label>
				<div class="col-sm-8">
					<input id="vip" name="vip"  class="form-control" type="text" value="${num.vip/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">高级用户分润：</label>
				<div class="col-sm-8">
					<input id="highvip" name="highvip"  class="form-control" type="text" value="${num.highvip/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">渠道商分润：</label>
				<div class="col-sm-8">
					<input id="channel" name="channel"  class="form-control" type="text" value="${num.channel/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">代理商分润：</label>
				<div class="col-sm-8">
					<input id="agent" name="agent"  class="form-control" type="text" value="${num.agent/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">区代分润：</label>
				<div class="col-sm-8">
					<input id="area" name="area"  class="form-control" type="text" value="${num.area/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">机构分润：</label>
				<div class="col-sm-8">
					<input id="institution" name="institution"  class="form-control" type="text" value="${num.institution/100}">
						<span class="help-block m-b-none">
				</div>
			</div>
		</form>
	</div>
</div>
<script>
   $(document).ready(function(){$(".i-checks").iCheck({checkboxClass:"icheckbox_square-green",radioClass:"iradio_square-green",})});
</script>
<%--<script type="text/javascript">--%>
<%--function numAll(){--%>
	<%--var amount = $("#num").val();--%>
	<%--if(amount > 5000){--%>
		<%--layer.confirm("升级金额大于5000无法使用在线付费，系统默认联系客户!!");--%>
	<%--}--%>

<%--}--%>
<%--</script>--%>
<script type="text/javascript">

 $(function(){
  	save = function(obj) {
  		if($("#roleFormalterNum").valid()){
  			$.ajax({
				type: "POST", 
				url: rootPath + "/Num/alert.shtml",
				data: $('#roleFormalterNum').serializeArray(),
				success: function(data){
						layer.confirm(data, function(index) {
							battcn.closeWindow();
							$('#numTables').bootstrapTable('refresh');
				        	return false;
 						});
				}
			});
  		}
	} 
	
 }); 
</script>