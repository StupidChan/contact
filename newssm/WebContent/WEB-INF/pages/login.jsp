<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>用户登录</title>	   
     
  </head>
  
  <body>
    <form action="/newssm/user/login" method="post" id="myform">
    	<table align="center">        
    		<tr>
    			<td><p>用户账户：<input type="text" id="username" name="username" style="width: 150px" /></p></td>
    		</tr>
    		<tr>
    			<td><p>用户密码：<input type="password" id="password" name="password" style="width: 150px"/></p></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="登录" id="login"/></td>
    			<td><input type="button" onclick="javascript:window.location.href='insert.jsp';" value="注册" /></td>
    		</tr>
    	</table> 
    	<%-- <font color="red">${requestScope.message}</font> --%>	
    	<font color="red"><h5 style="text-align: center;"> ${requestScope.message} </h5></font>
    </form>
  </body>
</html>
