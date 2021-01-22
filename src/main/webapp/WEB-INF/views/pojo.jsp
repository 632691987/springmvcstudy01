<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
username: ${requestScope.userobject.username } <br />
password: ${requestScope.userobject.password } <br />
email:    ${requestScope.userobject.email } <br />
country:  ${requestScope.userobject.address.country } <br />
province: ${requestScope.userobject.address.province } <br />
city:     ${requestScope.userobject.address.city } <br />
detail:   ${requestScope.userobject.address.detail } <br />

For arraylist object:(for using PojoController)<br />
${requestScope.names[0]}<br />
${requestScope.names[1]}<br />
${requestScope.names[2]}<br />

For arraylist object:(for using ModelAndViewController)<br />
${stringList[0]}<br />
${requestScope.stringList[1]}<br />
${requestScope.stringList[2]}<br />
${vincentuser.username}
</body>
</html>