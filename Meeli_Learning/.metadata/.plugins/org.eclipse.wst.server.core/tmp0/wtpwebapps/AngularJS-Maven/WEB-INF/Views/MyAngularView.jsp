<%@page
	import="org.apache.catalina.startup.ClassLoaderFactory.Repository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJs View</title>
<!-- <script type="text/javascript" src="js/angularjs"></script>
 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:bundle basename="myproperties">
	<fmt:message var="angularjsVersion" key="angularjs.version" />
	<script src='./webjars/angularjs/<fmt:message key='angularjs.version'/>/angular.js'></script>
</fmt:bundle>


</head>
<body>
	<div>10+ 5 = {{10+5}}</div>

</body>
</html>