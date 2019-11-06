<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
    <jsp:useBean id="ElMensaje" class="com.jstl.model.Mensaje"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>


	<h2> Hola </h2>
	<c:out value="hola Mundi"></c:out>
	<c:set var="X" value="100" scope="application"></c:set>
	<c:out value="${X}"></c:out>
	<c:forEach var="i" begin="1" end="1000">
	<c:out value="${i}"></c:out>
	</c:forEach>

	<form>
	
		<jsp:setProperty property="saludo" name="Mensaje" value="x2"/>
		El mensaje de mi bean es: <c:out value="${Mensajebb.texto}" default="nose"></c:out>
	
	</form>
	
	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/script.js"></script>
</body>
</html>