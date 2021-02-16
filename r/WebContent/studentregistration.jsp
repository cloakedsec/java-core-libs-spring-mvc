<%-- 
    Document   : studentregistration
    Created on : Oct 4, 2018, 4:46:44 PM
    Author     : Ahmad
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="db.connect_db"%>
<%@page import="java.sql.Connection"%>
<%
    String username = (String) session.getAttribute("username");
    String user_type = (String) session.getAttribute("user_type");
    String email = (String) session.getAttribute("email");
    String userID = (String) session.getAttribute("userID");
    //out.println(username+user_type+email+userID);
    if (username == null || user_type == null || email == null || userID == null) {
        response.sendRedirect("admin-panel/login.jsp");
    }
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration</title>
    </head>
    <body>
        <h3><center>STUDENT REGISTRATION FORM</center></h3>

        <form action="registerr" method="post">


            <!-- 
            Name: <input type="text" name="fullname"> <br>
            Address: <input type="text" name="address"> <br>
            City: <input type="text" name="city"> <br>
            School Name: <input type="text" name="school"> <br>
            Marks : <input type="text" name="marks"> <br>
            Percentage: <input type="text" name="percent"> <br>
            Image: <input type="file" name="image"><br>
            Image Name: <input type="text" name="imagename">
            <input type="submit">
            -->
            <table align="center" cellpadding = "10">

                <!----- First Name ---------------------------------------------------------->
                <tr>
                    <td>FIRST NAME</td>
                    <td><input type="text" name="firstname" maxlength="30"/>
                        (max 30 characters a-z and A-Z)
                    </td>
                </tr>

                <!----- Last Name ---------------------------------------------------------->
                <tr>
                    <td>LAST NAME</td>
                    <td><input type="text" name="lastname" maxlength="30"/>
                        (max 30 characters a-z and A-Z)
                    </td>
                </tr>

                <!----- Date Of Birth -------------------------------------------------------->
                <tr>
                    <td>DATE OF BIRTH</td>

                    <td>
                        <input type="date" name="birthday">
                    </td>
                </tr>

                <!----- Email Id ---------------------------------------------------------->
                <tr>
                    <td>EMAIL ID</td>
                    <td><input type="text" name="email" maxlength="100" /></td>
                </tr>

                <!----- Mobile Number ---------------------------------------------------------->
                <tr>
                    <td>MOBILE NUMBER</td>
                    <td>
                        <input type="text" name="mobile" maxlength="10" />
                        (10 digit number)
                    </td>
                </tr>

                <!----- Gender ----------------------------------------------------------->
                <tr>
                    <td>GENDER</td>
                    <td>
                        Male <input type="radio" name="gender" value="Male" />
                        Female <input type="radio" name="gender" value="Female" />
                    </td>
                </tr>

                <!----- Address ---------------------------------------------------------->
                <tr>
                    <td>ADDRESS <br /><br /><br /></td>
                    <td><textarea name="address" rows="4" cols="30"></textarea></td>
                </tr>

                <!----- City ---------------------------------------------------------->
                <tr>
                    <td>CITY</td>
                    <td><input type="text" name="city" maxlength="30" />
                        (max 30 characters a-z and A-Z)
                    </td>
                </tr>

                <!----- Pin Code ---------------------------------------------------------->
                <tr>
                    <td>PIN CODE</td>
                    <td><input type="text" name="pincode" maxlength="6" />
                        (6 digit number)
                    </td>
                </tr>

                <!----- State ---------------------------------------------------------->
                <tr>
                    <td>STATE</td>
                    <td><input type="text" name="state" maxlength="30" />
                        (max 30 characters a-z and A-Z)
                    </td>
                </tr>

                <!----- Country ---------------------------------------------------------->
                <tr>
                    <td>COUNTRY</td>
                    <td><input type="text" name="country" value="India" readonly="readonly" /></td>
                </tr>


                <!----- Submit and Reset ------------------------------------------------->
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit">
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>

        </form>
    </body>
</html>
