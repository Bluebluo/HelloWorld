<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setAttribute("APP_PATH", request.getContextPath()); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form id="loginForm">
		用户名<input type="text" name="userName" id="username" />
		<br/>
		密码<input type="password" id="password" name="userPwd"/>
		<input type="submit" value="提交" onclick="login()"/>
	</form>

<script type="text/javascript">
	function login(){
		var s = ${accessToken};
		alert($("#loginForm").serialize());
		$.ajax({
			url:"${APP_PATH}/login",
			data:$("#loginForm").serialize(),
			type:"POST",
			success:function(result){
				alert(result.extend.stu.userName);
			},
		})
	}
</script>

</body>
<script type="text/javascript" src="/HelloWorld/static/js/jquery-3.1.1.min.js"></script>
</html>