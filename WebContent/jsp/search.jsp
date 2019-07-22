<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>検索</p>
<form action="/serv/Search" method="post">
	<input type="text" name="keyword">
	<input type="submit" value="検索">
</form>

<p>追加</p>
<form action="/serv/Insert" method="post">
	商品名<input type="text" name="name">
	価格<input type="text" name="price">
	<input type="submit" value="追加">
</form>

<p>追加(トランザクション)</p>
<form action="/serv/Transaction" method="post">
	商品名<input type="text" name="name">
	価格<input type="text" name="price">
	<input type="submit" value="追加">
</form>
</body>
</html>