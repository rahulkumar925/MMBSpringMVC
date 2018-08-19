<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Accounts</title>
</head>
<body>
<div align="left">
<a href="home"><h2><b>Home</b></h2></a>
</div>
<table border="1" align="center">
		<tr>
			<th>Account Number</th>
			<th>Account Holder Name</th>
			<th>Account Balance</th>
			<th>Over Draft Limit</th>
			<th>Phone No</th>
		</tr>
		<jstl:forEach var="account" items="${account}">
			<tr>
				<td>${account.accountNumber}</td>
				<td>${account.accountHolder}</td>
				<td>${account.accountBalance}</td>
				<td>${account.odl}</td>
				<td>${account.phoneNo}</td>
			</tr>
		</jstl:forEach>
	</table>
</body>
</html>