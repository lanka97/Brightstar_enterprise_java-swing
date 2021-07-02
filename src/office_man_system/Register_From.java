/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pasindu Senarathne
 */
public class Register_From extends javax.swing.JPanel {

 
    
    public Register_From() {
        initComponents();
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
     
          public void getMachineBrand(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT brand FROM available_machines WHERE machineSerial = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
            brand_name.setSelectedItem(result.getString(1));
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
     public void getMachineType(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT type FROM available_machines WHERE machineSerial = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
            macine_type.setSelectedItem(result.getString(1));
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
     public void getMachineStatus(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT status FROM available_machines WHERE machineSerial = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                String state = result.getString(1);
                
                if(state.equals("External Damages")){
                    
                    damage_m.setSelected(true);
                }
                
                if(state.equals("Brand New")){
                    
                    new_m.setSelected(true);
                }
                
                if(state.equals("Good Condition")){
                    
                    new_m.setSelected(true);
                }
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
      public void getMachineDiscription(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT discrip FROM available_machines WHERE machineSerial = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                discription.setText(result.getString(1));
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
     
     public void getcopyCount(String search){
        
	Connection connection = getConnection();
       
        
           String query = "SELECT copycount FROM available_machines WHERE machineSerial= '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            while(result.next()){
                
                count_copy.setText(result.getString(1));
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
         
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
    
    public boolean validateSerialNumber(String string){
        
        if(string.length() == 10){
            
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
    
    public boolean validateNewNIC(String string){
	        
	        int val;
	        boolean ret = true;
                 int val2 = string.length();
	        
	        for(int i = 0; i < string.length(); i++){
	            
	            val = (int)string.charAt(i);
	            
	            if(!((val <= 57) && (val >= 48 ) && val2 == 12)){
	                
	                ret = false;
	            }
	            
	        }
	        
	        return ret;
    }
    
    public LocalDate setDate(){
        
        return java.time.LocalDate.now();
    }
   
    public void getCustomerDetails(String search){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT customerName,address,phone,email,depositAmount,paidType,bank,chequeNum FROM rented_customers WHERE nic = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
            c_name.setText(result.getString(1));
            address_area.setText(result.getString(2));
            phone_num.setText(result.getString(3));
            email_address.setText(result.getString(4));
            deposit_amount1.setText(result.getString(5));
            bank_type.setText(result.getString(7));
            cheque_num.setText(result.getString(8));
            
            String type = result.getString(6);
            
            if(type.equals("Cash Payment")){
            
                    cahT.setSelected(true);
            }
        
            if(type.equals("Cheque Payment")){
            
                    chqT.setSelected(true);
            }
            
            
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
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

        payment_type = new javax.swing.ButtonGroup();
        machin_conditions = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        m_serial = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cusName_txt = new javax.swing.JLabel();
        nic_name = new javax.swing.JTextField();
        phone_num = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_area = new javax.swing.JTextArea();
        phone_txt = new javax.swing.JLabel();
        nic_txt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email_address = new javax.swing.JTextField();
        email_txt = new javax.swing.JLabel();
        brand_name = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        count_copy = new javax.swing.JTextField();
        copy_txt = new javax.swing.JLabel();
        serial_txt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        macine_type = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        discription = new javax.swing.JTextArea();
        address_txt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cheque_num = new javax.swing.JTextField();
        bank_type = new javax.swing.JTextField();
        chq_txt = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cahT = new javax.swing.JRadioButton();
        chqT = new javax.swing.JRadioButton();
        new_m = new javax.swing.JRadioButton();
        good_m = new javax.swing.JRadioButton();
        damage_m = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        preview = new javax.swing.JTable();
        submit_btn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        deposit_txt1 = new javax.swing.JLabel();
        deposit_amount1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        customerType = new javax.swing.JRadioButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setName(""); // NOI18N

        m_serial.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        m_serial.setToolTipText("Customer Name");
        m_serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                m_serialKeyPressed(evt);
            }
        });

        cusName_txt.setBackground(new java.awt.Color(255, 255, 255));
        cusName_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cusName_txt.setText("Customer Name");

        nic_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nic_name.setToolTipText("NIC");
        nic_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nic_nameKeyPressed(evt);
            }
        });

        phone_num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone_num.setToolTipText("Phone Number");

        address_area.setColumns(20);
        address_area.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_area.setRows(5);
        address_area.setToolTipText("Address");
        jScrollPane1.setViewportView(address_area);

        phone_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phone_txt.setText("Phone Number");

        nic_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nic_txt.setText("NIC Number");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Discription");

        email_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_address.setToolTipText("Deposit Amount");

        email_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email_txt.setText("Email");

        brand_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        brand_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Ricoh", "Toshiba", " " }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        c_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_name.setToolTipText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Machine Brand");

        count_copy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        count_copy.setToolTipText("Customer Name");

        copy_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        copy_txt.setText("Copy Count");

        serial_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        serial_txt.setText("Machine Serial");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Machine Status");

        checkout.setBackground(new java.awt.Color(255, 255, 255));
        checkout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_User_Menu_Male_35px_1.png"))); // NOI18N
        checkout.setText("Checkout");
        checkout.setIconTextGap(10);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkout_btnActionPerformed(evt);
            }
        });

        macine_type.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        macine_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Color", "Black" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Type");

        discription.setColumns(20);
        discription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        discription.setRows(5);
        discription.setToolTipText("Address");
        jScrollPane2.setViewportView(discription);

        address_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address_txt.setText("Address");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("For Cheque Payments");

        cheque_num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bank_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        chq_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        chq_txt.setText("Cheque Number");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Bank");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cheque_num, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chq_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bank_type, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bank_type, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chq_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheque_num, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        cahT.setBackground(new java.awt.Color(255, 255, 255));
        payment_type.add(cahT);
        cahT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cahT.setText("Cash Payment");
        cahT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cahTActionPerformed(evt);
            }
        });

        chqT.setBackground(new java.awt.Color(255, 255, 255));
        payment_type.add(chqT);
        chqT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chqT.setText("Cheque Paymet");

        new_m.setBackground(new java.awt.Color(255, 255, 255));
        machin_conditions.add(new_m);
        new_m.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        new_m.setText("Brand New");

        good_m.setBackground(new java.awt.Color(255, 255, 255));
        machin_conditions.add(good_m);
        good_m.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        good_m.setText("Good Conditions");

        damage_m.setBackground(new java.awt.Color(255, 255, 255));
        machin_conditions.add(damage_m);
        damage_m.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        damage_m.setText("External Damaged");

        preview.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Machine Brand", "Type", "Serial Number", "Copy Count", "Status", "Discription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        preview.setGridColor(new java.awt.Color(255, 255, 255));
        preview.setRowHeight(25);
        jScrollPane4.setViewportView(preview);

        submit_btn1.setBackground(new java.awt.Color(255, 255, 255));
        submit_btn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Add_Shopping_Cart_35px_2.png"))); // NOI18N
        submit_btn1.setText("Record");
        submit_btn1.setIconTextGap(10);
        submit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btn1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Preview Machine Logs");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Remove_Tag_15px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Edit_Row_15px.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        deposit_txt1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deposit_txt1.setText("Security Deposit Amount");

        deposit_amount1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deposit_amount1.setToolTipText("Deposit Amount");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Add_New_40px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        customerType.setBackground(new java.awt.Color(255, 255, 255));
        customerType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerType.setText("Existing Customer");
        customerType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTypeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nic_name, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(phone_num, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(email_address, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cusName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(customerType, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nic_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)
                        .addComponent(c_name)
                        .addComponent(address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deposit_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deposit_amount1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cahT)
                        .addGap(27, 27, 27)
                        .addComponent(chqT)))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(count_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(407, 407, 407)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(copy_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brand_name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(macine_type, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(new_m)
                                .addGap(18, 18, 18)
                                .addComponent(good_m)
                                .addGap(18, 18, 18)
                                .addComponent(damage_m))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(serial_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusName_txt)
                            .addComponent(customerType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(nic_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nic_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phone_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_num, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(address_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deposit_txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deposit_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cahT)
                            .addComponent(chqT))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serial_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brand_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(macine_type, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(copy_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(new_m)
                                    .addComponent(good_m)
                                    .addComponent(damage_m))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 74, Short.MAX_VALUE)
                        .addComponent(submit_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkout_btnActionPerformed
        
        String customer_name = c_name.getText();
        String customer_nic = nic_name.getText();
        String customer_phone = phone_num.getText();
        String customer_address = address_area.getText();
        String deposit= deposit_amount1.getText();
        boolean cash = cahT.isSelected();
        boolean cheque = chqT.isSelected();
        String chequeNum = cheque_num.getText();
        String bank = bank_type.getText();
        String brand = brand_name.getSelectedItem().toString();
        String machine_type = macine_type.getSelectedItem().toString();
        String copycount = count_copy.getText();
        String serialNum = m_serial.getText();
        boolean newM = new_m.isSelected();
        boolean goodM = good_m.isSelected();
        boolean damageM = damage_m.isSelected();
        String damageDis = discription.getText();
        String email = email_address.getText();
        boolean stateReg = customerType.isSelected();
        
        String machineStatus = "";
        String state = "Unregistered";
        
        if(stateReg == true){
            
            state = "Registered";
        }
        
        if(cash == true){
            
            bank = "No";
            chequeNum = "No";
        }
        
        if(newM == true){
            
            machineStatus = "Brand New";
        }
        else if(goodM == true){
            
            machineStatus = "Good Condition";
        }
        else if(damageM == true){
            
            machineStatus = "External Damages";
        }
      
        String dateIssued = setDate().toString();
        
        if((customer_name.isEmpty()) && (customer_nic.isEmpty()) && (customer_address.isEmpty()) && (customer_phone.isEmpty()) && (copycount.isEmpty()) && (serialNum.isEmpty()) ){
            
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
        }
        else{
            
        if (customer_name.isEmpty()){
             
            JOptionPane.showMessageDialog(null, "Customer Name Can Not Be EMPTY!");
            cusName_txt.setForeground(Color.RED);
        }
        if(customer_nic.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "NIC Number Can Not Be EMPTY!");
            nic_txt.setForeground(Color.RED);
        }
        if(customer_address.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Address Can Not Be EMPTY!");
            address_txt.setForeground(Color.RED);
        }
        if(customer_phone.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Phone Can Not Be EMPTY!");
            phone_txt.setForeground(Color.RED);
        }
        if(copycount.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Copy Count Value Can Not Be EMPTY!");
            copy_txt.setForeground(Color.RED);
            
        }
        if(serialNum.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Serial Number Can Not Be EMPTY!");
            copy_txt.setForeground(Color.RED);
        }
        if(email.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Email Can Not Be EMPTY!");
            copy_txt.setForeground(Color.RED);
        }
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
            
            JOptionPane.showMessageDialog(null, "Old NIC number should contain 10 characters including V, New NIC should contain 12 numbers");
            nic_txt.setForeground(Color.RED);
            
        }
        else if(validateChequeNumber(chequeNum)== false && cheque == true){
            
            JOptionPane.showMessageDialog(null, "Cheque number should contain 6 numbers");
            chq_txt.setForeground(Color.RED);
            
        }
        else if(validateNumbers(serialNum) == false || validateSerialNumber(serialNum) == false){
            
            JOptionPane.showMessageDialog(null, "Serial number should contain 10 numbers, Can not contain letters or characters");
            serial_txt.setForeground(Color.RED);
        }
        else if(validateNumbers(copycount)== false){
            
            JOptionPane.showMessageDialog(null, "Copy Count should contain numbers, Can not contain letters or characters");
            copy_txt.setForeground(Color.RED);
        }
        else if(validateNumbers(deposit) == false){
            
            JOptionPane.showMessageDialog(null, "Deposit Amount should contain numbers, Can not contain letters or characters");
            deposit_txt1.setForeground(Color.RED);
            
        }
        else if(validateEmail(email) == false){
            
            
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address");
            email_txt.setForeground(Color.RED);
            
        }
        else {
            
            
            CheckOut check = new CheckOut();
            check = new CheckOut(customer_name,customer_nic,customer_phone,customer_address,deposit,chequeNum,dateIssued,bank,email,state);
            
            int rows=preview.getRowCount();

            for(int row = 0; row<rows; row++)
            {
                String name = (String)preview.getValueAt(row, 0);
                String typeOfMachine = (String)preview.getValueAt(row, 1);
                String serialNumber = (String)preview.getValueAt(row, 2);
                String copyC = (String)preview.getValueAt(row, 3);
                String statusOfMachine = (String)preview.getValueAt(row, 4);
                String machDis = (String)preview.getValueAt(row, 5);        
                
                CheckOut check1 = check;
                check1.addMachine(name, typeOfMachine, serialNumber, copyC, statusOfMachine, machDis);
            }
          
            check.setVisible(true);
            
            //RentService_MainUI main = new RentService_MainUI();
            //main.closeWindow();
            
        }
                
                
       
        
        
    }//GEN-LAST:event_checkout_btnActionPerformed

    private void cahTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cahTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cahTActionPerformed

    private void submit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btn1ActionPerformed
       
        String customer_name = c_name.getText();
        String customer_nic = nic_name.getText();
        String customer_phone = phone_num.getText();
        String customer_address = address_area.getText();
        String deposit= deposit_amount1.getText();
        boolean cash = cahT.isSelected();
        boolean cheque = chqT.isSelected();
        String chequeNum = cheque_num.getText();
        String bank = bank_type.getText();
        String brand = brand_name.getSelectedItem().toString();
        String type = macine_type.getSelectedItem().toString();
        String copyCount = count_copy.getText();
        String serial = m_serial.getText();
        boolean newM = new_m.isSelected();
        boolean goodM = good_m.isSelected();
        boolean damageM = damage_m.isSelected();
        String dis = discription.getText();
        String email = email_address.getText();
        
        String machineStatus = "";
         
        if(newM == true){
            
            machineStatus = "Brand New";
        }
        else if(goodM == true){
            
            machineStatus = "Good Condition";
        }
        else if(damageM == true){
            
            machineStatus = "External Damages";
        }
        
        if (customer_name.isEmpty()){
             
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
            cusName_txt.setForeground(Color.RED);
        }
        else if(customer_nic.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
            nic_txt.setForeground(Color.RED);
        }
        else if(customer_address.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
            address_txt.setForeground(Color.RED);
        }
        else if(customer_phone.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
            phone_txt.setForeground(Color.RED);
        }
        else if(copyCount.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
            copy_txt.setForeground(Color.RED);
            
        }
        else if(serial.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Can Not Be EMPTY!");
            copy_txt.setForeground(Color.RED);
        }
        
        else if(validateLetter(customer_name) == false){
            
            JOptionPane.showMessageDialog(null, "Customer name can not contain numbers or characters!");
            cusName_txt.setForeground(Color.RED);
        }
        else if(validatePhone(customer_phone) == false){
            
            JOptionPane.showMessageDialog(null, "Phone number should be like +94112700800!");
            phone_txt.setForeground(Color.RED);
        }
        else if(validateNIC(customer_nic) == false){
          
            JOptionPane.showMessageDialog(null, "Old NIC number should contain 10 characters including V, New NIC should contain 10 numbers");
            nic_txt.setForeground(Color.RED);
            
        }
        else if(validateChequeNumber(chequeNum)== false && cheque == true){
            
            JOptionPane.showMessageDialog(null, "Cheque number should contain 6 numbers");
            chq_txt.setForeground(Color.RED);
            
        }
        else if(validateNumbers(serial) == false || validateSerialNumber(serial) == false){
            
            JOptionPane.showMessageDialog(null, "Serial number should contain 10 numbers, Can not contain letters r characters");
            serial_txt.setForeground(Color.RED);
        }
        else if(validateNumbers(copyCount)== false){
            
            JOptionPane.showMessageDialog(null, "Copy Count should contain numbers, Can not contain letters or characters");
            copy_txt.setForeground(Color.RED);
        }
        else if(validateNumbers(deposit) == false){
            
            JOptionPane.showMessageDialog(null, "Deposit Amount should contain numbers, Can not contain letters or characters");
            deposit_txt1.setForeground(Color.RED);
            
        }
        else if(validateEmail(email) == false){
            
            
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address");
            email_txt.setForeground(Color.RED);
            
        }
        else {
            
            Object[] row = { brand, type, serial, copyCount, machineStatus,dis};
        
            DefaultTableModel model = (DefaultTableModel) preview.getModel();
        
            model.addRow(row);
        }
        
        
    }//GEN-LAST:event_submit_btn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) preview.getModel();
        
        try {
            
            int index = preview.getSelectedRow();
            model.removeRow(index);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) preview.getModel();
        
        int selectedRowIndex = preview.getSelectedRow();
        int selectedColIndex = preview.getSelectedColumn();
        
        String val = JOptionPane.showInputDialog("Enter Here New Value");
        
        model.setValueAt(val, selectedRowIndex, selectedColIndex);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void m_serialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_serialKeyPressed
        
        String serial = m_serial.getText();
        
        getMachineType(serial);
        getMachineBrand(serial);
        getcopyCount(serial);
        getMachineStatus(serial);
        getMachineDiscription(serial);
    }//GEN-LAST:event_m_serialKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        c_name.setText("Pasindu Senarathne");
        nic_name.setText("962791790V");
        address_area.setText("No 1,Street 1,City 1,Postal Code");
        phone_num.setText("+94112987654");
        email_address.setText("pasindubahagya@gmail.com");
        deposit_amount1.setText("40000");
        chqT.setSelected(true);
        bank_type.setText("Peoples Bank");
        cheque_num.setText("234098");
        m_serial.setText("7687213456");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customerTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTypeMouseClicked
       
        
    }//GEN-LAST:event_customerTypeMouseClicked

    private void nic_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nic_nameKeyPressed
       
       boolean typeC = customerType.isSelected();
       
       if(typeC == true){
           
           String nic = nic_name.getText();
           getCustomerDetails(nic);
       }
    }//GEN-LAST:event_nic_nameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_area;
    private javax.swing.JLabel address_txt;
    private javax.swing.JTextField bank_type;
    private javax.swing.JComboBox<String> brand_name;
    private javax.swing.JTextField c_name;
    private javax.swing.JRadioButton cahT;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField cheque_num;
    private javax.swing.JRadioButton chqT;
    private javax.swing.JLabel chq_txt;
    private javax.swing.JLabel copy_txt;
    private javax.swing.JTextField count_copy;
    private javax.swing.JLabel cusName_txt;
    private javax.swing.JRadioButton customerType;
    private javax.swing.JRadioButton damage_m;
    private javax.swing.JTextField deposit_amount1;
    private javax.swing.JLabel deposit_txt1;
    private javax.swing.JTextArea discription;
    private javax.swing.JTextField email_address;
    private javax.swing.JLabel email_txt;
    private javax.swing.JRadioButton good_m;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField m_serial;
    private javax.swing.ButtonGroup machin_conditions;
    private javax.swing.JComboBox<String> macine_type;
    private javax.swing.JRadioButton new_m;
    private javax.swing.JTextField nic_name;
    private javax.swing.JLabel nic_txt;
    private javax.swing.ButtonGroup payment_type;
    private javax.swing.JTextField phone_num;
    private javax.swing.JLabel phone_txt;
    private javax.swing.JTable preview;
    private javax.swing.JLabel serial_txt;
    private javax.swing.JButton submit_btn1;
    // End of variables declaration//GEN-END:variables
}
