<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Country List</title>
</head>
<body>
two countries:
<ul>
    <c:forEach items="${countries}" var="country">
        <li><c:out value="${country.value}"/></li>
    </c:forEach>
</ul>
</body>
</html>