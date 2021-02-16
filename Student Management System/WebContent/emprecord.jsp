<%@ page import="java.sql.*"%>
<html>
<head>
<script type="text/javascript" src="js/ajax.js">
        </script>
</head>
<body>
	<%
            String empno = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
                PreparedStatement Stmt = con.prepareStatement("Select * from empreg");

        %>
	<table cellpadding="15" border="1">
		<tr>
			<th>Employee Number</th>
		</tr>
		<%       ResultSet rs = Stmt.executeQuery();
                while (rs.next()) {
            %>


		<tr>
			<td><a href="details.jsp?empno=<%=rs.getString("empno")%>"
				onmouseover="sendRequest('get', 'details.jsp?empno=<%=rs.getString("empno")%>')"><%=rs.getString("empno")%></a></td>
		</tr>
		<%
                    }
                } catch (Exception ex) {
        }%>
	</table>
	<div id="ajax_res"></div>
</body>
</html>