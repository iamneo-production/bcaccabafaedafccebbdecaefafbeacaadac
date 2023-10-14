package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            //if (con !=null) System.out.println("Connection scuccessful");

            //Statement stmt = con.createStatement();

            PreparedStatement stmt = con.prepareStatement("insert into customer values(?,?,?)");
            stmt.setInt(1, 12);
            stmt.setString(2, "Customer3");
            stmt.setInt(3, 50);
            int recCount = stmt.executeUpdate();
            System.out.println("Affected record count:" +recCount);
            //String sqlQuery = "insert into customer values(" + 11 + ", 'Cutomer2', " + 3000 + ");";
            //System.out.println(sqlQuery);
            //stmt.execute(sqlQuery);
            String sqlQuery = "select 8 from customer;";
            



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}












        //Statement stmt = con.createStatement();
        //String sqlQuery = "Insert into employee values(" + 100 + ", 'emp1', " + 10000 + ");";
        //System.out.println(sqlQuery);
        //stmt.execute(sqlQuery);
        // PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?);");
        // stmt.setInt(1, 102);
        // stmt.setString(2, "emp2");
        // stmt.setInt(3, 20000);
        // int count = stmt.executeUpdate();
        // if(count >0)
        // System.out.println("Reconrd inserted successfully");
        // //  if(con !=null) 
        // //     System.out.println("Connection successful");
        // } catch(Exception e) {
        //     e.printStackTrace();
        // }
        
    

