<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${message}</h2><br><br>
<fieldset style="width:40%;">
<legend>File Upload</legend>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
File to Upload:<input type="file" required="required" name="files">


File to Upload:<input type="file" required="required" name="files"><br/><br/>
Description:<input type="text" name="description"><br/><br/>

File to Upload:<input type="file" required="required" name="files"><br/><br/>
Description:<input type="text" name="description"><br/><br/>

File to Upload:<input type="file" required="required" name="files"><br/><br/>
Description:<input type="text" name="description"><br/><br/>

File to Upload:<input type="file" required="required" name="files"><br/><br/>
Description:<input type="text" name="description"><br/><br/>

File to Upload:<input type="file" required="required" name="files"><br/><br/>
Description:<input type="text" name="description"><br/><br/>

File to Upload:<input type="file" required="required" name="files"><br/><br/>
Description:<input type="text" name="description"><br/><br/>
<input type="submit" value="Upload">


</form>
</fieldset>
</body>
</html>