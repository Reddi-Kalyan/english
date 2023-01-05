<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<br>
hi,user!
<form:form action="testStart" >
  <input type="submit" value="GO TEST!">
</form:form>


<br>
<br>


<form:form action="addNewQuestions">
  <input type="submit" value="ADD NEW QUESTIONS">
</form:form>      Only for admins!
</body>
</html>