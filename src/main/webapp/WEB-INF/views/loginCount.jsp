<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>User login count page</title>
</head>
<body>
你登陆的名字是: ${requestScope.sessionLoginBean.username } <br />
你总共登陆的次数: ${requestScope.sessionLoginBean.touchCount } <br />

<a href="${pageContext.request.contextPath }/sessionbeanscope1.jsp">come back</a><br />
<a href="${pageContext.request.contextPath }/sessionbeanscope2.jsp">Go to check username</a>
</body>
</html>