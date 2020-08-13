<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="ServletProject.ServletSignup"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=session.getAttribute("name")%></title>
</head>
<body>
	<h1>Merhaba <%=session.getAttribute("name")%></h1>
</body>
</html>