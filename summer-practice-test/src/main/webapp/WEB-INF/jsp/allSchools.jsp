<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista scoli</title>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
  <h1>Lista tuturor scolilor:</h1>
  <ul>
    <c:forEach items="${schools}" var="school">
      <li>
        <strong>Nume: ${school.name}</strong>

        <c:if test="${not empty school.students}">
        <ul>
          <c:forEach items="${school.students}" var="student">
            <li>
              Nume: ${student.name}, Varsta: ${student.age}
            </li>
          </c:forEach>
        </ul>
        </c:if>
        <c:if test="${empty school.students}">
          <p>Nu sunt studenti inscrisi la aceasta școala.</p>
        </c:if>
      </li>
    </c:forEach>
  </ul>
  <p>Data: <span id="data"></span></p>
  <p>Ora curentă: <span id="ora"></span></p>

  <script type="text/javascript" src="<c:url value="/static/script/common.js"/>"></script>
</body>
</html>
