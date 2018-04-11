<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String APP_PATH = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, width=device-width">
<title>《web应用开发》</title>
<link href="/HelloWorld/static/ionic/css/ionic.css" rel="stylesheet">
<script type="text/javascript" src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">${section.title}</div>
		<div class="list">
		<ul class="list">
		<li class="item">
			<video width="320" height="240" controls>
				<source src="${section.courseVideo}" type="video/mp4">
				<source src="${section.courseOgg}" type="video/ogg">
			</video>
		</li>
		<li><a href="${section.coursePpt}">课件下载</a></li>
		</ul>
		<div class="item item-divider">
		<center><span href="#" onclick="history.go(-1)">返回上一页</span></center>
		</div>			
		</div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>