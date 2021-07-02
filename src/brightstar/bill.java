/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar;

import DBconnection.DBConnection;
import brightstar.SubFrames.AddBill;
import brightstar.SubFrames.UpdateBill;
import functions.Bill;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
 * @author Admin
 */
public class bill extends javax.swing.JPanel {

    /**
     * Creates new form CustomersPanel
     */
    public bill() {
        initComponents();
        viewBillTable();
        sError.setVisible(false);
    }

    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        revalidate(); 
    }
    
    public ArrayList<Bill> getAllBills(){
        
       
            DBConnection con = new DBConnection();
            ArrayList<Bill> billList = new ArrayList<>();
            
            String viewAllBills = "SELECT * FROM expenditure where  type = 'phone' OR type = 'water' OR type = 'electricity'  ";
            
            try {
            PreparedStatement ps = con.getConnection().prepareStatement(viewAllBills);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Bill BILL = new Bill();
                BILL.billID = resultSet.getString(1);
                BILL.billType = resultSet.getString(2);
                BILL.billDate = resultSet.getString(3);
                BILL.billNO = resultSet.getString(4);
                BILL.units = resultSet.getInt(5);
                BILL.payed = resultSet.getDouble(7);
                BILL.total = resultSet.getDouble(8);
                BILL.chequeNum = resultSet.getInt(9);
                BILL.month = resultSet.getString(10);
                billList.add(BILL);
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billList;
    
        }
        
        public void viewBillTable(){
    
        ArrayList<Bill> billList = getAllBills();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] row = new String[9];
            
        for(int i = 0; i < billList.size(); i++){
            //DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
            //row[3] = df.format(billList.get(i).billDate);

            
            row[0] = billList.get(i).billID;
            row[1] = billList.get(i).billType;
            row[2] = billList.get(i).month;
            row[3] = billList.get(i).billDate;
            row[4] = billList.get(i).billNO;
            row[5] = Double.toString(billList.get(i).total);
            row[6] = Double.toString(billList.get(i).payed);
            row[7] = Integer.toString(billList.get(i).units);
            row[8] = Integer.toString(billList.get(i).chequeNum);
                   
            model.addRow(row);
        }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subDyanamic = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        sError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(10000, 10000));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1600, 1010));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 100));

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bill Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(626, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(538, 538, 538))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        subDyanamic.setBackground(new java.awt.Color(255, 255, 255));
        subDyanamic.setPreferredSize(new java.awt.Dimension(1900, 690));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Add Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Num", "Bill Type", "Bill mounth", "Bill Date", "bill/ phone NO", "Total Amount", "Payed Amount", "Num. of Units", "Cheque Num"
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

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
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

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Genarate Pending Bill Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Genarate full Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subDyanamicLayout = new javax.swing.GroupLayout(subDyanamic);
        subDyanamic.setLayout(subDyanamicLayout);
        subDyanamicLayout.setHorizontalGroup(
            subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subDyanamicLayout.createSequentialGroup()
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subDyanamicLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(subDyanamicLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(subDyanamicLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subDyanamicLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel3))
                                    .addComponent(sError, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        subDyanamicLayout.setVerticalGroup(
            subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subDyanamicLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subDyanamicLayout.createSequentialGroup()
                        .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(sError)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subDyanamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addComponent(subDyanamic, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subDyanamic, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddBill frame = new AddBill();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            Bill bill = new Bill();
            int row = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            /* String DATE = model.getValueAt(row, 3).toString();
            try {
            Date date = new SimpleDateFormat().parse(DATE);
            java.sql.Date day = new java.sql.Date(date);
            bill.billDate = day;
            } catch (ParseException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            //Date pday = bill.billDate;
            String sqlDate = model.getValueAt(row, 3 ).toString();
            
            bill.billDate = sqlDate;
            bill.billID = model.getValueAt(row, 0).toString();
            bill.billType = model.getValueAt(row, 1).toString();
            bill.month = model.getValueAt(row, 2).toString();
            bill.billNO = model.getValueAt(row, 4).toString();
            bill.total = Double.parseDouble(model.getValueAt(row, 5).toString());
            bill.payed = Double.parseDouble(model.getValueAt(row, 6).toString());
            bill.units = Integer.parseInt(model.getValueAt(row, 7).toString());
            bill.chequeNum =Integer.parseInt( model.getValueAt(row, 8).toString());
            System.out.println(bill.chequeNum);
            System.out.println(bill.month);
            System.out.println(sqlDate);
            UpdateBill updatebill = new UpdateBill(bill);
            updatebill.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
   
                
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        clearTable();
        viewBillTable();
        sError.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clearTable();

        String search = jTextField1.getText();

        DBConnection con = new DBConnection();
            ArrayList<Bill> billList = new ArrayList<>();
            
            String viewAllBills = "SELECT * FROM expenditure where  (UPPER(desciption) LIKE UPPER('%"+ search +"%') OR UPPER(type) LIKE UPPER('%"+ search +"%') OR UPPER(month) LIKE UPPER('%"+ search +"%') )AND "
                                   + "( type = 'phone' OR type = 'water' OR type = 'electricity' )";
           // SELECT DISTINCT COL_NAME FROM myTable WHERE UPPER(COL_NAME) LIKE UPPER('%PriceOrder%')
            
            try {
            PreparedStatement ps = con.getConnection().prepareStatement(viewAllBills);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Bill BILL = new Bill();
                BILL.billID = resultSet.getString(1);
                BILL.billType = resultSet.getString(2);
                BILL.billDate = resultSet.getString(3);
                BILL.billNO = resultSet.getString(4);
                BILL.units = resultSet.getInt(5);
                BILL.payed = resultSet.getDouble(7);
                BILL.total = resultSet.getDouble(8);
                BILL.chequeNum = resultSet.getInt(9);
                BILL.month = resultSet.getString(10);
                billList.add(BILL);
            }
              
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(billList.size()==0){
            sError.setVisible(true);
        }
        else{
            sError.setVisible(false);
        }
        

        // ArrayList<Other> otherList = OtherList;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] row = new String[9];
            
        for(int i = 0; i < billList.size(); i++){
            
            row[0] = billList.get(i).billID;
            row[1] = billList.get(i).billType;
            row[2] = billList.get(i).month;
            row[3] = billList.get(i).billDate;
            row[4] = billList.get(i).billNO;
            row[5] = Double.toString(billList.get(i).total);
            row[6] = Double.toString(billList.get(i).payed);
            row[7] = Integer.toString(billList.get(i).units);
            row[8] = Integer.toString(billList.get(i).chequeNum);
                   
            model.addRow(row);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DBConnection db = new DBConnection();
        
        InputStream input = null;
        try {
            BasicConfigurator.configure();
            String path = "C:\\Users\\Lanka\\Desktop\\BrightStar1.2\\BrightStar1.2\\BrightStar\\BillReport.jrxml";
            input = new FileInputStream(new File(path));
            JRDesignQuery jrquery = new JRDesignQuery();
            jrquery.setText("SELECT * FROM expenditure where  type = 'phone' OR type = 'water' OR type = 'electricity'   ");
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
            jrquery.setText("SELECT * FROM expenditure where ( type = 'phone' OR type = 'water' OR type = 'electricity' ) AND (total > payed) ");
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
