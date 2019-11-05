<%@page import="org.springframework.web.context.annotation.RequestScope"%>
<%@page import="com.lti.bean.UserDetails"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan</title>
</head>
<body>
<h4>Apply Loan</h4>

Personal Details
<div>
<form method="post" action="personaldetails">
<input type="text" name="firstName" value="${user1.firstName}">
<input type="text" name="lastName" value="${user1.lastName}">
<input type="text" name="age" value="${user1.age}">
<input type="text" name="gender" value="${user1.gender}">
<input type="text" name="mobile" value="${user1.mobile}">
<input type="text" name="Address" placeholder="address">
<input type="text" name="state" placeholder="state">
<input type="submit" name="submit" value="submit">
</form>
</div>

</body>
</html>
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
<%@ include file="/WEB-INF/views/css/emi.css"%>
</style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>
<title>Insert title here</title>
<style type="text/css">
#f2 {
	padding: 3px;
	width: 25%;
	margin: auto;
	border: 2px solid black;
}
</style>
</head>
<body>
	<div>
		<div class="scrollmenu">

			<a href="#home">Home</a> <a href="#emi">EMI Calculator</a> <a
				href="#aboutus">About Us</a> <a href="#login">Login</a> <a
				href="registervalidate.jsp">Register</a> <a class="right"
				href="applyloan.jsp" id="apply">APPLY LOAN</a>
		</div>
		<center>
			<h2>Applicant Details</h2>
		</center>
		<form method=post id="myForm" onsubmit="return registervalidate()"
			action="personaldetails">
			<strong>First Name:</strong><br> <input type="text"
				id="first_name" name="firstName" value="${user1.firstName}" /><br>
			<div id="err_msg_first_name"></div>
			<br> <strong>Last Name:</strong><br> <input type="text"
				id="last_name" name="lastName" value="${user1.lastName}" /><br>
			<div id="err_msg_last_name"></div>
			<br> <strong>Age:</strong><br> <input type="text" id="age"
				name="age" min="18" value="${user1.age}" /><br>
			<div id="err_msg_age"></div>
			<br> <br> <strong>Gender:</strong><br> <input
				type="radio" name="gender" value="male" checked="checked">
			Male<br> <input type="radio" name="gender" value="female">
			Female<br> <br> <br> <strong>Mobile:</strong><br>
			<input type="text" id="mob" name="mobile" value="${user1.mobile}" /><br>
			<br>
			<div id="err_msg_mobile"></div>
			<br> Address:<br>
			<input type="text" name="Address" placeholder="address"> <br>State:<br>
			<input type="text" name="state" placeholder="state"><br>
			Type Of Employment
			<div>
				<input type="radio" name="typeOfEmployment" value="Salaried" id="yesCheck">Salaried</input>
			</div>
			<div>
				<input type="radio" name="typeOfEmployment" value="Self Employed" id="noCheck">Self Employed</input>
			</div>
			<center>
				<input type="submit" value="Submit" />
				<!--  <input type="reset"
					value="Reset" />-->
			</center>
		</form>

	</div>
</body>
</body>
</html>