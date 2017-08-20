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
<script type="text/javascript">

 function searchSaleChance(){
	 $("#dg").datagrid('load',{
		"customerName":$("#s_customerName").val().trim(),
		"overView":$("#s_overView").val().trim(),
		"createMan":$("#s_createMan").val().trim(),
		"state":$("#s_state").combobox("getValue")
	 });
 }
 
 function formatState(val,row){
	 if(val==1){
		 return "已分配 ";
	 }else{
		 return "未分配 ";
	 }
 }
 
</script>
<title>Insert title here</title>
</head>
<body style="margin: 1px">
 <table id="dg" title="销售机会信息管理" class="easyui-datagrid"
   fitColumns="true" pagination="true" rownumbers="true"
   url="${pageContext.request.contextPath}/saleChance/list.do" fit="true" toolbar="#tb">
   <thead>
   	<tr>
   		<th field="cb" checkbox="true" align="center"></th>
   		<th field="id" width="50" align="center">编号</th>
   		<th field="chanceSource" width="200" align="center" hidden="true">机会来源</th>
   		<th field="customerName" width="50" align="center">客户名称</th>
   		<th field="cgjl" width="50" align="center" hidden="true">成功几率</th>
   		<th field="overView" width="200" align="center">概要</th>
   		<th field="linkMan" width="100" align="center">联系人</th>
   		<th field="linkPhone" width="100" align="center">联系电话</th>
   		<th field="description" width="200" align="center" hidden="true">机会描述</th>
   		<th field="createMan" width="100" align="center">创建人</th>
   		<th field="createTime" width="100" align="center">创建时间</th>
   		<th field="assignMan" width="200" align="center" hidden="true">指派人</th>
   		<th field="assignTime" width="200" align="center" hidden="true">指派时间</th>
   		<th field="state" width="100" align="center" formatter="formatState">状态</th>
   		<th field="devResult" width="200" align="center" hidden="true">客户开发状态</th>
   	</tr>
   </thead>
 </table>
 <div id="tb">
 	<div>
 		&nbsp;客户名称：&nbsp;<input type="text" id="s_customerName" size="20" onkeydown="if(event.keyCode==13) searchSaleChance()"/>
 		&nbsp;概要：&nbsp;<input type="text" id="s_overView" size="20" onkeydown="if(event.keyCode==13) searchSaleChance()"/>
 		&nbsp;创建人：&nbsp;<input type="text" id="s_createMan" size="20" onkeydown="if(event.keyCode==13) searchSaleChance()"/>
 		&nbsp;分配状态：&nbsp;<select class="easyui-combobox" id="s_state" editable="false" panelHeight="auto">
 			<option value="">请选择...</option>
 			<option value="0">未分配</option>
 			<option value="1">已分配</option>
 		</select>
 		<a href="javascript:searchSaleChance()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
 	</div>
 </div>
 
</body>
</html>