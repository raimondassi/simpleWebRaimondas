<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<body>
<h3>Create new question</h3>


<form:form method="POST" action="/submitQuestion" modelAttribute="question">
    <table>
        <tr>
            <td><form:label path="text">Enter new Question</form:label></td>
            <td><form:input path="text"/></td>
        </tr>

        <td>
            <form:label path="answerType">Select Answer Type</form:label>
            <select name="answerType">
                <c:forEach var="possibleAnswerType" items="${question.possibleAnswerType}">
                    <option value="${answerType}">${answerType}</option>
                </c:forEach>
            </select>
        </td>




        <tr>
            <td><input type="submit" value="Pateikti"/></td>
        </tr>
    </table>
</form:form>
</body>


</html>