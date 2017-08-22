<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link href="bootstrap4/css/bootstrap.css" rel="stylesheet" media="screen">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="bootstrap4/js/bootstrap.js"></script>


<html lang="en">
    <div class="container">
<body>

<h3>Create new question</h3>


<form:form method="POST" action="/submitQuestion" modelAttribute="question">
        <div class=".table-striped">
    <table class="table">
        <tr>
            <td><form:label path="text">Enter new Question</form:label></td>
            <td><form:input path="text"/></td>
        </tr>

        <td>
            <form:label path="answerType">Select Answer Type</form:label>
            <select name="answerType">
                <c:forEach var="i" items="${question.possibleAnswerTypes}">
                    <option value="${i}">${i}</option>
                </c:forEach>

            </select>
        </td>




        <tr>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
    </div>
</form:form>
</body>
    </div>


</html>