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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import office_man_system.GenaratePDFForReport;

/**
 *
 * @author Pasindu Senarathne
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
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
    
     public static String getMonth(String string){
		 
		 	String month = string;
		 	
		 	String monthString="";  
		 	
		 	switch(month){    
		  
		    case "January": monthString="01";  
		    break;    
		    case "February": monthString="02";  
		    break;    
		    case "March": monthString="03";  
		    break;    
		    case "April": monthString="04";  
		    break;    
		    case "May": monthString="05";  
		    break;    
		    case "June": monthString="06";  
		    break;    
		    case "July": monthString="07";  
		    break;    
		    case "August": monthString="08";  
		    break;    
		    case "September": monthString="09";  
		    break;    
		    case "October": monthString="10";  
		    break;    
		    case "November": monthString="11";  
		    break;    
		    case "December": monthString="12";  
		    break;    
		    default:System.out.println("Invalid Month!");    
		    }  
		 	
		 	return monthString;
	}
     
     
        public void getMachineCount(String string){
        
        String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT COUNT(serialNum) FROM rented_machine_records WHERE date LIKE '_____"+month+"%' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                rentMachineCount.setText(result.getString(1));
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
    
        public void getPendingCount(String string){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT COUNT(serial) FROM rent WHERE month = '"+string+"' AND status = 'Pending' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                pendingPaymentCount.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
        
        public void getSumOfProfits(String string){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT SUM(amount) FROM rent WHERE month = '"+string+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                profitCount.setText(result.getString(1));
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
        
         public void getMostRentedMachineCount(String string){
        
        String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT MAX(machineBrand) FROM rented_machine_records WHERE date LIKE '_____"+month+"%' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                machineBrand.setText(result.getString(1));
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
         
    public void getNewMachineCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT COUNT(serialNum) FROM rented_machine_records WHERE date LIKE '_____"+month+"%' AND status = 'Brand New' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                numOfMachines.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
    
    public void getUsedMachineCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT COUNT(serialNum) FROM rented_machine_records WHERE date LIKE '_____"+month+"%' AND status = 'Good Condition' OR status = 'External Damages' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                numOfUsedMachines.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
         public void getColorMachineCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT COUNT(serialNum) FROM rented_machine_records WHERE date LIKE '_____"+month+"%' AND machineType = 'Color' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                numOfColorMachines.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
        public void getBlackMachineCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT COUNT(serialNum) FROM rented_machine_records WHERE date LIKE '_____"+month+"%' AND machineType = 'Black' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                numOfBlackMachines.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
    
        public void getCustomerCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT MAX(nic) FROM rented_machine_records WHERE date LIKE '_____"+month+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                customer.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
        
        
    }
        
        public void getMaxTypeCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT MAX(machineType) FROM rented_machine_records WHERE date LIKE '_____"+month+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                mostRentedTypeOfMachine.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
        
          public void getPayTypeCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT MAX(type) FROM rent WHERE date LIKE '_____"+month+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                mostUsedMethod.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
          
          public void getMaxSaleDateCount(String string){
        
         String month = getMonth(string);
        
	Connection connection = getConnection();
       
        
           String query = "SELECT MAX(date) FROM rented_machine_records WHERE date LIKE '_____"+month+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                date.setText(result.getString(1));
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
          
           public void getMaxPendingCount(String string){
        
        
	Connection connection = getConnection();
       
        
           String query = "SELECT MAX(customerNIC) FROM rent WHERE month = '"+string+"' AND status = 'Pending' ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                pendingPaymentCount.setText(result.getString(1));
                
                
              
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numOfBlackMachines = new javax.swing.JLabel();
        numOfColorMachines = new javax.swing.JLabel();
        numOfUsedMachines = new javax.swing.JLabel();
        numOfMachines = new javax.swing.JLabel();
        machineBrand = new javax.swing.JLabel();
        profitCount = new javax.swing.JLabel();
        pendingPaymentCount = new javax.swing.JLabel();
        rentMachineCount = new javax.swing.JLabel();
        pdf_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        customer = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mostRentedTypeOfMachine = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mostUsedMethod = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Monthly Analysis Report");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monthly Analysis Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        monthBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                monthBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select Month");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Number Of Rented Machines");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Number Of Pending Payments");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Total Rent Profits (LKR)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Most Rented Machine Brand");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Number Of Brand New Machines Rented");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Number Of Used Machines Rented");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Number Of Color Machines Rented");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Number Of Black and White Machines Rented");

        numOfBlackMachines.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numOfBlackMachines.setText("jLabel11");

        numOfColorMachines.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numOfColorMachines.setText("jLabel11");

        numOfUsedMachines.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numOfUsedMachines.setText("jLabel11");

        numOfMachines.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numOfMachines.setText("jLabel11");

        machineBrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        machineBrand.setText("jLabel11");

        profitCount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profitCount.setText("jLabel11");

        pendingPaymentCount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pendingPaymentCount.setText("jLabel11");

        rentMachineCount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rentMachineCount.setText("jLabel11");

        pdf_btn.setBackground(new java.awt.Color(255, 255, 255));
        pdf_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pdf_btn.setForeground(new java.awt.Color(102, 102, 102));
        pdf_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_PDF_37px.png"))); // NOI18N
        pdf_btn.setText("Create PDF");
        pdf_btn.setIconTextGap(15);
        pdf_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdf_btnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Most Machine Issued Customer");

        customer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customer.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Most Issued Machine Type");

        mostRentedTypeOfMachine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostRentedTypeOfMachine.setText("jLabel11");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Most Used Payment Method For Pay Rent");

        mostUsedMethod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostUsedMethod.setText("jLabel11");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Day Of Most Machine Rented");

        date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthBox, 0, 295, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(pdf_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(numOfColorMachines, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numOfUsedMachines, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numOfMachines, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(machineBrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(profitCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pendingPaymentCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rentMachineCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numOfBlackMachines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mostUsedMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mostRentedTypeOfMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentMachineCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pendingPaymentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profitCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(machineBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfMachines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfUsedMachines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostRentedTypeOfMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfColorMachines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfBlackMachines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostUsedMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(pdf_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void monthBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_monthBoxPopupMenuWillBecomeInvisible
       
        String month = monthBox.getSelectedItem().toString();
        getMachineCount(month);
        getPendingCount(month);
        getSumOfProfits(month);
        getMostRentedMachineCount(month);
        getNewMachineCount(month);
        getUsedMachineCount(month);
        getColorMachineCount(month);
        getBlackMachineCount(month);
        getCustomerCount(month);
        getMaxTypeCount(month);
        getPayTypeCount(month);
        getMaxSaleDateCount(month);
    }//GEN-LAST:event_monthBoxPopupMenuWillBecomeInvisible

    private void pdf_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdf_btnActionPerformed
        
       String rentedCount = rentMachineCount.getText();
       String pendingPay = pendingPaymentCount.getText();
       String profits = profitCount.getText();
       String mostcount = machineBrand.getText();
       String newcount = numOfMachines.getText();
       String usedcount = numOfUsedMachines.getText();
       String colorcount = numOfColorMachines.getText();
       String blackcount = numOfBlackMachines.getText();
       String month = monthBox.getSelectedItem().toString();
       String customerM = customer.getText();
       String type =mostRentedTypeOfMachine.getText();
       String method = mostUsedMethod.getText();
       String dateMost = date.getText();
       
       
       GenaratePDFForReport.createPDF(month, rentedCount, pendingPay, profits, mostcount, newcount, usedcount, colorcount, blackcount,customerM,type,method,dateMost);
        JOptionPane.showMessageDialog(null, "PDF Document Created!");
    }//GEN-LAST:event_pdf_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customer;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel machineBrand;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JLabel mostRentedTypeOfMachine;
    private javax.swing.JLabel mostUsedMethod;
    private javax.swing.JLabel numOfBlackMachines;
    private javax.swing.JLabel numOfColorMachines;
    private javax.swing.JLabel numOfMachines;
    private javax.swing.JLabel numOfUsedMachines;
    private javax.swing.JButton pdf_btn;
    private javax.swing.JLabel pendingPaymentCount;
    private javax.swing.JLabel profitCount;
    private javax.swing.JLabel rentMachineCount;
    // End of variables declaration//GEN-END:variables
}
