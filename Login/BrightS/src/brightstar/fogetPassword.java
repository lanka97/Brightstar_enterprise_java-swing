
package brightstar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class fogetPassword extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
   
    public fogetPassword() {
        initComponents();
        
        con = DBconnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailbox = new javax.swing.JTextField();
        cpassbox = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        passbox = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        emailC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));

        submit.setBackground(new java.awt.Color(0, 0, 102));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Customer_20px.png"))); // NOI18N
        submit.setText("  Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(0, 0, 102));
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Payment_History_20px_1.png"))); // NOI18N
        Cancel.setText("   Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Email Address");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Conform password");

        emailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailboxActionPerformed(evt);
            }
        });
        emailbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailboxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailboxKeyReleased(evt);
            }
        });

        cpassbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassboxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("User Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("password");

        sidePanel.setBackground(new java.awt.Color(0, 0, 102));
        sidePanel.setPreferredSize(new java.awt.Dimension(300, 800));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/11.png"))); // NOI18N
        sidePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, 220));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sidePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/nmnm.png"))); // NOI18N
        sidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 190));

        emailC.setForeground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Foget Password ");
        jLabel4.setPreferredSize(new java.awt.Dimension(1200, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passbox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailbox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpassbox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailC, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailC, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(cpassbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addComponent(sidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        String username = null; 
        
        try{
            
            String name = namebox.getText();
            String email = emailbox.getText();
            String pass = passbox.getText().toString();
            String cpass = cpassbox.getText().toString();
             
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Name ia mandotory");
        }
        if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Email ia mandotory");
        }
        if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "passwoed ia mandotory");
        }
        if(cpass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "password ia mandotory");
        }
          
            
          if (pass.equals(cpass))
          { 
            String sql = "SELECT * FROM admint WHERE AFname= ? AND Aemail= ? "; 
            
            pst1 = con.prepareStatement(sql);
            
            
            pst1.setString(1,name);
            pst1.setString(2,email);
            
            
            rs=pst1.executeQuery();
            
                if(rs.next())
                {
                    name = rs.getString("AFname");
                    email = rs.getString("Aemail");    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invaid username or email","Access Denied",JOptionPane.ERROR_MESSAGE);
                } 
            
                if((name.equals(name) && email.equals(email)))
                {
                    String sq2 = "UPDATE admint SET  Apass = '"+pass+"' WHERE Aemail ='"+email+"'";
                
                    pst2 = con.prepareStatement(sq2);
                    pst2.executeUpdate();
                
                    JOptionPane.showMessageDialog(null,"....Change Password....");
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error");
                }
          }
          else
          {
              JOptionPane.showMessageDialog(null,"....Password is not Matching....");
          }
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }            
    }//GEN-LAST:event_submitActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void emailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailboxActionPerformed

    private void cpassboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassboxActionPerformed

    private void emailboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailboxKeyPressed
        // TODO add your handling code here    
    }//GEN-LAST:event_emailboxKeyPressed

    private void emailboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailboxKeyReleased
        // TODO add your handling code here:
        
          String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailbox.getText());

        if (!matcher.matches()) {
            emailC.setText("Invalid Email");
            
        } else {
            emailC.setText(null);
           
        }    
    }//GEN-LAST:event_emailboxKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        loginm l = new loginm();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(fogetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fogetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fogetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fogetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fogetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JPasswordField cpassbox;
    private javax.swing.JLabel emailC;
    private javax.swing.JTextField emailbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namebox;
    private javax.swing.JPasswordField passbox;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
