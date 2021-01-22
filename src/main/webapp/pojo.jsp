<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
http://localhost:8080/basic_xml/pojo.jsp
 -->
<form action="${pageContext.request.contextPath }/pojo" method="post">
	<table cellpadding="0" cellspacing="0" border="1" width="300px">
		<tr>
			<td width="150px">username</td>
			<td><input type="text" id="username" name="username" value="Jong Kim"></td>
		</tr>
		
		<tr>
			<td>password</td>
			<td><input type="text" id="password" name="password" value="1q2w3e4R"></td>
		</tr>
		
		<tr>
			<td>email</td>
			<td><input type="text" id="email" name="email" value="abc@china.com"></td>
		</tr>
		
		<tr>
			<td>address.country</td>
			<td>
				<select id="address.country" name="address.country">
					<option value="Korea">Korea</option>
					<option value="China">China</option>
					<option value="America">America</option>
					<option value="Canada">Canada</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td>address.province</td>
			<td><input type="text" id="address.province" name="address.province" value="Soul"></td>
		</tr>
		
		<tr>
			<td>address.city</td>
			<td><input type="text" id="address.city" name="address.city" value="soul"></td>
		</tr>
		
		<tr>
			<td>address.detail</td>
			<td><input type="text" id="address.detail" name="address.detail" value="this is street detail"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" id="submit" name="submit" value="submit"></td>
		</tr>
	</table>

</form>
</body>
</html>