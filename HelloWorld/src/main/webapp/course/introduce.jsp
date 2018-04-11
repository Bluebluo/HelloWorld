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
	content="initial-scale=1, maximum-scale=1, width=device-width">
<title>《web应用开发》</title>
<link href="/HelloWorld/static/ionic/css/ionic.css" rel="stylesheet">
<script type="text/javascript" src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : '${APP_PATH}/HelloWorld/introduce',
			dataType : 'json',
			type : 'post',
			success : function(result) {
				if (result.code == 200) {
					buildInfo(result.extend.introduce);
				}
			}
		})
	});

	function buildInfo(result) {
		var introduceDiv = $("#introduceDiv");
		var outlineSec = $("#outlineDiv");
		var introduceSec = $("<section></section>").append(
				$("<p></p>").append(result.introduce));
		var outlineSec = $("<section></seciton>").append(
				$("<a></a>").append(result.name + "  大纲  点击下载").attr({
					"href" : '${APP_PATH}/HelloWorld/downloadFile?name='+result.outLine
				})).addClass("item");
		introduceSec.appendTo(introduceDiv);
		outlineSec.appendTo(outlineDiv);
	}
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">课程简介</div>
		<div class="list" id="introduceDiv"></div>
		<div class="item item-divider">课程大纲</div>
		<div class="list" id="outlineDiv">
		</div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>