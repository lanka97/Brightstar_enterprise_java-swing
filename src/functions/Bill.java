/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import DBconnection.DBConnection;
import DBconnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.*;


/**
 *
 * @author Lanka
 */
public class Bill {
        public  String billID;
        public  String billType;
        public  String billDate;
        public String billNO;
        public  int units;
        public  double payed;
        public  double total;
        public String month;
        public int chequeNum;
        
    public void insertBill( ) throws ClassNotFoundException, SQLException{
            
            /*DateFormat dateFormate = new SimpleDateFormat("dd/mm/yyyy");
            String date = dateFormate.format(billDate);*/
        
            DBConnection con = new  DBConnection();
            
            String addCustomerQuery = "INSERT INTO expenditur( type, date, description, units, payed, total, cheque, month) VALUES( ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.getConnection().prepareStatement(addCustomerQuery);
            
            ps.setString(1, billType);
            ps.setString(2,  billDate);
            ps.setString(3, billNO);
            ps.setInt(4, units );
            ps.setDouble(5, payed);
            ps.setDouble(6, total);
            ps.setInt(7, chequeNum);
            ps.setString(8,month);
            
            ps.executeUpdate();
        
    } 
        
}
