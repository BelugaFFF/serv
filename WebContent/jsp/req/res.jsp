<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../html/header.html"%>
	<p>文字の出力</p>
	<% request.setCharacterEncoding("UTF-8"); %>
	<p>こんにちは、<%=request.getParameter("text") %>さん。</p>
<%@ include file="../../html/footer.html"%>