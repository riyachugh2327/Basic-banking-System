
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
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
        <title>transfer</title>
            <link rel="stylesheet" href="css/list.css">
<link href="css/font-awesome.css" rel="stylesheet" type="text/css">
    <!-- owl carousel css-->
    <link rel="stylesheet" href="owl-carousel/assets/owl.carousel.min.css" type="text/css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- custom CSS -->
<link rel="stylesheet" href="css/responsive.css">
    
    <link rel="stylesheet" href="css/list.css">
        <link rel="stylesheet" href="css/newcss.css">
        <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
input {
  border-top-style: hidden;
  border-right-style: hidden;
  border-left-style: hidden;
  border-bottom-style: groove;
  background-color: #eee;
}

.no-outline:focus {
  outline: none;
}

input {
	background: none;
	color: inherit;
	border: none;
	padding: 0;
	font: inherit;
	cursor: pointer;
	outline: inherit;
}
a
{
    text-decoration: none;
}
.open-button {
  background-color: white;
  color: black;
  padding: 8px 20px;
  border: none;
  font-size: 20px;
  cursor: pointer;
  /*opacity: 0.8;*/
  position: absolute;
  top: 5px;
  right: 250px;
  width: 180px;
  border-radius: 30px;

}
.tbtn{
    border-radius: 30px;
  background-color: white;
  color: black;
  padding: 8px 20px;
  border: none;
  font-size: 20px;
  cursor: pointer;
  opacity: 0.8;
  position: absolute;
  top: 2px;
  right: 10px;
  width: 200px;

}
.nav-link{
    font-size: 20px;
}

/*  bottom: 23px;
  left: 250px;
  width: 280px;
}
}
/* The popup form - hidden by default */
.form-popup {
  display: none;
  position: fixed;
  bottom: 0;
  right: 290px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

/* Add styles to the form container */
.form-container {
  max-width: 400px;
  padding: 10px;
  background-color: white;
}

/* Full-width input fields */
.form-container input[type=text], .form-container input[type=email] {
  width: 100%;
  padding: 10px;
  width:200px;
  height: 30px;
  /*border-radius: 20px;*/
  border-bottom: 2px solid black;
  margin: 0 100px;
  /*border: none;*/
  
  background: #f1f1f1;
}

/* When the inputs get focus, do something */
.form-container input[type=text]:focus, .form-container input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit/login button */
.form-container .btn {
  background-color: #a88beb;
  color: white;
  padding: 9px 20px;
  border: none;
  cursor: pointer;
  width: 50%;
  margin:10px 100px;
  opacity: 0.8;
  border-radius: 30px;
  margin: 10 50%;
}

/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: #a88beb;
  border-radius: 30px;
}

/* Add some hover effects to buttons */
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}
label{
    margin:10px 20px;
}
</style>

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light bg-transparent" id="gtco-main-nav">
    <div class="container"><a class="navbar-brand">HDFC</a>
        <button class="navbar-toggler" data-target="#my-nav" onclick="myFunction(this)" data-toggle="collapse"><span
                class="bar1"></span> <span class="bar2"></span> <span class="bar3"></span></button>
        <div id="my-nav" class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="service.html">Services</a></li>
                <li class="nav-item"><a class="nav-link" href="about.html">About Us</a></li>
                                <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>

            </ul>
           
        </div>
    </div>
</nav>
        
        <%
            ResultSet rs = null;
            Statement st = null;
            
                try {
                     st = DBConnector.getStatement();
                    String query = "select * from customer ";
                    rs = st.executeQuery(query);
                   if (rs.next()) {
                            int id = rs.getInt("id");
                            String ac = rs.getString("accountno");
                            String name = rs.getString("name");
                            String mail = rs.getString("email");
                            int blnc = rs.getInt("balance");
//                     
                        }
                }
                   catch (SQLException e) {
                    System.out.println(e);
                }
            %>
            <div class="container">
<!--<a  class="tbtn btn mb-2" data-toggle="modal" data-target="#money" class="transfer" href="final.jsp">Transfer Money</a> -->

                    <a class="tbtn btn mb-2"  data-toggle="modal" class="transfer" data-target="#trans" href="transactionhistory.jsp">Transaction History</a>
                </div>
            </div>
        </section>
            <!--<br>-->
            

<button class="open-button" onclick="openForm()">Transfer Money</button>

<!--<button class="open-button2" onclick="openForm()">Transaction History</button>-->


<div class="form-popup" id="myForm">
    <form action="Transfer" class="form-container" method="post">
    <h1>Transaction</h1>

    <label for="email">Sender Name</label><br>
    <input type="text" placeholder="Sender Name" name="name"  required>
    <br>

    <label for="email">  Sender Email</label><br>
    <input type="email" placeholder="Sender Mail" name="emal" required>
    <br>
    
      <label for="email">Receiver Name</label><br>
    <input type="text" placeholder="Receiver Name" name="name2"  required>
    <br>

    <label for="email">Receiver Email</label><br>
    <input type="email" placeholder="Receiver Mail" name="emal2" required>
    <br>

    <label for="email">Amount</label><br>
    <input  type="text"  placeholder="Enter Amount" name="amt">

    <input type="submit" class="btn">
    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
  </form>
</div>

        <%@ include file="message.jsp"%>
      
        <div
            class="container table-responsive-sm table-responsive-md table-responsive-lg table-responsive-xl">
            <table class="table table-striped">
                <thead style="background: #16c9f6; color: white; font-size: 20px;">
                    <tr>
                        <th scope="col">Account Number</th>
                        <th scope="col">Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Balance</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                             if (rs.next()) {
                            do {
                                int id = rs.getInt("id");
                                String ac = rs.getString("accountno");
                                String name = rs.getString("name");
                                String mail = rs.getString("email");
                                int blnc = rs.getInt("balance");
                    %>
                    <tr>
                        <td><%=ac%></td>
                        <td><%=name%></td>
                        <td><%=mail%></td>
                        <td>$ <%=blnc%></td>
                    </tr>

                    <%
                            } while (rs.next());
                        } else {
                            out.println("No records found");
                        }
                    %>
                </tbody>
            </table>
        </div>

                   
<script>
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
</script>

</body>
</html>
