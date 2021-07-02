/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import office_man_system.GenerateRentPaymentInvoicePDF;
import office_man_system.SendInvoiceEmail;

/**
 *
 * @author Pasindu Senarathne
 */
public class Rent_invoice_form extends javax.swing.JPanel {

    /**
     * Creates new form Rent_invoice_form
     */
    public Rent_invoice_form() {
        initComponents();
        
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December" };

        Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];
        
        monthRent.setSelectedItem(month);
        
    }
    
    public double calcRent(int count_current,int count_previous, String type){
        
        double rent = 0;
        
        if(type == "Color"){
            
            rent = (count_current - count_previous) * 25;
            
        }
        if(type == "Black"){
            
            rent = (count_current - count_previous) * 1.25;
        }
        
        return rent;
    }
    
    public Connection getConnection(){
        
        Connection con;
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office_management_system?autoReconnect=true&useSSL=false","root","root");
            return con;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
      
    }
    
     public void getSerial(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT serialNum,machineBrand,machineType FROM rented_machine_records WHERE nic = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
              serialNumbers.addItem(result.getString(1)+" => "+result.getString(2)+" / "+result.getString(3));
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
     public void getMachineBrand(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT machineBrand FROM rented_machine_records WHERE serialNum = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
            brandBox.setSelectedItem(result.getString(1));
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
     public void getMachineType(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT machineType FROM rented_machine_records WHERE serialNum = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
            typeBox.setSelectedItem(result.getString(1));
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
     public String getcopyCount(String search){
        
        String count = null;
	Connection connection = getConnection();
       
        
           String query = "SELECT copyCount FROM rented_machine_records WHERE serialNum = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            while(result.next()){
            count = result.getString(1);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
        return count;
         
    }
     public String getEmail(String search){
        
        String count = null;
	Connection connection = getConnection();
       
        
           String query = "SELECT email FROM rented_customers WHERE nic = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            while(result.next()){
            count = result.getString(1);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
        return count;
         
    }
     
     
     public void getCustomerName(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT customerName FROM rented_customers WHERE nic = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
              customerName.setText(result.getString(1));
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
      
    public LocalDate setDate(){
        
        return java.time.LocalDate.now();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinField1 = new com.toedter.components.JSpinField();
        jPanel2 = new javax.swing.JPanel();
        customerNIC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        brandBox = new javax.swing.JComboBox<>();
        submit_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cheque_num = new javax.swing.JTextField();
        bank_name = new javax.swing.JTextField();
        chq_txt1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cash_payment_type = new javax.swing.JRadioButton();
        cheque_payment_type = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        serialNumbers = new javax.swing.JComboBox<>();
        customerName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monthRent = new javax.swing.JComboBox<>();
        copyCounter = new javax.swing.JTextField();
        totalRent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        customerNIC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerNICKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Month");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Brand");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Payment Type");

        brandBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        brandBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Toshiba", "Ricoh" }));

        submit_btn.setBackground(new java.awt.Color(255, 255, 255));
        submit_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Print_35px.png"))); // NOI18N
        submit_btn.setText("Submit And Print");
        submit_btn.setIconTextGap(10);
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("For Cheque Payments");

        cheque_num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bank_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        chq_txt1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        chq_txt1.setText("Cheque Number");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Bank");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheque_num, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chq_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chq_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheque_num, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        buttonGroup1.add(cash_payment_type);
        cash_payment_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cash_payment_type.setText("Cash Payment");

        buttonGroup1.add(cheque_payment_type);
        cheque_payment_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cheque_payment_type.setText("Cheque Payment");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Customer NIC");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Total Payment");

        typeBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Color", "Black" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Type ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Machine Serial");

        serialNumbers.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        serialNumbers.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                serialNumbersPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        customerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Current Copy Count");

        monthRent.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        monthRent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", " February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        copyCounter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        copyCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyCounterActionPerformed(evt);
            }
        });
        copyCounter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                copyCounterKeyPressed(evt);
            }
        });

        totalRent.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel1.setText("Rs.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(submit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerNIC)
                        .addComponent(customerName)
                        .addComponent(serialNumbers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monthRent, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cash_payment_type)
                            .addGap(18, 18, 18)
                            .addComponent(cheque_payment_type))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(brandBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalRent, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serialNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cash_payment_type)
                    .addComponent(cheque_payment_type))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brandBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monthRent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
      
        String cusNIC = customerNIC.getText();
        String cusName = customerName.getText();
        String bankName = bank_name.getText();
        String chequeNumber = cheque_num.getText();
        String count = copyCounter.getText();
        String total2 = totalRent.getText();
        double total = Double.parseDouble(total2);
        String serial_number = serialNumbers.getSelectedItem().toString();
        String brandOfMachine = brandBox.getSelectedItem().toString();
        String typeOfMachine = typeBox.getSelectedItem().toString();
        boolean cashType = cash_payment_type.isSelected();
        boolean chequeType = cheque_payment_type.isSelected();
        String date = setDate().toString();
        String status = null;
        String paytype = null;
        String month = monthRent.getSelectedItem().toString();
        String copy_counter =copyCounter.getText();
        String getserial = serialNumbers.getSelectedItem().toString();
        String serialN = getserial.substring(0, 10);
       
        
        
        if(cashType == true){
            
            status = "Completed";
            paytype ="Cash Payment";
        }
        
        if(chequeType == true){
            
            status = "Pending";
            paytype ="Cheque Payment";
        }
        
        
          
        if(cashType == true){
            
            bankName = "No";
            chequeNumber = "No";
        }
        
         //String addQuery = "INSERT INTO rent VALUES(?, ?, ?, ?, ?, ?, ?, ?,?,?)";
        
         
       try {
           PreparedStatement ps;
           String query1 = "UPDATE rent "
                    + "SET amount = '"+total+"',type = '"+paytype+"',date = '"+date+"',chequeNum = '"+chequeNumber+"',bank = '"+bankName+"',status = '"+status+"'"
                    + "WHERE customerNIC = '"+cusNIC+"' AND serial = '"+serialN+"'";
        
            ps = getConnection().prepareStatement(query1);
            
            ps.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
       
    }//GEN-LAST:event_submit_btnActionPerformed
 
        try{
           
            PreparedStatement ps;
         String query2 = "UPDATE rented_machine_records "
                    + "SET copyCount = '"+count+"'"
                    + "WHERE nic = '"+cusNIC+"' AND serialNum = '"+serialN+"'";
        
            ps = getConnection().prepareStatement(query2);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Update_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Data Updated Sucessfully", "Informer", 1);
        
        
        GenerateRentPaymentInvoicePDF.createPDF(cusNIC, date,paytype,bankName,chequeNumber,total2,cusName,serialN,brandOfMachine,month,copy_counter);
        
        String email = getEmail(cusNIC);
        
        if(paytype.equals("Cash Payment")){
            
            SendInvoiceEmail.create_sendEmail(month, serialN,email);
        }
        
    }
    
    private void customerNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerNICKeyPressed
       
       String cusNIC = customerNIC.getText();
      
        getSerial(cusNIC);
        getCustomerName(cusNIC);
       
    }//GEN-LAST:event_customerNICKeyPressed

    private void serialNumbersPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_serialNumbersPopupMenuWillBecomeInvisible
        String getserial = serialNumbers.getSelectedItem().toString();
        String serial = getserial.substring(0, 10);
        System.out.println(serial);
        getMachineBrand(serial);
        getMachineType(serial);
    }//GEN-LAST:event_serialNumbersPopupMenuWillBecomeInvisible

    private void copyCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyCounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyCounterActionPerformed

    private void copyCounterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_copyCounterKeyPressed
         String type = typeBox.getSelectedItem().toString();
       String counterC = null; 
               counterC = copyCounter.getText();
       int count_cur = Integer.parseInt(counterC);
       
       if(counterC.isEmpty()){
           
           count_cur = 0;
       }
       
       String getserial = serialNumbers.getSelectedItem().toString();
        String serial = getserial.substring(0, 10);
        
               
       String counterP = null; 
               counterP = getcopyCount(serial);
       int count_prev = Integer.parseInt(counterP);
        
       System.out.println(counterP);
        
        Double rent = calcRent(count_cur,count_prev,type);
        
        totalRent.setText(rent.toString());
    }//GEN-LAST:event_copyCounterKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bank_name;
    private javax.swing.JComboBox<String> brandBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cash_payment_type;
    private javax.swing.JTextField cheque_num;
    private javax.swing.JRadioButton cheque_payment_type;
    private javax.swing.JLabel chq_txt1;
    private javax.swing.JTextField copyCounter;
    private javax.swing.JTextField customerNIC;
    private javax.swing.JTextField customerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JComboBox<String> monthRent;
    private javax.swing.JComboBox<String> serialNumbers;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel totalRent;
    private javax.swing.JComboBox<String> typeBox;
    // End of variables declaration//GEN-END:variables
}
