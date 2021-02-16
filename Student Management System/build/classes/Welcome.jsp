
<%
    String username = (String)session.getAttribute("username");
    %>
<h1>
	Welcome<%=username%>
</h1>
<a href="MyProfile.jsp">Click Here</a>