
package brightstar;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class UserHistory extends javax.swing.JPanel {

    Connection con=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public UserHistory() {
        initComponents();
    }
        public void getMaxCount(){ 
        
         String query = "SELECT MAX(name) FROM auditt";
       
        ResultSet result;
        
        try {
            
          PreparedStatement ps = DBconnect.connect().prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                maxVal.setText(result.getString(1));
                      
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }
        
        public void getMinCount(){
        
           String query = "SELECT MIN(name) FROM auditt";
       
        ResultSet result;
        
        try {
            
          PreparedStatement ps = DBconnect.connect().prepareStatement(query);
            result = ps.executeQuery(query);
            
            
            while(result.next()){
                
                minVal.setText(result.getString(1));   
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
         
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maxVal = new javax.swing.JLabel();
        minVal = new javax.swing.JLabel();
        btnp = new javax.swing.JButton();
        rfsh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Management System");
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Services_64px.png"))); // NOI18N
        jLabel4.setText("jLabel3");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Increase_50px.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("History");
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 100));

        tabl.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Time", "Date", "Status"
            }
        ));
        tabl.setRowHeight(20);
        jScrollPane1.setViewportView(tabl);
        if (tabl.getColumnModel().getColumnCount() > 0) {
            tabl.getColumnModel().getColumn(0).setResizable(false);
            tabl.getColumnModel().getColumn(1).setResizable(false);
            tabl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Most Loged Person     ::");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText(" Less Loged Person     ::");

        maxVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxVal.setForeground(new java.awt.Color(255, 0, 0));
        maxVal.setText("...........");

        minVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minVal.setForeground(new java.awt.Color(255, 0, 0));
        minVal.setText("..........");

        btnp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/gghhhgg.png"))); // NOI18N
        btnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpActionPerformed(evt);
            }
        });

        rfsh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rfsh.setText("Refresh");
        rfsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(btnp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(maxVal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(minVal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(655, 655, 655)
                .addComponent(rfsh, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rfsh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxVal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minVal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpActionPerformed
       
        
        try {
            tabl.print();
        } catch (PrinterException ex) {
            Logger.getLogger(UserHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnpActionPerformed

    private void rfshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfshActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dm = (DefaultTableModel) tabl.getModel();
        dm.getDataVector().removeAllElements();
        revalidate();
        
        try {
            // TODO add your handling code here:
      
            String abc = "SELECT * FROM auditt";
    
            PreparedStatement ps = DBconnect.connect().prepareStatement(abc);
            DefaultTableModel Model = (DefaultTableModel) tabl.getModel(); 
            ResultSet result = ps.executeQuery();
            
            while(result.next()){
                
                String name = result.getString(1);
                String  time = result.getString(2);
                String date = result.getString(3);
                String status = result.getString(4);
               
                
                Model.addRow(new String[]{
                        name,time,date,status
                });
                 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserHistory.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        getMaxCount();
        getMinCount();
        
    }//GEN-LAST:event_rfshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maxVal;
    private javax.swing.JLabel minVal;
    private javax.swing.JButton rfsh;
    private javax.swing.JTable tabl;
    // End of variables declaration//GEN-END:variables
}
