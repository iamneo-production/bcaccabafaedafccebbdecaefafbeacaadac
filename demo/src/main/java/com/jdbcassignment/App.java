package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection con = null;
        try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/appdb", "root", "examly");
        Statement stmt = con.createStatement();
        String sqlQuery = "Insert into employee values(" + 100 + ", 'emp1', " + 10000 + ");";
        //System.out.println(sqlQuery);
        stmt.execute(sqlQuery);
        System.out.println("Reconrd inserted successfully");
         if(con !=null) {
            System.out.println("Connection successful");
        }
        con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
