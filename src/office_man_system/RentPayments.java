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
public class RentPayments {
    
    private String cusNIC;
    private String brand;
    private double amount;
    private String type;
    private String paidDate;
    private String chequeNumber;
    private String bank;
    private String month;
    private String status;
    private String serial;

    public void setMonth(String month) {
        this.month = month;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMonth() {
        return month;
    }

    public String getStatus() {
        return status;
    }

    public String getSerial() {
        return serial;
    }
    

  
    
   public void setCusNIC(String cusNIC) {
        this.cusNIC = cusNIC;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCusNIC() {
        return cusNIC;
    }

    public String getBrand() {
        return brand;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setRentMonth(String month) {
        this.month = month;
    }

    public String getRentMonth() {
        return month;
    }

  
}