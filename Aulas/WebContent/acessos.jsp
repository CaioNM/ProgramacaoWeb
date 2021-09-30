<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acessos</title>
</head>
<body>
<% Aula08.Contador.novoAcesso(); %>
Quantidade de acessos as esta pagina: 
<b> <%= Aula08.Contador.getQuantidadeAcessos() %> </b>
</body>
</html>