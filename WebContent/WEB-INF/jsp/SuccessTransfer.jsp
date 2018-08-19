<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<div align="left">
<a href="home"><h2><b>Home</b></h2></a>
</div>
<article>
	<div><jstl:if test="${debit>=0 }">
			Successfully Debited: <br></br>
			Your Account Balance : ${debit} <br></br>
			Receiver Account Balance : ${credit}	<br></br>	
		</jstl:if>
		<jstl:if test="${debit<0 }">
	     <h3>Transfer Unsuccessful: Sender does not have sufficient Balance</h3>	
		</jstl:if>
	</div>
</article>
</body>
</html>