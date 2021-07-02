/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

/**
 *
 * @author Pasindu Senarathne
 */
public class AvailableMachines {
    
    private String brand;
    private String type;
    private String serial;
    private String copycount;
    private String status;
    private String discrip;
    
 
    public String getBrand(){
        
        return brand;
    }
    
    public void setBrand(String brand){
        
        this.brand = brand;
    }
    
    public String getType(){
        
        return type;
    }
    
    public void setType(String type){
        
        this.type = type;
    }
    
    public String getSerial(){
        
        return serial;
    }
    
    public void setSerial(String serial){
        
        this.serial = serial;
    }
    
    public String getCopyCount(){
        
        return copycount;
    }
    
    public void setCopyCount(String copycount){
        
        this.copycount = copycount;
    }
    
    public String getStatus(){
        
        return status;
    }
    
    public void setStatus(String status){
        
        this.status = status;
    }
    
    public String getDiscription(){
        
        return discrip;
    }
    
    public void setDiscription(String discrip){
        
        this.discrip = discrip;
    }
    
}

