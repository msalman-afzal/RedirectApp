<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

          <h1>hello word </h1>

                      
           <%
               String name =(String)  request.getAttribute("name");
                  List<String> list = (List) request.getAttribute("list");
                
               
           %>
           <h1><%
             for(String ele : list){
             }
           %></h1>
           <h1><%= list%></h1>
        
           
</body>
</html>