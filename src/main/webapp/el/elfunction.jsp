<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://basic_xml/myElFuns" prefix="elPrifix"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Request Scope</title>
</head>
<body>
<!-- 
制作EL 函数的步骤：
1, 建立一个普通的 Java 类，以及一个静态方法。
2, 建立一个相对应的 tld 文件, 文件里面记录了 Java 的类名，函数的签名方法以及该函数的名字（tld 里对该函数的别名）
3, 把 tld 文件记录在 web.xml 里面。
4, 建立 JSP 文件，并且 2，3，4步里面的URI 的值是一样的。(http://basic_xml/myElFuns)
-->
${elPrifix:appendString("abc","def")}

</body>
</html>