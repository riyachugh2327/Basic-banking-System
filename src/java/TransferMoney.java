
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.DBConnector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet(urlPatterns = {"/TransferMoney"})

public class TransferMoney extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ResultSet rs = null;
        Statement st = null;
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String name2 = request.getParameter("name2");
        String email2 = request.getParameter("email2");
        String temail = null;

        int amt = Integer.parseInt(request.getParameter("amt"));

        try {

            st = DBConnector.getStatement();
             String up = "update customer set balance=balance-? where email='" + email + "'";
            String qr = "update customer set balance=balance+? where email='" + email2 + "'";
            String tm = "insert into transfer(user, amount, date,time) values(?,?,curdate(),curtime())";
         int i = st.executeUpdate(up);
            int j = st.executeUpdate(qr);
            int k = st.executeUpdate(tm);

            if (i > 0) {
                System.out.println(i + " record updated1");
            
            }
            if (j > 0) {
                System.out.println(j + " record updated2");
            }
            if (k > 0) {
                System.out.println(k + " record inserted");
            }

        
        else
    {
        response.sendRedirect("email.html");
        System.out.println("Login Failed");
    }

    }

catch(SQLException e)
    {
        System.out.println(e);
    }
          
}  
}
