<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@page isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>User Information</h1>
    
    <form>
        <label>Email:</label>
        <input type="text" name="email" value="${user.email}" readonly><br><br>
        
        <label>Username:</label>
        <input type="text" name="username" value="${user.username}" readonly><br><br>
        
        <label>Password:</label>
        <input type="password" name="password" value="${user.password}" readonly><br><br>
    </form>
</body>
</html>