/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/**
 *
 * @author Lanka
 */
public class chequeTest {


    public static boolean chequeNum(String str)
    {
        if(str.length() == 6){
         return(str.chars().allMatch( Character::isDigit ) );
       }
        else if(Integer.parseInt(str) == 0  )
            return true;
        else 
            return false;
     }
        
}        
 

    

