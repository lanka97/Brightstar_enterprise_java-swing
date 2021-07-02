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
public class RentedCustomers {
    
    private String invoice_id;
    private String customerName;
    private String customerNIC;
    private String customerPhone;
    private String customerAddress;
    private String depositAmount;
    private String paymentType;
    private String bankName;
    private String chequeNumber;
    private String emailAddress;

    public String getInvoice_id() {
        return invoice_id;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    /*
    public RentedCustomers(String invoiceid,String name,String nic,String phone,String address,String deposit,String type,String bankName,String chequeNum){
        
        invoiceid = invoice_id;
        name = customerName;
        nic = customerNIC;
        phone= customerPhone;
        address = customerAddress;
        deposit = depositAmount;
        type = paymentType;
        bankName = this.bankName;
        chequeNum = chequeNumber;
    }
    */
    
    public String getInvoiceId(){
        
        return invoice_id;
    }
    
    public void setInvoiceId(String invoice_id){
        
        this.invoice_id = invoice_id;
    }
    
    public String getCustomerName(){
        
        return customerName;
    }
    
    public void setCustomerName(String customerName){
        
        this.customerName = customerName;
    }
    
    public String getCustomerNIC(){
        
        return customerNIC;
    }
    
    public void setCustomerNIC(String customerNIC){
        
        this.customerNIC = customerNIC;
    }
    
    public String getCustomerPhone(){
        
        return customerPhone;
    }
    
    public void setCustomerPhone(String customerPhone){
        
        this.customerPhone = customerPhone;
    }
    
    public String getCustomerAddress(){
        
        return customerAddress;
    }
    
    public void setCustomerAddress(String customerAddress){
        
        this.customerAddress = customerAddress;
    }
    
    public String getBankName(){
        
        return bankName;
    }
    
    public void setBankName(String bankName){
        
        this.bankName = bankName;
    }
    
    public String getDeposit(){
        
        return depositAmount;
    }
    
    public void setDeposit(String depositAmount){
        
        this.depositAmount = depositAmount;
        
    }
    
    public String getPaymentType(){
        
        return paymentType;
    }
    
    public void setPaymentType(String paymentType){
        
        this.paymentType = paymentType;
    }
    
    public String getChequeNumber(){
        
        return chequeNumber;
    }
    
    public void setChequeNumber(String chequeNumber){
        
        this.chequeNumber = chequeNumber;
    }
    
    
   
}
