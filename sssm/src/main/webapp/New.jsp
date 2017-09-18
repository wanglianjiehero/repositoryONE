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
<script type="text/javascript">
function toDestop(sUrl,sName){
	try{
		var WshShell=new ActiveXObject("WScript.Shell");
		var oUrlLink = WshShell.CreateShortcut(WshShell.SpecialFolders("Desktop")+"\\"+sName+".url");
		oUrlLink.TargetPath=sUrl;
		oUrlLink.Save();
	}catch(e){
		alert("当前的IE安全级别不允许操作");
	}
	
}
</script>
<body>
 <button onclick="toDestop('www.baidu.com','百度')">添加桌面快捷方式</button>
</body>
</html>