/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import java.awt.Color;

/**
 *
 * @author Pasindu Senarathne
 */
public class LoadScreen {
    
    public static void main(String[] args) throws InterruptedException{
      
        load_screen load = new load_screen();
        load.setVisible(true);
        
        Home home = new Home();
        
        try{
            for(int i = 0; i <= 100; i++){
                
                Thread.sleep(40);
                load.loadingtext.setText(Integer.toString(i)+"%");
                
                load.loadingBar.setValue(i);
                
                if(i == 100){
                    load.dispose();
                    home.setVisible(true);
                }
            }
        }
        catch (Exception e){
            
        }
        
        
    }
}
