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
	<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8">	</script>
</head>
<style type="text/css">
	div[class^=row] {
		border: 1px solid blue;
	}
</style>
<script type="text/javascript">
	function submit1(){	
		alert($("#from2").serialize());
		$("#emps").val($("#from2").serialize());
		
		$("#from").submit();
		
		/* $.post("userController/listUser.do",$("#from").serialize()); */
		
	};
	function querySum(){
		$("#uid").val("");
		$("#uname").val("");
		$("#uage").val("");	
		/* alert($("#from").serialize()); */
		$("#from").submit();
	};
	function submit2(){	
		
		
		$("#from2").submit();
	};
	function querySum2(){
		$("#empid").val("");
		$("#empname").val("");
		$("#deptid").val("");	
		$("#from2").submit();
	};
</script>
<body>
	<div class="container">
		<div class="row">
			<form id="from" action="userController/listUser.do" method="post">
			<input type="hidden" value="" id="emps" name="emps">
				<div class="col-sm-2">
					<input type="text" name="uid" id="uid" value="${uid}"
						placeholder="用户编号" />
				</div>
				<div class="col-sm-2">
					<input type="text" name="uname" id="uname" value="${uname}"
						placeholder="用户姓名" />
				</div>
				<div class="col-sm-2">
					<input type="text" name="uage" id="uage" value="${uage}"
						placeholder="用户年龄" />
				</div>
				<div class="col-sm-2">
					<input type="radio" name="shunxu" id="shunxu" value="0" onchange="submit()"
						<c:if test="${shunxu eq 1 }"></c:if> checked="checked" />顺序 <input
						type="radio" name="shunxu" id="shunxu" value="1" onchange="submit()"
						<c:if test="${shunxu eq 1 }">checked="checked"</c:if> />倒序
				</div>

				<div class="col-sm-2">
					<button  class="btn btn-default" onclick="submit1()">查询</button>
					<button  class="btn btn-default" onclick="querySum()">查询全部</button>
				</div>
			</form>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<table border="1">
					<tr>
						<th>用户编号</th>
						<th>用户姓名</th>
						<th>用户年龄</th>
					</tr>
					<c:forEach items="${users }" var="item">
						<tr>
							<td>${item.uid }</td>
							<td>${item.uname }</td>
							<td>${item.uage }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		
		
	<div class="row">
			<form id="from2" action="empController/getAllemp.do" method="post">
				<div class="col-sm-2">
					<input type="text" name="empid" id="empid" value="${empid}"
						placeholder="员工编号" />
				</div>
				<div class="col-sm-2">
					<input type="text" name="empname" id="empname" value="${empname}"
						placeholder="员工姓名" />
				</div>
				<div class="col-sm-2">
					<input type="text" name="deptid" id="deptid" value="${deptid}"
						placeholder="部门编号" />
				</div>
			
				<div class="col-sm-2">
					<button  class="btn btn-default" onclick="submit2()">查询</button>
					<button  class="btn btn-default" onclick="querySum2()">查询全部</button>
				</div>
			</form>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<table border="1">
					<tr>
						<th>员工编号</th>
						<th>员工姓名</th>
						<th>部门编号</th>
					</tr>
					<c:forEach items="${emps }" var="item">
						<tr>
							<td>${item.empid }</td>
							<td>${item.empname }</td>
							<td>${item.deptid }</td>
						</tr>
					</c:forEach> 
			</div>
		</div>

		<!-- <div class="row">
			<form action="userController/upload.do" method="post"
				enctype="multipart/form-data">
				<div class="col-sm-8">
					<input type="file" name="file">
				</div>
				<div class="col-sm-2">
					<button  class="btn btn-default" type="submit">上传</button>
				</div>
			</form>
		</div> -->
	</div>
</body>

</html>