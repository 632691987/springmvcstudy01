<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Request Scope</title>
</head>
<body>
<!-- 
用URL: 
http://localhost:8080/basic_xml/el/requestScope.jsp?score=81&abc=123&def=4av&def=ghj
测试Param
 -->
<a href="${pageContext.request.contextPath }/elrequestScope01">test basic redirect</a><br />

<!-- EL 表达式进行运算 -->
score: ${param.score+11}<br /><br /><br /><br />

<!-- 知识点三：当URL 为 abc 这个 parameter 并且唯一的时候，用param.abc -->
${param.abc}<br />
<!-- 知识点四：当URL 为def, 而这个参数并不唯一，有两个“..cope.jsp?score=81&abc=123&def=4av&def=ghj”
此时，用paramValues.def[index]
 -->
${paramValues.def[0]}<br />
${paramValues.def[1]}<br />

<!-- 知识点五：关系运算符,注意，及格或者不及格，是直接输出的。 -->
${param.score > 60 ? "及格":"不及格" }<br /><br /><br /><br />
</body>
</html>