<%@ page import="java.sql.*"%>
<html>
<head>

</head>

<body>

	<form action="update.jsp">
		<TABLE cellpadding="15" border="1">
			<%
                    String empno = request.getParameter("empno");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
                        PreparedStatement Stmt = con.prepareStatement("Select * from empreg where empno=?");
                        Stmt.setString(1, empno);
                        ResultSet rs = Stmt.executeQuery();
                       if (rs.next()) {
                %>

			<tr>
			<tr>
				<th>Employee Number</th>
			</tr>
			<tr>
				<td><%= rs.getString("empno")%></td>
				<td><%= rs.getString("empname")%></td>
				<td><%= rs.getString("salary")%></td>
				<td><%= rs.getString("deptno")%></td>


			</tr>
			<%
         }
     } catch (Exception ex) { out.println(ex.getMessage());}
     %>
		</table>
	</form>
	<p>
		you are not logged in click here to <a href="login.jsp"> <b>login</b>
		</a>
	</p>

</body>
</html>