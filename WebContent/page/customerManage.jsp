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
 
 
 function searchCustomer(){
	 $("#dg").datagrid('load',{
		"khno":$("#s_khno").val(),
		"name":$("#s_name").val()
	 });
 }
 
</script>
<title>Insert title here</title>
</head>
<body style="margin: 1px">
 <table id="dg" title="客户信息查询" class="easyui-datagrid"
    pagination="true" rownumbers="true"
   url="${pageContext.request.contextPath}/customer/list.do" fit="true" toolbar="#tb">
   <thead data-options="frozen:true"><!--以下七个被固定，其他的可拖动  -->
		<tr>
			<th field="cb" checkbox="true" align="center"></th>
	 		<th field="id" width="50" align="center" hidden="true">编号</th>
	 		<th field="khno" width="150" align="center">客户编号</th>
	 		<th field="name" width="200" align="center">客户名称</th>
	 		<th field="cusManager" width="100" align="center">客户经理</th>
	 		<th field="level" width="100" align="center">客户等级</th>
	 		<th field="phone" width="100" align="center">联系电话</th>
		</tr>
	</thead>
	<thead>
		<tr>
			<th field="area" width="80" align="center">客户地区</th>	
	 		<th field="myd" width="80" align="center">客户满意度</th>
	 		<th field="xyd" width="80" align="center">客户信用度</th>
	 		<th field="address" width="200" align="center" >客户地址</th>
	 		<th field="postCode" width="100" align="center" >邮政编码</th>
	 		<th field="fax" width="100" align="center" >传真</th>
	 		<th field="webSite" width="100" align="center" >网址</th>
	 		<th field="yyzzzch" width="100" align="center" >营业执照注册号</th>
	 		<th field="fr" width="100" align="center" >法人</th>
	 		<th field="zczj" width="100" align="center" >注册资金(万元)</th>
	 		<th field="nyye" width="100" align="center" >年营业额(万元)</th>
	 		<th field="khyh" width="100" align="center" >开户银行</th>
	 		<th field="khzh" width="100" align="center" >开户帐号</th>
	 		<th field="dsdjh" width="100" align="center" >地税登记号</th>
	 		<th field="gsdjh" width="100" align="center" >国税登记号</th>
		</tr>
	</thead>
 </table>
 <div id="tb">
 	<div>
 		&nbsp;客户编号：&nbsp;<input type="text" id="s_khno" size="20" onkeydown="if(event.keyCode==13) searchCustomer()"/>
 		&nbsp;客户名称：&nbsp;<input type="text" id="s_name" size="20" onkeydown="if(event.keyCode==13) searchCustomer()"/>
 		<a href="javascript:searchCustomer()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
 	</div>
 </div>
 
</body>
</html>