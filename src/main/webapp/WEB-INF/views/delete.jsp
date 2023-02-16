<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<form action="/employee/delete?id=${employee.id}" method="post">
    <h1>Delete Employee ${employee.name}</h1>
    <button>Delete</button>
</form>
</body>
</html>
