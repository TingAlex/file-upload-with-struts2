<%--
  Created by IntelliJ IDEA.
  User: Ting
  Date: 2017/2/4
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
     <form name="form1" action="loginAction">
         name:<input type="text" name="username"><br>
         pass:<input type="password" name="password"><br>
         <input type="submit" value="login">&nbsp;<input type="button" value="register"
     onclick="window.location.href='registerAction'">
     </form>
</div>
</body>
</html>
