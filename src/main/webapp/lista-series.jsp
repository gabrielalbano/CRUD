<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,crud.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Séries</title>
</head>
<body>
	<h1>Lista de séries JSP</h1>
	
	<ul>
		<c:forEach items="${series}" var="serie">
			<li>Id: ${serie.id} Nome: ${serie.name}</li>
		</c:forEach>
	</ul>
</body>
</html>