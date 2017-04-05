<%@ page import="ua.com.model.Candidate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Candidate info</title>
</head>
<body>

<% Candidate transfered = (Candidate) request.getAttribute("candidate");%>
<div class="container">
    <ul>
        <li>
            <div class="column">
                name : <%=transfered.getName()%>
            </div>
        </li>
            <div class="column">
                age : <%=transfered.getAge()%>
            </div>
        <li>
            <div class="column">
                hobby : <%=transfered.getHobby()%>
            </div>
        </li>
            <div class="column">
                region : <%=transfered.getRegion()%>
            </div>
        <li>
            <div class="column">
                clan : <%=transfered.getClan()%>
            </div>
        </li>
    </ul>
</div>
</body>
</html>
