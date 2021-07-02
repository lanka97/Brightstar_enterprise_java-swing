package DBconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//import java.sql.Connection;
public class DBConnection {
    private static String url = "jdbc:mysql://localhost/";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";  
    private static String name="brightstar";
    private static String password = "root";
    private static Connection con;
    private static Statement state;

    public  Connection getConnection() {
       if(con == null){
           
           try{
               Class.forName(driverName);
               this.con =(Connection)DriverManager.getConnection(url+name, username,password);
               System.out.println("elakiri");
           }catch(ClassNotFoundException | SQLException sql){
               System.out.println("So Saaad");
           }
           
       
       }
        return con;
    }
}