<%@page import="java.sql.*"%>
<%@page import="" %>
<%
    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");

    	
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
        PreparedStatement Stmt = con.prepareStatement("Select * from signup where username=? and pwd=?");
        Stmt.setString(1, username);
    
        ResultSet rs = Stmt.executeQuery();
        if (rs.next()) {
            session.setAttribute("username", username);
            rs.close();
            con.close();
        }      
%>