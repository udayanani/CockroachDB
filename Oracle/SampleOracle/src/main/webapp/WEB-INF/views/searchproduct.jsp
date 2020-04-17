<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Product Result</title>
</head>
<body>
<div align="center">
    <h2>Search Product Result</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>CustId</th>

        </tr>
        <c:forEach items="${result}" var="product">
        <tr>
           <%--  <td>${customer.id}</td> --%>
            <td>${product.prodId}</td>
            <td>${product.prodName}</td>
            <td>${product.custId}</td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>