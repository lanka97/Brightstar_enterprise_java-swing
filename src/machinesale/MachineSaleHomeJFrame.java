/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinesale;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import office_man_system.Home;

/**
 *
 * @author Naviya
 */
public class MachineSaleHomeJFrame extends javax.swing.JFrame {

      GridBagLayout layout = new GridBagLayout();
      
     MachineSalePanel  machine_sale;
     UpdateDeletePanel update_delete;
     ReportPanel report;
    /**
     * Creates new form MachineSaleHomeJFrame
     */
    public MachineSaleHomeJFrame() {
        initComponents();
        
        machine_sale = new  MachineSalePanel();
        update_delete =  new UpdateDeletePanel();
        report = new ReportPanel();
        
        Dynamic_p.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();    
        
        c.gridx = 0;
        c.gridy = 0;
        
        
        Dynamic_p.add(machine_sale, c);
        
      Dynamic_p.add(update_delete, c);
        
      Dynamic_p.add(report, c);
    
       machine_sale.setVisible(true);
       update_delete.setVisible(false);
        report.setVisible(false);
    }

        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg_panel = new javax.swing.JPanel();
        btn_customer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Editdet = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_report = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TopPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Dynamic_p = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Bg_panel.setBackground(new java.awt.Color(0, 51, 153));
        Bg_panel.setForeground(new java.awt.Color(153, 0, 204));
        Bg_panel.setPreferredSize(new java.awt.Dimension(300, 800));

        btn_customer.setBackground(new java.awt.Color(0, 51, 153));
        btn_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customerMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(54, 33, 89));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Details");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Customer_35px_1.png"))); // NOI18N

        javax.swing.GroupLayout btn_customerLayout = new javax.swing.GroupLayout(btn_customer);
        btn_customer.setLayout(btn_customerLayout);
        btn_customerLayout.setHorizontalGroup(
            btn_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_customerLayout.setVerticalGroup(
            btn_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_customerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(67, 67, 67))
        );

        btn_Editdet.setBackground(new java.awt.Color(0, 51, 153));
        btn_Editdet.setPreferredSize(new java.awt.Dimension(300, 56));
        btn_Editdet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditdetMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edit Details");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Edit_Property_35px_1.png"))); // NOI18N

        javax.swing.GroupLayout btn_EditdetLayout = new javax.swing.GroupLayout(btn_Editdet);
        btn_Editdet.setLayout(btn_EditdetLayout);
        btn_EditdetLayout.setHorizontalGroup(
            btn_EditdetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EditdetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        btn_EditdetLayout.setVerticalGroup(
            btn_EditdetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_EditdetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_EditdetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        btn_report.setBackground(new java.awt.Color(0, 51, 153));
        btn_report.setPreferredSize(new java.awt.Dimension(300, 56));
        btn_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sales Report");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Graph_Report_Script_35px.png"))); // NOI18N

        javax.swing.GroupLayout btn_reportLayout = new javax.swing.GroupLayout(btn_report);
        btn_report.setLayout(btn_reportLayout);
        btn_reportLayout.setHorizontalGroup(
            btn_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        btn_reportLayout.setVerticalGroup(
            btn_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_reportLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_reportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bright-star.png"))); // NOI18N

        home.setBackground(new java.awt.Color(0, 51, 153));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Home_50px_1.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Bg_panelLayout = new javax.swing.GroupLayout(Bg_panel);
        Bg_panel.setLayout(Bg_panelLayout);
        Bg_panelLayout.setHorizontalGroup(
            Bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Editdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Bg_panelLayout.createSequentialGroup()
                .addGroup(Bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bg_panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Bg_panelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Bg_panelLayout.setVerticalGroup(
            Bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bg_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btn_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Editdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(0, 51, 204));
        TopPanel.setPreferredSize(new java.awt.Dimension(1200, 100));
        TopPanel.setRequestFocusEnabled(false);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Machine Sale");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dynamic_p.setRequestFocusEnabled(false);

        javax.swing.GroupLayout Dynamic_pLayout = new javax.swing.GroupLayout(Dynamic_p);
        Dynamic_p.setLayout(Dynamic_pLayout);
        Dynamic_pLayout.setHorizontalGroup(
            Dynamic_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        Dynamic_pLayout.setVerticalGroup(
            Dynamic_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(Dynamic_p);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
            .addComponent(Bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void Bg_panelMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        
    }         
      
    private void btn_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customerMouseClicked
        // TODO add your handling code here:
        setColor(btn_customer);
        resetColor(btn_Editdet);
        resetColor(btn_report);
        
         machine_sale.setVisible(true);
       update_delete.setVisible(false);
        report.setVisible(false);
    }//GEN-LAST:event_btn_customerMouseClicked

    private void btn_EditdetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditdetMouseClicked
        // TODO add your handling code here:
         setColor(btn_Editdet);
        resetColor(btn_customer);
        resetColor(btn_report);
        
         machine_sale.setVisible(false);
       update_delete.setVisible(true);
        report.setVisible(false);
    }//GEN-LAST:event_btn_EditdetMouseClicked

    private void btn_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportMouseClicked
        // TODO add your handling code here:
         setColor(btn_report);
        resetColor(btn_customer);
        resetColor(btn_Editdet);
        
         machine_sale.setVisible(false);
       update_delete.setVisible(false);
        report.setVisible(true);
    }//GEN-LAST:event_btn_reportMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        Home home = new Home();
        home.setVisible(rootPaneCheckingEnabled);
        closeWindow();
        
    }//GEN-LAST:event_jLabel9MouseClicked

    
    public void closeWindow(){
        
        WindowEvent windowClose;
        windowClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0,102,204) );
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0,51,153) );
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
            java.util.logging.Logger.getLogger(MachineSaleHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MachineSaleHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MachineSaleHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MachineSaleHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MachineSaleHomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg_panel;
    private javax.swing.JPanel Dynamic_p;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel btn_Editdet;
    private javax.swing.JPanel btn_customer;
    private javax.swing.JPanel btn_report;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
