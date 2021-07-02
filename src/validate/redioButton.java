/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import javax.swing.ButtonGroup;
import supportive.GroupButtonUtils;
//import static supportive.GroupButtonUtils.*;

public class redioButton {
    
    public static boolean checkPay(ButtonGroup buttonGroup){
        
        String type = GroupButtonUtils.getSelectedButtonText(buttonGroup );
  
        if(type == "cash" || type == "cheque" ){
            return true;
        }
        else{
            return false;
        }
    } 
    
    public static boolean chechtype(ButtonGroup buttonGroup){
      
        String type = GroupButtonUtils.getSelectedButtonText(buttonGroup );
  
        if(type == "rent" || type == "maintenance" ||type ==  "phone"  || type ==  "water" || type == "electricity" ){
            return true;
        }
        else{
            return false;
        }
    } 
    
    
 }
    

