<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WHEEL ON LOAN</title>
<style><%@ include file="/WEB-INF/views/css/emi.css" %></style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>

<%-- <link href="${pageContext.request.contextPath}/resources/css/emi.css"
rel="stylesheet"> --%>
<link rel="stylesheet" type="text/css" href="D:\vijitworkspace\maven_vehicle_loan\src\main\webapp\WEB-INF\css\emi.css">

<script type="text/javascript" src="js/emi.js"></script>
<style>
[title] {
    border-bottom: none !important;
    cursor: inherit !important;
    text-decoration: none !important;
    
  }
 
</style>
<style> </style>
</head>
<body>
<div>
<div class="scrollmenu">
    
<a href="#home" id="home" class="right">Home</a>
<a class="right" href="applyloan.html" id="apply" >Register</a>
</div>
    <center><h2> LOGIN</h2></center>
        <form  id="myForm" action="login" method="POST" onsubmit=" return loginvalidate();">
                <center>    <strong>EMAIL</strong><br>
                    <input type="text" id="email" name="email" /><br>
                    <div id="loginvalidate"></div></center>
                    <br><br>
                    <center> 
                    <strong><abbr title="Should contain atleast one Uppercase,one Lowercase,One numeric,One Special character">PASSWORD</abbr></strong><br>
                    <input type="text" id="password" name="password" placeholder="minimum 6 characters"/><br>
                    <div id="passvalidate"></div>
                    <br> 
                    <br>
                    </center> 
                   
                                        
            <center><input type="SUBMIT"  value="SIGN IN">
           
     <!--       <br>  Forgot password???
    <a href="forgotpassword.html"> Click here..</a>
            </form>
    -->
</div>
</body>
</html>