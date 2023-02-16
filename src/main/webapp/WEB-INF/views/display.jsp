<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<html>
<head>
    <title>List Employee</title>
</head>
<body>
<h1>List Employee</h1> <br><br>
<h3><a href="/employee/create" style="margin-top: 20px;margin-left: 200px"> Create New Employee</a></h3>
<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Name</th>
        <th scope="col">Age</th>
        <th scope="col">Address</th>
        <th scope="col" colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="element" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>
            <td>${element.getName()}</td>
            <td>${element.getAge()}</td>
            <td>${element.getAddress()}</td>
            <td><a href="/employee/edit?id=${element.id}">Edit</a></td>
            <td><a href="/employee/delete?id=${element.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
