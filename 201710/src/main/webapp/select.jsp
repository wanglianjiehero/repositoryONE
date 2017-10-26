<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.bootcss.com/angular.js/1.6.3/angular.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	 <form  id=form action="user/selectUser.do" ng-app="myApp" ng-controller="validateCtrl" 
name="myForm" novalidate method="post">
                  	   姓名：
					<input type="text" id=userName   name="userName" value="${userName }" />
				<!-- 	 角色: 
					<select name="roleId" id="roleId">
					</select> -->
                    <input value="查询" type="submit" class="btn btn-primary"/>
               </form>
	
	<div ng-app="myApp" ng-controller="customersCtrl"> 

<table>
  <tr ng-repeat="x in names">
    <td>{{ x.Name }}</td>
    <td>{{ x.Country }}</td>
  </tr>
</table>
</body>
</html>