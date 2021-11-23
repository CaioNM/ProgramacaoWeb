<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>tela inicial</title>
</head>
<body>
<jsp:include page="dadosUsuario.jsp">
	<jsp:param value="Caio" name="usuario"/>
</jsp:include>
</body>
</html>