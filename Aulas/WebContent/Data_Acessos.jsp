<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acessos</title>
</head>
<body>
<% atividade_TrabalhandoComJSPs.Contador.novoAcesso(); %>
Quantidade de acessos as esta pagina: 
<b> <%= atividade_TrabalhandoComJSPs.Contador.getQuantidadeAcessos() %> </b>
horario
<b> <% atividade_TrabalhandoComJSPs.Contador.primeiroAcesso(); %></b>
</body>
</html>