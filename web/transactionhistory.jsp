<%-- 
    Document   : transactionhistory
    Created on : Jun 20, 2021, 5:55:18 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBConnector"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="css/font-awesome.css" rel="stylesheet" type="text/css">
        <!-- owl carousel css-->
        <link rel="stylesheet" href="owl-carousel/assets/owl.carousel.min.css" type="text/css">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- custom CSS -->
        <link rel="stylesheet" href="css/responsive.css">

        <link rel="stylesheet" href="css/list.css">
        <link rel="stylesheet" href="css/newcss.css">
    </head>
    <body>


        <div class="modal-body">
            <div class="table-responsive-sm table-responsive-md table-responsive-lg table-responsive-xl">
                <table class="table table-striped">
                    <thead style="background: #16c9f6; color: white; font-size: 20px;">
                        <tr>
                            <th scope="col">Sender</th>
                            <th scope="col">Receiver</th>
                            <th scope="col">Amount</th>
                            <th scope="col">Date</th>
                            <th scope="col">Time</th>

                        </tr>
                    </thead>
                    <tbody>



                        <%
                            ResultSet rs = null;
                            Statement st = null;
                            try {
                                st = DBConnector.getStatement();
                                String query = "select * from transfer ";
                                rs = st.executeQuery(query);
                                if (rs.next()) {
                                    do {
                                        String sender = rs.getString("sender");
                                        String receiver = rs.getString("receiver");
                                        int bln = rs.getInt("amount");
                                        String d = rs.getDate("date").toString();
                                        String t = rs.getTime("time").toString();
                        %>
                        <tr>
                            <td><%=sender%></td>
                            <td><%=receiver%></td>

                            <td>$ <%=bln%></td>
                            <td><%=d%></td>
                            <td><%=t%></td>
                        </tr>

                        <%
                                    } while (rs.next());
                                } else {
                                    out.println("No records found");
                                }
                            } catch (SQLException e) {
                                System.out.println(e);
                            }

                        %>


                    </tbody>
                </table>
            </div>

        </div>

    </div>
</div>
</div>



</body>
</html>
