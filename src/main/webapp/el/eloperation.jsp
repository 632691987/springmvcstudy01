<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Request Scope</title>
</head>
<body>
<%
	java.util.List<String> names = new java.util.ArrayList<>();
	names.add("fwefwe");
	request.setAttribute("names",names);
%>

name is empty 此处是得到一个boolean 值: ${empty requestScope.names}<br />
name is empty 此处是得到一个boolean 值: ${empty requestScope.names2}<br />

</body>
</html>