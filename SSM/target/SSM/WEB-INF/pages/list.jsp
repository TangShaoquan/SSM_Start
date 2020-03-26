<%--
  Created by IntelliJ IDEA.
  User: 唐绍权
  Date: 2020/3/26
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询所有账户</h1>
<c:forEach items="${list}" var="user">
    ${user.username}
    <br>
    ${user.birthday}
    <br>
</c:forEach>
</body>
</html>
