<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<body>
<h3>Create new question</h3>


<form:form method="POST" action="/submitQuestion" modelAttribute="create_question">
    <table>
        <tr>
            <td><form:label path="question">Enter new Question</form:label></td>
            <td><form:input path="question"/></td>
        </tr>

        <td>
            <form:label path="answerType">Select Answer Type</form:label>
            <select name="answerType">
                <c:forEach var="posibleAnswerTypes" items="${create_question.answerType}">
                    <option value="${answerTypes}">${possibleTypes}</option>
                </c:forEach>
            </select>
        <td>



        <tr>

            <td>
                <form:label path="gender">Kokia tavo lytis</form:label>
                <select name="gender">
                    <c:forEach var="possibleGenders" items="${user.possibleGenders}">
                        <option value="${gender}">${possibleGenders}</option>
                    </c:forEach>
                </select>
            <td>
        </tr>
        <tr>
            <td><input type="submit" value="Pateikti"/></td>
        </tr>
    </table>
</form:form>
</body>

<body>

<c:forEach items="${elements}" var="elements1">
    <tr>
        <td>${elements1.question}</td>
        <td>${elements1.answers}</td>

        <br>


    </tr>
</c:forEach>


</body>

</html>