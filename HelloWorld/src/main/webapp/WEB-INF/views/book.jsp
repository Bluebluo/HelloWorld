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
<meta name="referrer" content="always">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<meta name="format-detection" content="telephone=no">
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
		<div class="item item-divider">书籍</div>
		<a class="item item-thumbnail-left"
			href="https://www.baidu.com/s?wd=${book.name}"> <img
			src="/HelloWorld/${book.photo}">
			<h2>${book.name}</h2>
			<p>${book.author }</p>
			<p>${book.text }</p>
			<a href="${APP_PATH }/HelloWorld/downloadFile?name=${book.url}">点击下载电子版</a>
		</a>
		<section class="item">
			单价：${book.price } <a
				href="http://search.dangdang.com/?key=${book.name}">去购买</a>
		</section>
		<section>${book.introduce }</section>
	</div>
</body>
</html>