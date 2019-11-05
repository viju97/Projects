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
	<div>
		<div class="scrollmenu">

			<a href="#home">Home</a> <a href="#emi">EMI Calculator</a> <a
				href="#aboutus">About Us</a> <a href="#login">Login</a> <a
				href="personaldetail.jsp">Register</a> <a class="right"
				href="applyloan.jsp" id="apply">APPLY LOAN</a>
		</div>
		<center>
			<h2>CALCULATOR</h2>
		</center>
		<form method=post id="myForm" onreset="reset()">
			<strong>ENTER LOAN AMOUNT:</strong><br> <input type="text"
				id="loanamount" name="laonamount" /><br>
			<div id="loanvalidate"></div>
			<br> <strong>RATE OF INTEREST:</strong> (max 12% , multiples of
			0.50%)<br> <input type="text" id="rateofinterest"
				name="rateofinterest" /><br>
			<div id="roivalidate"></div>
			<br> <strong>TENURE:</strong> (in months)<br> <input
				type="text" id="tenure" name="tenure" /><br>
			<div id="tenurevalidate"></div>
			<br> <strong>Estimated EMI: </strong><br> Rs
			<div id="totalemi"
				style="background-color: blanchedalmond; width: 150px"></div>

			<br>
			<br>


			<center>
				<input type="button" onclick="emicalculator();" value="CALCULATE">
				<input type="button" value="Reset"
					onClick="window.location.reload()">
			</center>
			Want to check if you are Eligible? <a href="eligibility.html">
				Click here..</a>
		</form>

	</div>
</body>
</html>