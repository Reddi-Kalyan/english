<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
ALL USERS LIST:


<br>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Status</th>
        <th></th>
    </tr>
    <c:forEach var="us" items="${allUsersAtt}">

        <c:url var="banButton" value="/admin/banUser">
            <c:param name="userId" value="${us.username}"/>
        </c:url>

        <c:url var="ubBanButton" value="/admin/unBanUser">
            <c:param name="userId" value="${us.username}"/>
        </c:url>

        <tr>
            <td>${us.username}</td>
            <td>
                <c:if test="${us.enabled>0}">active

                    <input type="button" value="BAN" onClick="window.location.href='${banButton}'"/>
                </c:if>
                <c:if test="${us.enabled<1}">banned
                    <input type="button" value="UNBAN" onClick="window.location.href='${ubBanButton}'"/>
                </c:if>

            </td>


        </tr>
    </c:forEach>
</table>

</body>
</html>
