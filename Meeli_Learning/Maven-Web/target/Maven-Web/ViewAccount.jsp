<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page import="com.collaborative.domain.Contact"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Contact c = (Contact) request.getAttribute("ContactObj");
		String fName = c.getFirstName();
		String lName = c.getLastName();
		String email = c.getEmail();
		String phone = String.valueOf(c.getPhoneNumber());
	%>

<h1> This is a View Page</h1>
First Name: <%=fName%> <br>
Last Name: <%=lName%> <br> 
Email : <%=email %> <br>
Phone Number: <%=phone%> <br> 
</body>
</html>