/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.panels;

import brightstar.Maintenance.Maintenance;
import brightstar.Maintenance.Payment;
import brightstar.frames.UpdateMaintenanceForm;
import brightstar.frames.UpdatependingPayment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import brightstar.connection.DBConnection;

/**
 *
 * @author Yasith
 */
public class PendingPaymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form PendingPaymentPanel
     */
    public PendingPaymentPanel() {
        initComponents();
        clearTable();
        ViewAllPendingPayment();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel30.setText("Pending Payments Of Complete Maintenance");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Payment Id", "Complain Id", "Customer Name", "Amount", "Date", "Payment Methode", "Payment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setMaximumSize(new java.awt.Dimension(2147483647, 0));
        jTable2.setMinimumSize(new java.awt.Dimension(120, 0));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Click row to update maintenance details");

        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Click row to update pending payment details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(474, 474, 474)
                    .addComponent(jLabel1)
                    .addContainerGap(474, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(324, 324, 324)
                    .addComponent(jLabel1)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public ArrayList<Payment> getAllPendingPayment(){
        
            ArrayList<Payment> payList = new ArrayList<>();
            String getPayment  = "SELECT * FROM maintenancepaymentnew WHERE paymentStatus = 'Pending'";
           try { 
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(getPayment );
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
               
                Payment payment = new Payment();
            
                payment.setPaymentId(resultSet.getString(1));
                payment.setComplainId(resultSet.getString(2));
                payment.setCustomerName(resultSet.getString(3));
                payment.setAmount(resultSet.getDouble(4));
                payment.setDate(resultSet.getString(5));
                payment.setPaymentMethode(resultSet.getString(6));
                payment.setPaymentStatus(resultSet.getString(7));
                //payment.setAmount(resultSet.getDouble(6));
                
                        
                payList.add(payment);
                
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
      return payList;
    
    }      
        
    public void ViewAllPendingPayment(){
    
        ArrayList<Payment> pendingList = getAllPendingPayment();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String[] row = new String[7];
        
        
        
        for(int i = 0; i < pendingList.size(); i++){
            row[0] = pendingList.get(i).getPaymentId();
            row[1] = pendingList.get(i).getComplainId();
            row[2] = pendingList.get(i).getCustomerName();
            row[3] = Double.toString( pendingList.get(i).getAmount());
            row[4] = pendingList.get(i).getDate();
            row[5] = pendingList.get(i).getPaymentMethode();
            row[6] = pendingList.get(i).getPaymentStatus();
            
            
            model.addRow(row);
        }
        
        
    }
   public ArrayList<Maintenance> getAllDoneMaintenanceStatus(){
        
        ArrayList<Maintenance> doneList = new ArrayList<>();
        String viewAllDoneMaintenanceStatusQueary  = "SELECT * FROM machinemaintenancenew  WHERE  maintenanceStatus = 'Done' ";
        
        try {
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllDoneMaintenanceStatusQueary );
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
               
                Maintenance maintenance = new Maintenance();
                
                maintenance.setMaintenanceStatus(resultSet.getString(9));
                
                doneList.add(maintenance);
                
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MaintenancePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MaintenancePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return doneList;
            
    }
    public void viewMaintenanceTable(){
    
        ArrayList<Maintenance> doneList = getAllDoneMaintenanceStatus();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String[] row = new String[8];
            
        for(int i = 0; i < doneList.size(); i++){
            row[8] = doneList.get(i).getComplainId();
   
            model.addRow(row);
            
        }
        
        
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        DefaultTableModel mode = (DefaultTableModel)jTable2.getModel();
        
        String one = mode.getValueAt(row, 0).toString();
        String two = mode.getValueAt(row, 1).toString();
        String three = mode.getValueAt(row, 2).toString();
       
        
        UpdatependingPayment frame = new UpdatependingPayment(one,two,three);
        frame.setVisible(true);        
        
    }//GEN-LAST:event_jTable2MouseClicked
    public void clearTable(){
        
    DefaultTableModel dm = (DefaultTableModel) jTable2.getModel();
    dm.getDataVector().removeAllElements();
    revalidate();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearTable();
        ViewAllPendingPayment();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}