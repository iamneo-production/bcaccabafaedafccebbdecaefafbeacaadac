package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcFirst {
    public static void main( String[] args ) throws SQLException
    {
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appdb", "root", "examly");
        if(con != null) {
            System.out.println("Connection successful");
        }
    }
}
