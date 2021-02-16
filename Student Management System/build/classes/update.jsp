<%@page import="java.sql.*"%>
<%
    String username = (String) session.getAttribute("username");
    String pwd = request.getParameter("pwd");
    String fullname = request.getParameter("fullname");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");
    String city = request.getParameter("city");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
        PreparedStatement Stmt = con.prepareStatement("update signup set fullname=?,phone=?,address=?, city=? where username=?");

        Stmt.setString(1, username);
        Stmt.setString(2, pwd);
        Stmt.setString(3, fullname);
        Stmt.setString(4, phone);
        Stmt.setString(5, address);
        Stmt.setString(6, city);
        Stmt.executeUpdate();
        con.close();
        out.println("Record Updated");
        ResultSet rs = Stmt.executeQuery();
        if (rs.next()) {
             rs.close();
            con.close();
            response.sendRedirect("Welcome.jsp");
        } else {
            rs.close();
            con.close();
            response.sendRedirect("login.jsp");
        }
    } catch (Exception ex) {
        out.println(ex.getMessage());
    }
%>