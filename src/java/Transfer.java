
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Transfer"})

public class Transfer extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

            boolean isAvailable = false;
            String uname = request.getParameter("name");
            String emal = request.getParameter("emal");

            String sname = request.getParameter("name2");
            String semal = request.getParameter("emal2");

            int amt = Integer.parseInt(request.getParameter("amt"));
            System.out.println(amt);

            String remn = "select * from customer where email=?";
            System.out.println(remn);
            PreparedStatement pst = con.prepareStatement(remn);
            pst.setString(1, emal);
            java.sql.ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                isAvailable = true;
            }
            if (isAvailable != false) {
                String up = "update customer set balance=balance-? where email=?";
                System.out.println(up);
                String qr = "update customer set balance=balance+? where email=?";
                System.out.println(qr);
                String tm = "insert into transfer(sender,receiver, amount, date,time) values(?,?,?,curdate(),curtime())";
                PreparedStatement pup = con.prepareStatement(up);
                PreparedStatement ps = con.prepareStatement(qr);
                PreparedStatement pt = con.prepareStatement(tm);
                pup.setString(2, emal);
                pup.setInt(1, amt);
                ps.setString(2, semal);
                ps.setInt(1, amt);
                pt.setString(1, uname);
                pt.setString(2, sname);
                pt.setInt(3, amt);

                pup.executeUpdate();
                ps.executeUpdate();
                pt.executeUpdate();

                System.out.println("Succeesssss");
                response.sendRedirect("transfer.jsp");
                
                } 
            else {
                System.out.println("noooooooooooooo");
                response.sendRedirect("transfermoney.jsp");

            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
