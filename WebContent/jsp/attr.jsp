<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="bean.Product, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% @SuppressWarnings("unchecked") List<Product> List = (List<Product>)request.getAttribute("list"); %>
	<% for (Product p : List){ %>
		<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>
	<% } %>
</body>
</html>