<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade Avaliativa - Agenda</title>
</head>
<body>
Por favor, informe os dados para cadastrar um novo contato e clique em "Enviar" para submete-los: 
<form action="Servlet_Agenda" method="post">
	<input type="text" name="nome" placeholder="Nome Completo" />
	<br>
	<input type="text" name="telefone" placeholder="Telefone p/ Contato" />
	<br>
	<input type="text" name="data" placeholder="Data de Nascimento" />
	<br>
	<input type="submit" value="Enviar">
</form>
</body>
</html>