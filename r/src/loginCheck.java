import db.connect_db;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class loginCheck extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	    /* TODO output your page here. You may use following sample code. */
	    String action = request.getParameter("action");
	    String getEM  = request.getParameter("getEM");
	    String email = request.getParameter("email");
	    String pass = request.getParameter("pass");
            String status = request.getParameter("");
               try {
		Connection ak = new connect_db().getConnection();
		if (email != "" && pass != "") {
		    if (action.equals("login")) {
			PreparedStatement _ak = ak.prepareStatement("select email from tbl_admin where email='" +email+ "' and status=1");
			ResultSet __ak = _ak.executeQuery();
			if (__ak.next()) {
			    PreparedStatement _ak1 = ak.prepareStatement("select * from tbl_admin where email='" +email+ "' && password='" +pass+ "'");
			    ResultSet __ak1 = _ak1.executeQuery();
			    if (__ak1.next()) {
				HttpSession session = request.getSession(true);
				String jv_name	= __ak1.getString("username");
				String jv_type	= __ak1.getString("user_type");
				String jv_email = __ak1.getString("email");
				String jv_id	= __ak1.getString("id");
				/* define session variable */
				session.setAttribute("username",jv_name);
				session.setAttribute("user_type",jv_type);
				session.setAttribute("email", jv_email);
				session.setAttribute("userID",jv_id);
				/* define session variable */
				response.sendRedirect("admin/dashboard.jsp");
			    } else {
				out.println("<script type=\"text/javascript\">");
				out.println("window.location.href='admin/index.jsp'");
				out.println("alert('incorrect password');");
				out.println("</script>");
			    }
			} else {
			    out.println("<script type=\"text/javascript\">");
			    out.println("window.location.href='admin/index.jsp'");
			    out.println("alert('Email not register or your account is terminated');");
			    out.println("</script>");
			}
		    }
		}else{
		    out.println("<script type=\"text/javascript\">");
		    out.println("window.location.href='admin/index.jsp'");
		    out.println("alert('all field required');");
		    out.println("</script>");
		}
	    } catch (SQLException e) {
		out.println(e);
	    }
	}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>

}