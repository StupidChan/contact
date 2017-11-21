<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 	 <style type="text/css" >
		table {border-collapse =collapse;
		border-spacing: 0;
		border-left: 1px solid #888;
		border-top: 1px solid #888;
		background: #efeffe;
			}
	</style>
  </head>
  
  <body>
   <h3 style="text-align: center;">查询结果:</a></h3>
    <br>
    <table align="center" border="1">
        <tr>
            <th>编号</th>
            <th>年龄</th>
            <th>姓名</th>
            <th>电话</th>
            <th>学校</th>
            <th>地址</th>
            <th>性别</th>
            <th>用户ID</th>
        </tr>
        <c:forEach items="${sessionScope.dyContact}" var="contact">
            <tr>
                <td>${contact.t_id}</td>
                <td>${contact.t_age}</td>
                <td>${contact.t_name}</td>
                <td>${contact.t_phone}</td>
                <td>${contact.t_school}</td>
                <td>${contact.t_address}</td>
                <td>${contact.t_gender}</td>
                <td>${contact.user_id}</td>
            </tr>
            
        </c:forEach>
    </table>
    
  </body>
</html>
