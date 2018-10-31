package newbookingsystem;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class DBconn {
         static Connection connection;
 static Statement stmt;
    public static void connect() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/hotel";
            connection=DriverManager.getConnection(url,"root","root");
            stmt=connection.createStatement();
            System.out.println("Connection Successful!!!");
        }
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(DBconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DBconn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    
}
