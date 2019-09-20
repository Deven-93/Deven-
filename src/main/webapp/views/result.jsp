<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="get" method="GET">
<b>Enter the salary</b><input type="text" name="salary"/>
<select name="category">
    <option value="great">greater</option>
    <option value="less">less</option>    
</select>

<input type="submit" name="submit"/>
</form>
<table border="1" cellpadding="10" cellspacing="0" align="center">
<caption>Employee Table</caption>
<tr>
<th>name</th>
<th>email</th>
<th>salary</th>
</tr>

<c:forEach items="${lists}" var="lists">
<tr>

     <td>  ${lists.getName()}  </td>
     <td>  ${lists.getEmail()}</td>
      <td> ${lists.getSalary()}</td>
    
      </tr>
</c:forEach>

</body>
</html>