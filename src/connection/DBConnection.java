/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author Pasan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection conn;

	public DBConnection() {

	}

	public static Connection getDBconnection() throws ClassNotFoundException, SQLException{

		//Server connection parameters
		String url = "jdbc:mysql://localhost:3306/brightstar?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";
		
		/*
		 * This create new connection objects when connection is closed or it is
		 * null
		 */
                                        
		if (conn == null || conn.isClosed()) {
		
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		
		}

		return conn;
                                        
                                            
        }
}
