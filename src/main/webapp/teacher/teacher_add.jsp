<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '/tea_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   		<form action="teacher!save" method="post">
   			<table>
	   			
	   			<tr>
	   				<td>教师姓名</td>
	   				<td><input type="text" name="teacher.teaName" ></td>
	   			</tr>
	   			<tr>
	   				<td>教师地址</td>
	   				<td><input type="text" name="teacher.teaAdd" ></td>
	   			</tr>
	   			<tr>
	   				<td>教师工资</td>
	   				<td><input type="number" name="teacher.salary" ></td>
	   			</tr>
	   			
	   			<tr><td colspan="2"><input type="submit" value="提交" ></td></tr>
	   			
	   		</table>
   		</form>
  </body>
</html>
