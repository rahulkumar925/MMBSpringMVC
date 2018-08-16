<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="withdrawSave" method="post">
<table>
<tr>
<td>Enter Account Number: </td>
<td><input type="text" name="accountNumber"></td>
</tr>
<tr>
<td>Enter Withdrawal Amount: </td>
<td><input type="number" name="withdrawAmount" min=1></td>
</tr>
<tr>
<td><input type="submit" value="Withdraw"></td>
</tr>
</table>
</form>
</body>
</html>