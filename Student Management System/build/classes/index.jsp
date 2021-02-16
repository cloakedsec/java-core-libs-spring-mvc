<%@page import="java.sql.Connection" %>
<%@page import="test.DbManager" %>
<%@page import="java.sql.DriverManager" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		DbManager db = new DbManager();
		Connection con = db.getConnection();
		if(con == null){
			out.print("Connection failed");
		}
		else {
			out.print("connection succeeded");
		}

%>
</body>
</html>