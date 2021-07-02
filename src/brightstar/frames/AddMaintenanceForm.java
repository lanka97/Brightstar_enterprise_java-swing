/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.frames;

//import brightstar.Maintenance.GroupButtonUtils;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javax.management.Query.match;
import brightstar.connection.DBConnection;

/**
 *
 * @author Yasith
 */
public class AddMaintenanceForm extends javax.swing.JFrame {
    
    
    /**
     * Creates new form AddMaintenanceForm
     */
    public AddMaintenanceForm() {
        initComponents();
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jphonenumber1 = new javax.swing.JTextField();
        PaymentMethode = new javax.swing.ButtonGroup();
        MaintenanceStatus = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JphoneNumber = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Jemail = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Jaddress = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        JcustomerName = new javax.swing.JTextField();
        Jmodel = new javax.swing.JComboBox<>();
        JmachineBrand = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jissue = new javax.swing.JTextField();
        Jdate = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        Jphonenumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jphonenumber1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel4.setMinimumSize(new java.awt.Dimension(1200, 700));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Enter Maintenance Details");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Address");

        JphoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JphoneNumberActionPerformed(evt);
            }
        });
        JphoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JphoneNumberKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Machine Brand");

        Jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JemailActionPerformed(evt);
            }
        });
        Jemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JemailKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Email");

        Jaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddressActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Phone Number");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Add Maintenance Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Model");

        JcustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcustomerNameActionPerformed(evt);
            }
        });
        JcustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JcustomerNameKeyReleased(evt);
            }
        });

        Jmodel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model", "Black", "Colour" }));
        Jmodel.setPreferredSize(new java.awt.Dimension(6, 22));

        JmachineBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model", "Toshiba", "Ricoh" }));
        JmachineBrand.setPreferredSize(new java.awt.Dimension(6, 22));
        JmachineBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmachineBrandActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Issue");

        Jissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JissueActionPerformed(evt);
            }
        });
        Jissue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JissueKeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Date");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Customer Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel31)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JcustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(JphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel27)
                    .addComponent(JmachineBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(Jmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Jissue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Jissue)
                    .addComponent(JcustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JmachineBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int state = JOptionPane.showConfirmDialog(null, "Do you want to cancel?", "Alert", JOptionPane.YES_NO_OPTION);
        
        if(state == 0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
         String CustomerName  = JcustomerName.getText();
         String Address = Jaddress.getText();
         String PhoneNumber = JphoneNumber.getText();
         String Email = Jemail.getText();
         String Issue = Jissue.getText();
         String MachineBrand = JmachineBrand.getSelectedItem().toString();
         String Model = Jmodel.getSelectedItem().toString();
         Format formatter = new SimpleDateFormat("yyyy-MM-dd");
         String Date = formatter.format(Jdate.getDate());
        
         
         
        try {
            String addMaintenanceQueary = "INSERT INTO machinemaintenancenew (customerName,address,phoneNumber,email,issue,machineBrand,model,date) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(addMaintenanceQueary);
            
         
            ps.setString(1, CustomerName);
            ps.setString(2, Address);
            ps.setString(3, PhoneNumber);
            ps.setString(4, Email);
            ps.setString(5, Issue);
            ps.setString(6, MachineBrand);
            ps.setString(7, Model);
            ps.setString(8,Date );
            
            ps.executeUpdate();
             System.out.println(CustomerName + ","+Address +  ","+PhoneNumber +  ","+Email +  ","+Issue +  ","+MachineBrand +  ","+Model);
        
            JOptionPane.showMessageDialog(null, "Maintenance added successfully!",
                    "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddMaintenanceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMaintenanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            if(CustomerName.isEmpty()){
                JOptionPane.showMessageDialog(null, "Customer Name Can Not Be EMPTY!");
                JcustomerName.setForeground(Color.RED);
            }
            if(Address.isEmpty()){
                JOptionPane.showMessageDialog(null, "Address Can Not Be EMPTY!");
                Jaddress.setForeground(Color.RED);
            }
            if(PhoneNumber.isEmpty()){
                JOptionPane.showMessageDialog(null, "Phone Number Can Not Be EMPTY!");
                JphoneNumber.setForeground(Color.RED);
            }
            if(Email.isEmpty()){
                JOptionPane.showMessageDialog(null, "Email Can Not Be EMPTY!");
                Jemail.setForeground(Color.RED);
            }
            if(Issue.isEmpty()){
                JOptionPane.showMessageDialog(null, "Address Can Not Be EMPTY!");
                Jissue.setForeground(Color.RED);
            }
            if(MachineBrand.isEmpty()){
                JOptionPane.showMessageDialog(null, "Machine Brand Can Not Be EMPTY!");
                JmachineBrand.setForeground(Color.RED);
            }
            if(Model.isEmpty()){
                JOptionPane.showMessageDialog(null, "Model Can Not Be EMPTY!");
                Jmodel.setForeground(Color.RED);
            }
            else{
                 JOptionPane.showMessageDialog(null, "Validation is Successfully");
            }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JaddressActionPerformed

    private void JemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JemailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JemailActionPerformed

    private void JphoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JphoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JphoneNumberActionPerformed

    private void JcustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcustomerNameActionPerformed

    private void Jphonenumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jphonenumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jphonenumber1ActionPerformed

    private void JmachineBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmachineBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmachineBrandActionPerformed

    private void JemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JemailKeyReleased
        // TODO add your handling code here:
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(Jemail.getText());

        if (!matcher.matches()) {
            jLabel1.setText("email is incorrect");
            
        } else {
            jLabel1.setText(null);
           
        }
    }//GEN-LAST:event_JemailKeyReleased

    private void JphoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JphoneNumberKeyReleased
        // TODO add your handling code here:
        Pattern pattern = Pattern.compile("^[0-9, ]+$");
        Matcher matcher = pattern.matcher(JphoneNumber.getText());

        if (!matcher.matches() || JphoneNumber.getText().length() != 10) {
            jLabel2.setText("Invalid Phone Number");
          
        } else {
            jLabel2.setText(null);
           
        }
    }//GEN-LAST:event_JphoneNumberKeyReleased

    private void JcustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JcustomerNameKeyReleased
       
    }//GEN-LAST:event_JcustomerNameKeyReleased

    private void JissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JissueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JissueActionPerformed

    private void JissueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JissueKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_JissueKeyReleased

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
            java.util.logging.Logger.getLogger(AddMaintenanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMaintenanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMaintenanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMaintenanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMaintenanceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jaddress;
    private javax.swing.JTextField JcustomerName;
    private com.toedter.calendar.JDateChooser Jdate;
    private javax.swing.JTextField Jemail;
    private javax.swing.JTextField Jissue;
    private javax.swing.JComboBox<String> JmachineBrand;
    private javax.swing.JComboBox<String> Jmodel;
    private javax.swing.JTextField JphoneNumber;
    private javax.swing.JTextField Jphonenumber1;
    private javax.swing.ButtonGroup MaintenanceStatus;
    private javax.swing.ButtonGroup PaymentMethode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}