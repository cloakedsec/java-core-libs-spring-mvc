
<%


    
    session.removeAttribute("username");
    session.removeAttribute("user_type");
    session.removeAttribute("email");
    session.removeAttribute("userID");
    response.sendRedirect("login.jsp");

    out.println("<script type=\"text/javascript\">");
    out.println("window.location.href='index.jsp'");
   out.println("alert('You are successfully logout.')");
    out.println("</script>");

%>