<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
ALL USERS LIST:

<c:forEach var="u1" items="${allUsersAtt}">
    ${u1.username}
    <br>
    <br>
</c:forEach>
<br>
<br>
<table>
  <tr>
    <th>Name</th>
    <th>Status</th>
    <th>Button</th>
  </tr>
  <c:forEach var="user" items="${allUsersAtt}">
    <tr>
        <td>${user.username}</td>
        <td>${user.enabled}</td>
        <td>
          3
        </td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
