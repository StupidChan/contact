<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加</title>
</head>
<body>
	<form action="/newssm/contact/save" method="post" id="saveform">
    	<table align="center"> 
    		<tr>
    			<td><p>年龄：<input type="text" id="t_age" name="t_age" style="width: 150px" /></p></td>
    			
    		</tr>
    		<tr>
    			<td><p>姓名：<input type="text" id="t_name" name="t_name" style="width: 150px"/></p></td>
    		</tr>
    		<tr>
    			<td><p>电话：<input type="text" id="t_phone" name="t_phone" style="width: 150px" /></p></td>
    			
    		</tr>
    		<tr>
    			<td><p>学校：<input type="text" id="t_school" name="t_school" style="width: 150px"/></p></td>
    		</tr>
    		<tr>
    			<td><p>地址：<input type="text" id="t_address" name="t_address" style="width: 150px" /></p></td>
    			
    		</tr>
    		<tr>
    			<td><p>性别：<input type="text" id="t_gender" name="t_gender" style="width: 150px"/></p></td>
    		</tr>
    		<tr>
    			<td><p>用户ID：<input type="text" name="user_id" value="${sessionScope.user_id}" readonly style="width: 150px"/></p></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="确认舔加" id="login"/></td>
    			
    		</tr>
    	</table> 	
	</form>

</body>
</html>