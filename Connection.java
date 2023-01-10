
package employee.management.system;
import java.sql.*;
import java.sql.Connection = null;


public class Connection {
    Connection c;
    Statement s;

    
    public Connection()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "riyasharma");
             s = c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    
}
    public static void main(String[]args){
       // new Connection();

}

    
}

