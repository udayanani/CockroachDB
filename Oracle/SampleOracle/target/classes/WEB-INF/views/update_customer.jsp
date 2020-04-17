<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Customer</title>
</head>
<body>
	<div align="center">
        <h2>Edit Customer</h2>
        <form action="savecust" method="POST">
            <table>
                <tr>
                    <td>ID: </td>
                    <td>
                        <input id="id" name="id" value="${customer1.id}" type="number" />
                    </td>
                </tr>        
                <tr>
                    <td>Name: </td>
                    <td><input name = "name" value="${customer1.name}"/></td>
                </tr>
                <tr>
                    <td>Age: </td>
                    <td><input name="age" value="${customer1.age}" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><input name="address" value="${customer1.address}" /></td>
                </tr>    
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form>
    </div>

</body>
</html>