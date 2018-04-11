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
	content="initial-scale=1, maximum-scale=1,width=device-width">
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
		<div class="item item-divider">教师信息</div>
		   <div class="list">
	        <a class="item item-thumbnail-left" href="#">
          <img src="${APP_PATH }/HelloWorld/${teacher.photo}">
          <h2>姓名：${teacher.name }</h2>
          <p>职称：${teacher.level }</p>
		<p>院校：${teacher.school }</p>
        </a>
          <p class="item">联系方式：${teacher.contact }</p>
        <label class="item">${teacher.history }</label>
        </div>
        <div class="list">
			<span class="item">111</span>
        </div>
	</div>
</body>
</html>