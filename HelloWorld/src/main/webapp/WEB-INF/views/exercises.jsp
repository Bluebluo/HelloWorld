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
<script type="text/javascript">

	function checkAnswer(){
		$("input:radio:checked").each(function(index,domEle){
			var s = "#"+index+"answer"
			var answer = $(s).val();
			var checked = domEle.value;
			if(answer==checked){
				$("#"+index+"right").css({"display":"","color":"green"});
				console.log("you are right",answer);
			}else{
				$("#"+index+"right").css({"display":"","color":"red"});
				$("#"+index+"reason").css({"display":""});
				console.log("you are wrong right answer is",answer);
			}
		});
		
	}
	
	/*$(function() {
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
				$("<a></a>").append(result.name + "大纲  点击下载").attr({
					"href" : '${APP_PATH}/HelloWorld/data/outline.doc'
				}));
		introduceSec.appendTo(introduceDiv);
		outlineSec.appendTo(outlineDiv);
	}*/
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">练习题</div>
		<div class="list">
		<form action="#" onsubmit="return false">
		<c:forEach items="${exercises}" var="exer" varStatus="status">
			<section class="item">${status.index+1}. ${exer.question}
				(&nbsp;<strong id="${status.index }right" style="display:none">${exer.answer }</strong>&nbsp;)
			 </section>
			<ul>
			<li><input type="hidden" id="${status.index }answer" value="${exer.answer }"></li>
			<li><input type="radio" name="${exer.id }" value="A" required="required"/>A:${exer.optionA }</li>
			<li><input type="radio" name="${exer.id }" value="B" required="required"/>B:${exer.optionB }</li>
			<li><input type="radio" name="${exer.id }" value="C" required="required"/>C:${exer.optionC }</li>
			<li><input type="radio" name="${exer.id }" value="D" required="required"/>D:${exer.optionD }</li>
			<li id="${status.index }reason" style="display:none">
			<section style="color:red">
				正确答案为：${exer.answer }<br>
				原因：${exer.reason }
			</section></li>
			</ul>
		</c:forEach>
		<button onclick="return checkAnswer()">做完了，看答案</button>
		</form>
		</div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>