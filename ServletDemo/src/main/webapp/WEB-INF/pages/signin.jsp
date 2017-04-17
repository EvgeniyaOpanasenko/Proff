<%--
  Created by IntelliJ IDEA.
  User: EVA
  Date: 11.04.2017
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Последняя компиляция и сжатый CSS -->
<link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">

<!-- Дополнение к теме -->
<link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
      integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
      crossorigin="anonymous">

<!-- Последняя компиляция и сжатый JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<html>
<head>
    <title>Sing in</title>
</head>
<body>
<form role="form">
    <div class="form-group">
        <label for="email">Email</label>
        <input type="email" class="form-control" id="email" placeholder="Enter mail">
        <p class="help=block">Example</p>
    </div>
    <div class="form-group">
        <label for="pass">Пароль</label>
        <input type="password" class="form-control" id="pass" placeholder="Пароль">
    </div>
    <div class="checkbox">
        <label><input type="checkbox"> Чекбокс</label>
    </div>
    <button type="submit" class="btn btn-success">Войти</button>
</form>

</body>
</html>
