
package brightstar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class ShowLogingHistory extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String userName = null;
    
   
    public ShowLogingHistory() {
        initComponents();
    }
    
    public ShowLogingHistory(String Username) {
        
            initComponents();
            this.userName= Username;
            System.out.println(this.userName);
            
            this.viewTable();
        }
    
    public void viewTable() {
        ArrayList<loginRecord> List = this.getLoginRecords();
        DefaultTableModel model = (DefaultTableModel) tablehis.getModel();
        String[] row = new String[3];
        for(int i = 0; i< List.size(); i++){
            
            row[0]= List.get(i).time;
            row[1]= List.get(i).date;
            row[2]= List.get(i).status;
            
            model.addRow(row);
        }
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablehis = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 100));
        setUndecorated(true);

        tablehis.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tablehis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Date", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablehis.setRowHeight(30);
        tablehis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablehisKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablehis);
        if (tablehis.getColumnModel().getColumnCount() > 0) {
            tablehis.getColumnModel().getColumn(0).setResizable(false);
            tablehis.getColumnModel().getColumn(1).setResizable(false);
            tablehis.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        jLabel2.setText("History Report");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablehisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablehisKeyReleased
              
    }//GEN-LAST:event_tablehisKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public ArrayList<loginRecord> getLoginRecords() {
           
        
            ArrayList<loginRecord> List = new ArrayList<loginRecord>();
            
            con = DBconnect.connect();
            
            
            String sql = "SELECT * FROM auditt WHERE name=?  ";
        try {    
            pst = con.prepareStatement(sql);
            
            pst.setString(1,userName);
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                loginRecord login =new loginRecord();
                login.date = rs.getString(3);
                login.status = rs.getString(4);
                login.time = rs.getString(2);
                login.userName = rs.getString(1);
                List.add(login);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowLogingHistory.class.getName()).log(Level.SEVERE, null, ex);
        }    
            return List;
        
    }
   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowLogingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablehis;
    // End of variables declaration//GEN-END:variables
}
