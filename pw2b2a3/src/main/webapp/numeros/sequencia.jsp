<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name+"viewport" content="width=device-width, initial-scale=1.0" />
<title> Document </title>
</head>
<body>
<h1> Resultado </h1>
<ul>
<h2>${aluno}</h2>
<c:forEach var="valor" items="${valores}">
<li>${valor}</li>
</c:forEach>
</ul>
</body>
</html>