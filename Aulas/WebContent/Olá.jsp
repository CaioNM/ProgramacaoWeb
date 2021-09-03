<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Olá Personalizado</title>
</head>
<body>
Digite seu nome e clique em enviar: 
<form action="ServletOláPersonalizado" method="post">
	<input type="text" name="nome" />
	<input type="submit" value="Enviar" />
</form>
</body>
</html>