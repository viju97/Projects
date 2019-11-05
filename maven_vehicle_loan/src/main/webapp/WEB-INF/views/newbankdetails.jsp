<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
<%@ include file="/WEB-INF/views/css/emi.css"%>
</style>
<script><%@ include file="/WEB-INF/views/js/emi.js" %></script>
<title>Bank Details</title>

</head>
<body>
	<form id="myForm" method="post">
		<div id="header">Bank Details</div>

		<div class="form_fiels">
			<div class="outer">
				<div class="inner">
					<label class="form_lab required">Do you have a bank Account
						???</label>
				</div>
				<div class="inner">
					<input type="radio" onclick="javascript:yesnoCheck();"
						name="quesResponse" value="Yes" id="yesCheck">Yes<br>
					<input type="radio" onclick="javascript:yesnoCheck();"
						name="quesResponse" value="No" id="noCheck">No
				</div>

				<div id="ifYes" style="display: none">
					<div class="outer">
						<label class="form_lab">Account Name :</label>
						<div class="inner required">
							<input type="text" id="bankName" name="accountName" value="">
						</div>

					</div>
					<br />
					<div class="outer">
						<label class="form_lab">Account Number :</label>
						<div class="inner required">
							<input type="text" id="accountNo" name="existingAccountNo" value="">
						</div>

					</div>
					<br />
					<div class="outer">
						<label class="form_lab">IFSC Number :</label>
						<div class="inner required">
							<input type="text" id="ifscCode" name="ifscCode" value="">
						</div>

					</div>
					<br />
					<input type="hidden" name="userId" value="">
					 <input type="submit" id="nextBtn" name="nextBtn" value="Next" formaction="bankDetails">
				</div>


				<div id="ifNo" style="display: none">
					<br />
					<p align="center">Its OK !!! We will create Account for you .</p>
					<input type="submit" id="nextBtn" name="nextBtn" value="Next"
						formaction="bankNewDetails">
				</div>

			</div>
			<div class="formaction">
				<div class="outer">
					<!-- input type="submit" id="nextBtn" name="nextBtn" value="Next"-->
				</div>


			</div>

		</div>
	</form>
	<script type="text/javascript">
		function yesnoCheck() {
			if (document.getElementById('yesCheck').checked) {
				document.getElementById('ifYes').style.display = 'block';
				document.getElementById('ifNo').style.display = 'none';
			} else {
				document.getElementById('ifNo').style.display = 'block';
				document.getElementById('ifYes').style.display = 'none';
			}

		}
	</script>

</body>
</html>