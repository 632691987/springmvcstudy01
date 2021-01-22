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
	<%
		java.util.List<String> names = new java.util.ArrayList<>();
		names.add("ab1");
		names.add("ab2");
		names.add("ab3");
		
		request.setAttribute("names", names);
	%>
	<c:forEach var="i" begin="1" end="3">
	   Item : <c:out value="${i}"/>&nbsp;&nbsp;
	</c:forEach>
	
	<br /><br />
	<c:forEach items="${names}" var="name">
	   <c:out value="${name}"/>&nbsp;&nbsp;
	</c:forEach>
	
	<br /><br />
	<c:forTokens items="Zara,nuha,roshy" delims="," var="name">
	   <c:out value="${name}"/>&nbsp;&nbsp;
	</c:forTokens>
</body>
</html>