<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

	<h2> JSP </h2>
	<%
		for(int i = 0; i<=10; i++){
			out.append("<p>");
			out.append(String.format("%d X %d = %d ",130,i,130*i));
			out.append("</p>");
		}
	%>
	<hr>
	<form class="form-group" action="Tablas" method="post">
		<p>
			<label for="txtTabla">Tabla: </label>
			<input class="form-control" type="text" id="txtTabla" name="txtTabla">
		</p>
		<p>
			<label for="txtRango">Rango: </label>
			<input class="form-control" type="text" id="txtRango" name="txtRango">
		</p>
		<input class="btn btn-danger" type="submit" value="iniciar">
	</form> 
	<%
		int tabla = Integer.parseInt(request.getParameter("txtTabla"));
		int rango = Integer.parseInt(request.getParameter("txtRando"));
	%>
	
	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/script.js"></script>
</body>
</html>