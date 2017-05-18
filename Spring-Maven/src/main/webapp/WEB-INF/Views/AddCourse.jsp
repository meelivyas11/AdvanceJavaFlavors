<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Course</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>
</head>
<body>
<div>
	<div id="ShowStatus">
		<c:if test="${isCourseCreated == true}"> 
				<p style="color: green; font-weight: bold;">Course Created Successfully </p> 
		</c:if>
	</div>
	<div id="AddCourse" class="container text-left row">
	<c:set var="contextPath" value="<%=request.getContextPath() %>" /> 
		 <form:form modelAttribute="NewCourse" action="${contextPath}/ProfessorController/AddCourse" method="post">
			<div class="col-sm-10"> Course Name: <form:input path="name" /> </div> 
			<div class="col-sm-10"> Course Code : <form:input  path="code"  /></div> 
			<div class="col-sm-10">Description : <form:input  path="description" /></div>
			<div class="col-sm-10">Term : <form:input path="term"  /></div>
			<div class="col-sm-10"><input type="submit" name="submit" value="Add Course"> </div>
		</form:form> 
	</div>
</div>

</body>
</html>