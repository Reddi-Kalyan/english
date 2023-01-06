<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<br>


<form:form action="testStart">
    <input type="submit" value="GO TEST!">
</form:form>


<br>
<br>
<security:authorize access="hasRole('ADMIN')">

    <form:form action="admin/adminPage">
        <input type="submit" value="GO TO ADMIN PAGE">
    </form:form>
</security:authorize>


<br>
<br>


</body>
</html>