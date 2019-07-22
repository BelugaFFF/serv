<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../html/header.html"%>
	<form action="res.jsp" method="post">
		<input type="text" name="price">
		円×
		<input type="text" name="count">
		個=
		<input type="submit" value="out">
	</form>
<%@ include file="../../html/footer.html"%>