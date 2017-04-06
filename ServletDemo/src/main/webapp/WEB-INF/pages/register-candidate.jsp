<%@ page import="ua.com.model.Hobby" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<head>
    <title>Registration of a new Candidate</title>
</head>
<body>

<form method="post" action="register">

    Name :<br>
    <input type="text" name="name">
    <br>

    Age :<br>
    <input type="text" name="age">
    <br>

    Hobby :<br>
    <select name="hobby">
        <option value="choice">Choose</option>
        <option value="SPORT">SPORT</option>
        <option value="FINANCE">FINANCE</option>
        <option value="THEATRE">THEATRE</option>
        <option value="ANTHOLOGISES">ANTHOLOGISES</option>
    </select>
    <br>

    Clan :<br>
    <select name="clan">
        <option value="choice">Choose</option>
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="fiat">Fiat</option>
        <option value="audi">Audi</option>
    </select>
    <br>

    Region :<br>
    <select name="region">
        <option value="choice">Choose</option>
        <option value="KIEV">KIEV</option>
        <option value="KHARKOV">KHARKOV</option>
        <option value="LVOV">LVOV</option>
    </select>
    <br>

    <br>
    <input type="submit" value="Submit">

</form>

</body>
</html>
