<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
ADMINNNNN....
<br>
<a></a>
<table>
<form>
<c:forEach items="${loanList}" var="loan">
<tr>
<td>${loan.email}</td>
<td>${loan.loanAmount}</td>
<td>${loan.emi}</td>
<td>${loan.loanTenure}</td>
<td>${loan.roi}</td>
<td><a href="acceptRequest?email=${loan.email}">Accept</a></td>
<td><a href="rejectRequest?email=${loan.email}">Reject</a></td>
</tr>



</c:forEach>
</form>
</table>
</body>
</html>