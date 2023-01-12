<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">

<head>
    <title>English - login</title>
</head>
<body>
<form th:action="@{/login}" method="POST">
    Login
    <br>
    <input type="text" id="email" name="email" th:placeholder="Email"/>
    <br>
    Password
    <br>
    <input type="password" id="password" name="password" th:placeholder="Password"/>
    <br>
    <br>
    <button name="Submit" value="Login" type="Submit" th:text="Login"></button>
    <a href="/recover-password">Forgot password?</a>
</form>
</body>
</html>