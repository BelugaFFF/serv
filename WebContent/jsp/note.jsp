<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../html/header.html"%>
	<p>暗黙オブジェクト</p>
	<%!
	String paragraph(String str){
		return "<p>" + str + "</p>";
	}
	%>
hlk/j
	<%!
	int servletMember = 0;
	%>
	<%
	int localVal = 0;
	servletMember++;
	localVal++;
	out.println(paragraph("localVal = " + localVal));
	out.println(paragraph("servletMember = " + servletMember));
	%>

	<%
	out.println("out object");
	String name = request.getParameter("name");//?name=something
	out.println("<p>" + name + "</p>");
	%>
	<%= name%>
	<%
	out.println(paragraph("paragraph()"));
	%>
	<p>練習問題</p>
	<p> - 乱数表示</p>
	<%=Math.random()%>

<%@ include file="../html/footer.html"%>