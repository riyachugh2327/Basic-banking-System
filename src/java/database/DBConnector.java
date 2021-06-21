package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author mihir
 */
public class DBConnector 
{
    static Connection conn=null;
    static Statement st=null;
    
    static
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            System.out.println("connected");
            
            st=conn.createStatement();
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
       public static Statement getStatement()
       { return st; }
       
       public static Connection getConnection()
       { return conn; }
}
    
    

