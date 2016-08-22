<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="border: thick black;">
	<form name="UserInfo" action="AccountController" method="post">
		First Name: <input type="text" name="firstName" id="firstName">
		<br>
		Last Name : <input type="text" name="lastName" id="lastName"> <br>
		Email Address: <input type="text" name="email" id="email"> <br>
		Phone Number: <input type="text" name="phoneNumber" id="phoneNumber"> <br>
		<input type="submit" name="Submit" value="Submit">
	</form>
</body>
</html>