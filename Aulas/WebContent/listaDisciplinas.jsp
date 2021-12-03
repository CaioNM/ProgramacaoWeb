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
<center>
<%-- Chamada do documento header: --%>
<%@ include file="header.jsp" %><br>
<h3>Situação dos Alunos:</h3>

<%-- Criação das tabelas começando pelos titulos: --%>
<table border="4">
	<tr>
		<td>Disciplina</td>
		<td>Nome</td>
		<td>Nota</td>
		<td>Situação</td>
	</tr>
	<%-- Chamada da lista para pegar dos dados inseridos na tela de cadastro: --%>
	<%
		List<Nota> lista = (List<Nota>) request.getAttribute("lista");
		for(Nota nota : lista){
	%>
	<%-- Chamando dados específicos pelos seus nomes --%>
	<tr>
		<td><%= nota.getDisciplina() %></td>
		<td><%= nota.getNomeAluno() %></td>
		<td><%= nota.getResultado()%></td>
		<td><%= nota.getSituacao() %></td>
	</tr>
	<%
		}
	%>
	</table>
	<%-- Botão que leva a um novo cadastro: --%>
<a href="http://localhost:8080/Aulas/ServletControladora?acao=cadastrar">Adicionar nova nota</a><br><br>
</form>
<form action="ServletControladora">
<%-- Fim do form e botão que redireciona ao menu: --%>
<input type="submit" value="Voltar ao menu principal" >
</form>
</body>
</center>
</html>