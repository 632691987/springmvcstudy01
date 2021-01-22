<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL - Core</title>
</head>
<body>
	<%
		class Item {
			private String str1;
			private String str2;
			private double price;
			private int num;
			public Item(String str1, String str2, double price, int num){
				this.str1 = str1;
				this.str2 = str2;
				this.price = price;
				this.num = num;
			}
			public String toString(){
				return "str1:" + str1 + " str2:" + str2 + " price:" + price + " num:" + num;
			}
		}
		String[] daysArray = {"Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday","Sunday"};
		session.setAttribute("arrayOfDays", daysArray);
		List<String> daysList = new ArrayList<>();
		daysList.add("Monday"); daysList.add("Tuesday"); daysList.add("Wednesday");
		daysList.add("Thursday"); daysList.add("Friday"); daysList.add("Saturday");
		daysList.add("Sunday");
		request.setAttribute("listOfDays", daysList);
		Map<Integer, String> daysMap = new HashMap<>();
		daysMap.put(new Integer(1), "Monday");
		daysMap.put(new Integer(2), "Tuesday");
		daysMap.put(new Integer(3), "Wednesday");
		daysMap.put(new Integer(4), "Thursday");
		daysMap.put(new Integer(5), "Friday");
		daysMap.put(new Integer(6), "Saturday");
		daysMap.put(new Integer(7), "Sunday");
		request.setAttribute("mapOfDays", daysMap);
		Item item = new Item("Shoes", "Ekin", 999.90, 1);
		Item[] itemsArray = {
			new Item("Shoes", "Ekin", 999.90, 10),
			new Item("Shirt", "Van Heusen", 9.90, 30),
			new Item("Shampoo", "Simple", 99.90, 15),
			new Item("Socks", "Golden Toe", 900.00, 9),
			new Item("Suit", "Armani", 49.90, 17)
		};
		request.setAttribute("arrayOfItems", itemsArray);
%>

<c:set var="myShoes" value="<%= item %>" scope="request" />
<c:out value="${myShoes}"/><br/>

<c:set var="day" value="${listOfDays[2]}" scope="request" />
<c:out value="${day}"/><br/>

<c:set var="attribute" value="in session" scope="session" />
<c:out value="attribute ${attribute}" /><br/>
</body>
</html>