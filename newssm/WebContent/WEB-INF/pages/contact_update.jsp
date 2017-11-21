<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
 
	<form action="/newssm/contact/doUpdate.action" method="post" id="updateForm">
	  <table align="center"> 
		<input type="hidden" name="t_id" value="${contact.t_id}">
		<tr>
			<td><p>年龄:<input type="text" name="t_age" value="${contact.t_age}"></p></td>
		</tr>
		<tr>
			<td><p>姓名:<input type="text" name="t_name" value="${contact.t_name}"></p></td>
		</tr>
		<tr>
			<td><p>电话:<input type="text" name="t_phone" value="${contact.t_phone}"></p></td>
		</tr>
		<tr>
			<td><p>学校:<input type="text" name="t_school" value="${contact.t_school}"></p></td>
		</tr>
		<tr>
			<td><p>地址:<input type="text" name="t_address" value="${contact.t_address}"></p></td>
		</tr>
		<tr>
			<td><p>性别:<input type="text" name="t_gender" value="${contact.t_gender}"></p></td>
		</tr>
		<input type="hidden" name="user_id" value="${contact.user_id}">
		<tr>
			<td><p><input type="submit" value="修改"></p></td>
		</tr>
	 </table>
	</form>

</body>
</html>