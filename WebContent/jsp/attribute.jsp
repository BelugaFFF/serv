<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Product" %>
<% Product p = (Product)request.getAttribute("product"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>

</body>
</html>