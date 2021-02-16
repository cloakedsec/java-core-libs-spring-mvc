<%@page import="java.sql.*"%>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salary = request.getParameter("salary");
    String deptno = request.getParameter("deptno");
    
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/wp_amd","root","");
                    PreparedStatement Stmt = con.prepareStatement
                    ("Select from *salary empreg where empno=?");
                    Stmt.setString(1,empno);
                    Stmt.setString(2,empname);
                    Stmt.setString(3,salary);
                    Stmt.setString(4,deptno);
                    Stmt.executeUpdate();
                    con.close();
                    out.println("Your salary is ");
}
catch(Exception ex)
{
 out.println(ex.getMessage());                   
}
%>