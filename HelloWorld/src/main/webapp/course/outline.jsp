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
		var guideDiv = $("#guideDiv");
		var outlineDiv = $("#outlineDiv");
		var guideSec = $("<section></section>").addClass("item").append(
				$("<a></a>").append(result.testGuideBook)
				.attr({"href":"https://www.baidu.com/s?wd="+result.testGuideBook}));
		var buyTeach = $("<a></a>").addClass("item").append("点击购买")
		.attr({"href":"http://search.dangdang.com/?key="+result.testGuideBook});
		var outlineSec = $("<section></seciton>").addClass("item").append(
				$("<a></a>").append(result.name + "实验大纲  点击下载").attr({
					"href" : '${APP_PATH}/HelloWorld/downloadFile?name='+result.testOutLine
				}));
		buyTeach.appendTo(buyTeachDiv);
		guideSec.appendTo(guideDiv);
		outlineSec.appendTo(outlineDiv);
	}
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">实验指导书</div>
		<div class="row">
		<div class="col col-60"  id="guideDiv"></div>
		<div class="col" id="buyTeachDiv"></div>
		</div>
		<div class="item item-divider">实验大纲</div>
		<div class="list" id="outlineDiv">
		</div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>