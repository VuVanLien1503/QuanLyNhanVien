<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Edit</title>
</head>
<body>
<h1>Edit</h1>
<form action="/employee/edit?id=${employee.id}"method="post">
    <table>
        <tr>
            <th>ID</th>
            <td>${employee.id}</td>
        </tr>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name" value="${employee.name}"></td>
        </tr>
        <tr>
            <th>Age</th>
            <td><input type="text" name="age" value="${employee.age}"></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><input type="text" name="address" value="${employee.address}"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center">
                <button>Edit</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
