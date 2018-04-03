<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Model.Pais" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pais</title>
</head>
<body>
	<%Pais pais = (Pais)request.getAttribute("pais"); %>>
	
	Id: <%=pais.getIdPais() %> </br>
	Nome: <%= pais.getNomePais() %> </br>
	Populacao: <%= pais.getPopulacaoPais() %> </br>
</body>
</html>