<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Cadastro</title>
</head>
<body>
<%@ include file="header.jsp" %><br>
	<%
	if(request.getSession(true)!=null){
	%>
<h3>Novo registro:</h3>
<form action="ServletControladora" method="post">
	<input type="hidden" name="acao" value="confirmarCadastro">
	<input type="text" name="disciplina" placeholder="Disciplina"><br>
	<input type="text" name="nomeAluno" placeholder="Nome"><br>
	<input type="number" step="0.01" name="resultado" placeholder="Nota"><br>
	<input type="submit" value="Registrar Encontro"><br>
</form>
<a href="ServletControladora">Voltar ao menu principal</a>
	<% } %>
</body>
</html>