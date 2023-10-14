package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection con = null;
        con = DriverManager.getConnection(""jdbc:mysql://localhost/appdb", "root", "examly");
        if(con !=null) {
            System.out.println("Connection successful");
        }
    }
}
