<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<title></title>
</head>
<body bgcolor="#efefef">
	<h1 align="center">Customer Details</h1>
  	<hr>

  	<div class="form">
  	<form:form method="POST" modelAttribute="customer" action="createCustomer">
      <table align="center">
      	<spring:bind path="id">
        <tr>
        	<td>Id</td>
        	<td><form:input id="id" name="id" path="id" type="number"/></td>
        </tr>
        </spring:bind>
        <spring:bind path="name">
        <tr>
          	<td>Name</td>
          	<td><form:input id="name" type="text" path="name"></form:input></td>
        </tr>
        <tr>
          	<td>Age</td>
          	<td><form:input id="age" type="number" path="age"></form:input></td>
        </tr>
        <tr>
          	<td>Address</td>
          	<td><form:input id="address" type="text" path="address"></form:input></td>
        </tr>
        </spring:bind>
        <tr/><tr/>
        <tr>
        	 <td><input id="submit" type="submit" value="Create Customer"></td>
			
        </tr>
        <tr></tr><tr></tr>
        <tr>
        	 <!-- <td><a href="" onclick="this.href='/updateCustomer/'+document.getElementById('id').value" >Update Customer</a></td> -->
        	 <td ><a href="" onclick="this.href='/delete/'+document.getElementById('id').value" >Delete Customer</a></td>
			  <td ><a href="" onclick="this.href='/search/'+document.getElementById('name').value" >Search Customer By Name</a></td>
        </tr>
        <tr></tr><tr></tr>
        <tr>
        	<td ><a href="/selectAll" >All Customer Details</a></td>
        	<td ><a href="/selectJoin" >All Customer and Product Details</a></td>
        </tr>
        <tr></tr><tr></tr>
        <tr>
        	<td ><a href="/search1" >Search1</a></td>
        	<td ><a href="/searchP" >Select Product Details</a></td>
        </tr>
      </table>
      <br/><br/>
      <div align="center">
      	<label>Successful Message</label>
      	<input type="text" width="100%" value="${message}"/>
      </div>
      
    </form:form>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>