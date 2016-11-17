
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h3>Login</h3>
    <hr/>
    <form name="loginForm" method="POST" action="/login">
        <input type="hidden" name="command" value="login" />
        Login:<br/>
        <input type="text" name="login" value=""><br/>
        Password:<br/>
        <input type="password" name="password" value=""> <br/>
        <input type="submit" value="Enter">
        ${error}
    </form><hr/>
</body>
</html>
