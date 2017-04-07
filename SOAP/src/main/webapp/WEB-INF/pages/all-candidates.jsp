<%@include file="include.jsp"%>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<body>
<div class="w3-container">
    <h2>List of candidates</h2>

    <c:set var="transfer" value="${candidate}"/>

    <table class="w3-table-all">
        <thead>
        <tr class="w3-light-grey w3-hover-red">
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
            <th>Hobby</th>
            <th>Clan</th>
            <th>Region</th>

        </tr>
        </thead>
        <tr class="w3-hover-green">
            <td>${transfer.id}</td>
            <td>${transfer.name}</td>
            <td>${transfer.age}</td>
            <td>${transfer.hobby}</td>
            <td>${transfer.clan}</td>
            <td>${transfer.region}</td>

        </tr>
    </table>
</div>

</body>
</html>