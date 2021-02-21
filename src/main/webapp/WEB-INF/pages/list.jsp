<%--
  Created by IntelliJ IDEA.
  User: HUAWEI
  Date: 2021/1/26
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3 align="center">查询所有的账户信息</h3>
    <table border="1px" align="center" width="300px">
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>金额</th>
        </tr>
        <c:forEach items="${list}" var="account" varStatus="vs">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
