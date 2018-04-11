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
			url : '${APP_PATH}/HelloWorld/sections',
			dataType : 'json',
			type : 'post',
			success : function(result) {
				if (result.code == 200) {
					buildInfo(result.extend.sections);
				}
			}
		})
	});

	function buildInfo(result) {
		var pointDiv = $("#pointDiv");
		$.each(result,function(index,item){
			var pointSec = $("<section></section>").addClass("item")
			.append(item.title+"重点难点解析  ").append(
				$("<a></a>").append("点击下载").attr({
					"href" : '${APP_PATH}/HelloWorld/downloadFile?name='+item.pointAnalyze
				}));
			pointSec.appendTo(pointDiv);
		});
	}
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">重点难点解析</div>
		<div class="list" id="pointDiv"></div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>