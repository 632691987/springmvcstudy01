<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Model Attributes</title>
</head>
<body>
<!-- 此处为模拟表单操作 -->
<form action="${pageContext.request.contextPath }/modelAttributes" method="post">
	<input id="id" name="id" value="123" /><br /><br />
	<input id="attrKey1" name="attrKey1" value="keyvalue1" /><br /><br />
	<input id="attrKey3" name="attrKey3" value="keyvalue3" /><br /><br />
	<input type="submit" value="Submit"/>
</form>
</body>
</html>