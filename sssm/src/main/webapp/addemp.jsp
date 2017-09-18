<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>

<head>
	<base href="<%=basePath%>">
	<meta charset="utf-8" />
	
	<meta name="viewport"
		content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
	<title>123</title>
	<script src="js/jquery-3.2.1.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<div class="container">
		<form action="empController" method="post">
			<input type="text" name="empname" >
			<select id="dept" name="dept">
			
			
			</select>
		</form>
	
	</div>
</body>
</html>