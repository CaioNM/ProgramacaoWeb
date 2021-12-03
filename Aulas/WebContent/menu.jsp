<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="estilo.css">
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<center>
<div class="title">
<%@ include file="header.jsp" %><br>
</div>
</center>
<div class="container">
	<div class="screen">
		<div class="screen__content">
				<div class="menu__field">
					<i class="login__icon fas fa-user"></i>
					<p class = "text_enter">Para onde deseja ir?</p>
				</div>
				<left>
				<button class="button notas__submit">
					<span class="button__text"></span>
					<a href="ServletControladora?acao=cadastrar">Registrar notas</a>
					<i class="button__icon fas fa-chevron-right"></i>
				</button>
				<button class="button lista__submit">
					<span class="button__text"></span>
					<a href="ServletControladora?acao=listar">Lista de notas e disciplinas</a>
					<i class="button__icon fas fa-chevron-right"></i>
				</button>
				</left>				
			</form>
		</div>
		<div class="screen__background">
			<span class="screen__background__shape screen__background__shape4"></span>
			<span class="screen__background__shape screen__background__shape3"></span>		
			<span class="screen__background__shape screen__background__shape2"></span>
			<span class="screen__background__shape screen__background__shape1"></span>
		</div>		
	</div>
</div>


<center>
<%-- Este é o menu, aqui serão exibidas duas opçoes, ou seja, dois caminhos que redirecionarão o usuário para a página correspondente: --%>
<%-- Chamada do documento header: --%>

<%--Para onde deseja ir?<br>
<%-- Redireciona ao cadastro de uma nova nota: --%>
<%--1. <a href="ServletControladora?acao=cadastrar">Registrar notas</a><br>
<%-- Redireciona a pagina de notas cadastradas: --%>
<%-- 2. <a href="ServletControladora?acao=listar">Lista de notas e disciplinas</a>--%>
</center>
</body>
</html>