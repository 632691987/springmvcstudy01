<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL - Core</title>
</head>
<body>
<!-- 
URL:
http://localhost:8080/basic_xml/jstl/core/cchoose.jsp?salary=3
http://localhost:8080/basic_xml/jstl/core/cchoose.jsp?salary=-10
http://localhost:8080/basic_xml/jstl/core/cchoose.jsp?salary=1200
 -->
<c:set var="salary" scope="session" value="${param.salary}"/>
<p>Your salary is : <c:out value="${salary}"/></p>
<c:choose>
    <c:when test="${salary <= 0}">
       Salary is very low to survive.
    </c:when>
    <c:when test="${salary > 1000}">
        Salary is very good.
    </c:when>
    <c:otherwise>
        No comment sir...
    </c:otherwise>
</c:choose>
</body>
</html>