<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
<%@include file="/WEB-INF/views/css/emi.css" %>
</style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#f2 {
	padding: 3px;
	width: 25%;
	margin: auto;
	border: 2px solid black;
}

h3{
	color: white;
}
</style>

</head>
<body>
	<div class="scrollmenu">
		<div>
			<h3>Welcome ${name}</h3>
		</div>
		<div>
			<a class="right" href="logout" id="apply">Logout</a>
		</div>
	</div>
	<form id="myForm">
		<div>
			<input type="submit" value="Apply For Loan" formaction="applyloan">
			<input type="submit" value="Emi Calculator" formaction="emi">


		</div>

	</form>
</body>
</html>