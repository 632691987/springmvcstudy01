<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Request Scope testing</title>
</head>
<body>
${requestScope.time}<br />

<!-- 
知识点一：
如果域对象中的属性名带有特殊字符，则使用[] 运算符会比较方便
-->
以两种形式不同来表现user.username:<br />
第一种：${requestScope.user.username }<br />
第二种：${requestScope.user["username"] }<br />

<!-- 知识点二：也可以直接写user.username
因为此时并没有指定是什么域，因此server 逻辑上就是 Request / Session / Application 一直往下找。直到找到位置，或者为 null
 -->
<br /><br /><br />
${user.username }<br />

</body>
</html>