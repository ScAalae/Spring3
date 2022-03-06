<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Read</title>
</head>
<body>

    <h2>Liste</h2>

    <p><strong>Student List is Here | <a href="/Spring3/create">Click for Create</a></strong></p>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
            <th>Action</th>
        </tr>
        <c:forEach var="student" items="${listStudent}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.email}</td>
                <td>${student.course}</td>
                <td><a href="/Spring3/update/<c:out value='${student.id}'/>">Update</a> | <a
                    href="/Spring3/delete/<c:out value='${student.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
