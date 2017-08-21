<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<html lang="en">
<body>
<div class="container">

<h3>Iveskite savo Varda ir Pavarde</h3>


<form:form method="POST" action="/submitQuizAnswers" modelAttribute="user">


    <div class=".table-striped">
    <table class="table">
        <tr>
            <td><form:label path="name">Vardas</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="lastname">Pavarde</form:label></td>
            <td><form:input path="lastname"/></td>
        </tr>
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

</div>
</div>


</body>

</html>