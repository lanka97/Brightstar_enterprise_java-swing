/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import db.dbconnect;
import static db.dbconnect.connect;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import office_man_system.Home;
import reports.reportGen;


public class FORM2 extends javax.swing.JFrame {

    ResultSet rs   = null;
    PreparedStatement ps = null;
    String primaryKey;
    String SprimaryKey;
    //Connection con = null;
    
    public FORM2() {
    
            initComponents();
            tableLoad(); // employee table
            SupplierTableLoad(); // Supplier table
            getEmpID();
            getPaysheetID();
            //update_jTable1();//update tabele
            //con = dbconnect.connect();//connection
            supplier_panel.setVisible(false);
            paysheet_panel.setVisible(false);
        
    }
    /*table update*/
    /*private void update_jTable1(){
    
        try {
            String sql = "SELECT * FROM paysheet";
            ps  = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }*/
    /*end*/
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        btn_emp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btn_sup = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btn_pay = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        sup_panel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        del_emp = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        emp_del1 = new javax.swing.JButton();
        sup_canc4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        emp1_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        SName = new javax.swing.JTextField();
        phoneNum = new javax.swing.JTextField();
        DOB = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        nic = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearAllBtn = new javax.swing.JButton();
        btnDemo = new javax.swing.JButton();
        supplier_panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        compnyName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        compnyAddress = new javax.swing.JTextArea();
        compnyEmail = new javax.swing.JTextField();
        compnyPhone = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        compnyInsert = new javax.swing.JButton();
        compnyUpdate = new javax.swing.JButton();
        compnyDelete = new javax.swing.JButton();
        compnyClearall = new javax.swing.JButton();
        demobtn2 = new javax.swing.JButton();
        paysheet_panel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        payEmpID = new javax.swing.JComboBox<>();
        payEmpName = new javax.swing.JTextField();
        payIssueDate = new com.toedter.calendar.JDateChooser();
        payYear = new javax.swing.JTextField();
        payMonth = new javax.swing.JComboBox<>();
        payRole = new javax.swing.JTextField();
        totWorkHours = new javax.swing.JComboBox<>();
        payBonus = new javax.swing.JTextField();
        payOtRate = new javax.swing.JTextField();
        payAdditionPayment = new javax.swing.JTextField();
        payAttendance = new javax.swing.JTextField();
        payTotSalary = new javax.swing.JTextField();
        payPrintBtn = new javax.swing.JButton();
        payClearBtn = new javax.swing.JButton();
        paySaveBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        recept = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        demoBtn3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        paysheetIdBox = new javax.swing.JComboBox<>();
        delBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Bg.setBackground(new java.awt.Color(255, 255, 255));

        sidepane.setBackground(new java.awt.Color(0, 51, 153));
        sidepane.setPreferredSize(new java.awt.Dimension(300, 800));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_emp.setBackground(new java.awt.Color(0, 102, 204));
        btn_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_empMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEES");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Contacts_50px.png"))); // NOI18N

        javax.swing.GroupLayout btn_empLayout = new javax.swing.GroupLayout(btn_emp);
        btn_emp.setLayout(btn_empLayout);
        btn_empLayout.setHorizontalGroup(
            btn_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_empLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btn_empLayout.setVerticalGroup(
            btn_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_empLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, -1));

        btn_sup.setBackground(new java.awt.Color(0, 102, 200));
        btn_sup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_supMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUPPLIERS");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_Groups_50px.png"))); // NOI18N

        javax.swing.GroupLayout btn_supLayout = new javax.swing.GroupLayout(btn_sup);
        btn_sup.setLayout(btn_supLayout);
        btn_supLayout.setHorizontalGroup(
            btn_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_supLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
        );
        btn_supLayout.setVerticalGroup(
            btn_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_supLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_sup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 190, 50));

        btn_pay.setBackground(new java.awt.Color(0, 102, 200));
        btn_pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_payMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PAYSHEET");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Bulleted_List_50px.png"))); // NOI18N

        javax.swing.GroupLayout btn_payLayout = new javax.swing.GroupLayout(btn_pay);
        btn_pay.setLayout(btn_payLayout);
        btn_payLayout.setHorizontalGroup(
            btn_payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_payLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(53, 53, 53))
        );
        btn_payLayout.setVerticalGroup(
            btn_payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_payLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane.add(btn_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 50));

        sup_panel1.setBackground(new java.awt.Color(255, 255, 255));
        sup_panel1.setPreferredSize(new java.awt.Dimension(1200, 0));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("ADD SUPPLIER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("DELETE SUPPLIER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("UPDATE SUPPLIER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        del_emp.setBackground(new java.awt.Color(255, 255, 255));
        del_emp.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel35.setBackground(new java.awt.Color(51, 0, 153));
        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 153));
        jLabel35.setText("Delete Employee");

        jLabel36.setText("Employee ID");

        emp_del1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emp_del1.setText("DELETE");
        emp_del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_del1ActionPerformed(evt);
            }
        });

        sup_canc4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sup_canc4.setText("CANCEL");
        sup_canc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_canc4ActionPerformed(evt);
            }
        });

        jLabel37.setText("Employee Name");

        javax.swing.GroupLayout del_empLayout = new javax.swing.GroupLayout(del_emp);
        del_emp.setLayout(del_empLayout);
        del_empLayout.setHorizontalGroup(
            del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(del_empLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField20))
                .addGap(104, 104, 104))
            .addGroup(del_empLayout.createSequentialGroup()
                .addGroup(del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(del_empLayout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel35))
                    .addGroup(del_empLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(emp_del1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(sup_canc4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(662, Short.MAX_VALUE))
        );
        del_empLayout.setVerticalGroup(
            del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(del_empLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel35)
                .addGap(42, 42, 42)
                .addGroup(del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(del_empLayout.createSequentialGroup()
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(del_empLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                        .addGroup(del_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_del1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sup_canc4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout sup_panel1Layout = new javax.swing.GroupLayout(sup_panel1);
        sup_panel1.setLayout(sup_panel1Layout);
        sup_panel1Layout.setHorizontalGroup(
            sup_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sup_panel1Layout.createSequentialGroup()
                .addGap(538, 538, 538)
                .addGroup(sup_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 1318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sup_panel1Layout.setVerticalGroup(
            sup_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sup_panel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton4)
                .addGap(80, 80, 80)
                .addComponent(jButton5)
                .addGap(87, 87, 87)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sup_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(del_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidepane.add(sup_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 306, 890, 450));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Home_50px.png"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        sidepane.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 50, 70));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Webp.net-resizeimage.png"))); // NOI18N
        sidepane.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 90));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 100));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMPLOYEE MANAGEMENT SYSTEM");

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Permanent_Job_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel4)
                .addGap(112, 112, 112)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        emp1_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("First Name");

        jLabel6.setText("Second Name");

        jLabel7.setText("Date of Birth");

        jLabel8.setText("Address");

        jLabel9.setText("E-mail");

        jLabel10.setText("Phone Number");

        jLabel11.setText("NIC");

        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });

        phoneNum.setText("+94");
        phoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Date of Birth", "Address", "E-mail", "Phone Number", "NIC"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        insertBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        insertBtn.setText("INSERT");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        clearAllBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clearAllBtn.setText("CLEAR ALL");
        clearAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtnActionPerformed(evt);
            }
        });

        btnDemo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDemo.setText("DEMO");
        btnDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emp1_panelLayout = new javax.swing.GroupLayout(emp1_panel);
        emp1_panel.setLayout(emp1_panelLayout);
        emp1_panelLayout.setHorizontalGroup(
            emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp1_panelLayout.createSequentialGroup()
                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emp1_panelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp1_panelLayout.createSequentialGroup()
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(14, 14, 14)
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SName)
                                    .addComponent(Fname)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp1_panelLayout.createSequentialGroup()
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(emp1_panelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(emp1_panelLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jScrollPane1))))
                            .addGroup(emp1_panelLayout.createSequentialGroup()
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nic)
                                        .addComponent(phoneNum))
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(emp1_panelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearAllBtn)
                        .addGap(18, 18, 18)
                        .addComponent(btnDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1036, Short.MAX_VALUE))
        );
        emp1_panelLayout.setVerticalGroup(
            emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp1_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(emp1_panelLayout.createSequentialGroup()
                        .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(emp1_panelLayout.createSequentialGroup()
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(SName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8))
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp1_panelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8))
                            .addGroup(emp1_panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp1_panelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9))
                            .addGroup(emp1_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addGroup(emp1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1011, Short.MAX_VALUE))
        );

        jPanel2.add(emp1_panel, "card2");

        supplier_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Company Name :");

        jLabel13.setText("Company Address :");

        jLabel14.setText("E-mail :");

        jLabel15.setText("Phone Number :");

        compnyAddress.setColumns(20);
        compnyAddress.setRows(5);
        jScrollPane3.setViewportView(compnyAddress);

        compnyPhone.setText("+94");
        compnyPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compnyPhoneActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Company Address", "E-mail", "Phone Number"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        compnyInsert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        compnyInsert.setText("INSERT");
        compnyInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compnyInsertActionPerformed(evt);
            }
        });

        compnyUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        compnyUpdate.setText("UPDATE");
        compnyUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compnyUpdateActionPerformed(evt);
            }
        });

        compnyDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        compnyDelete.setText("DELETE");
        compnyDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compnyDeleteActionPerformed(evt);
            }
        });

        compnyClearall.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        compnyClearall.setText("CLEAR ALL");
        compnyClearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compnyClearallActionPerformed(evt);
            }
        });

        demobtn2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        demobtn2.setText("DEMO");
        demobtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demobtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supplier_panelLayout = new javax.swing.GroupLayout(supplier_panel);
        supplier_panel.setLayout(supplier_panelLayout);
        supplier_panelLayout.setHorizontalGroup(
            supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(compnyName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(compnyPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(compnyEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addComponent(compnyInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compnyUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compnyDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(compnyClearall)))))
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(demobtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1016, Short.MAX_VALUE))
        );
        supplier_panelLayout.setVerticalGroup(
            supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compnyName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel13))
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(compnyEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compnyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(81, 81, 81)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compnyInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compnyUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compnyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compnyClearall, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(demobtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1095, Short.MAX_VALUE))
        );

        jPanel2.add(supplier_panel, "card3");

        paysheet_panel.setBackground(new java.awt.Color(255, 255, 255));
        paysheet_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel16.setText("Employee ID : ");

        jLabel17.setText("Employee Name :");

        jLabel18.setText("Issued Date :");

        jLabel19.setText("Year :");

        jLabel20.setText("Month :");

        jLabel21.setText("Role :");

        jLabel22.setText("Total Working Hours :");

        jLabel23.setText("Additional Payments (Rs.) :");

        jLabel24.setText("Bonus (Rs.):");

        jLabel25.setText("OT Rates (Rs.):");

        jLabel26.setText("Total Salary (Rs.) :");

        jLabel27.setText("Attendance :");

        payEmpID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        payEmpID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Employee ID" }));
        payEmpID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                payEmpIDItemStateChanged(evt);
            }
        });
        payEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payEmpIDActionPerformed(evt);
            }
        });

        payEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payEmpNameActionPerformed(evt);
            }
        });

        payMonth.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        payMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        totWorkHours.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totWorkHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Hours", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " ", " " }));

        payOtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payOtRateActionPerformed(evt);
            }
        });

        payPrintBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        payPrintBtn.setText("PREVIEW DETAILS");
        payPrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payPrintBtnActionPerformed(evt);
            }
        });

        payClearBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        payClearBtn.setText("CLEAR");
        payClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payClearBtnActionPerformed(evt);
            }
        });

        paySaveBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paySaveBtn.setText("SAVE");
        paySaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paySaveBtnActionPerformed(evt);
            }
        });

        recept.setColumns(20);
        recept.setRows(5);
        jScrollPane5.setViewportView(recept);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        demoBtn3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        demoBtn3.setText("DEMO");
        demoBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtn3ActionPerformed(evt);
            }
        });

        paysheetIdBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paysheetIdBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Paysheet ID" }));

        delBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        delBtn.setText("DELETE");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(paysheetIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paysheetIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paysheet_panelLayout = new javax.swing.GroupLayout(paysheet_panel);
        paysheet_panel.setLayout(paysheet_panelLayout);
        paysheet_panelLayout.setHorizontalGroup(
            paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paysheet_panelLayout.createSequentialGroup()
                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paysheet_panelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(payPrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(payClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paysheet_panelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(payYear)
                                            .addComponent(payMonth, 0, 224, Short.MAX_VALUE)
                                            .addComponent(payRole)))
                                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(payEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(payEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(payIssueDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(29, 29, 29)
                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paysheet_panelLayout.createSequentialGroup()
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel26))
                                .addGap(36, 36, 36)
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(payTotSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payAdditionPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payOtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totWorkHours, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(paysheet_panelLayout.createSequentialGroup()
                                .addComponent(paySaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton2)
                                .addGap(34, 34, 34)
                                .addComponent(demoBtn3)
                                .addGap(125, 125, 125))))
                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1068, 1068, 1068))
        );
        paysheet_panelLayout.setVerticalGroup(
            paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paysheet_panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paysheet_panelLayout.createSequentialGroup()
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(payEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(totWorkHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(14, 14, 14)
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(payEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel24))
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18))
                                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(payIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                                        .addComponent(payYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(payMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(payRole, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel26)))
                                    .addGroup(paysheet_panelLayout.createSequentialGroup()
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel27)
                                            .addComponent(payAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel23)
                                            .addComponent(payAdditionPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(payTotSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))))
                            .addGroup(paysheet_panelLayout.createSequentialGroup()
                                .addComponent(payOtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(payBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addGap(151, 151, 151)))
                        .addGap(66, 66, 66)
                        .addGroup(paysheet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payPrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paySaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(demoBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(922, Short.MAX_VALUE))
        );

        jPanel2.add(paysheet_panel, "card4");

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2222, Short.MAX_VALUE)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empMouseClicked

        setColor(btn_emp);
        resetColor(btn_sup);
        resetColor(btn_pay);

        //removing panels
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        
        //adding panel
        jPanel2.add(emp1_panel);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        supplier_panel.setVisible(false);
        paysheet_panel.setVisible(false);
  
    }//GEN-LAST:event_btn_empMouseClicked

    private void btn_supMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supMouseClicked
        setColor(btn_sup);
        resetColor(btn_emp);
        resetColor(btn_pay);
        
         //removing panels
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        
        //adding panel
        jPanel2.add(supplier_panel);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        emp1_panel.setVisible(false);
        supplier_panel.setVisible(true);
        paysheet_panel.setVisible(false);
       
    }//GEN-LAST:event_btn_supMouseClicked

    private void btn_payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_payMouseClicked
        
   
        
        setColor(btn_pay);
        resetColor(btn_emp);
        resetColor(btn_sup);
        
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
       
         //adding panel
        jPanel2.add(paysheet_panel);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        emp1_panel.setVisible(false);
        supplier_panel.setVisible(false);
        paysheet_panel.setVisible(true);

    }//GEN-LAST:event_btn_payMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//           //removing panels
//        m_panel.removeAll();
//        m_panel.repaint();
//        m_panel.revalidate();
//        
//        //adding panel
//        m_panel.add(del_sup);
//        m_panel.repaint();
//        m_panel.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//              //removing panels
//        m_panel.removeAll();
//        m_panel.repaint();
//        m_panel.revalidate();
//        
//        //adding panel
//        m_panel.add(upd_sup);
//        m_panel.repaint();
//        m_panel.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void emp_del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_del1ActionPerformed
        JOptionPane.showConfirmDialog(null, "Do You Want To Delete?" ,"Cancel", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_emp_del1ActionPerformed

    private void sup_canc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_canc4ActionPerformed
        JOptionPane.showConfirmDialog(null, "Do You Want To Cancel?" ,"Cancel", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_sup_canc4ActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            SimpleDateFormat ddate = new SimpleDateFormat("yyyy-MM-dd");

            primaryKey = model.getValueAt(row,0).toString();

            Fname.setText(model.getValueAt(row,1).toString());
            SName.setText(model.getValueAt(row,2).toString());
            address.setText(model.getValueAt(row,4).toString());
            email.setText(model.getValueAt(row,5).toString());
            DOB.setDate(ddate.parse(model.getValueAt(row,3).toString()));
            phoneNum.setText(model.getValueAt(row,6).toString());
            nic.setText(model.getValueAt(row,7).toString());

        }catch(ParseException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        String firstName = Fname.getText();
        String secondName = SName.getText();
        String bDay = sdf.format(DOB.getDate());
        String addres = address.getText();
        String mail = email.getText();
        String phone = phoneNum.getText();
        String NIC = nic.getText();
        
        if (firstName.isEmpty()|| secondName.isEmpty() ||addres.isEmpty() ||phone.isEmpty() ||NIC.isEmpty() || mail.isEmpty() ){
             
            JOptionPane.showMessageDialog(null, "Fields Can Not Be Empty!!!");
          
        }
       
        else if(validateLetter(firstName) == false){
            
            JOptionPane.showMessageDialog(null, "First Name Can Not Contain Numbers Or Characters!!!");
            
        }
        
        else if(validateLetter(secondName) == false){
            
            JOptionPane.showMessageDialog(null, "Second Name Can Not Contain Numbers Or Characters!!!");
            
        }
        
        else if(validateEmail(mail) == false){
            
            JOptionPane.showMessageDialog(null, "Invalid Email Address!!!");
            
        }
       
        else if(validatePhone(phone) == false){
            
            JOptionPane.showMessageDialog(null, "Phone Number Should Be Like +94112700800!!!");
            
        }
        
         else if(validateNIC(NIC) == false){
            
            JOptionPane.showMessageDialog(null, "NIC Should Contain 10 Characters Including V!!!");
            
            
        }
        
        else{

        String query = "INSERT INTO employee(firstName, secondName, bDay, addres, mail, phone, NIC) "
        + "VALUES('"+ firstName +"', '"+ secondName +"', '"+ bDay +"', '"+ addres +"', '"+ mail +"', '"+ phone +"', '"+ NIC +"')";

        try{
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been saved successfully");
            tableLoad();
            clearAll();

        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_insertBtnActionPerformed
        phoneNum.setText("+94");
    }
    
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        String firstName = Fname.getText();
        String secondName = SName.getText();
        String bDay = sdf.format(DOB.getDate());
        String addres = address.getText();
        String mail = email.getText();
        String phone = phoneNum.getText();
        String NIC = nic.getText();
        
        if (firstName.isEmpty()|| secondName.isEmpty() || addres.isEmpty()|| phone.isEmpty() || NIC.isEmpty() || mail.isEmpty() ){
             
            JOptionPane.showMessageDialog(null, "Fields Can Not Be Empty!!!");
          
        }
       
        else if(validateLetter(firstName) == false){
            
            JOptionPane.showMessageDialog(null, "First Name Can Not Contain Numbers Or Characters!!!");
            
        }
        
        else if(validateLetter(secondName) == false){
            
            JOptionPane.showMessageDialog(null, "Second Name Can Not Contain Numbers Or Characters!!!");
            
        }
        
        else if(validateEmail(mail) == false){
            
            JOptionPane.showMessageDialog(null, "Invalid Email Address!!!");
            
        }
       
        else if(validatePhone(phone) == false){
            
            JOptionPane.showMessageDialog(null, "Phone Number Should Be Like +94112700800!!!");
            
        }
        
         else if(validateNIC(NIC) == false){
            
            JOptionPane.showMessageDialog(null, "NIC Should Contain 10 Characters Including V!!!");
            
            
        }

         else{
        String query = "UPDATE employee SET firstName='"+ firstName +"', secondName='"+ secondName +"', bDay='"+ bDay +"', addres='"+ addres +"', mail='"+ mail +"', phone='"+ phone +"', NIC='"+ NIC +"' WHERE empID='"+ primaryKey +"'";

        try{
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been Update Successfully");
            clearAll();
            tableLoad();

        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnActionPerformed
    }
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try{
            String query = "DELETE FROM employee WHERE empID='"+ primaryKey +"'";
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been Delete Successfully");
            clearAll();
            tableLoad();

        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtnActionPerformed
        clearAll();
        phoneNum.setText("+94");
    }//GEN-LAST:event_clearAllBtnActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        SprimaryKey = model1.getValueAt(row,0).toString();
        compnyName.setText(model1.getValueAt(row,1).toString());
        compnyAddress.setText(model1.getValueAt(row,2).toString());
        compnyEmail.setText(model1.getValueAt(row,3).toString());
        compnyPhone.setText(model1.getValueAt(row,4).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void compnyInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compnyInsertActionPerformed
        String cName = compnyName.getText();
        String cAddress = compnyAddress.getText();
        String cEmail = compnyEmail.getText();
        String cPhone = compnyPhone.getText();
        
        if (cName.isEmpty()|| cAddress.isEmpty()||cPhone.isEmpty() || cEmail.isEmpty()){
             
            JOptionPane.showMessageDialog(null, "Fields Can Not Be Empty!!!");
          
        }
        
        
       else if(validateEmail(cEmail) == false){
            
            JOptionPane.showMessageDialog(null, "Invalid Email Address!!!");
            
        }
       
        else if(validatePhone(cPhone) == false){
            
            JOptionPane.showMessageDialog(null, "Phone Number Should Be Like +94112700800!!!");
            
        }
        
        else{

        String query = "INSERT INTO supplier (companyName, companyAddress, email, phoneNumber) VALUES('"+ cName +"', '"+ cAddress +"', '"+ cEmail +"', '"+ cPhone +"')";

        try{
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been saved successfully");
            SupplierClearAll();
            SupplierTableLoad();

        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_compnyInsertActionPerformed
        compnyPhone.setText("+94");
    }
    
    
    private void compnyUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compnyUpdateActionPerformed
        String cName = compnyName.getText();
        String cAddress = compnyAddress.getText();
        String cEmail = compnyEmail.getText();
        String cPhone = compnyPhone.getText();
        
         if (cName.isEmpty()||cAddress.isEmpty()||cPhone.isEmpty()||cEmail.isEmpty()){
             
            JOptionPane.showMessageDialog(null, "Fields Can Not Be Empty!!!");
          
        }
        
        
       
        else if(validateEmail(cEmail) == false){
            
            JOptionPane.showMessageDialog(null, "Invalid Email Address!!!");
            
        }
       
        else if(validatePhone(cPhone) == false){
            
            JOptionPane.showMessageDialog(null, "Phone Number Should Be Like +94112700800!!!");
            
        }
         
        else{

        String query = "UPDATE supplier SET companyName='"+ cName +"', companyAddress='"+ cAddress +"', email='"+ cEmail +"', phoneNumber='"+ cPhone +"' WHERE supID='"+ SprimaryKey +"'";

        try{
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been Update Successfully");
            SupplierClearAll();
            SupplierTableLoad();

        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_compnyUpdateActionPerformed
    }
    
    private void compnyDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compnyDeleteActionPerformed
        try{
            String query = "DELETE FROM supplier WHERE supID='"+ SprimaryKey +"'";
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been Delete Successfully");
            SupplierClearAll();
            SupplierTableLoad();

        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_compnyDeleteActionPerformed

    private void compnyClearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compnyClearallActionPerformed
        SupplierClearAll();
        compnyPhone.setText("+94");
    }//GEN-LAST:event_compnyClearallActionPerformed

    private void payEmpIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_payEmpIDItemStateChanged
        getEmpName();
    }//GEN-LAST:event_payEmpIDItemStateChanged

    private void payEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payEmpNameActionPerformed

    private void payOtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payOtRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payOtRateActionPerformed

    private void payClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payClearBtnActionPerformed
        payEmpID.setSelectedIndex(0);
        payEmpName.setText("");
        payIssueDate.setCalendar(null);
        payYear.setText("");
        payMonth.setSelectedIndex(0);
        payRole.setText("");
        totWorkHours.setSelectedIndex(0);
        payOtRate.setText("");
        payBonus.setText("");
        payAdditionPayment.setText("");
        payAttendance.setText("");
        payTotSalary.setText("");
        recept.setText("");
    }//GEN-LAST:event_payClearBtnActionPerformed

    private void paySaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paySaveBtnActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        String empID = payEmpID.getSelectedItem().toString();
        String empName = payEmpName.getText();
        String issueDate = sdf.format(payIssueDate.getDate());
        String pay_year = payYear.getText();
        String pay_month = payMonth.getSelectedItem().toString();
        String pay_role = payRole.getText();
        String pay_work_hours = totWorkHours.getSelectedItem().toString();
        String pay_ot_rate = payOtRate.getText();
        String pay_bonus = payBonus.getText();
        String add_payment = payAdditionPayment.getText();
        String pay_attendance = payAttendance.getText();
        String pay_tot_salary = payTotSalary.getText();
        
        if (pay_year.isEmpty() ||pay_role.isEmpty()||add_payment.isEmpty()||pay_attendance.isEmpty()  ){
             
            JOptionPane.showMessageDialog(null, "Fields Can Not Be Empty!!!");
          
        }
       
        else{
        int RegularWorkingHours = 8;
        int pay_perDay = 600;
        
        int atten = Integer.parseInt(pay_attendance);
        int otrate = Integer.parseInt(pay_ot_rate);
        int workingHours = Integer.parseInt(pay_work_hours);
        int bonus = Integer.parseInt(pay_bonus);
        int addPay = Integer.parseInt(add_payment);
        
        int totalSal = (atten * pay_perDay) + otrate *(workingHours - (RegularWorkingHours * atten) + bonus + addPay);
        payTotSalary.setText(Integer.toString(totalSal));
        
        String query = "INSERT INTO paysheet(empID, empName, issuedDate, month, role, totWorkinghours, otRate, bonusPay, additionPay, attendance, totSalary) "
        + "VALUES('"+ empID +"', '"+ empName +"', '"+ issueDate +"', '"+ pay_month +"', '"+ pay_role +"', '"+ workingHours +"', '"+ otrate +"', '"+ bonus +"', '"+ addPay +"', '"+ atten +"','"+ totalSal +"')";

        try{
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record has been saved successfully");

        
           getPaysheetID();
            
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_paySaveBtnActionPerformed
    }   
    private void payPrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payPrintBtnActionPerformed
        
        
        recept.setText(" ******************************************************************            \n" +
                       " ******************************************************************             \n\n\n" +
                       "  Employee Name                          -     " + payEmpName.getText() +                                   "\n\n" + 
                       "  Year Of Payment                           -     " + payYear.getText() +                                      "\n\n" +   
                       "  Month Of Payment                        -     " + payMonth.getSelectedItem().toString() +                  "\n\n" + 
                       "  Total Working Hours                    -     " + totWorkHours.getSelectedItem().toString() +              "\n\n" + 
                       "  Overtime Rates                             -     " + payOtRate.getText() +                                    "\n\n" + 
                       "  Bonus                                              -     " + payBonus.getText() +                                     "\n\n" + 
                       "  Additional Payments                     -     " + payAdditionPayment.getText() +                           "\n\n" + 
                       "  Attendance                                      -     " + payAttendance.getText() +                                "\n\n" + 
                       "  Total Salary                                     -     " + payTotSalary.getText() +                              "\n\n\n\n\n" );
       
    }//GEN-LAST:event_payPrintBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       
        try {
            reportGen rep = new reportGen("./src/reports/report1.jasper");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemoActionPerformed
        Fname.setText("Kamal");
        SName.setText("Kasthuriarachchi");
        address.setText("No.2890 , Stage 3 , Anuradhapura");
        email.setText("kamal@gmail.com");
        phoneNum.setText("+94718779855");
        nic.setText("655930599V");
    }//GEN-LAST:event_btnDemoActionPerformed

    private void demobtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demobtn2ActionPerformed
        compnyName.setText("David Peiris");
        compnyAddress.setText("No.23/1 , Walawaththe Road , Kakiraawe");
        compnyEmail.setText("davidp@yahoo.com");
        compnyPhone.setText("+94115896325");
        
    }//GEN-LAST:event_demobtn2ActionPerformed

    private void demoBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtn3ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        //payIssueDate.setCalendar(sdf.format(Locale.getDefault()));
        payEmpID.setSelectedIndex(11);
        payEmpName.setText("Amal");
        payYear.setText("2018");
        payRole.setText("Employee");
        payOtRate.setText("1000");
        payBonus.setText("1000");
        payAttendance.setText("28");
        payMonth.setSelectedIndex(8);
        totWorkHours.setSelectedIndex(20);
        payAdditionPayment.setText("2000");
        
    }//GEN-LAST:event_demoBtn3ActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
         try{
            String query = "DELETE FROM paysheet WHERE paysheetID='"+ paysheetIdBox.getSelectedItem().toString() +"'";
            Connection con =  connect();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Record Has Been Deleted Successfully");
           
            getPaysheetID();
            paysheetIdBox.setSelectedIndex(0);

            //paysheetIdBox.setSelectedItem(null);
          

        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void payEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payEmpIDActionPerformed

    private void phoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumActionPerformed
        //phoneNum.setText("+94");
    }//GEN-LAST:event_phoneNumActionPerformed

    private void compnyPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compnyPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compnyPhoneActionPerformed

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        
        Home home = new Home();
        home.setVisible(rootPaneCheckingEnabled);
        closeWindow();
        
    }//GEN-LAST:event_jLabel54MouseClicked
    
    
    public void closeWindow(){
        
        WindowEvent windowClose;
        windowClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    
    public void getEmpID(){
        try{
            String query = "SELECT * FROM employee";
            Connection con =  connect();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
               payEmpID.addItem(rs.getString("empID"));
            }
            
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getEmpName(){
          try{
            String query = "SELECT * FROM employee WHERE empID='"+ payEmpID.getSelectedItem().toString() +"'";
            Connection con =  connect();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
               payEmpName.setText(rs.getString("firstName"));
            }  
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPaysheetID(){
        
        
          try{
            
            String query = "SELECT * FROM paysheet";
            Connection con =  connect();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
               paysheetIdBox.addItem(rs.getString("paysheetID"));
               
            }  
            paysheetIdBox.setSelectedIndex(0);
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SupplierClearAll(){
        compnyName.setText("");
        compnyAddress.setText("");
        compnyEmail.setText("");
        compnyPhone.setText("");
    }
    
    public void clearAll(){
        Fname.setText("");
        SName.setText("");
        address.setText("");
        email.setText("");
        DOB.setCalendar(null);
        phoneNum.setText("");
        nic.setText("");
    }
    public void SupplierTableLoad(){
        String query = "SELECT * FROM supplier";
        try{
           Connection con =  connect();
           Statement st = con.createStatement();
           rs = st.executeQuery(query);
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    public void tableLoad(){
        String query = "SELECT * FROM employee";
        try{
           Connection con =  connect();
           Statement st = con.createStatement();
           rs = st.executeQuery(query);
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));  
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    void setColor(JPanel panel){
        
        panel.setBackground(new Color(0,102,204));
    }
    
    void resetColor(JPanel panel){
        
        panel.setBackground(new Color(0,51,153));
    }
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
            java.util.logging.Logger.getLogger(FORM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField SName;
    private javax.swing.JTextArea address;
    private javax.swing.JButton btnDemo;
    private javax.swing.JPanel btn_emp;
    private javax.swing.JPanel btn_pay;
    private javax.swing.JPanel btn_sup;
    private javax.swing.JButton clearAllBtn;
    private javax.swing.JTextArea compnyAddress;
    private javax.swing.JButton compnyClearall;
    private javax.swing.JButton compnyDelete;
    private javax.swing.JTextField compnyEmail;
    private javax.swing.JButton compnyInsert;
    private javax.swing.JTextField compnyName;
    private javax.swing.JTextField compnyPhone;
    private javax.swing.JButton compnyUpdate;
    private javax.swing.JButton delBtn;
    private javax.swing.JPanel del_emp;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton demoBtn3;
    private javax.swing.JButton demobtn2;
    private javax.swing.JTextField email;
    private javax.swing.JPanel emp1_panel;
    private javax.swing.JButton emp_del1;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField payAdditionPayment;
    private javax.swing.JTextField payAttendance;
    private javax.swing.JTextField payBonus;
    private javax.swing.JButton payClearBtn;
    private javax.swing.JComboBox<String> payEmpID;
    private javax.swing.JTextField payEmpName;
    private com.toedter.calendar.JDateChooser payIssueDate;
    private javax.swing.JComboBox<String> payMonth;
    private javax.swing.JTextField payOtRate;
    private javax.swing.JButton payPrintBtn;
    private javax.swing.JTextField payRole;
    private javax.swing.JButton paySaveBtn;
    private javax.swing.JTextField payTotSalary;
    private javax.swing.JTextField payYear;
    private javax.swing.JComboBox<String> paysheetIdBox;
    private javax.swing.JPanel paysheet_panel;
    private javax.swing.JTextField phoneNum;
    private javax.swing.JTextArea recept;
    private javax.swing.JPanel sidepane;
    private javax.swing.JButton sup_canc4;
    private javax.swing.JPanel sup_panel1;
    private javax.swing.JPanel supplier_panel;
    private javax.swing.JComboBox<String> totWorkHours;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
