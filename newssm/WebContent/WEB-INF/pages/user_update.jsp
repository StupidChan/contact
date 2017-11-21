<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
</head>
<body>

	<form action="/newssm/user/updateUser.action" method="post" id="updateForm">
	 <table align="center"> 
		<input type="hidden" name="id" value="${user.id}">
		<tr>
			<td><p>用户名:<input type="text" name="username" value="${user.username}" readonly></p></td>
		</tr>
		<tr>
			<td><p>密     码:<input type="text" name="password" value="${user.username}"></p></td>
		</tr>
		<tr>
			<td><p><input type="submit" value="修改"></p></td>
		</tr>
	 </table>

	</form>

</body>
</html>