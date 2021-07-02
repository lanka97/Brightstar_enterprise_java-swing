/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.panels;

import brightstar.connection.DBConnection;
import brightstar.frames.EditSalesForm;
import brightstar.model.SparepartBuyer;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Pasan
 */
public class ViewSparePartsSalesPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewSalesPanel
     */
    public ViewSparePartsSalesPanel() {
        initComponents();

        JTableHeader tHeader = display_sales.getTableHeader();
        tHeader.setFont(new Font("Segoe UI", Font.BOLD, 18));

        getAllSales();
        //getAllSales(month_combo.getSelectedItem().toString());
        //getAllSales("All");
        //clearTable();
    }

    public void refreshPanel() {

        clearTable();
        getAllSales();
    }

    public void getAllSales() {

        DefaultTableModel model = (DefaultTableModel) display_sales.getModel();
        String[] row = new String[9];

        String viewAllSalesQuery = "SELECT * FROM sparepart_sale_invoice ORDER BY invoiceID";

        try {
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllSalesQuery);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[4] = resultSet.getString(5);
                row[5] = resultSet.getString(6);
                row[6] = resultSet.getString(7);
                row[7] = resultSet.getString(8);
                row[8] = resultSet.getString(9);

                model.addRow(row);
            }

            ps.close();
            resultSet.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomersPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex,
                    "Alert!", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(CustomersPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex,
                    "Alert", JOptionPane.PLAIN_MESSAGE);

        }

    }

    public void clearTable() {

        DefaultTableModel dm = (DefaultTableModel) display_sales.getModel();
        dm.getDataVector().removeAllElements();
        revalidate();

    }

    public void getAllSales(String month) {

        String _month = null;

        if (month == "All") {
            _month = "2%";
        }
        if (month == "January") {
            _month = "%-01-%";
        }
        if (month == "February") {
            _month = "%-02-%";
        }
        if (month == "March") {
            _month = "%-03-%";
        }
        if (month == "April") {
            _month = "%-04-%";
        }
        if (month == "May") {
            _month = "%-05-%";
        }
        if (month == "June") {
            _month = "%-06-%";
        }
        if (month == "July") {
            _month = "%-07-%";
        }
        if (month == "August") {
            _month = "%-08-%";
        }
        if (month == "September") {
            _month = "%-09-%";
        }
        if (month == "October") {
            _month = "%-10-%";
        }
        if (month == "November") {
            _month = "%-11-%";
        }
        if (month == "December") {
            _month = "%-12-%";
        }

        DefaultTableModel model = (DefaultTableModel) display_sales.getModel();
        String[] row = new String[9];

        String viewAllSalesQuery = "SELECT * FROM sparepart_sale_invoice WHERE date LIKE '" + _month + "'";

        try {
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllSalesQuery);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[4] = resultSet.getString(5);
                row[5] = resultSet.getString(6);
                row[6] = resultSet.getString(7);
                row[7] = resultSet.getString(8);
                row[8] = resultSet.getString(9);

                model.addRow(row);
            }

            ps.close();
            resultSet.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomersPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex,
                    "Alert!", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(CustomersPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex,
                    "Alert", JOptionPane.PLAIN_MESSAGE);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display_sales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        month_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        display_sales.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        display_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Customer", "NIC", "Date", "Payment", "Status", "Bank", "Cheque", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        display_sales.setRowHeight(30);
        jScrollPane1.setViewportView(display_sales);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Spare Parts Sales");

        month_combo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        month_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                month_comboItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Month");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(month_combo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void month_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_month_comboItemStateChanged
        // TODO add your handling code here:
        //String month = (String) month_combo.getSelectedItem();
        //clearTable();
        //getAllSales(month);

        //System.out.println("changed!");

    }//GEN-LAST:event_month_comboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable display_sales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> month_combo;
    // End of variables declaration//GEN-END:variables
}
