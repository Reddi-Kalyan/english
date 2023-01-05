<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
add new question

<form:form action="saveQuestion" modelAttribute="questionAtt">

  Question <form:input path="question"/>
  <br><br>
  Answer <form:input path="answer1"/>
  <br><br>
  Answer <form:input path="answer2"/>
  <br><br>
  Answer <form:input path="answer3"/>
  <br><br>
  Answer <form:input path="correctAnswer"/>
  <br><br>
  Level <form:select path="level">
    <form:option value="A1" label="A1"/>
    <form:option value="A2" label="A2"/>
    <form:option value="B1" label="B1"/>
    <form:option value="B2" label="B2"/>
    <form:option value="C1" label="C1"/>
    <form:option value="C2" label="C2"/>

      </form:select>
  <br><br>
  Type <form:select path="type">
        <form:option value="Grammar" label="Grammar"/>
        <form:option value="Vocabulary" label="Vocabulary"/>

       </form:select>
  <br><br>
  Format <form:select path="format">
  <form:option value="text" label="text"/>
  </form:select>


<input type="submit" value="ADD">

</form:form>


</body>
</html>
