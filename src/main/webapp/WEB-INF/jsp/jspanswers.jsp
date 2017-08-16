<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<body>

<c:forEach items="${elements}" var="elements1">
    <tr>
        <td>${elements1.question}</td>
        <td>${elements1.answers}</td>
        <br>

        <form:radiobutton path="sex" value="M"/>Male



    </tr>
</c:forEach>


</body>

</html>