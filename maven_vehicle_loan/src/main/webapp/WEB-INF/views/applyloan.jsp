<%@page import="org.springframework.web.context.annotation.RequestScope"%>
<%@page import="com.lti.bean.UserDetails"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<!--  <html>
<head>
<meta charset="ISO-8859-1">
<title>Loan</title>
</head>
<body>
<h4>Apply Loan</h4>
<c:out value="${user.firstName}" />
<a href="eligibilityCal">Check your Eligibility!!!!!!!!!</a>


</body>
</html>-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style><%@ include file="/WEB-INF/views/css/emi.css" %></style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>
<title>Applicant Details</title>
</head>
<body>
<div>
<div class="scrollmenu">
    
<a href="#home">Home</a>
<a href="#emi">EMI Calculator</a>
<a href="#aboutus">About Us</a>
<a href="#login">Login</a>
<a href="personaldetail.jsp">Register</a>
<a class="right" href="applyloan.jsp" id="apply" >APPLY LOAN</a>
</div>
<center><h1> Eligibilty Criteria</h1></center>
<div id="myForm">
<ul style="list-style-type:disc;">
<li>
<h4>Must be at least 21 years old and not more than 70 years old when the loan matures.</h4>
</li>
<li>
<h4>The net annual salary should be at least Rs.2.4 lakh p.a.</h4>
</li>
<li>
<h4>Should be in continuous employment for at least 1 year</h4>
</li>
<li>
<h4>Income eligibility based on latest salary slip </h4>
</li>
</ul>
</div>
</div>
<br>
<br>

<div>
    <form id="myForm" action="eligibilityCal" method="post">
       <label><strong> Age:</strong></label><br>
       <input type="text" id= "eligage" placeholder="minimum 21" maxlength="2">
       <div id="validateage"></div>
       <br>
       <br>
       <label><strong>  Anuual Salary:</strong></label><br>
       <input type="text" id="elisalary" placeholder="example 3.4L as 340000" min="" >
       <div id="validatesal"></div>

       <br><br>
       
       <label><strong>  Employment type:</strong></label><br>
        <input type="radio" class="eliemptyp" name="eliemptyp" value="SELF-EMPLOYED"checked>SELF-EMPLOYED
        <input type="radio" class="eliemptyp" name="eliemptyp" value="SALARIED" >SALARIED
        
        <br><br>

        <label><strong> LOAN AMOUNT:</strong></label><br>
        <input type="text" id="loanamount" name="loanAmount" placeholder="example 3.4L as 340000" >
        <div id="loanvalidate" ></div>
        <br><br> 
        
        <label><strong> EXISTING EMI:</strong></label><br>
        <input type="text" id="existingemi" name="existingemi"  >
        <div id="existingemidiv" ></div>
        <br><br> 
        

        <strong>RATE OF INTEREST:</strong> (max 12% , multiples of 0.50%)<br>
        <input type="text" id="rateofinterest" name="roi" /><br>
        <div id="roivalidate"></div>
        <br>
        <strong>TENURE:</strong> (in months)<br>
        <input type="text" id="tenure" name="loanTenure" /><br>
        <input type="hidden" id="emi1" name="emi">
        <div id="tenurevalidate"></div>
        <br>        
                                          
        <center><input type="button" onclick="return eligibility();" value="CHECK">
            <br><br>    
            <div id="finalCheck"></div>  
        <strong> </strong><br>
        <div id="totalemi" style="background-color: blanchedalmond;width: 150px" ></div>
        

        <br><br>
        <center><input type="submit" id="disable" value="NEXT" disabled>

        
</form>
</div>
</body>
</html>