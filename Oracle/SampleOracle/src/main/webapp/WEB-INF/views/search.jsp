<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1">
        <tr>
           <!--  <th>ID</th> -->
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${result}" var="customer">
        <tr>
           <%--  <td>${customer.id}</td> --%>
            <td>${customer.name}</td>
            <td>${customer.age}</td>
            <td>${customer.address}</td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>