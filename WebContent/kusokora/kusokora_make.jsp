<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クソコラメーカー</title>
</head>
<body>

<p>クソコラメーカー</p>
<form action="/serv/html/kusokora.jsp" method="get">
<p>本文</p>
	<input type="text" name="text">
<p>業種</p>
	<input type="text" name="industry">
<p>職種</p>
	<input type="text" name="position">
<p>年代</p>
	<input type="text" name="age">
<p></p>
<input type="submit" value="作成">
</form>

</body>
</html>