<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jquery-easyui-1.3.3/demo/demo.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">
 
  //页面加载完执行 
 $(function(){
	
	 $.post("${pageContext.request.contextPath}/saleChance/findById.do",{id:'${param.saleChanceId}'},function(result){
		 $("#customerName").val(result.customerName);
		 $("#chanceSource").val(result.chanceSource);
		 $("#linkMan").val(result.linkMan);
		 $("#linkPhone").val(result.linkPhone);
		 $("#cgjl").val(result.cgjl);
		 $("#overView").val(result.overView);
		 $("#description").val(result.description);
		 $("#createMan").val(result.createMan);
		 $("#createTime").val(result.createTime);
		 $("#assignMan").val(result.assignMan);
		 $("#assignTime").val(result.assignTime);
		},"json");
	 
 });
 
</script>
<title>Insert title here</title>
</head>
<body style="margin: 15px">
 
 <div id="p" class="easyui-panel" title="销售机会信息" style="width: 700px;height: 400px;padding: 10px">
 	<table cellspacing="8px">
   		<tr>
   			<td>客户名称：</td>
   			<td><input type="text" id="customerName" name="customerName" readonly="readonly"/></td>
   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
   			<td>机会来源</td>
   			<td><input type="text" id="chanceSource" name="chanceSource" readonly="readonly"/></td>
   		</tr>
   		<tr>
   			<td>联系人：</td>
   			<td><input type="text" id="linkMan" name="linkMan" readonly="readonly"/></td>
   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
   			<td>联系电话：</td>
   			<td><input type="text" id="linkPhone" name="linkPhone" readonly="readonly"/></td>
   		</tr>
   		<tr>
   			<td>成功几率(%)：</td>
   			<td><input type="text" id="cgjl" name="cgjl" readonly="readonly"/></td>
   			<td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;</td>
   		</tr>
   		<tr>
   			<td>概要：</td>
   			<td colspan="4"><input type="text" id="overView" name="overView" style="width: 420px" readonly="readonly"/></td>
   		</tr>
   		<tr>
   			<td>机会描述：</td>
   			<td colspan="4">
   				<textarea rows="5" cols="50" id="description" name="description" readonly="readonly"></textarea>
   			</td>
   		</tr>
   		<tr>
   			<td>创建人：</td>
   			<td><input type="text" readonly="readonly" id="createMan" name="createMan" /></td>
   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
   			<td>创建时间：</td>
   			<td><input type="text" id="createTime" name="createTime" readonly="readonly"/></td>
   		</tr>
   		<tr>
   			<td>指派给：</td>
   			<td>
   				<input type="text" readonly="readonly" id="assignMan" name="assignMan" />
   			</td>
   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
   			<td>指派时间：</td>
   			<td><input type="text" id="assignTime" name="assignTime" readonly="readonly"/></td>
   		</tr>
 </div>
 
</body>
</html>