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
<script type="text/javascript"
	src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<div class="bar bar-header">
		<div class="h1 title">web应用开发</div>
	</div>
	<div class="content has-header ionic-pseudo">
		<div class="item item-divider">程序猿</div>
		<div class="list">
			<div style="text-align: center">
				<img alt="程序猿" src="../image/cxy.jpg">
			</div>
			<p>程序猿是一种非常特殊的、可以从事程序开发、维护的动物。</p>
			<p>一般分为程序设计猿和程序编码猿，但两者的界限并不非常清楚，都可以进行开发、维护工作。</p>
		</div>
		<div class="item item-divider">web开发程序猿</div>
		<div class="list">
			<div style="text-align: center">
			</div>
			<p>web开发程序猿是最为常见的一种程序猿，常年活跃于互联网一线。</p>
			<p>因其市场需求巨大，学习曲线较为平缓，经过二十多年的繁衍已经成为最为庞大的一种猿类。</p>
			<p>而技术的变迁，web开发衍生出庞大的技术栈，入门虽易，精通很难！</p>
		</div>
		<div class="item item-divider">web开发程序猿的一些指导</div>
		<div class="list">
			</div>
			<p>一切都得从基础抓起</p>
			<p>首先需要学习前端基础，html/css/javascript</p>
			<p>而后熟悉jquery/ajax/dom编程</p>
			<p>学习常用框架bootstrap/easyui</p>
			<p>学习后端typescript/node</p>
			<p>攻城狮必备vue.js/angular.js/react.js</p>
		</div>
		<div class="list">
			<div style="text-align: center">
			</div>
			<p>首先需要学习后端基础，javaSE/jdbc/j2EE/sql</p>
			<p>而后熟悉常用spring/mybatis/springmvc/hibernate框架</p>
			<p>熟悉分布式、缓存、消息队列hadoop/redis/mongodb/memcached/mq</p>
			<p>攻城狮必备rabbitMQ/spark/hdfs</p>
		</div>
		<div style="text-align: center">
		<img alt="学习路线图" src="../image/gcs.png">
		</div>
		<div class="item item-divider"></div>
	</div>
</body>
</html>