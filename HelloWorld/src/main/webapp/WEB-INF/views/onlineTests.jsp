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
<title>《web应用开发》在线测试</title>
<link href="/HelloWorld/static/ionic/css/ionic.css" rel="stylesheet">
<script type="text/javascript" src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">

	//校验得分，显示答案
	function checkAnswer(){
		$(".init").css({"display":"none"});
		var total = 0;
		//获取单选框组答案，校验，累加得分
		$("input:radio:checked").each(function(index,domEle){
			var name = domEle.name;
			var answer = $("#"+name+"radio").val();
			var checked = domEle.value;
			if(answer==checked){
				total += 5;
				$("#"+name+"right").css({"display":"","color":"green"});
				console.log(index,"you are right",answer);
			}else{
				$("#"+name+"right").css({"display":"","color":"red"});
				$("#"+name+"reason").css({"display":""});
				console.log(index,"you are wrong,the right answer is",answer);
			}
		});
		var result = {};
		var answerTemp = "";
		var checkedTemp = "";
		var keyTemp = "";
		//获取复选框组选中的值
		$("input:checkbox").each(function(index,domEle){
			var name = domEle.name;
			var answer = $("#"+name+"check").val();
			//result[name] ? result[name] += domEle.value : result[name] = domEle.value;
			
			if(result[name] != undefined){
				if(domEle.checked == true){
					//result[name]已经定义，说明仍然在该复选框组中，值+=domEle.value
					result[name] += domEle.value;
					checkedTemp = result[name];
				}
			//如果result[name]没有定义，说明获取到了下一个复选框组，此时判断上一道题目回答是否正确,然后定义下一个复选框组
			}else{
				//
				for(var key in result){
					delete result[key];
				}
				//第一次进入该分支,即第一道题开始时，不校验
				if(index == 0){
					//定义第一个复选框组,初始化answerTemp,keyTemp;
					result[name] = '';
					if(domEle.checked == true){
						result[name] += domEle.value;
						checkedTemp = result[name];
					}
					answerTemp = answer;
					keyTemp = name;
				}else{
					//判断上一道题目是否回答正确
					if(answerTemp == checkedTemp){
						total += 15;
						console.log("last one question's answer right "+answerTemp,checkedTemp);
						//还原answerTemp和checkedTemp
						answerTemp='';
						checkedTemp='';
						$("#"+keyTemp+"right").css({"display":"","color":"green"});
					}else{
						$("#"+keyTemp+"right").css({"display":"","color":"red"});
						$("#"+keyTemp+"reason").css({"display":""});
						console.log(index,"you are wrong,the right answer is",answer);
					}
					//定义下一个复选框组,初始化answerTemp,keyTemp;
					result[name] = '';
					if(domEle.checked == true){
						result[name] += domEle.value;
						checkedTemp = result[name];
					}
					answerTemp = answer;
					keyTemp = name;
				}
			}		
		});
		//最后一题
		console.log(answerTemp);
		console.log(checkedTemp);
		if(answerTemp == checkedTemp){
			total += 10;
			$("#"+keyTemp+"right").css({"display":"","color":"green"});
			console.log("last question's answer right "+answerTemp);
		}else{
			$("#"+keyTemp+"right").css({"display":"","color":"red"});
			$("#"+keyTemp+"reason").css({"display":""});
			console.log("you are wrong,the right answer is");
		}
		if(total<60){
			alert("您本次测评结果为需改善，得分为"+total+",需要加油哦！");
		}
		if(80> total >=60){
			alert("您本次测评结果为良好，得分为"+total+",再接再厉哦！");
		}
		if(total>=80){
			alert("您本次测评结果为优秀，得分为"+total+",继续保持s哦！");
		}
	}
</script>
</head>
<body>
<div>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发在线测试</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">单选题,每小题5分</div>
		<div class="list">
		<form action="#" onsubmit="return false">
		<c:forEach items="${radio}" var="exer" varStatus="status">
			<section class="item" style="word-wrap:break-word;white-space:normal">${status.index+1}. ${exer.question}
				(&nbsp;<strong class="init" id="${exer.id }right" style="display:none">${exer.answer }</strong>&nbsp;)
			 </section>
			<ul >
			<li><input type="hidden" id="${exer.id }radio" value="${exer.answer }"></li>
			<li><input type="radio" name="${exer.id }" value="A"/>A:${exer.optionA }</li>
			<li><input type="radio" name="${exer.id }" value="B"/>B:${exer.optionB }</li>
			<li><input type="radio" name="${exer.id }" value="C"/>C:${exer.optionC }</li>
			<li><input type="radio" name="${exer.id }" value="D"/>D:${exer.optionD }</li>
			<li id="${exer.id }reason" class="init" style="display:none">
			<section style="color:red">
				正确答案为：${exer.answer }<br>
				原因：${exer.reason }
			</section></li>
			</ul>
		</c:forEach>
		<div class="item item-divider">多选题，每小题10分，错选或少选不得分</div>
		<c:forEach items="${checkbox}" var="exer" varStatus="status">
			<section class="item">${status.index+1}. ${exer.question}
				(&nbsp;<strong class="init" id="${exer.id }right" style="display:none">${exer.answer }</strong>&nbsp;)
			 </section>
			<ul>
			<li><input type="hidden" id="${exer.id }check" value="${exer.answer }"></li>
			<li><input type="checkbox" name="${exer.id }" value="A" />A:${exer.optionA }</li>
			<li><input type="checkbox" name="${exer.id }" value="B" />B:${exer.optionB }</li>
			<li><input type="checkbox" name="${exer.id }" value="C" />C:${exer.optionC }</li>
			<li><input type="checkbox" name="${exer.id }" value="D" />D:${exer.optionD }</li>
			<li  id="${exer.id }reason" class="init" style="display:none" >
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
	</div>
</body>
</html>