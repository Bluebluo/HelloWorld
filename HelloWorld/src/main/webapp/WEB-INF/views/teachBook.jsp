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
<script type="text/javascript"
	src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">教材</div>
		<div class="list">
			<c:forEach items="${teachBooks }" var="x" varStatus="status">
				<a class="item item-thumbnail-left"
					href="${APP_PATH }/HelloWorld/book/${x.id}"> <img
					src="${APP_PATH }/HelloWorld/${x.photo}">
					<h2>${x.name}</h2>
					<p>${x.author }</p>
				</a>
			</c:forEach>
		</div>
		<div class="item item-divider">参考书目</div>
		<div class="list">
			<c:forEach items="${guideBooks }" var="x" varStatus="status">
					<a class="item item-thumbnail-left"
					href="${APP_PATH }/HelloWorld/book/${x.id}"> <img
					src="${APP_PATH }/HelloWorld/${x.photo}">
					<h2>${x.name}</h2>
					<p>${x.author }</p>
				</a>
			</c:forEach>
		</div>
		<div class="item item-divider"></div>
		</div>
</body>
</html>