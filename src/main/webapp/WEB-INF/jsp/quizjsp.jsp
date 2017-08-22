<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Pateikti"/></td>
        </tr>
    </table>
        </div>
  

</form:form>
      </div>
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