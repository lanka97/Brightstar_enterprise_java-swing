/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import com.toedter.components.JSpinField;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pasindu Senarathne
 */
public class Payment_View extends javax.swing.JPanel {

    private static int counter = 0;
    /**
     * Creates new form Payment_View
     */
    public Payment_View() {
        initComponents();
        show_details_in_table();
        
   
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
    

    public ArrayList<RentPayments> getPaymentList(){
        
        
        ArrayList<RentPayments> paymentList = new ArrayList<RentPayments>();
        

	Connection connection = getConnection();
       
        
        String query = "select * from rent";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentPayments payment;
            
            while(result.next()){
                
            payment = new RentPayments();
                
               payment.setCusNIC(result.getString(1));
               payment.setBrand(result.getString(2));
               payment.setSerial(result.getString(3));
               payment.setRentMonth(result.getString(4));
               payment.setAmount(result.getDouble(5));
               payment.setType(result.getString(6));
               payment.setPaidDate(result.getString(7)); 
               payment.setChequeNumber(result.getString(8));
               payment.setBank(result.getString(9));
               payment.setStatus(result.getString(10));
               
               
               paymentList.add(payment);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return paymentList;
    }
    
    public void show_details_in_table(){
        
        ArrayList<RentPayments> list = getPaymentList();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[10];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getCusNIC();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getSerial();
            row[3] = list.get(i).getRentMonth();
            row[4] = list.get(i).getAmount();
            row[5] = list.get(i).getType();
            row[6] = list.get(i).getPaidDate();
            row[7] = list.get(i).getChequeNumber();
            row[8] = list.get(i).getBank();
            row[9] = list.get(i).getStatus();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
     public void clearTableRecords(){
        
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        tm.getDataVector().removeAllElements();
        revalidate();
    }
    
    public ArrayList<RentPayments> getSearchList1(String search){
        
       
        
        ArrayList<RentPayments> searchList = new ArrayList<RentPayments>();
        

	Connection connection = getConnection();
       
        
        String query = "SELECT * FROM rent WHERE month LIKE '%"+search+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentPayments payment;
            
          while(result.next()){
                
            payment = new RentPayments();
             
               payment.setCusNIC(result.getString(1));
               payment.setBrand(result.getString(2));
               payment.setSerial(result.getString(3));
               payment.setRentMonth(result.getString(4));
               payment.setAmount(result.getDouble(5));
               payment.setType(result.getString(6));
               payment.setPaidDate(result.getString(7)); 
               payment.setChequeNumber(result.getString(8));
               payment.setBank(result.getString(9));
               payment.setStatus(result.getString(10));
               
               
               
            searchList.add(payment);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return searchList;
    }
    
    public void show_result_in_table1(String string){
        
        ArrayList<RentPayments> list = getSearchList1(string);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[10];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getCusNIC();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getSerial();
            row[3] = list.get(i).getRentMonth();
            row[4] = list.get(i).getAmount();
            row[5] = list.get(i).getType();
            row[6] = list.get(i).getPaidDate();
            row[7] = list.get(i).getChequeNumber();
            row[8] = list.get(i).getBank();
            row[9] = list.get(i).getStatus();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
       public ArrayList<RentedMachines> getRentedMachineList(){
        
        
        ArrayList<RentedMachines> rentList = new ArrayList<RentedMachines>();
        

	Connection connection = getConnection();
       
        
        String query = "select nic,machineBrand,serialNum from rented_machine_records";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentedMachines rMachine;
            
            while(result.next()){
                
               RentedMachines  machines;
               machines = new RentedMachines();
                
               machines.setId(result.getString(1));
               machines.setBrand(result.getString(2));
               machines.setSerial(result.getString(3));
             
               rentList.add(machines);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return rentList;
    }
       
    public void show_rented_records_in_table(){
        
        ArrayList<RentedMachines> list = getRentedMachineList();
        
        String other = null;
        String state = "Pending";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[11];
        
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December" };

        Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getSerial();
            row[3] = month;
            row[4] = other;
            row[5] = other;
            row[6] = other;
            row[7] = other;
            row[8] = other;
            row[9] = state;
             
            model.addRow(row);
            
            String addQuery = "INSERT INTO rent VALUES(?, ?, ?, ?, ?, ?, ?, ?,?,?)";
        
         PreparedStatement ps;
       try {
           ps = getConnection().prepareStatement(addQuery);
           
           ps.setString(1, row[0].toString());
           ps.setString(2, row[1].toString());
           ps.setString(3, row[2].toString());
           ps.setString(4, row[3].toString());
           ps.setString(5, null);
           ps.setString(6, null);
           ps.setString(7, null);
           ps.setString(8, null);
           ps.setString(9, null);
           ps.setString(10, row[9].toString());
       
           ps.executeUpdate();
           
       } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Records Already Added For This Month",
                        "Alert", JOptionPane.PLAIN_MESSAGE);
       
    }                                          
         
        }
        model.fireTableDataChanged();
    }
    
     public ArrayList<RentPayments> getSearchList2(String search){
        
       
        
        ArrayList<RentPayments> searchList = new ArrayList<RentPayments>();
        

	Connection connection = getConnection();
       
        
        String query = "SELECT * FROM rent WHERE status LIKE '%"+search+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentPayments payment;
            
          while(result.next()){
                
            payment = new RentPayments();
             
               payment.setCusNIC(result.getString(1));
               payment.setBrand(result.getString(2));
               payment.setSerial(result.getString(3));
               payment.setRentMonth(result.getString(4));
               payment.setAmount(result.getDouble(5));
               payment.setType(result.getString(6));
               payment.setPaidDate(result.getString(7)); 
               payment.setChequeNumber(result.getString(8));
               payment.setBank(result.getString(9));
               payment.setStatus(result.getString(10));
               
               
               
            searchList.add(payment);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return searchList;
    }
    
    public void show_result_in_table2(String string){
        
        ArrayList<RentPayments> list = getSearchList2(string);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[10];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getCusNIC();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getSerial();
            row[3] = list.get(i).getRentMonth();
            row[4] = list.get(i).getAmount();
            row[5] = list.get(i).getType();
            row[6] = list.get(i).getPaidDate();
            row[7] = list.get(i).getChequeNumber();
            row[8] = list.get(i).getBank();
            row[9] = list.get(i).getStatus();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
     public ArrayList<RentPayments> getSearchList3(String search){
        
       
        
        ArrayList<RentPayments> searchList = new ArrayList<RentPayments>();
        

	Connection connection = getConnection();
       
        
        String query = "SELECT * FROM rent WHERE customerNIC LIKE '%"+search+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentPayments payment;
            
          while(result.next()){
                
            payment = new RentPayments();
             
               payment.setCusNIC(result.getString(1));
               payment.setBrand(result.getString(2));
               payment.setSerial(result.getString(3));
               payment.setRentMonth(result.getString(4));
               payment.setAmount(result.getDouble(5));
               payment.setType(result.getString(6));
               payment.setPaidDate(result.getString(7)); 
               payment.setChequeNumber(result.getString(8));
               payment.setBank(result.getString(9));
               payment.setStatus(result.getString(10));
               
               
               
            searchList.add(payment);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return searchList;
    }
    
    public void show_result_in_table3(String string){
        
        ArrayList<RentPayments> list = getSearchList3(string);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[10];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getCusNIC();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getSerial();
            row[3] = list.get(i).getRentMonth();
            row[4] = list.get(i).getAmount();
            row[5] = list.get(i).getType();
            row[6] = list.get(i).getPaidDate();
            row[7] = list.get(i).getChequeNumber();
            row[8] = list.get(i).getBank();
            row[9] = list.get(i).getStatus();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refresh_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        search_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search_btn1 = new javax.swing.JButton();
        search_btn2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchNICFeild = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer NIC", "Brand", "Serial Number", "Month", "Amount", "Payment Type", "Date", "Cheque number", "Bank", "Payment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setAutoscrolls(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(30);
        jTable1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jTable1MouseWheelMoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        refresh_btn.setBackground(new java.awt.Color(255, 255, 255));
        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Refresh_35px.png"))); // NOI18N
        refresh_btn.setMaximumSize(new java.awt.Dimension(67, 50));
        refresh_btn.setMinimumSize(new java.awt.Dimension(67, 50));
        refresh_btn.setPreferredSize(new java.awt.Dimension(67, 50));
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });
        refresh_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                refresh_btnsearch_feildKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Downloads_Folder_40px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Month>", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        search_btn.setBackground(new java.awt.Color(255, 255, 255));
        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Search_35px.png"))); // NOI18N
        search_btn.setMaximumSize(new java.awt.Dimension(67, 50));
        search_btn.setMinimumSize(new java.awt.Dimension(67, 50));
        search_btn.setPreferredSize(new java.awt.Dimension(67, 50));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        search_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_btnsearch_feildKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Select State");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Select Month");

        search_btn1.setBackground(new java.awt.Color(255, 255, 255));
        search_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Search_35px.png"))); // NOI18N
        search_btn1.setMaximumSize(new java.awt.Dimension(67, 50));
        search_btn1.setMinimumSize(new java.awt.Dimension(67, 50));
        search_btn1.setPreferredSize(new java.awt.Dimension(67, 50));
        search_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btn1ActionPerformed(evt);
            }
        });

        search_btn2.setBackground(new java.awt.Color(255, 255, 255));
        search_btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Search_35px.png"))); // NOI18N
        search_btn2.setMaximumSize(new java.awt.Dimension(67, 50));
        search_btn2.setMinimumSize(new java.awt.Dimension(67, 50));
        search_btn2.setPreferredSize(new java.awt.Dimension(67, 50));
        search_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btn2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Enter Customer NIC");

        searchNICFeild.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select State>", "Pending", "Completed" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchNICFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(search_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2))
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchNICFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed

            String monthSelected = jComboBox1.getSelectedItem().toString(); 
            clearTableRecords();
            show_result_in_table1(monthSelected);
    }//GEN-LAST:event_search_btnActionPerformed

    private void search_btnsearch_feildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_btnsearch_feildKeyReleased

        /*
        String search = search_feild.getText();

        try {

            String query = "SELECT * FROM rented_customers WHERE nic LIKE '"+search+"' ";
            PreparedStatement ps = getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            e.printStackTrace();
        }

        DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(table);
        jTable2.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search));
        */

    }//GEN-LAST:event_search_btnsearch_feildKeyReleased

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
       
        clearTableRecords();
        show_details_in_table();
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void refresh_btnsearch_feildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refresh_btnsearch_feildKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh_btnsearch_feildKeyReleased

    private void jTable1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTable1MouseWheelMoved
        
        int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        String nic= model.getValueAt(selectedRow,0).toString();
        String state = model.getValueAt(selectedRow,9).toString();
        
        if(state.equals("Pending")){
            
            CustomerViewer view = new CustomerViewer(nic);
            view.setVisible(true);
        }
        if(state.equals("Completed")){
            
            CustomerViewNormal normalview = new CustomerViewNormal(nic);
            normalview.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jTable1MouseWheelMoved

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
         int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        try{
        String nic= model.getValueAt(selectedRow,0).toString();
        String serial = model.getValueAt(selectedRow,2).toString();
        String month = model.getValueAt(selectedRow,3).toString();
        String status = model.getValueAt(selectedRow,9).toString();
        //String date = model.getValueAt(selectedRow,6).toString();
        
        PaymentStateUpdater state = new PaymentStateUpdater(serial, nic,month);
        
        if(status.equals("Pending")){
            
            state.setVisible(true);
        }
        }catch(NullPointerException e){
           e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        //System.out.print(counter);
        
        if(counter == 0){
            
            int answer = JOptionPane.showConfirmDialog(null, "Record May Be Already Added, Are You Checked Your Table Before Add Records For Current Month?", "Confirm Adding",JOptionPane.YES_NO_OPTION);
            
            if(answer == 0){
                
            show_rented_records_in_table();
            counter++;
            
            }
        }
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btn1ActionPerformed
      
            String valSelected = jComboBox2.getSelectedItem().toString(); 
            clearTableRecords();
            show_result_in_table2(valSelected);
    }//GEN-LAST:event_search_btn1ActionPerformed

    private void search_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btn2ActionPerformed
       
            String valSelected = searchNICFeild.getText();
            clearTableRecords();
            show_result_in_table3(valSelected);
    }//GEN-LAST:event_search_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTextField searchNICFeild;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton search_btn1;
    private javax.swing.JButton search_btn2;
    // End of variables declaration//GEN-END:variables
}
