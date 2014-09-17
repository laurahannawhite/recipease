/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recipease.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author abpp041
 */
public final class ConnectionManager {
    
 public static void main(String[] args)
 {
     new ConnectionManager();
 }
 
 public ConnectionManager()
 {
    Connection con1 = CreateConnection(); 
 }
    
 public Connection CreateConnection(){
 
     System.out.println("Making a connection");
     Connection con = null;
     String userName = "root";
     String pwd = "";
     String dbname = "recipease";
     String serverName = "localhost";
    // int portNumber = 3306;
     
     try{
         Properties connectionProps = new Properties();
         connectionProps.put("user", userName);
         connectionProps.put("password", pwd);
         con = DriverManager.getConnection("jdbc:mysql://" + serverName 
         + "/" + dbname, connectionProps);
         
         
         System.out.println("Connected to database");
         con.setAutoCommit(false);
         
         con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
         
        
     }
     
     catch(SQLException sqle){
         sqle.printStackTrace();
     }
       return con;
 }    
    
}

