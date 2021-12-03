<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="estilo.css">
<meta charset="ISO-8859-1">
<title>Novo Cadastro</title>
</head>
	<%
	if(request.getSession(true)!=null){
	%>
<%-- Esta é a página de cadastro: --%>
<body>
<center>
<div class="title">
<%@ include file="header.jsp" %><br>
</div>
</center>

<div class="container">
	<div class="screen">
		<div class="screen__content">
			<form class="login" action="ServletControladora" method="post">
				<div class="cadastro__field">
					<i class="login__icon fas fa-user"></i>
					<p class = "text_enter" >Insira os dados:</p>
					<input type="hidden" name="acao" value="confirmarCadastro">
					<input type="text" name="disciplina" placeholder="Disciplina" class="disciplina__input">
					<i class="login__icon fas fa-lock"></i>
					<input type="text" name="nomeAluno" placeholder="Nome" class="nome__input">
					<input type="number" step="0.01" name="resultado" placeholder="Nota" class="nota__input">
					<i class="login__icon fas fa-lock"></i>
				</div>
				<button class="button cadastro__submit">
					<span class="button__text">Enviar</span>
					<i class="button__icon fas fa-chevron-right"></i>
				</button>
				<button class="button lista__submit">
					<span class="button__text"></span>
					<input type="submit" value="Voltar ao menu principal" ></a>
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

<%-- Chamada do documento header: --%>
<%-- Verificação para exibir a página apenas se o usuario estiver logado: --%>
<%-- <h3>Registrar nova nota:</h3>--%> 
<%-- O botão enviará os dados inseridos por metodo post para que os dados não sejam vistos na URL, assim como tem o type hidden, trazendo mais segurança --%>
<form action="ServletControladora" method="post">
	<%--<input type="hidden" name="acao" value="confirmarCadastro">--%>
	<%--<input type="text" name="disciplina" placeholder="Disciplina"><br> --%>
	<%--<input type="text" name="nomeAluno" placeholder="Nome"><br> --%>
	<%--<input type="number" step="0.01" name="resultado" placeholder="Nota"><br><br> --%>
	<%--<input type="submit" value="Registrar Encontro"> --%>
<%-- Este botão envia de volta ao menu principal: --%>
<%--</form>--%>
<%--<form action="ServletControladora">--%>
<%-- Fim do form e botão que redireciona ao menu: --%>
<%--<input type="submit" value="Voltar ao menu principal" >--%>
</form>
</body>
<% } %>
</html>