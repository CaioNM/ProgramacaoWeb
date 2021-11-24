<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
<h3>Novo encontro:</h3>
<form action="ServletControlador" method="post">
	<input type="hidden" name="acao" value="confirmarCadastro">
	<input type="text" name="nomePessoa" placeholder="Nome"><br>
	<input type="text" name="motivo" placeholder="Motivo"><br>
	<input type="text" name="local" placeholder="Local"><br>
	<input type="submit" value="Registrar Encontro"><br>
</form>
<a href="ServletControlador">Voltar ao menu</a>
</body>
</html>