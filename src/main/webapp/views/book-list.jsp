<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
    <%-- Include JSTL Core library for JSTL tags --%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <h1>Book List</h1>
    <table>
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
            </tr>
        </thead>
        <tbody>
            <%-- Loop through the list of books using JSTL forEach tag --%>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
