/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportive;

 

public class GetMonth {



public static String GetMonth(int num){
   // this.num = num;
    String monthString;
    
        switch (num) {
            case 0:  monthString = "January";
                     break;
            case 1:  monthString = "February";
                     break;
            case 2:  monthString = "March";
                     break;
            case 3:  monthString = "April";
                     break;
            case 4:  monthString = "May";
                     break;
            case 5:  monthString = "June";
                     break;
            case 6:  monthString = "July";
                     break;
            case 7:  monthString = "August";
                     break;
            case 8:  monthString = "September";
                     break;
            case 9: monthString = "October";
                     break;
            case 10: monthString = "November";
                     break;
            case 11: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }

    return monthString;
    
}

public static int setmonth(String month){

    int intMonth;
    
    switch (month) {
            case "January":  intMonth = 0 ;
                     break;
            case "February":  intMonth = 1;
                     break;
            case "March":  intMonth = 2;
                     break;
            case "April":  intMonth = 3;
                     break;
            case "May":  intMonth = 4;
                     break;
            case "June":  intMonth = 5;
                     break;
            case "July":  intMonth = 6;
                     break;
            case "August": intMonth = 7;
                     break;
            case "September":  intMonth =8 ;
                     break;
            case "October": intMonth = 9;
                     break;
            case "November": intMonth = 10;
                     break;
            case "December": intMonth = 11;
                     break;
            default: intMonth= -99;
                     break;
    }             
        return intMonth;
    

}
    
}
