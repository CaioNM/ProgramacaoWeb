<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="estilo.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div class="container">
	<div class="screen">
		<div class="screen__content">
			<form class="login" action="verificador" method="post">
				<div class="login__field">
					<i class="login__icon fas fa-user"></i>
					<p class = "text_enter" >Faça seu login:</p>
					<input type="text" name="usuario" placeholder="Usuário" class="login__input">
				</div>
				<div class="login__field">
					<i class="login__icon fas fa-lock"></i>
					<input type="password" type="number" name="senha" placeholder="Senha" class="login__input">
				</div>
				<button class="button login__submit">
					<span class="button__text">Entrar</span>
					<i class="button__icon fas fa-chevron-right"></i>
				</button>				
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
<%--Ao apertar o botão de login ele envia os dados a classe verificador por metodo post para conferi-los --%>
	<%-- <form action="verificador" method="post"> --%> 
		 <%-- <h4>Insira seus dados:</h4> --%>
		 <%-- Campos de dados a serem inseridos --%>
		<%-- <input type="text" name="usuario" placeholder="Usuário"><br> --%>
		<%-- <input type="password" type="number" name="senha" placeholder="Senha"><br> --%>
		<%-- <input type="submit" value="Entrar"> --%>
	</form>
</center>
</body>
</html>