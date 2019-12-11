<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/bootstrap/easyui.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/setRole.css" />
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/verificationNumbers.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Particleground.js" ></script>
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/setRole.js"></script>
<body>
<table id="users"></table>
<div id="RoleWindow">
<span id="sp">请点击所要设置的权限</span >
<table id="roles"></table>
</div>

</body>
</html>