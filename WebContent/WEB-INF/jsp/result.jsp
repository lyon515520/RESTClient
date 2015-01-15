<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AWT project</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/display" method="get">
    <input type="submit" name="button1" value="All Users" style="width:100px"/><br />
    <input type="submit" name="button2" value="Get Tweets" style="width:100px" /><input type="number" name="getTweets" placeholder="User ID"/><br />
    <input type="submit" name="button3" value="All Tweets" style="width:100px"/><br />
    <input type="submit" name="button4" value="Update" style="width:100px"/><br />
</form>
<h3>Result</h3>
<p>${message}</p>

</body>
</html>