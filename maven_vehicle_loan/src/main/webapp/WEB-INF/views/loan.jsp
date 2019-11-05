<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
<%@include file="/WEB-INF/views/css/emi.css"%>
</style>
<title>Insert title here</title>
</head>
<body>
	<form action="finalLoan" id="myForm">
		<h3>LOAN Details:</h3>

		<div>
			Loan Amount:<label>${loan.loanAmount }</label>
		</div>
		<div>
			Rate Of Interest:<label>${loan.roi }</label>
		</div>
		<div>
			Loan Tenure:<label>${loan.loanTenure }</label>
		</div>
		<div>
			Loan Emi:<label>${loan.emi }</label>
		</div>
		<input type="submit" formaction="finaleligibility" value="Change">
		<input type="submit" value="submit"><br>
		
	</form>
	
</body>
</html>