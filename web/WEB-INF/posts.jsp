<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guestbook posts</title>
</head>
<body>
    <table border="1">
        <c:forEach items="${posts}" var="post">
        <tr>
            <td>${post.id}</td>
            <td><c:out value="${post.text}"/> </td>
            <td>
                <a href="delete?id=${post.id}">
                    УДАЛИТЬ
                </a>
            </td>
        </tr>
        </c:forEach>
        <form action="/add" method="post">
        <tr>
            <td colspan="2">
                <input name="txt" type="text">
            </td>
            <td>
                <input type="submit">
            </td>
        </tr>
        </form>
    </table>
</body>
</html>
