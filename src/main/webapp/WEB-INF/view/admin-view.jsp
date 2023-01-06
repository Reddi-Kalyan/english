<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<br>
hi,admin!

<br>
<br>
<security:authorize access="hasRole('ADMIN')">

    <form:form action="admin/addNewQuestions">
        <input type="submit" value="ADD NEW QUESTIONS">
    </form:form>
</security:authorize>


<br>
<br>


<security:authorize access="hasRole('ADMIN')">
    <form:form action="listOfUsers">
        <input type="submit" value="GET ALL USERS LIST">
    </form:form>
</security:authorize>


</body>
</html>