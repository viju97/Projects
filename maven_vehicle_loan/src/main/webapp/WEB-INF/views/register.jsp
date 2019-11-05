<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@ include file="/WEB-INF/views/css/emi.css" %></style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>
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
	<div>
		<div class="scrollmenu">
		<h3>Wheel On Loan</h3>
			<!--  <a href="#home">Home</a> <a href="#emi">EMI Calculator</a> <a
				href="#aboutus">About Us</a> <a href="#login">Login</a> <a
				href="registervalidate.jsp">Register</a> <a class="right"
				href="applyloan.jsp" id="apply">APPLY LOAN</a>-->
		</div>
		<center>
			<h2>Applicant Details</h2>
		</center>
		<form method=post id="myForm" onsubmit="return registervalidate()"
			action="register">
			<strong>First Name:</strong><br> <input type="text"
				id="first_name" name="firstName" /><br>
			<div id="err_msg_first_name"></div>
			<br> <strong>Last Name:</strong><br> <input type="text"
				id="last_name" name="lastName" /><br>
			<div id="err_msg_last_name"></div>
			<br> <strong>Age:</strong><br> <input type="text" id="age"
				name="age" min="18" /><br>
			<div id="err_msg_age"></div>
			<br> <br> <strong>Gender:</strong><br> <input
				type="radio" name="gender" value="male" checked="checked">
			Male<br> <input type="radio" name="gender" value="female">
			Female<br> <br>
			<br> <strong>Mobile:</strong><br> <input type="text"
				id="mob" name="mobile" /><br>
			<br>
			<div id="err_msg_mobile"></div>
			<br> <strong>Email:</strong><br> <input type="text"
				id="email" name="email" /><br>
			<br>
			<div id="err_msg_email"></div>
			<br> <strong>Password:</strong><br> <input type="text"
				id="pass" name="password" /><br>
			<br>
			<div id="err_msg_password"></div>
			<br>
			<div>
				<input type="hidden" name="Address" value="null">
			</div>
			<div>
				<input type="hidden" name="state" value="null">
			</div>
			<div>
				<input type="hidden" name="typeOfEmployment" value="null">
			</div>
			<center>
				<input type="submit" value="Submit" /> <input type="reset"
					value="Reset" />
			</center>
		</form>

	</div>
</body>
</body>
</html>