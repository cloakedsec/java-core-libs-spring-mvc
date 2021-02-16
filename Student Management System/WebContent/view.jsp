<%@ page import="java.sql.*"%>
<%
    String username = request.getParameter("username");
    String pwd = "";
    String fullname = "";
    String phone = "";
    String address = "";
    String city = "";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
        PreparedStatement Stmt = con.prepareStatement("Select * from signup where username=?");
        Stmt.setString(1, username);
        ResultSet rs = Stmt.executeQuery();
        if (rs.next()) {
            fullname = rs.getString("fullname");
            phone = rs.getString("phone");
            address = rs.getString("address");
            city = rs.getString("city");
%>
<form action="update.jsp">
	<table align="center" width="100%" cellspacing="2" cellpadding="2"
		border="5">
		<tr>
			<td>Username: <input type="text" name="empno"
				value="<%=username%>" /></td>
		</tr>
		<tr>
			<td>Full Name: <input type="text" name="empname"
				value="<%=fullname%>" /></td>
		</tr>
		<tr>
			<td>Address: <input type="text" name="salary"
				value="<%=address%>" /></td>
		</tr>
		<tr>
			<td>City: <input type="text" name="deptno" value="<%=city%>" /></td>
		</tr>

		<tr>
			<td><input type="submit" name="Update"></td>
		</tr>
		<tr>
			<td><input type="reset" name="Reset"></td>
		</tr>
	</table>

</form>
<%
        } else {
            out.println("Record Not Found");
        }
    } catch (Exception ex) {
        out.println(ex.getMessage());
    }
%>

