<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@ include file="/WEB-INF/views/css/emi.css" %></style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>
<title>Insert title here</title>
</head>
<body>

<form id="myForm" method="post" action="vehicledetails">
<h3>Vehicle Details</h3>

<div>
Car Brand name:
<div>
<input type="text" name="vehicleBrand" >
</div>
</div>
<div>
Car model:
<div>
<input type="text" name="vehicleModel" >
</div>

</div>
<div>
Car price :
<div>
<input type="text" name="vehiclePrice" >
</div>
</div>
<div>
<input type="hidden" name="email" value="${sessionScope.email}">
</div><br>
<div>
<input type="submit" value="submit">
</div>

</form>
</body>
</html>