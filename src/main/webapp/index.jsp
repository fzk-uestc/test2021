<%--
  Created by IntelliJ IDEA.
  User: HUAWEI
  Date: 2021/1/26
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试</a><br/>
    <h3>测试包</h3>
    <form action="account/saveAccount">
        姓名：<input type="text" name="name"/><br/>
        金额：<input type="text" name="money"/><br/>
        <input type="submit" value="保存">
    </form>
</body>
</html>
