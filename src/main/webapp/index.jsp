<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
	</head>
	<body>
	<h1><c:out value="${message}"></c:out></h1><br/>
	<c:forEach items="${infos }" var="info">
		${info}
	</c:forEach>
	<h2>Hello World!</h2>
	</body>
</html>
