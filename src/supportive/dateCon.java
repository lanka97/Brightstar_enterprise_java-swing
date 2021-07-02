/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportive;

/**
 *
 * @author Lanka
 */
public class dateCon {

java.util.Date utilDate = new java.util.Date();
java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    
public static java.sql.Date convert (java.util.Date date){

        java.sql.Date sqlDate;
        sqlDate = new java.sql.Date(date.getDate());

        return sqlDate;
}

    
}
