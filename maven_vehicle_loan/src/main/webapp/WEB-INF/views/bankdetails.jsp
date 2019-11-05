<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	....

<form id="myForm"  method="post">
	<div id="header">Bank Details</div>
	<div>
		<label class="form_lab required">Do you have a bank Account
			???</label>
	</div>
	
		<div>
			<input type="radio" onclick="javascript:yesnoCheck();"
				name="quesResponse" value="Yes" id="yesCheck">Yes</input>
		</div>
		<div>
			<input type="radio" onclick="javascript:yesnoCheck();"
				name="quesResponse" value="No" id="noCheck">No</input>
		</div>



		<div id="ifYes" style="display: none">
			ACCOUNT EXIST

			<div>
				<div>
					Bank Account no:<input type="text" name="existingAccountNo">
				</div>
				<div>
					Account Name:<input type="text" name="accountName">
				</div>
				<div>
					IFSC code:<input type="text" name="ifscCode">
				</div>
				<div>
					<input type="hidden" name="email" value="${sessionScope.email}">
				</div>
				<div>
					<input type="hidden" name="balance" value=768>
				</div>
				<div>
				<input type="submit" formaction="bankdetails">
				</div>

			</div>



		</div>

		<div id="ifNo" style="display: none">Request sent for new Bank
			account.....Confirmation mail will be sent once approved</div>
		
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