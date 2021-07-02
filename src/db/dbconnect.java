/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dilshan
 */
public class dbconnect {
        
    public static Connection connect() throws ClassNotFoundException{
        Connection con = null;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmgt", "root", "root");
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return con;
    }
}
