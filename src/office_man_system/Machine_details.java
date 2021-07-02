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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import office_man_system.SendThankYouEmail;

/**
 *
 * @author Pasindu Senarathne
 */
public class Machine_details extends javax.swing.JPanel {

    /**
     * Creates new form machine_details
     */
    public Machine_details() {
        initComponents();
        show_rented_records_in_table();
        show_available_records_in_table();
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
    

    public ArrayList<RentedMachines> getRentedMachineList(){
        
        
        ArrayList<RentedMachines> rentList = new ArrayList<RentedMachines>();
        

	Connection connection = getConnection();
       
        
        String query = "select * from rented_machine_records";
       
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
               machines.setType(result.getString(3));
               machines.setSerial(result.getString(4));
               machines.setCopyCount(result.getString(5));
               machines.setStatus(result.getString(6));
               machines.setDiscription(result.getString(7));
               machines.setDate(result.getString(8));
               
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
        
        DefaultTableModel model = (DefaultTableModel) rented_machines.getModel();
        Object[] row = new Object[8];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getType();
            row[3] = list.get(i).getSerial();
            row[4] = list.get(i).getCopyCount();
            row[5] = list.get(i).getStatus();
            row[6] = list.get(i).getDiscription();
            row[7] = list.get(i).getDate();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
     public ArrayList<AvailableMachines> getAvailableMachineList(){
        
        
        ArrayList<AvailableMachines> availableList = new ArrayList<AvailableMachines>();
        

	Connection connection = getConnection();
       
        
        String query = "select * from available_machines";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
          
            
            while(result.next()){
                
               AvailableMachines  machines;
               machines = new AvailableMachines();
                
               machines.setBrand(result.getString(2));
               machines.setType(result.getString(3));
               machines.setSerial(result.getString(1));
               machines.setCopyCount(result.getString(4));
               machines.setStatus(result.getString(5));
               machines.setDiscription(result.getString(6));
               
               availableList.add(machines);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return availableList;
    }
    
    public void show_available_records_in_table(){
        
        ArrayList<AvailableMachines> list = getAvailableMachineList();
        
        DefaultTableModel model = (DefaultTableModel) available_machines.getModel();
        Object[] row = new Object[8];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getBrand();
            row[1] = list.get(i).getType();
            row[2] = list.get(i).getSerial();
            row[3] = list.get(i).getCopyCount();
            row[4] = list.get(i).getStatus();
            row[5] = list.get(i).getDiscription();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
    public void clearTableRecords1(){
        
        DefaultTableModel tm = (DefaultTableModel) rented_machines.getModel();
        tm.getDataVector().removeAllElements();
        revalidate();
    }
    
     public void clearTableRecords2(){
        
        DefaultTableModel tm = (DefaultTableModel) available_machines.getModel();
        tm.getDataVector().removeAllElements();
        revalidate();
    }
    
    public ArrayList<RentedMachines> getSpecificRentedMachineList(String search){
        
        
        ArrayList<RentedMachines> rentList = new ArrayList<RentedMachines>();
        

	Connection connection = getConnection();
       
        
           String query = "SELECT * FROM rented_machine_records WHERE nic LIKE '%"+search+"%' OR machineBrand LIKE '%"+search+"%' OR serialNum LIKE '%"+search+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
               RentedMachines  machines;
               machines = new RentedMachines();
                
               machines.setId(result.getString(1));
               machines.setBrand(result.getString(2));
               machines.setType(result.getString(3));
               machines.setSerial(result.getString(4));
               machines.setCopyCount(result.getString(5));
               machines.setStatus(result.getString(6));
               machines.setDiscription(result.getString(7));
               
               rentList.add(machines);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return rentList;
    }
    
    public void show_search_records_in_table(String string){
        
        ArrayList<RentedMachines> list = getSpecificRentedMachineList(string);
        
        DefaultTableModel model = (DefaultTableModel) rented_machines.getModel();
        Object[] row = new Object[7];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrand();
            row[2] = list.get(i).getType();
            row[3] = list.get(i).getSerial();
            row[4] = list.get(i).getCopyCount();
            row[5] = list.get(i).getStatus();
            row[6] = list.get(i).getDiscription();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
    public ArrayList<AvailableMachines> getSpecificAvailableMachineList(String search){
        
        
        ArrayList<AvailableMachines> machineList = new ArrayList<AvailableMachines>();
        

	Connection connection = getConnection();
       
        
           String query = "SELECT * FROM available_machines WHERE brand LIKE '%"+search+"%' OR machineSerial LIKE '%"+search+"%'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            AvailableMachines aMachine;
            
            while(result.next()){
                
               AvailableMachines  machines;
               machines = new AvailableMachines();
                
               machines.setBrand(result.getString(2));
               machines.setType(result.getString(3));
               machines.setSerial(result.getString(1));
               machines.setCopyCount(result.getString(4));
               machines.setStatus(result.getString(5));
               machines.setDiscription(result.getString(6));
               
               machineList.add(machines);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return machineList;
    }
    
    public void show_asearch_records_in_table(String string){
        
        ArrayList<AvailableMachines> list = getSpecificAvailableMachineList(string);
        
        DefaultTableModel model = (DefaultTableModel)  available_machines.getModel();
        Object[] row = new Object[7];
        
        for(int i = 0; i < list.size(); i++){
           
            row[0] = list.get(i).getBrand();
            row[1] = list.get(i).getType();
            row[2] = list.get(i).getSerial();
            row[3] = list.get(i).getCopyCount();
            row[4] = list.get(i).getStatus();
            row[5] = list.get(i).getDiscription();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
     public String getEmail(String search){
        
        
	Connection connection = getConnection();
       
           String email = "";
                   
           String query = "SELECT email FROM rented_customers WHERE nic = '"+search+"'";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                
              
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
        return email;
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        remove_btn1 = new javax.swing.JButton();
        remove_feild1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        rented_machines = new javax.swing.JTable();
        refresh_btn1 = new javax.swing.JButton();
        search_feild = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        available_machines = new javax.swing.JTable();
        search_feild2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        refresh_btn2 = new javax.swing.JButton();
        search_btn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1500, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Serial Number");

        remove_btn1.setBackground(new java.awt.Color(255, 255, 255));
        remove_btn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        remove_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Slot_Machine_35px_1.png"))); // NOI18N
        remove_btn1.setText("Remove Record");
        remove_btn1.setIconTextGap(10);
        remove_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btn1ActionPerformed(evt);
            }
        });

        remove_feild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_feild1ActionPerformed(evt);
            }
        });

        rented_machines.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rented_machines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer NIC", "Machine Brand", "Type", "Serial Number", "Copy Count", "Status", "Discription", "Rented Date"
            }
        ));
        rented_machines.setGridColor(new java.awt.Color(255, 255, 255));
        rented_machines.setRowHeight(30);
        rented_machines.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                rented_machinesMouseWheelMoved(evt);
            }
        });
        rented_machines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rented_machinesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rented_machines);
        if (rented_machines.getColumnModel().getColumnCount() > 0) {
            rented_machines.getColumnModel().getColumn(6).setPreferredWidth(200);
            rented_machines.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        refresh_btn1.setBackground(new java.awt.Color(255, 255, 255));
        refresh_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Refresh_35px.png"))); // NOI18N
        refresh_btn1.setMaximumSize(new java.awt.Dimension(67, 50));
        refresh_btn1.setMinimumSize(new java.awt.Dimension(67, 50));
        refresh_btn1.setPreferredSize(new java.awt.Dimension(67, 50));
        refresh_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btn1ActionPerformed(evt);
            }
        });

        search_feild.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        search_feild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_feildKeyPressed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Search Customer NIC , Machine Serial Or Machine Brand Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remove_feild1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(remove_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(refresh_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(search_feild)
                        .addComponent(search_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refresh_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_feild1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(remove_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rented Machines", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 600));

        available_machines.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        available_machines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Machine Brand", "Type", "Serial Number", "Copy Count", "Status", "Discription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        available_machines.setGridColor(new java.awt.Color(255, 255, 255));
        available_machines.setRowHeight(30);
        available_machines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                available_machinesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(available_machines);
        if (available_machines.getColumnModel().getColumnCount() > 0) {
            available_machines.getColumnModel().getColumn(0).setResizable(false);
        }

        search_feild2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        search_feild2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_feild2KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Search Machine Brand Or Serial Number Here");

        refresh_btn2.setBackground(new java.awt.Color(255, 255, 255));
        refresh_btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Refresh_35px.png"))); // NOI18N
        refresh_btn2.setMaximumSize(new java.awt.Dimension(67, 50));
        refresh_btn2.setMinimumSize(new java.awt.Dimension(67, 50));
        refresh_btn2.setPreferredSize(new java.awt.Dimension(67, 50));
        refresh_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btn2ActionPerformed(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Add_User_Male_35px_1.png"))); // NOI18N
        jButton1.setText(" Add Machine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search_feild2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_feild2)
                    .addComponent(search_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refresh_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        jTabbedPane1.addTab("Available Machines", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void remove_feild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_feild1ActionPerformed
        
      
    }//GEN-LAST:event_remove_feild1ActionPerformed

    private void remove_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btn1ActionPerformed
        
        int selectedRow = rented_machines.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)rented_machines.getModel();
        
        String nic= model.getValueAt(selectedRow,0).toString();
        String brand = model.getValueAt(selectedRow,1).toString();
        String type = model.getValueAt(selectedRow,2).toString();
        String serial = model.getValueAt(selectedRow,3).toString();
        String copy_c = model.getValueAt(selectedRow,4).toString();
        String status = model.getValueAt(selectedRow,5).toString();
        String dis = model.getValueAt(selectedRow,6).toString();
        String date = model.getValueAt(selectedRow,7).toString();
       
         remove_feild1.setText(serial);
        String id = remove_feild1.getText();
         
         String query = "DELETE FROM rented_machine_records WHERE serialNum = '"+id+"'";
         
        try {
            
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(Custome_View.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
        
        
        String addQuery = "INSERT INTO available_machines VALUES(?, ?, ?, ?, ?, ?)";
        
         PreparedStatement ps;
       try {
           ps = getConnection().prepareStatement(addQuery);
           
           ps.setString(1, brand);
           ps.setString(2, type);
           ps.setString(3, serial);
           ps.setString(4, copy_c);
           ps.setString(5, status);
           ps.setString(6, dis);
        
        
           ps.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
       }

       String emailAddress = getEmail(nic);
       SendThankYouEmail.create_sendEmail(emailAddress);
       
       JOptionPane.showMessageDialog(null, "Record Deleted and Customer Notified");
       
    }//GEN-LAST:event_remove_btn1ActionPerformed

    private void refresh_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btn1ActionPerformed
       
        clearTableRecords1();
        show_rented_records_in_table();
    }//GEN-LAST:event_refresh_btn1ActionPerformed

    private void rented_machinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rented_machinesMouseClicked
       
        int selectedRow = rented_machines.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)rented_machines.getModel();
        
        String id= model.getValueAt(selectedRow,0).toString();
        String brand= model.getValueAt(selectedRow,1).toString();
        String type = model.getValueAt(selectedRow,2).toString();
        String serial = model.getValueAt(selectedRow,3).toString();
        String count = model.getValueAt(selectedRow,4).toString();
        String status = model.getValueAt(selectedRow,5).toString();
        String dis = model.getValueAt(selectedRow,6).toString();
        
        Update_Machine machine =  new Update_Machine(id,brand,type,count,serial,status,dis);
        machine.setVisible(true);
        
    }//GEN-LAST:event_rented_machinesMouseClicked

    private void search_feildKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_feildKeyPressed
/*
        String search = search_feild.getText();
        try {

            String sql = "SELECT customerName,nic,address,phone,dpositAmount,paidType,bank,chequeNum rented_customers WHERE nic LIKE '%"+search+"%'";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

        } catch (Exception e) {
        }
*/
    }//GEN-LAST:event_search_feildKeyPressed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        
        String search = search_feild.getText();
        clearTableRecords1();
        show_search_records_in_table(search);
    }//GEN-LAST:event_search_btnActionPerformed

    private void search_feild2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_feild2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_feild2KeyPressed

    private void refresh_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btn2ActionPerformed
        
        clearTableRecords2();
        show_available_records_in_table();
    }//GEN-LAST:event_refresh_btn2ActionPerformed

    private void search_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btn1ActionPerformed
        
        String search = search_feild2.getText();
        clearTableRecords2();
        show_asearch_records_in_table(search);
    }//GEN-LAST:event_search_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       Machine_Add add = new Machine_Add();
       add.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void available_machinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_available_machinesMouseClicked
       
        int selectedRow = available_machines.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) available_machines.getModel();
        
        String brand= model.getValueAt(selectedRow,0).toString();
        String type = model.getValueAt(selectedRow,1).toString();
        String serial = model.getValueAt(selectedRow,2).toString();
        String count = model.getValueAt(selectedRow,3).toString();
        String status = model.getValueAt(selectedRow,4).toString();
        String dis = model.getValueAt(selectedRow,5).toString();
       
        Machine_Add add = new Machine_Add(brand, type, count, serial, dis, status);
        add.setVisible(true);
    }//GEN-LAST:event_available_machinesMouseClicked

    private void rented_machinesMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_rented_machinesMouseWheelMoved
       
         int selectedRow = rented_machines.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)rented_machines.getModel();
        
        String nic= model.getValueAt(selectedRow,0).toString();
        
         CustomerViewNormal normalview = new CustomerViewNormal(nic);
         normalview.setVisible(true);
    }//GEN-LAST:event_rented_machinesMouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable available_machines;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton refresh_btn1;
    private javax.swing.JButton refresh_btn2;
    private javax.swing.JButton remove_btn1;
    private javax.swing.JTextField remove_feild1;
    public javax.swing.JTable rented_machines;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton search_btn1;
    private javax.swing.JTextField search_feild;
    private javax.swing.JTextField search_feild2;
    // End of variables declaration//GEN-END:variables
}
