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
<form id="myForm" method="post" action="complete">
<div>
<label>Name:${user.firstName } ${user.lastName }</label>
<label>Loan ID : ${loan.loanId}</label>
<label>Bank Account No : ${bank.existingAccountNo }</label>
<label>IFSC : ${bank.ifscCode }</label>
<label>EMI : ${loan.emi}</label>

</div>
</form>
</body>
</html>