<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>Prod_Name</th>
            <th>Prod_Id</th>
        </tr>
        <c:forEach items="${result}" var="e">
        <tr>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td>${e.address}</td>
            <td>${e.prodName}</td>
            <td>${e.prodId}</td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>