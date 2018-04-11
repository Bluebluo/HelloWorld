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
	$(function() {
		$.ajax({
			url : '${APP_PATH}/HelloWorld/hello',
			dataType : 'json',
			type : 'post',
			success : function(result) {
				buildLi(result);

			}
		})
	});

	function buildLi(result) {
		$.each(result, function(index, item) {
			var li = $("<a></a>").addClass("item item-avatar").attr({"href":'${APP_PATH }/HelloWorld/teacher/'+item.id});
			var img = $("<img>").attr({"src":'${APP_PATH }/HelloWorld'+item.photo});
			var h2 = $("<h2></h2>").append(item.name);
			var p = $("<p></p>").append(item.school + "  " + item.level);
			li.append(img).append(h2).append(p).appendTo($("#teacherDiv"));
			/*var floor = $("<div></div>").addClass("item item-toggle").append($("<span></span>")
				.append(item.name + " " + item.level + "  " + item.school));
			var label = $("<label></label>").addClass("toggle");
			var input = $("<input type='checkbox'>");
			var div = $("<div></div>").addClass("track").append($("<div></div>").addClass("handle"));
			label.append(input).append(div);
			label.appendTo(floor);
			floor.appendTo(li);
			var parent = $("<div></div>").addClass("row");
			input.on("click", function() {
				if(this.checked==true){
					var left = $("<div></div>").addClass("col col-75").css({"flex-wrap":"wrap"});
					var right = $("<div></div>").addClass("col col-25");
					var img = $("<img>").attr({
						"src" : 'http://localhost:8080/HelloWorld/image/yena.png',
						"alt" : item.name
					}).css({
						"width" : "66px",
						"height" : "70px"
					});
					var line1 = $("<span></span>").addClass("item").append("教授课程："+item.teachcls);
					var line2 = $("<span></span>").append("联系方式：" + item.contact);
					var line3 = $("<span></span>").append("个人履历："+ item.history);
					left.append(line1).append($("<br>"))
						.append(line2).append($("<br>"))
						.append(line3).appendTo(parent);
					right.append(img).appendTo(parent);
				}else{
					parent.empty();
				}
			});
			parent.appendTo(li);
			li.appendTo($("#teacherUl"));
		});*/
	});
	}

</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">西安建筑科技大学</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">教师列表</div>
		<div class="list" id="teacherDiv"></div>
		<div class="item item-divider">Candy Bars</div>
	</div>
</body>
</html>