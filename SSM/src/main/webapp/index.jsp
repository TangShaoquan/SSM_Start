<%--
  Created by IntelliJ IDEA.
  User: 唐绍权
  Date: 2020/3/26
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><a href="/user/findAll">测试</a> </h1>
<h1>测试保存</h1>
<form action="/user/saveUser" method="post">
    用户名：<input type="text" name="username">
    <br>
    密码：  <input type="text" name="password">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
