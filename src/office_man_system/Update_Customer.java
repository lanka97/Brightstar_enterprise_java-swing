/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasindu Senarathne
 */
public class Update_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Update_Customer
     */
    public Update_Customer() {
        initComponents();
    }
    
    public Update_Customer(String customer,String nic,String phone,String address,String deposit,String typ,String bank,String cheque,String emailA) {
        
        initComponents();
        
        c_name.setText(customer);
        nic_name.setText(nic);
        phone_num.setText(phone);
        address_area.setText(address);
        deposit_amount.setText(deposit);
        bank_type2.setText(bank);
        cheque_num2.setText(cheque);
        email.setText(emailA);
        
        if(typ.equals("Cash Payment")){
            
            cahT.setSelected(true);
        }
        
        if(typ.equals("Cheque Payment")){
            
            chqT.setSelected(true);
        }
    }
    
    public void setRadioVal(String val){
        
         if(val == "Cash"){
             
        cahT.setSelected(true);
        
        }
        
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
    
    public void close(){
        
        WindowEvent windowClose;
        windowClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    
      public boolean validateLetter(String string){
	        
	        int val;
	        boolean ret = true;
	        
	        for(int i = 0; i < string.length(); i++){
	            
	            val = (int)string.charAt(i);
	            
	          if(!(((val >=65) && (val <= 90)) || ((val >= 97) && (val <= 122)) || val == 32)){
	                
	                ret = false;
	            }
	            
	        }
	        
	        return ret;
    }
    
    public boolean validatePhone(String string){
        
        if((string.length() == 12)&& (string.charAt(0) == '+')&& (string.charAt(1) == '9') && (string.charAt(2) == '4')  ){
            
            return true;
        }
        else{
            
            return false;
        }
    }
    
    public boolean validateNIC(String string){
        
        int val = string.length();
        
        char str = 0;
        
        for(int i = 0; i < string.length();i++){
	            
	    str = string.charAt(i);
            
            if(val == 10 && str == 'V'){
            
            return true;
            
            }
            
        }
          
            return false;
      
    }
    
    public boolean validateChequeNumber(String string){
        
        if(string.length() == 6){
            
            return true;
        }
        else{
            
            return false;
        }
    }
    
     public boolean validateNumbers(String string){
	        
	        int val;
	        boolean ret = true;
	        
	        for(int i = 0; i < string.length(); i++){
	            
	            val = (int)string.charAt(i);
	            
	            if(!((val <= 57) && (val >= 48 ))){
	                
	                ret = false;
	            }
	            
	        }
	        
	        return ret;
    }
     
     public boolean validateEmail(String string){
	       
	       int val;
	       
	       int at = 0;
	       int dot = 0;
	        
	        for(int i = 0; i < string.length();i++){
	            
	            val = (int)string.charAt(i);
	            
	            if(val == 64) {
	            	
	            	at = i;
	            }
	        }
	            
	        for(int j = 0; j < string.length();j++){
		            
		        val = (int)string.charAt(j);
		            
		        if(val == 46) {
		            	
		           dot = j;
		        }
	        }
	       
	        if(((at != 0) && (dot!= 0) )&&(at < dot)) {
                    
	        	return true;
	        }
	        else{
                    
	        	return false;
	        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cash_type = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        cusName_txt = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        nic_txt = new javax.swing.JLabel();
        nic_name = new javax.swing.JTextField();
        phone_num = new javax.swing.JTextField();
        phone_txt = new javax.swing.JLabel();
        address_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_area = new javax.swing.JTextArea();
        deposit_txt = new javax.swing.JLabel();
        deposit_amount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cheque_num2 = new javax.swing.JTextField();
        bank_type2 = new javax.swing.JTextField();
        chq_txt2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cahT = new javax.swing.JRadioButton();
        chqT = new javax.swing.JRadioButton();
        emailTxt = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Customer");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cusName_txt.setBackground(new java.awt.Color(255, 255, 255));
        cusName_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cusName_txt.setText("Customer Name");

        c_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_name.setToolTipText("Customer Name");

        nic_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nic_txt.setText("NIC Number");

        nic_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nic_name.setToolTipText("NIC");
        nic_name.setEnabled(false);

        phone_num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone_num.setToolTipText("Phone Number");

        phone_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phone_txt.setText("Phone Number");

        address_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address_txt.setText("Address");

        address_area.setColumns(20);
        address_area.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_area.setRows(5);
        address_area.setToolTipText("Address");
        jScrollPane1.setViewportView(address_area);

        deposit_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deposit_txt.setText("Security Deposit Amount");

        deposit_amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deposit_amount.setToolTipText("Deposit Amount");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("For Cheque Payments");

        cheque_num2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bank_type2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        chq_txt2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        chq_txt2.setText("Cheque Number");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("Bank");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheque_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chq_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bank_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bank_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chq_txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheque_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        submit_btn.setBackground(new java.awt.Color(255, 255, 255));
        submit_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Change_User_35px.png"))); // NOI18N
        submit_btn.setText("Update User");
        submit_btn.setIconTextGap(10);
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Customers");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        cahT.setBackground(new java.awt.Color(255, 255, 255));
        cash_type.add(cahT);
        cahT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cahT.setText("Cash Payment");
        cahT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cahTActionPerformed(evt);
            }
        });

        chqT.setBackground(new java.awt.Color(255, 255, 255));
        cash_type.add(chqT);
        chqT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chqT.setText("Cheque Paymet");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailTxt.setText("Email ");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setToolTipText("Phone Number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone_num, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cahT)
                        .addGap(27, 27, 27)
                        .addComponent(chqT))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nic_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nic_name, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(deposit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deposit_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(c_name, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(cusName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(cusName_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nic_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nic_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phone_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone_num, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(address_txt)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deposit_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deposit_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cahT)
                    .addComponent(chqT))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        
        
        try {
            String customer_name = c_name.getText();
            String customer_nic = nic_name.getText();
            String customer_phone = phone_num.getText();
            String customer_address = address_area.getText();
            String deposit= deposit_amount.getText();
            String bank = bank_type2.getText();
            String cheque = cheque_num2.getText();
            String emailA = email.getText();
           
            boolean cash = cahT.isSelected();
            boolean chequeT = chqT.isSelected();
            
            String paytype = "";
            
            if(cash == true){
                
                paytype = "Cash Payment";
                bank = "No";
                cheque = "No";
                
            }
            else if(chequeT = true){
                
                paytype = "Cheque Payment";
            }
            
          
             if (customer_name.isEmpty()){
             
                JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
                cusName_txt.setForeground(Color.RED);
            }
            if(customer_nic.isEmpty()){
            
                JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
                nic_txt.setForeground(Color.RED);
            }
            if(customer_address.isEmpty()){
            
                JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
                address_txt.setForeground(Color.RED);
            }
            if(customer_phone.isEmpty()){
            
                JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
                phone_txt.setForeground(Color.RED);
            }
            if(emailA.isEmpty()){
            
                JOptionPane.showMessageDialog(null, "Email Can Not Be EMPTY!");
                emailTxt.setForeground(Color.RED);
            }
            
            if(validateLetter(customer_name) == false){
            
                JOptionPane.showMessageDialog(null, "Customer name can not contain numbers or characters!");
                cusName_txt.setForeground(Color.RED);
            }
            else if(validatePhone(customer_phone) == false){
            
                JOptionPane.showMessageDialog(null, "Phone number should be like +94112700800!");
                phone_txt.setForeground(Color.RED);
            }
            else if(validateNIC(customer_nic) == false){
            
                JOptionPane.showMessageDialog(null, "Phone number should contain 10 characters including V");
                nic_txt.setForeground(Color.RED);
            }
            else if(validateChequeNumber(cheque)== false && chequeT == true){
            
            JOptionPane.showMessageDialog(null, "Cheque number should contain 6 numbers");
            chq_txt2.setForeground(Color.RED);
            
            }
             else if(validateNumbers(deposit) == false){
            
            JOptionPane.showMessageDialog(null, "Deposit Amount should contain numbers, Can not contain letters or characters");
            deposit_txt.setForeground(Color.RED);
            
        }
             else if(validateEmail(emailA) == false){
            
            
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address");
            deposit_txt.setForeground(Color.RED);
            
        }
            
            String query = "UPDATE rented_customers "
                    + "SET nic = '"+customer_nic+"' , customerName = '"+customer_name+"', address = '"+customer_address+"', phone = '"+customer_phone+"', depositAmount = '"+deposit+"', bank = '"+bank+"',chequeNum ='"+cheque+"', paidType ='"+paytype+"',email ='"+emailA+"'"
                    + "WHERE nic = '"+customer_nic+"'";
        
            PreparedStatement ps = getConnection().prepareStatement(query);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Update_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Data Updated Sucessfully", "Informer", 1);
        close();
        
        
        
        
    }//GEN-LAST:event_submit_btnActionPerformed

    private void cahTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cahTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cahTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_area;
    private javax.swing.JLabel address_txt;
    private javax.swing.JTextField bank_type2;
    private javax.swing.JTextField c_name;
    private javax.swing.JRadioButton cahT;
    private javax.swing.ButtonGroup cash_type;
    private javax.swing.JTextField cheque_num2;
    private javax.swing.JRadioButton chqT;
    private javax.swing.JLabel chq_txt2;
    private javax.swing.JLabel cusName_txt;
    private javax.swing.JTextField deposit_amount;
    private javax.swing.JLabel deposit_txt;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nic_name;
    private javax.swing.JLabel nic_txt;
    private javax.swing.JTextField phone_num;
    private javax.swing.JLabel phone_txt;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
