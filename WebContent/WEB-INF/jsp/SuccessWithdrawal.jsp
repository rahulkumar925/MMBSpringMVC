<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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