<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String APP_PATH = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
<title>教师信息列表</title>
<link href="/HelloWorld/static/ionic/css/ionic.css" rel="stylesheet">
<script type="text/javascript" src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		window.setTimeout(function(){
			window.location.href="${APP_PATH}/HelloWorld/course/introduce.jsp";
		},3000);
	});
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">丢失了。。</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">sorry</div>
		<div class="list" id="teacherDiv">
			三秒后跳回首页面。。。
		</div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>