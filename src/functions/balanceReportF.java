/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import DBconnection.DBConnection;
import brightstar.bill;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lanka
 */
public class balanceReportF {    
    
    public String Smonth(){
    
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String Stmonth = null;
        
        if(month<10){
        Stmonth = "0"+Integer.toString(month);
        }else{
            Stmonth = Integer.toString(month);
        }
        
        return Stmonth;
    }
    
    public String getYear(){
    return Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public double getTotalMonthBills() throws SQLException{
    
     DBConnection con = new DBConnection();
     
            String mm = this.Smonth();
            String yyyy = this.getYear();
            
            System.out.println(yyyy+ mm);
            
            double total = 0;
            
            String allBill = "SELECT SUM(total) FROM expenditure where  (type = 'phone' OR type = 'water' OR type = 'electricity') AND (date LIKE '"+yyyy+"-"
                             +mm+"%')";
            
                        
            PreparedStatement ps = con.getConnection().prepareStatement(allBill);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                total = resultSet.getDouble(1);
                
            }
              
       
        return total;
    
        }
    
    public double getTotalMonthRents() throws SQLException{
        
    String mm = this.Smonth();
    String yyyy = this.getYear();
            
    
     DBConnection con = new DBConnection();
            
            double total = 0;
            
            String allRents = "SELECT SUM(total) FROM expenditure where (type = 'rent' OR type = 'maintenance') AND date LIKE '"+yyyy+"-"
                             +mm+"%'";
            
            PreparedStatement ps = con.getConnection().prepareStatement(allRents);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                total = resultSet.getDouble(1);
                
            }
              
       
        return total;
    
        }
    
    public double getTotalMonthOther() throws SQLException{
        
    String mm = this.Smonth();
    String yyyy = this.getYear();
    
    DBConnection con = new DBConnection();
            
            double total = 0;
            
            String allOther = "SELECT SUM(total) FROM expenditure where  (type = 'other') AND (date LIKE '"+yyyy+"-"
                             +mm+"%')";            
           
            PreparedStatement ps = con.getConnection().prepareStatement(allOther);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                total = resultSet.getDouble(1);
                
            }
              
       
        return total;
    
        }
    
    public double getTotalYearBills() throws SQLException{
    
     DBConnection con = new DBConnection();
     
            String mm = this.Smonth();
            String yyyy = this.getYear();
            
            System.out.println(yyyy+ mm);
            
            double total = 0;
            
            String allBill = "SELECT SUM(total) FROM expenditure where  (type = 'phone' OR type = 'water' OR type = 'electricity') AND (date LIKE '"+yyyy+"-%')";
            
                        
            PreparedStatement ps = con.getConnection().prepareStatement(allBill);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                total = resultSet.getDouble(1);
                
            }
              
       
        return total;
    
        }
    
    public double getTotalYearRents() throws SQLException{
        
    String mm = this.Smonth();
    String yyyy = this.getYear();
            
    
     DBConnection con = new DBConnection();
            
            double total = 0;
            
            String allRents = "SELECT SUM(total) FROM expenditure where (type = 'rent' OR type = 'maintenance') AND date LIKE '"+yyyy+"-"
                             +"%'";
            
            PreparedStatement ps = con.getConnection().prepareStatement(allRents);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                total = resultSet.getDouble(1);
                
            }
              
       
        return total;
    
        }
    
    public double getTotalYearOther() throws SQLException{
        
    String mm = this.Smonth();
    String yyyy = this.getYear();
    
    DBConnection con = new DBConnection();
            
            double total = 0;
            
            String allOther = "SELECT SUM(total) FROM expenditure where  (type = 'other') AND (date LIKE '"+yyyy+"-"
                             +"%')";            
           
            PreparedStatement ps = con.getConnection().prepareStatement(allOther);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                total = resultSet.getDouble(1);
                
            }
              
       
        return total;
    
        }
    
    }

