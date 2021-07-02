/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar;

import DBconnection.DBConnection;
import brightstar.SubFrames.AddOther;
import brightstar.SubFrames.UpdateOther;
import functions.Bill;
import functions.Other;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Pasan
 */
public class other extends javax.swing.JPanel {

    /**
     * Creates new form ViewSalesPanel
     */
    public other() {
        initComponents();
        viewOtherTable();
        sError.setVisible(false);
    }
    
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        revalidate(); 
    }
    

    public void viewOtherTable(){
    
        ArrayList<Other> otherList = getAllOthers();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] row = new String[7];
            
        for(int i = 0; i < otherList.size(); i++){
            DateFormat df = new SimpleDateFormat("yyyy-MM-d"); 
            row[0] = otherList.get(i).otherID;
            //row[1] = otherList.get(i).billType;
            row[2] = otherList.get(i).officer;
            row[1] = otherList.get(i).otherDate;
            row[3] = otherList.get(i).otherDes;
            row[4] = Double.toString(otherList.get(i).total);
            row[5] = Double.toString(otherList.get(i).payed);
            //row[7] = Integer.toString(otherList.get(i).units);
            row[6] = Integer.toString(otherList.get(i).chequeNum);
                   
            model.addRow(row);
        }
    
    }
    
    public ArrayList<Other> getAllOthers(){
        
       
            DBConnection con = new DBConnection();
            ArrayList<Other> OtherList = new ArrayList<>();
            
            String viewAll = "SELECT * FROM expenditure where  type = 'other'";
            
            try {
            PreparedStatement ps = con.getConnection().prepareStatement(viewAll);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Other OTHER = new Other();
                OTHER.otherID = resultSet.getString(1);
                OTHER.otherType = resultSet.getString(2);
                OTHER.otherDate = resultSet.getString(3);
                OTHER.otherDes = resultSet.getString(4);
                //OTHER.units = resultSet.getInt(5);
                OTHER.officer = resultSet.getString(6);
                OTHER.payed = resultSet.getDouble(7);
                OTHER.total = resultSet.getDouble(8);
                OTHER.chequeNum = resultSet.getInt(9);
                //OTHER.month = resultSet.getString(10);
                OtherList.add(OTHER);
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return OtherList;
    
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subDyanamic = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sError = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1600, 1010));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Other Expenditures");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        subDyanamic.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expenditure ID", "Date", "Officer in Charge", "Discription", "Total Amount", "Payed Amount", "cheque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(22);
        jTable1.setSelectionForeground(new java.awt.Color(255, 51, 51));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Create Expenditute");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Search_52px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Refresh_48px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        sError.setForeground(new java.awt.Color(204, 0, 0));
        sError.setText("****************No Search Result Found************************");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Genarate full Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Genarate Pending Payment Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subDyanamicLayout = new javax.swing.GroupLayout(subDyanamic);
        subDyanamic.setLayout(subDyanamicLayout);
        subDyanamicLayout.setHorizontalGroup(
            subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subDyanamicLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sError, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(subDyanamicLayout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(subDyanamicLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1517, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        subDyanamicLayout.setVerticalGroup(
            subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subDyanamicLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(sError)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(subDyanamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subDyanamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        clearTable();
        viewOtherTable();
        sError.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddOther add = new AddOther();
        add.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try {
            int row = jTable1.getSelectedRow();
            DefaultTableModel mode = (DefaultTableModel)jTable1.getModel();

            Other OTHER = new Other();

            String sqlDate = mode.getValueAt(row, 1 ).toString();

            OTHER.otherID = mode.getValueAt(row, 0).toString();
            //RENT.rentDate = mode.getValueAt(row, 1).toString();
            OTHER.otherDate=sqlDate;
            OTHER.otherDes = mode.getValueAt(row, 3).toString();
            OTHER.officer = mode.getValueAt(row, 2).toString();
            OTHER.total= Double.parseDouble(mode.getValueAt(row, 4).toString());
            OTHER.payed= Double.parseDouble(mode.getValueAt(row, 5).toString());
            OTHER.chequeNum= Integer.parseInt(mode.getValueAt(row, 6).toString());

            UpdateOther frame = new UpdateOther(OTHER);
            frame.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(other.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                  
          
        
        
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearTable();
        
        String search = jTextField1.getText();
        
            DBConnection con = new DBConnection();
            ArrayList<Other> OtherList = new ArrayList<>();
            
            String viewAll = "SELECT * FROM expenditure where  type = 'other' AND ( UPPER(desciption) LIKE UPPER('%"+ search + "%') OR UPPER(officer) LIKE UPPER('%"+ search + "%'))";
            
            try {
            PreparedStatement ps = con.getConnection().prepareStatement(viewAll);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Other OTHER = new Other();
                OTHER.otherID = resultSet.getString(1);
                OTHER.otherType = resultSet.getString(2);
                OTHER.otherDate = resultSet.getString(3);
                OTHER.otherDes = resultSet.getString(4);
                //OTHER.units = resultSet.getInt(5);
                OTHER.officer = resultSet.getString(6);
                OTHER.payed = resultSet.getDouble(7);
                OTHER.total = resultSet.getDouble(8);
                OTHER.chequeNum = resultSet.getInt(9);
                //OTHER.month = resultSet.getString(10);
                OtherList.add(OTHER);
            }
              
            } catch (SQLException ex) {
                Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
            }
       
            if(OtherList.size()==0){
                sError.setVisible(true);
            }
            else{
                sError.setVisible(false);
            }
            
           // ArrayList<Other> otherList = OtherList;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String[] row = new String[7];
            
            for(int i = 0; i < OtherList.size(); i++){
                
                row[0] = OtherList.get(i).otherID;
                //row[1] = otherList.get(i).billType;
                row[2] = OtherList.get(i).officer;
                row[1] = OtherList.get(i).otherDate;
                row[3] = OtherList.get(i).otherDes;
                row[4] = Double.toString(OtherList.get(i).total);
                row[5] = Double.toString(OtherList.get(i).payed);
                //row[7] = Integer.toString(otherList.get(i).units);
                row[6] = Integer.toString(OtherList.get(i).chequeNum);
                   
                model.addRow(row);
            } 


    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DBConnection db = new DBConnection();

        InputStream input = null;
        try {
            BasicConfigurator.configure();
            String path = "C:\\Users\\Lanka\\Desktop\\BrightStar1.2\\BrightStar1.2\\BrightStar\\Reports\\OtherReport.jrxml";
            input = new FileInputStream(new File(path));
            JRDesignQuery jrquery = new JRDesignQuery();
            jrquery.setText("SELECT * FROM expenditure where type = 'other'");
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            jasperDesign.setQuery(jrquery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, db.getConnection());
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (JRException ex) {
            ex.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBConnection db = new DBConnection();

        InputStream input = null;
        try {
            BasicConfigurator.configure();
            String path = "C:\\Users\\Lanka\\Desktop\\BrightStar1.2\\BrightStar1.2\\BrightStar\\BillReport.jrxml";
            input = new FileInputStream(new File(path));
            JRDesignQuery jrquery = new JRDesignQuery();
            jrquery.setText("SELECT * FROM expenditure where ( type ='other') AND (total > payed) ");
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            jasperDesign.setQuery(jrquery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, db.getConnection());
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (JRException ex) {
            ex.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel sError;
    private javax.swing.JPanel subDyanamic;
    // End of variables declaration//GEN-END:variables
}
