<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
<form action="ServletTela1Cadastro">
	<h4>Dados:</h4>
		Nome: <input type="text" name="nome">
		Sobrenome: <input type="text" name="sobrenome">
	<br><br>
	<h4>Endereço:</h4>
		Rua: <input type="text" name="rua">
		Complemento: <input type="text" name="complemento"><br>
		Cidade: <input type="text" name="cidade">
		CEP: <input type="text" name="cep"><br>
		Estado: <input type="text" name="estado"><br><br>
<input type="submit" value="Proxima tela">
</form>
</body>
</html>