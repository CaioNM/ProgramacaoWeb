<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acessos</title>
</head>
<body>
<%! int cont = 1; %>
Este é o acesso de número: <%= cont %>
<% cont = cont + 1; %>
</body>
</html>