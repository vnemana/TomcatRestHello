<%@ page import="com.mahesh.database.dbObjects.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: mahesh
  Date: 5/13/17
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
<%--<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">--%>
<style>
    .first {
        width: 75%;
        color: black;
        background-color: white;
        border: 2px solid darkblue;
        padding: 0.5%;
    }
</style>

<style>
    .second {
        width: 75%;
        color: black;
        background-color: #ff8967;
        border: 2px solid darkblue;
        padding: 0.5%;
    }
</style>

<style>
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
        /*padding: 5px;*/
    }
    th {
        text-align : center;
    }
    /*table {*/
    /*border-spacing: 15px;*/
    /*}*/
</style>

<div class="first">
    <head>
        <title>Create a User</title>
    </head>
    <body style="background-color:#b1f7ff;">

    <form method="post" action="createuser">
        <table
                style="text-align: left; width: 952px; height: 116px; margin-left: auto; margin-right: auto; background-color: rgb(153, 255, 255);"
                border="0" cellpadding="2" cellspacing="2">
            <tbody>
            <tr>
                <td style="vertical-align: top; text-align: right; width: 50%;">First
                    Name:<br>
                </td>
                <td style="vertical-align: top; width: 50%;"><input size="50"
                                                                    maxlength="64" placeholder="&lt;Enter your first name here&gt;" name="fname"><br>
                </td>
            </tr>
            <tr>
                <td style="vertical-align: top; text-align: right; width: 50%;">Last
                    Name:<br>
                </td>
                <td style="vertical-align: top; width: 50%;"><input
                        placeholder="&lt;Enter your last name here&gt;" maxlength="64" size="50"
                        name="lname"><br>
                </td>
            </tr>
            <tr>
                <td style="vertical-align: top; text-align: right; width: 50%;">Middle
                    Name:<br>
                </td>
                <td style="vertical-align: top; width: 50%;"><input
                        placeholder="&lt;Enter your middle name here&gt;" maxlength="64" size="50"
                        name="mname"><br>
                </td>
            </tr>
            <tr>
                <td style="vertical-align: top;"><br>
                </td>
                <td style="vertical-align: top;"><br>
                </td>
            </tr>
            <tr>
                <td style="vertical-align: top; text-align: right; width: 50%;">Username:<br>
                </td>
                <td style="vertical-align: top; width: 50%;"><input
                        placeholder="&lt;Enter your username here&gt;" maxlength="64" size="50"
                        name="username"><br>
                </td>
            </tr>
            <tr>
                <td style="vertical-align: top; width: 50%; text-align: right;">Password:<br>
                </td>
                <td style="vertical-align: top;"><input
                        placeholder="&lt;Enter your password here&gt;" maxlength="64" size="50"
                        name="password" type="password"><br>
                </td>
            </tr>
            <tr>
                <td colspan="2" rowspan="1"
                    style="vertical-align: top; text-align: center;"><input name="submit"
                                                                            value="Submit" type="submit"><br>
                </td>
            </tr>
            </tbody>
        </table>
        <br>
    </form>

    <%--<form action="createuser" method="post">--%>
        <%--First Name: <input type="text" name="fname"><br>--%>
        <%--Last Name: <input type="text" name="lname"><br>--%>
        <%--Middle Name: <input type="text" name="mname"><br>--%>
        <%--<br>--%>
        <%--Username: <input type="text" name="username"><br>--%>
        <%--Password: <input type="password" name="password"><br>--%>
        <%--<br>--%>
        <%--<input type="submit" value="submit">--%>
    <%--</form>--%>

    <%out.println("<br>" + request.getAttribute("message") + "<br>"); %>
    </body>
</div>

<div class="second">
    <head>
        <title>Get All Users</title>
    </head>
    <body style="background-color:#ff8967;">
    <form action="getallusers" method="get">
        <input type="submit" value="Get All Users">
        <br>
        <table>
            <tr>
                <th>First Name</th>
                <th>Middle Name</th>
                <th>Last Name</th>
                <th>Username</th>
            </tr>
            <% ArrayList<User> users = null;
                users = (ArrayList<User>) request.getAttribute("userList"); %>
            <%
                User user = null;
                if (users != null) {
                    for (int ii = 0; ii < users.size(); ii++) {
                        user = users.get(ii);
            %>
            <tr>
                <td><%=user.getFirstName()%></td>
                <td><%=user.getMiddleName()%></td>
                <td><%=user.getLastName()%></td>
                <td><%=user.getUsername()%></td>
            </tr>
            <% } %>
            <% } %>
        </table>
    </form>
    </body>
</div>
</html>
