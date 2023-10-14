package com.octbatch;

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

        con = DriverManager.getConnection("jdbc:mysql://localhost/appdb", "root", "examly");

        if(con != null) {
        System.out.println("Connection established");
        } else {
            System.out.println("Connnection is not established");
        }
    }

    mvn exec:java -Dexec.mainClass="com.example.Client.Main" -Dexec.cleanupDaemonThreads=false

}
