<%@page import="java.sql.*"%>
<%
    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
        PreparedStatement Stmt = con.prepareStatement("Select * from signup where username=? and pwd=?");
        Stmt.setString(1, username);
        Stmt.setString(2, pwd);
        ResultSet rs = Stmt.executeQuery();
         if (rs.next()){
            session.setAttribute("username", username);
            rs.close();
            con.close();
            response.sendRedirect("Welcome.jsp");
        } else {
            rs.close();
            con.close();
            response.sendRedirect("login.jsp");
        }
    } catch (Exception ex) {
    }
%>