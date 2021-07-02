/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar;

import DBconnection.DBConnection;
import brightstar.SubFrames.AddRent;
import brightstar.SubFrames.UpdateRent1;
import functions.Other;
import functions.Rent;
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
//import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pasan
 */
public class rent extends javax.swing.JPanel {

    /**
     * Creates new form AddSpareParts
     */
    public rent() {
        initComponents();
        viewRentTable();
        sError.setVisible(false);
    }

    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        revalidate(); 
    }
    
   public void viewRentTable(){
    
        ArrayList<Rent> rentList = getAll();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] row = new String[8];
            
        for(int i = 0; i < rentList.size(); i++){
            
            row[0] = rentList.get(i).rentID;
            row[1] = rentList.get(i).rentDate;
            row[2] = rentList.get(i).rentType;
            row[4] = rentList.get(i).officer;
            //row[3] = billList.get(i).billDate;
            row[3] = rentList.get(i).rentDes;
            row[5] = Double.toString(rentList.get(i).total);
            row[6] = Double.toString(rentList.get(i).payed);
            //row[7] = Integer.toString(otherList.get(i).units);
            row[7] = Integer.toString(rentList.get(i).chequeNum);
                   
            model.addRow(row);
        }
    
    }
    
    public ArrayList<Rent> getAll(){
        
       
            DBConnection con = new DBConnection();
            ArrayList<Rent> rentList = new ArrayList<>();
            
            String viewAll = "SELECT * FROM expenditure where  type = 'rent' OR type = 'maintenance'";
            
            try {
            PreparedStatement ps = con.getConnection().prepareStatement(viewAll);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Rent RENT = new Rent();
                RENT.rentID = resultSet.getString(1);
                RENT.rentType = resultSet.getString(2);
                RENT.rentDate = resultSet.getString(3);
                RENT.rentDes = resultSet.getString(4);
                //OTHER.units = resultSet.getInt(5);
                RENT.officer = resultSet.getString(6);
                RENT.payed = resultSet.getDouble(7);
                RENT.total = resultSet.getDouble(8);
                RENT.chequeNum = resultSet.getInt(9);
                //OTHER.month = resultSet.getString(10);
                rentList.add(RENT);
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rentList;
    
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        sError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1600, 1010));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rents and Repears");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jLabel1)
                .addContainerGap(605, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        subDyanamic.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "payment ID", "Date", "Type", "Payment Discription", "officer incharge", "Total Amount", "Payed Amount", "cheque Num."
            }
        ));
        jTable1.setRowHeight(22);
        jTable1.setSelectionForeground(new java.awt.Color(204, 0, 0));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Create Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Refresh_48px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        sError.setForeground(new java.awt.Color(204, 0, 0));
        sError.setText("****************No Search Result Found************************");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Search_52px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

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
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(subDyanamicLayout.createSequentialGroup()
                        .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(subDyanamicLayout.createSequentialGroup()
                                .addComponent(sError, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(subDyanamicLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subDyanamicLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(43, 43, 43))
        );
        subDyanamicLayout.setVerticalGroup(
            subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subDyanamicLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subDyanamicLayout.createSequentialGroup()
                        .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subDyanamicLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(sError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subDyanamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subDyanamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddRent frame = new AddRent();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static String ONE;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
       
            int row = jTable1.getSelectedRow();
            DefaultTableModel mode = (DefaultTableModel)jTable1.getModel();
            
            Rent RENT = new Rent();
            
            RENT.rentID = mode.getValueAt(row, 0).toString();
            RENT.rentDate = mode.getValueAt(row, 1 ).toString() ;
            RENT.rentType = mode.getValueAt(row, 2).toString();
            RENT.rentDes = mode.getValueAt(row, 3).toString();
            RENT.officer = mode.getValueAt(row, 4).toString();
            RENT.total= Double.parseDouble(mode.getValueAt(row, 5).toString());
            RENT.payed= Double.parseDouble(mode.getValueAt(row, 6).toString());
            RENT.chequeNum= Integer.parseInt(mode.getValueAt(row, 7).toString());
            
            UpdateRent1 frame = new UpdateRent1(RENT);
            frame.setVisible(true);
       
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        clearTable();
        viewRentTable();
        sError.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearTable();

        String search = jTextField1.getText();

        DBConnection con = new DBConnection();
        ArrayList<Rent> rentList = new ArrayList<>();
            
        String viewAll = "SELECT * FROM expenditure where  (type = 'rent' OR type = 'maintenance') AND ( UPPER(type) LIKE UPPER('%"+ search + "%') OR UPPER(desciption) LIKE UPPER('%"+ search + "%') OR UPPER(officer) LIKE UPPER('%"+ search + "%'))";
            
        try {
        PreparedStatement ps = con.getConnection().prepareStatement(viewAll);
            
        ResultSet resultSet = ps.executeQuery();
            
        while(resultSet.next()){
            Rent RENT = new Rent();
            RENT.rentID = resultSet.getString(1);
            RENT.rentType = resultSet.getString(2);
            RENT.rentDate = resultSet.getString(3);
            RENT.rentDes = resultSet.getString(4);
            //OTHER.units = resultSet.getInt(5);
            RENT.officer = resultSet.getString(6);
            RENT.payed = resultSet.getDouble(7);
            RENT.total = resultSet.getDouble(8);
            RENT.chequeNum = resultSet.getInt(9);
            //OTHER.month = resultSet.getString(10);
            rentList.add(RENT);
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(rentList.size()==0){
            sError.setVisible(true);
        }
        else{
            sError.setVisible(false);
        }

        // ArrayList<Other> otherList = OtherList;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] row = new String[8];
            
        for(int i = 0; i < rentList.size(); i++){
             
            row[0] = rentList.get(i).rentID;
            row[1] = rentList.get(i).rentDate;
            row[2] = rentList.get(i).rentType;
            row[4] = rentList.get(i).officer;
            //row[3] = billList.get(i).billDate;
            row[3] = rentList.get(i).rentDes;
            row[5] = Double.toString(rentList.get(i).total);
            row[6] = Double.toString(rentList.get(i).payed);
            //row[7] = Integer.toString(otherList.get(i).units);
            row[7] = Integer.toString(rentList.get(i).chequeNum);
                   
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
            jrquery.setText("SELECT * FROM expenditure where type = 'rent' OR type = 'maintenance'");
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
            jrquery.setText("SELECT * FROM expenditure where ( type = 'rent' OR type = 'maintenance' ) AND (total > payed) ");
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
