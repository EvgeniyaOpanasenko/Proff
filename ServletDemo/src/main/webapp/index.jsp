<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>

<div class="header">
    <ul>
        <li><a href="register">Register</a> </li>
    </ul>

    <c:if test="${!inSystem}">
        <form action="login" method="post">
            <ul>
                <li>
                <input name="name" type="text">
                </li>

                <li>Submit
                    <input type="submit">
                </li>
            </ul>

        </form>

    </c:if>

    <c:if test="${inSystem}">
        <ul>
            <li>Hello ${currentUserName}</li>
        </ul>
    </c:if>

</div>
</body>
</html>