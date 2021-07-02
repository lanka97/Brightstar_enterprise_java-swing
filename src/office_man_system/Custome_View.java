/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

import com.sun.imageio.plugins.png.RowFilter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.util.*;


/**
 *
 * @author Pasindu Senarathne
 */
public class Custome_View extends javax.swing.JPanel {

   
    public Custome_View() {
        initComponents();
        show_customers_in_table();
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
    

    public ArrayList<RentedCustomers> getCustomersList(){
        
        
        ArrayList<RentedCustomers> customerList = new ArrayList<RentedCustomers>();
        

	Connection connection = getConnection();
       
        
        String query = "select * from rented_customers";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentedCustomers customer;
            
            while(result.next()){
                
               RentedCustomers  customers;
               customers = new RentedCustomers();
                
               customers.setCustomerName(result.getString(2));
               customers.setCustomerNIC(result.getString(1));
               customers.setCustomerPhone(result.getString(4));
               customers.setEmailAddress(result.getString(5));
               customers.setCustomerAddress(result.getString(3));
               customers.setDeposit(result.getString(6));
               customers.setPaymentType(result.getString(7));
               customers.setBankName(result.getString(8));
               customers.setChequeNumber(result.getString(9));
                
               customerList.add(customers);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return customerList;
    }
    
    public void show_customers_in_table(){
        
        ArrayList<RentedCustomers> list = getCustomersList();
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object[] row = new Object[9];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getCustomerName();
            row[1] = list.get(i).getCustomerNIC();
            row[2] = list.get(i).getCustomerPhone();
            row[3] = list.get(i).getCustomerAddress();
            row[4] = list.get(i).getEmailAddress();
            row[5] = list.get(i).getDeposit();
            row[6] = list.get(i).getPaymentType();
            row[7] = list.get(i).getBankName();
            row[8] = list.get(i).getChequeNumber();
          
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    
    public void clearTableRecords(){
        
        DefaultTableModel tm = (DefaultTableModel) jTable2.getModel();
        tm.getDataVector().removeAllElements();
        revalidate();
    }
    
    public ArrayList<RentedCustomers> getSpecificCustomersList(String search){
        
        
        ArrayList<RentedCustomers> customerList = new ArrayList<RentedCustomers>();
        

	Connection connection = getConnection();
       
        
        String query = "SELECT * FROM rented_customers WHERE nic LIKE '%"+search+"%' OR customerName LIKE '%"+search+"%'  ";
       
        ResultSet result;
        
        try {
            
           PreparedStatement ps = connection.prepareStatement(query);
            result = ps.executeQuery(query);
            RentedCustomers customer;
            
            while(result.next()){
                
               RentedCustomers  customers;
               customers = new RentedCustomers();
                
              customers.setCustomerName(result.getString(2));
               customers.setCustomerNIC(result.getString(1));
               customers.setCustomerPhone(result.getString(4));
               customers.setEmailAddress(result.getString(5));
               customers.setCustomerAddress(result.getString(3));
               customers.setDeposit(result.getString(6));
               customers.setPaymentType(result.getString(7));
               customers.setBankName(result.getString(8));
               customers.setChequeNumber(result.getString(9));
                
               customerList.add(customers);
                
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
          
        return customerList;
    }
    
    public void show_customers_result_in_table(String string){
        
        ArrayList<RentedCustomers> list = getSpecificCustomersList(string);
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object[] row = new Object[9];
        
        for(int i = 0; i < list.size(); i++){
            
            row[0] = list.get(i).getCustomerName();
            row[1] = list.get(i).getCustomerNIC();
            row[2] = list.get(i).getCustomerPhone();
            row[3] = list.get(i).getCustomerAddress();
            row[4] = list.get(i).getEmailAddress();
            row[5] = list.get(i).getDeposit();
            row[6] = list.get(i).getPaymentType();
            row[7] = list.get(i).getBankName();
            row[8] = list.get(i).getChequeNumber();
            
            model.addRow(row);
         
        }
        model.fireTableDataChanged();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        delete_btn1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        refresh_btn = new javax.swing.JButton();
        search_feild = new javax.swing.JTextField();
        refresh_btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        delete_btn1.setBackground(new java.awt.Color(255, 255, 255));
        delete_btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        delete_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Denied_35px.png"))); // NOI18N
        delete_btn1.setText("Remove Customer");
        delete_btn1.setIconTextGap(10);
        delete_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_btn1MousePressed(evt);
            }
        });
        delete_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Customer NIC");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "NIC", "Phone Number", "Address", "Email", "Deposit Amount", "Payment Type", "Bank", "Cheque Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

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

        search_feild.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        search_feild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_feildKeyReleased(evt);
            }
        });

        refresh_btn1.setBackground(new java.awt.Color(255, 255, 255));
        refresh_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_man_system/images/icons8_Search_35px.png"))); // NOI18N
        refresh_btn1.setMaximumSize(new java.awt.Dimension(67, 50));
        refresh_btn1.setMinimumSize(new java.awt.Dimension(67, 50));
        refresh_btn1.setPreferredSize(new java.awt.Dimension(67, 50));
        refresh_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btn1ActionPerformed(evt);
            }
        });
        refresh_btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_feildKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Search Customer Name Or NIC Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refresh_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refresh_btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btn1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_btn1MousePressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int selectedRow = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        
        String name= model.getValueAt(selectedRow,0).toString();
        String nic = model.getValueAt(selectedRow,1).toString();
        String phone = model.getValueAt(selectedRow,2).toString();
        String address = model.getValueAt(selectedRow,3).toString();
        String email = model.getValueAt(selectedRow,4).toString();
        String deposit = model.getValueAt(selectedRow,5).toString();
        String type = model.getValueAt(selectedRow,6).toString();
        String bank = model.getValueAt(selectedRow,7).toString();
        String cheque = model.getValueAt(selectedRow,8).toString();
        
        Update_Customer customer =  new Update_Customer(name,nic,phone,address,deposit,type,bank,cheque,email);
        customer.setVisible(true);
       
    }//GEN-LAST:event_jTable2MouseClicked

    private void delete_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btn1ActionPerformed
        
         String id = jTextField2.getText();
         
         String query1 = "DELETE FROM rented_customers WHERE nic = '"+id+"'";
         String query2 = "DELETE FROM rented_machine_records WHERE nic = '"+id+"'";
         
        try {
            
            PreparedStatement ps1 = getConnection().prepareStatement(query1);
            ps1.executeUpdate();
            
            PreparedStatement ps2 = getConnection().prepareStatement(query2);
            ps2.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(Custome_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_btn1ActionPerformed

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        
        clearTableRecords();
        show_customers_in_table();
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void refresh_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btn1ActionPerformed
       
        String search = search_feild.getText();
         clearTableRecords();
        show_customers_result_in_table(search);
    }//GEN-LAST:event_refresh_btn1ActionPerformed

    private void search_feildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_feildKeyReleased
        
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

        
    }//GEN-LAST:event_search_feildKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JButton refresh_btn1;
    private javax.swing.JTextField search_feild;
    // End of variables declaration//GEN-END:variables
}
