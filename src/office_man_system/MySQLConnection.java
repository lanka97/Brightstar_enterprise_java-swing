/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Pasindu Senarathne
 */
public class MySQLConnection {
    
    public static Connection connection = null;
   
    private MySQLConnection(){
        
    }
    
    public static Connection getDBConnection(){
        
        try{
            if(connection == null){
                
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/office_management_system","root","root");
            } 
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        catch(ClassNotFoundException ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        return connection;
    }
    
    
    
}
