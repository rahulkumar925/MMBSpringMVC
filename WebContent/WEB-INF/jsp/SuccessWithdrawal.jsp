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
	<div><jstl:if test="${bal>=0 }">
			Successfully withdrawal: <br></br>
			account Balance : ${bal}		
		</jstl:if>
		<jstl:if test="${bal<0 }">
	     <h3>Insufficient Balance</h3>	
		</jstl:if>
	</div>
</article>
</body>
</html>