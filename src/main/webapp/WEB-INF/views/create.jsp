<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Create</title>
</head>
<body>
  <h1>Create</h1>
  <form action="/employee/create"method="post">
    <table>
      <tr>
        <th>ID</th>
        <td><input type="number" name="id"></td>
      </tr>
      <tr>
        <th>Name</th>
        <td><input type="text" name="name"></td>
      </tr>
      <tr>
        <th>Age</th>
        <td><input type="text" name="age"></td>
      </tr>
      <tr>
        <th>Address</th>
        <td><input type="text" name="address"></td>
      </tr>
      <tr>
        <td colspan="2" style="text-align: center">
          <button>Create</button>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
