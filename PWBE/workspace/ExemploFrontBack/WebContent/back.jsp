<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BackEnd</title>
</head>
<body>

<%
	out.print("Ol�");
	String valor = request.getParameter("valor");
	out.print(valor);
	response.sendRedirect("front.html?resposta="+valor);
%>

</body>
</html>