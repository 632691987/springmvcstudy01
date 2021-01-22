<html>
<head>
    <title>Display Page</title>
</head>
<body>
<h2>Hello this is a display.jsp Page</h2>
UserID: <%=request.getParameter("userid") %><br>
Password is: <%=request.getParameter("password") %><br>
User Name: <%=request.getParameter("name") %><br>
Age: <%=request.getParameter("age") %>
</body>
</html>