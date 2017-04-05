<%@ page import="ua.com.model.Candidate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<%--
<head>
    <title>Candidate info</title>
</head>--%>

<body>

<% Candidate transfered = (Candidate) request.getAttribute("candidate");%>
<h2>Candidate</h2>
<div class="container">

    <table class="w3-table w3-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
            <th>Hobby</th>
            <th>Clan</th>
            <th>Region</th>
        </tr>
        <tr>
            <td><%=transfered.getId()%></td>
            <td><%=transfered.getName()%></td>
            <td><%=transfered.getAge()%></td>
            <td><%=transfered.getHobby()%></td>
            <td><%=transfered.getClan()%></td>
            <td><%=transfered.getRegion()%></td>
        </tr>

    </table>
</div>

</body>

</html>

<%-- <ul>
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
</div>--%>