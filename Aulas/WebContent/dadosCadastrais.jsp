<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
<form action="ServletDadosProfissionais">
	<h3>Por favor, insira seus dados nos campos abaixo:</h3>
	<h4>Dados pessoais: </h4>
		<input type="text" name="nome" placeholder="Nome">
		<input type="text" name="sobrenome" placeholder="Sobrenome">
	<br><br>
	<h4>Endereço residencial:</h4>
		<input type="text" name="rua" placeholder="Rua">
		<input type="text" name="complemento" placeholder="Complemento"><br>
		<input type="text" name="cidade" placeholder="Cidade">
		<input type="text" name="cep" placeholder="CEP"><br>
		<input type="text" name="estado" placeholder="Estado"><br><br> 
<input type="submit" value="Confirmar">
</form>  	
</body>
</html>