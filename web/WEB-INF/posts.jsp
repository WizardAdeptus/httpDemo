<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Отправка и получение сообщений</title>
</head>
<body>
    Привет ${user}
    <br>
    <form action="/add" method="post">
        <textarea name="txt" rows="4" cols="100">${post.text}</textarea>
        <br>
        <input name="send" type="submit" value="Отправить">
        <a href="/get">Получить сообщение</a>
    </form>
</body>
</html>
