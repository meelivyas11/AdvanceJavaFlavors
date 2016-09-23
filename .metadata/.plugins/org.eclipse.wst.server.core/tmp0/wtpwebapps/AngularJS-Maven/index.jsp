<%@page
	import="org.apache.catalina.startup.ClassLoaderFactory.Repository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:bundle basename="myproperties">
	<fmt:message var="angularjsVersion" key="angularjs.version" />
	<fmt:message var="bootstrapVersion" key="bootstrap.version" />

	<script
		src='./webjars/angularjs/<fmt:message key='angularjs.version'/>/angular.js'></script>
	<link rel='stylesheet'
		href='./webjars/bootstrap/<fmt:message key='bootstrap.version'/>/css/bootstrap.min.css'>
</fmt:bundle>

<!-- Manually added JS file to call myController -->
<script src="<c:url value='/static/js/script.js' />"></script>


</head>
<body>
	<div ng-app>10+ 5 = {{ 10+5 }}</div>

	<div ng-controller="myFirstController">{{ message }}</div>

</body>
</html>