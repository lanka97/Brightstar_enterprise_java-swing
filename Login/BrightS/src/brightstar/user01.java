
package brightstar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class user01 extends javax.swing.JFrame {

     ResultSet rs = null;    
     Connection con=null;
     PreparedStatement pst = null;  
     
         String userID= null;
         String username = null;
         String firstname = null;
         String password = null;
         String type = null;
         String nic = null;
         String phone = null;
         String email = null;
         String lname = null;
         String DfB = null;
         String Add = null;
   
         
    public user01() {
        initComponents();
    }
         
    public user01(String username, String date) {
        initComponents();
        this.DfB = date;
        this.username=username;
        System.out.println(DfB);
        System.out.println(username);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("user");

        jButton1.setText("profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("logOut");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        con = DBconnect.connect();
           
        try{
            String sql = "SELECT * FROM admint WHERE AFname= ? AND ADayofBirth= ?";
            
            pst = con.prepareStatement(sql);
            
            pst.setString(1,username);
            pst.setString(2,DfB);
            
            try{
                
                rs = pst.executeQuery();     
                
                if(rs.next())
                {
                    
                    username = rs.getString("AFname");
                    firstname = rs.getString("AFname");
                    password = rs.getString("Apass");
                    type = rs.getString("type");
                    nic = rs.getString("Anic");
                    phone = rs.getString("Aphone");
                    email = rs.getString("Aemail");
                    lname = rs.getString("ALname");
                    //DfB = rs.getString("ADayofBirth");
                    Add = rs.getString("Address");
                    
                }
                
                UserProfile profile = new UserProfile(userID, username, firstname, lname,DfB, Add, nic, phone, email);
                profile.setVisible(true);
                
                this.dispose();
            }catch (SQLException e){
                
                JOptionPane.showMessageDialog(null,e);    
            }
            
        }catch (SQLException ex){
            
             Logger.getLogger(user01.class.getName()).log(Level.SEVERE,null,ex);   
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loginm l = new loginm();
        l.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
