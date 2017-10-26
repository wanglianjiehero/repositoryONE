<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.bootcss.com/angular.js/1.6.3/angular.min.js"></script>

<title>Insert title here</title>
</head>

<body>
	<%--  <form  id=form action="user/selectUser.do" ng-app="myApp" ng-controller="validateCtrl" 
name="myForm" novalidate method="post">
                  	   姓名：
					<input type="text" id=userName   name="userName" value="${userName }" />
				<!-- 	 角色: 
					<select name="roleId" id="roleId">
					</select> -->
                    <input value="查询" type="submit" class="btn btn-primary"/>
               </form> --%>
	<div ng-app="myApp" ng-controller="customersCtrl"> 

<table>
  <tr ng-repeat="x in names">
    <td>{{ x.userId }}</td>
    <td>{{ x.userName }}</td>
  </tr>
</table>

</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.post("user/user.do?userName=2")
    .then(function (result) {
        $scope.names = result.data;
    });
});
</script>
</body>
</html>