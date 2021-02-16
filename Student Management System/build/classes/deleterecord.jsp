<%@ page import="java.sql.*"%>
<%
    String empno = request.getParameter("empno");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
        PreparedStatement Stmt = con.prepareStatement("delete from empreg where empno=?");
        Stmt.setString(1, empno);
        Stmt.executeUpdate();
        out.println("Record Deleted!");
        con.close();
        
       
    } catch (Exception ex) {
        out.println(ex.getMessage());
    }
%>

<a href="delete.html">Go Back</a>
