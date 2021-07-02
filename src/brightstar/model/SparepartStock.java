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
public class SparepartStock {

    private String brand;
    private String model;
    private String partname;
    private String partNumber;
    private double unitPrice;
    private int quantity;
    private double total;
    // other attributes

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total;
    }

}
