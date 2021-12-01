<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>
Bem-vindo, Professor!
<% SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");%>
<% sdf.format(new Date()); %>
<%= (new Date()).toLocaleString() %>
</body>
</html>