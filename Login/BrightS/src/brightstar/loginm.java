 
package brightstar;
;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.*;
import brightstar.UserProfile;
import java.util.Date;  

public class loginm extends javax.swing.JFrame 
{
    
    
    Connection con=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public loginm() {
        initComponents();
        
         con = DBconnect.connect();
    }
    
   public String date;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordBox = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        usernameBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 50));
        setPreferredSize(new java.awt.Dimension(666, 700));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 75)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Login");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 0, 230, 110);

        sidePanel.setBackground(new java.awt.Color(0, 0, 102));
        sidePanel.setPreferredSize(new java.awt.Dimension(300, 800));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/nmnm.png"))); // NOI18N
        sidePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 210, 170));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/11.png"))); // NOI18N
        sidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 220));

        getContentPane().add(sidePanel);
        sidePanel.setBounds(0, 0, 260, 700);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Customer_20px.png"))); // NOI18N
        jButton1.setText("    login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 490, 101, 48);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Quickdraw_20px.png"))); // NOI18N
        jButton2.setText("     Foget Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 590, 155, 29);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Password :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 330, 129, 30);

        passwordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBoxActionPerformed(evt);
            }
        });
        getContentPane().add(passwordBox);
        passwordBox.setBounds(350, 390, 246, 44);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("User Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 170, 129, 30);

        usernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameBoxActionPerformed(evt);
            }
        });
        getContentPane().add(usernameBox);
        usernameBox.setBounds(350, 230, 245, 43);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/wallpp.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(654, 651));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 660, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
         
         String id = null;
            
            
        try{
            
            String name = usernameBox.getText();
            String pass = passwordBox.getText().toString();
             
            String sql = "SELECT * FROM admint WHERE AFname= ? AND Apass= ?";
            
            
            pst = con.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,pass);
            
            rs=pst.executeQuery();
            
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
                DfB = rs.getString("ADayofBirth");
                Add = rs.getString("Address");   
                
            }
                
            else
            {
                JOptionPane.showMessageDialog(null,"Invaid username or password","Access Denied",JOptionPane.ERROR_MESSAGE);
            } 
           
             
            if((name.equals(username) && pass.equals(password))){
                JOptionPane.showMessageDialog(null,"Welcome User");
                System.out.print(type);
                   
                if(type.equals("admin"))
                {
                    admin01 m = new admin01(username,DfB);
                    m.setVisible(true);
                    this.dispose();
                       
                    Date currentDate = (Date) GregorianCalendar.getInstance().getTime();    
                    DateFormat df = DateFormat.getDateInstance();  
                    String dateString = df.format(currentDate);
                    
                    Date d;
                    d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String timeString = sdf.format(d);
                        
                    String value0 = timeString;
                    String values = dateString;
                    
                    UserProfile user = new UserProfile();
                     String value = user.userID;  
                    
                    String reg = "insert into Auditt(name,time,date,status) values ('"+username+"','"+value0+"','"+values+"','logged in')";
                    pst=con.prepareStatement(reg);
                    pst.execute();
                    this.dispose();
                 }
                if(type.equals("user"))
                {
                        user01 u = new user01(username,DfB);
                        u.setVisible(true);
                        this.dispose();
                        
                    Date currentDate = (Date) GregorianCalendar.getInstance().getTime();    
                    DateFormat df = DateFormat.getDateInstance();  
                    String dateString = df.format(currentDate);
                    
                    Date d;
                    d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String timeString = sdf.format(d);
                        
                    String value0 = timeString;
                    String values = dateString;
                    
                    UserProfile user = new UserProfile();
                     String value = user.userID; 
                    
                    String reg = "insert into Auditt(name,time,date,status) values ('"+username+"','"+value0+"','"+values+"','logged in')";
                    pst=con.prepareStatement(reg);
                    pst.execute();
                    this.dispose();           
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }
            
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null,e);
            
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        fogetPassword f = new fogetPassword();
        f.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameBoxActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:  
    }//GEN-LAST:event_jButton1MouseClicked

    private void passwordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordBoxActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField usernameBox;
    // End of variables declaration//GEN-END:variables
}
