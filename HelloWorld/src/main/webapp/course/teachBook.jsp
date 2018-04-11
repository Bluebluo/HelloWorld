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
		var teachDiv = $("#teachDiv");
		var guideDiv = $("#guideDiv");
		var buyTeachDiv = $("#buyTeach");
		var buyGuideDiv = $("#buyGuide");
		var teachSec = $("<section></section>").append(
				$("<a></a>").append(result.teachBook)
				.attr({"href":"https://www.baidu.com/s?wd="+result.teachBook}));
		var buyTeach = $("<a></a>").append("点击购买")
				.attr({"href":"http://search.dangdang.com/?key="+result.teachBook});
		var guideSec = $("<section></section>").append(
				$("<a></a>").append(result.teachGuideBook)
				.attr({"href":"https://www.baidu.com/s?wd="+result.teachGuideBook})
			);
		var buyGuide = $("<a></a>").append("点击购买")
				.attr({"href":"http://search.dangdang.com/?key="+result.teachBook});
		teachSec.appendTo(teachDiv);
		buyTeach.appendTo(buyTeachDiv);
		guideSec.appendTo(guideDiv);
		buyGuide.appendTo(buyGuideDiv);
	}
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">教材</div>
			<div class="row">
				<div class="col col-60" id="teachDiv"></div>
				<div class="col" id="buyTeach"></div>
			</div>
		<div class="item item-divider">参考书目</div>
		<div class="row">
			<div class="col col-60" id="guideDiv"></div>
			<div class="col" id="buyGuide"></div>
		</div>
		<div class="item item-divider"></div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>