<%@page import="br.com.notas.model.Nota"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de notas e disciplinas</title>
</head>
<body>
<h3>Lista de Notas:</h3>

<table border="1">
	<tr>
		<td>Disciplina</td>
		<td>Nome</td>
		<td>Nota</td>
		<td>Situação</td>
	</tr>
	<%
		List<Nota> lista = (List<Nota>) request.getAttribute("lista");
		for(Nota nota : lista){
	%>
	<tr>
		<td><%= nota.getDisciplina() %></td>
		<td><%= nota.getNomeAluno() %></td>
		<td><%= nota.getResultado()%></td>
		<td><%= nota.getSituacao() %></td>
	</tr>
	<%
		}
	%>
	<br><br>
	<a href="ServletControladora">Voltar ao menu principal</a>
</table>

</body>
</html>