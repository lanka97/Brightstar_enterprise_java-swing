/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.model;

/**
 *
 * @author Pasan
 */
public class SparepartBuyer {

    private String buyerID;
    private String nic;
    private String name;
    private String phone;
    private String address;
    private String company;
    private String email;

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    public String getBuyerID() {
        return this.buyerID;
    }

    public void setNIC(String nic) {
        this.nic = nic;
    }

    public String getNIC() {
        return this.nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

}
