<%@page import="java.sql.*"%>
<%
    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");
    String fullname= request.getParameter("fullname");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");
    String city = request.getParameter("city");
    
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
            ("`//localhost:3306/wp_amd","root","");
                    PreparedStatement Stmt = con.prepareStatement
                    ("insert into signup(username,pwd,fullname,phone,address,city)values(?,?,?,?,?,?)");
                    Stmt.setString(1,username);
                    Stmt.setString(2,pwd);
                    Stmt.setString(3,fullname);
                    Stmt.setString(4,phone);
                    Stmt.setString(5,address);
                    Stmt.setString(6,city);
                    Stmt.executeUpdate();
                    con.close();
                    out.println("Record Added");
}
catch(Exception ex)
{
 out.println(ex.getMessage());                   
}
%>