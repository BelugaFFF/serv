<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>kusokora</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<% request.setCharacterEncoding("UTF-8"); %>

<div class="bookBox clearfix fadeOvj" style="color: rgb(1, 124, 155); opacity: 1; transform: matrix(1, 0, 0, 1, 0, 0);">

    <div class="bookJapanese" id="bookJapanese" style="border-color: #017c9b">
      <img class="sp" src="https://www.hatakoto.jp/wp-content/themes/hataraku/img/bg_book_space.jpg" alt="">
      <p class="chinMsg vertical">

      <%
      	String industry = request.getParameter("industry");
      	String[] industryArr = industry.split("");

      	for(String s : industryArr){
          	out.println("<span>" + s + "</span>");
      	}
      %>

      <span>/</span>

      <%
      	String position = request.getParameter("position");
      	String[] positionArr = position.split("");

      	for(String t : positionArr){
          	out.println("<span>" + t + "</span>");
      	}
      %>

      <span>・</span>

      <span><%=request.getParameter("age") %></span>
      <span>代</span></p>

      <div class="chinContent vertical" id="chinContent" style="top: 99.5px;">
      	<%=request.getParameter("text") %>
      </div>
    </div>
  </div>

</body>
</html>