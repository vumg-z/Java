<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Http Sessions</title>
</head>
<body>
	<h2> Http Sessions</h2>
	<form action="Sessions" method="post">
		<p>  
			<label for="txtUserName"> Write your user </label>
			<input type="text" id="txtUserName" name="txtUserName">
		</p>
		<p>  
			<label for="txtPassword"> Write your password </label>
			<input type="password" id="txtPassword" name="txtPassword">
		</p>
		<p>
			<input type="submit" value="login">
		</p>
	</form>
</body>
</html>