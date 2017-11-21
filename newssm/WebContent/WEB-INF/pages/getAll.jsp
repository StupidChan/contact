<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  <h5 style="text-align: center;"> ${sessionScope.user.username}的通讯录: </h5>
   <h5 style="text-align: center;">
    <a href="<%=request.getContextPath()%>/user/toUpdateUser.action?user_id=${sessionScope.user.id}">修改用户信息</a>
    <a href="<%=request.getContextPath()%>/contact/toSave.action?user_id=${sessionScope.user.id}">增加联系人</a>
   </h5>
    
    <form align="center" action="/newssm/contact/dynamicSelect.action" method="post" id="dyform">
    			<td><p>姓名：<input type="text" id="t_name" name="t_name" style="width: 150px" /></p></td>
    			<td><p>学校：<input type="text" id="t_school" name="t_school" style="width: 150px"/></p></td>
    			<td><p>性别：<input type="text" id="t_gender" name="t_gender" style="width: 150px"/></p></td>
    			<td><input type="submit" value="查询" id="select"/></td>
    		</tr>
    	</table> 
    </form>
    
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
            <th>操作</th>
        </tr>
        <c:forEach items="${sessionScope.contacts}" var="contact">
            <tr>
                <td>${contact.t_id}</td>
                <td>${contact.t_age}</td>
                <td>${contact.t_name}</td>
                <td>${contact.t_phone}</td>
                <td>${contact.t_school}</td>
                <td>${contact.t_address}</td>
                <td>${contact.t_gender}</td>
                <td>${contact.user_id}</td>
                <td> 
  	 				<a href="<%=request.getContextPath()%>/contact/toUpdate.action?t_id=${contact.t_id}">修改</a>
  	 					
  	 				<a href="<%=request.getContextPath()%>/contact/deleteById.action?t_id=${contact.t_id}&id=${sessionScope.user.id}">删除</a>
  	 			</td>
            </tr>
            
        </c:forEach>
    </table>
    <font color="red">${requestScope.message}</font>	
  </body>
</html>
