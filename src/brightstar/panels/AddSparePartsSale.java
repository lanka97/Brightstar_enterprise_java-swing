/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.panels;

import brightstar.connection.DBConnection;
import brightstar.frames.CheckOutForm;
import brightstar.model.SparepartBuyer;
import brightstar.model.SparepartStock;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pasan
 */
public class AddSparePartsSale extends javax.swing.JPanel {

    /**
     * Creates new form AddSpareParts
     */
    public AddSparePartsSale() {
        initComponents();
        nic_combo.setAlignmentY(CENTER_ALIGNMENT);
        brand_combo.setAlignmentY(CENTER_ALIGNMENT);
        model_combo.setAlignmentY(CENTER_ALIGNMENT);
        JquantitySpin.setMinimum(0);
        JunitPriceField.setText("0");
        JquantitySpin.setValue(0);
        JcalenderField.setEnabled(false);
        fillCombo();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(JcalenderField.getDate());
        System.out.println(date);

    }

    public ArrayList<String> getAllSparepartBuyersNIC() {

        ArrayList<String> buyerList = new ArrayList<>();

        String getAllBuyersNICQuery = "SELECT DISTINCT nic FROM sparepart_buyer ORDER BY nic";

        try {
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(getAllBuyersNICQuery);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String nic = resultSet.getString(1);
                buyerList.add(nic);
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

        return buyerList;
    }

    public SparepartBuyer getSparepartBuyerByNIC(String nic) {

        SparepartBuyer buyer = new SparepartBuyer();

        String viewAllBuyersQuery = "SELECT * FROM sparepart_buyer WHERE nic = ?";

        try {

            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllBuyersQuery);

            ps.setString(1, nic);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                SparepartBuyer newBuyer = new SparepartBuyer();
                newBuyer.setNIC(resultSet.getString(2));
                newBuyer.setName(resultSet.getString(3));
                newBuyer.setPhone(resultSet.getString(4));
                newBuyer.setAddress(resultSet.getString(5));
                newBuyer.setCompany(resultSet.getString(6));
                newBuyer.setEmail(resultSet.getString(7));
                buyer = newBuyer;
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

        return buyer;
    }

    public ArrayList<String> getAllSparepartBrands() {

        ArrayList<String> itemList = new ArrayList<>();

        String getAllSparepartBrandsQuery = "SELECT DISTINCT brand FROM sparepart_stock";

        try {

            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(getAllSparepartBrandsQuery);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String brand = resultSet.getString(1);
                itemList.add(brand);
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

        return itemList;
    }

    public ArrayList<String> getAllSparepartModelsByBrand(String brand) {

        ArrayList<String> itemList = new ArrayList<>();

        String viewAllBuyersQuery = "SELECT DISTINCT model FROM sparepart_stock WHERE brand = ?";

        try {

            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllBuyersQuery);

            ps.setString(1, brand);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String newItem = resultSet.getString(1);
                itemList.add(newItem);
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

        return itemList;
    }

    public ArrayList<SparepartStock> getAllSparepartsByModelAndPartNum(String brand, String model, String partNumber) {

        ArrayList<SparepartStock> itemList = new ArrayList<>();

        String viewAllBuyersQuery = "SELECT * FROM sparepart_stock WHERE brand = ? AND model = ? AND partnumber = ?";

        try {

            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(viewAllBuyersQuery);

            ps.setString(1, brand);
            ps.setString(2, model);
            ps.setString(3, partNumber);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                SparepartStock item = new SparepartStock();
                item.setPartname(resultSet.getString(1));
                item.setPartNumber(resultSet.getString(2));
                item.setBrand(resultSet.getString(3));
                item.setModel(resultSet.getString(4));
                item.setUnitPrice(resultSet.getDouble(5));
                item.setQuantity(resultSet.getInt(7));
                itemList.add(item);
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

        return itemList;
    }

    public void fillCombo() {
        // NIC comboBox
        nic_combo.addItem("Select NIC");

        ArrayList<String> NICList = getAllSparepartBuyersNIC();

        for (String getNIC : NICList) {

            nic_combo.addItem(getNIC);
        }

        // Brand comboBox
        brand_combo.addItem("Select Brand");

        ArrayList<String> itemList = getAllSparepartBrands();

        for (String getBrand : itemList) {

            brand_combo.addItem(getBrand);
        }

        model_combo.addItem("Select Model");

    }

    public void refillBrandCombo() {
        brand_combo.addItem("Select Brand");

        ArrayList<String> itemList = getAllSparepartBrands();

        for (String getBrand : itemList) {

            brand_combo.addItem(getBrand);
        }

        model_combo.addItem("Select Model");
    }

    public void refreshAllCombo() {
        nic_combo.removeAllItems();
        brand_combo.removeAllItems();
        fillCombo();
    }

    public void refreshPanel() {
        refreshAllCombo();
        JpartNumberField.setText("");
        JpartNameField.setText("");
        JquantitySpin.setValue(0);
        JunitPriceField.setText("0");
        JtotalPriceField.setText("0");
        label_valid.setText("");
        totalPriceField.setText("");
        resetTable();

    }

    public void resetSaleForm() {

        brand_combo.removeAllItems();
        JpartNumberField.setText("");
        JpartNameField.setText("");
        JquantitySpin.setValue(0);
        JunitPriceField.setText("0");
        JtotalPriceField.setText("0");
        label_valid.setText("");
        refillBrandCombo();

    }

    public void resetTable() {

        DefaultTableModel model = (DefaultTableModel) sale_previewTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);

        }
    }

    public double getTotalPrice() {

        int rowsCount = sale_previewTable.getRowCount();
        double total = 0.00;

        for (int i = 0; i < rowsCount; i++) {
            total += Double.parseDouble(sale_previewTable.getValueAt(i, 6).toString());
        }

        return total;
    }

    public ArrayList<String> getInvoiceIDs() {

        ArrayList<String> arrayList = new ArrayList<String>();

        String findIDQuery = "SELECT invoiceID FROM sparepart_sale_invoice";

        PreparedStatement ps;
        try {
            ps = DBConnection.getDBconnection().prepareStatement(findIDQuery);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                arrayList.add(resultSet.getString(1));
            }

            ps.close();
            resultSet.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return arrayList;
    }

    public static String generateInvoiceID(ArrayList<String> arrayList) {

        String id;
        int next = arrayList.size();
        next++;
        id = "I10" + next;
        if (arrayList.contains(id)) {
            next++;
            id = "I10" + next;
        }

        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentMethod = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        nic_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JphoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        brand_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        model_combo = new javax.swing.JComboBox<>();
        JpartNumberField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JpartNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioCash = new javax.swing.JRadioButton();
        jRadioCheque = new javax.swing.JRadioButton();
        btn_create = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_addList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sale_previewTable = new javax.swing.JTable();
        label1 = new java.awt.Label();
        label_valid = new javax.swing.JLabel();
        JtotalPriceField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        tableMessage = new javax.swing.JLabel();
        btn_updateList = new javax.swing.JButton();
        btn_deleteList = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JcalenderField = new com.toedter.calendar.JCalendar();
        label_available = new javax.swing.JLabel();
        JquantitySpin = new com.toedter.components.JSpinField();
        jLabel17 = new javax.swing.JLabel();
        JunitPriceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer NIC");

        nic_combo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nic_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nic_comboItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");

        JnameField.setEditable(false);
        JnameField.setBackground(new java.awt.Color(255, 255, 255));
        JnameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JnameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        JphoneField.setEditable(false);
        JphoneField.setBackground(new java.awt.Color(255, 255, 255));
        JphoneField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JphoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Brand");

        brand_combo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        brand_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brand_comboItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Model");

        model_combo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        JpartNumberField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JpartNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JpartNumberFieldKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Part Number");

        JpartNameField.setEditable(false);
        JpartNameField.setBackground(new java.awt.Color(255, 255, 255));
        JpartNameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JpartNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Part Name");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Unit Price");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Date");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Payment Method");

        jRadioCash.setBackground(new java.awt.Color(255, 255, 255));
        paymentMethod.add(jRadioCash);
        jRadioCash.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioCash.setText("Cash");

        jRadioCheque.setBackground(new java.awt.Color(255, 255, 255));
        paymentMethod.add(jRadioCheque);
        jRadioCheque.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioCheque.setText("Cheque");

        btn_create.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_create.setText("Checkout");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_addList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addList.setText("Add to List");
        btn_addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addListActionPerformed(evt);
            }
        });

        sale_previewTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sale_previewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Part Name", "Part No.", "Quantity", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sale_previewTable.setRowHeight(20);
        sale_previewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sale_previewTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sale_previewTable);
        if (sale_previewTable.getColumnModel().getColumnCount() > 0) {
            sale_previewTable.getColumnModel().getColumn(0).setResizable(false);
            sale_previewTable.getColumnModel().getColumn(1).setResizable(false);
            sale_previewTable.getColumnModel().getColumn(2).setResizable(false);
            sale_previewTable.getColumnModel().getColumn(3).setResizable(false);
            sale_previewTable.getColumnModel().getColumn(4).setResizable(false);
            sale_previewTable.getColumnModel().getColumn(5).setResizable(false);
            sale_previewTable.getColumnModel().getColumn(6).setResizable(false);
        }

        label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Enter details");

        label_valid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JtotalPriceField.setEditable(false);
        JtotalPriceField.setBackground(new java.awt.Color(255, 255, 255));
        JtotalPriceField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JtotalPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Rs.");

        errorMessage.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(0, 153, 0));
        errorMessage.setText("Fill the form and click Add to List ");

        tableMessage.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tableMessage.setForeground(new java.awt.Color(0, 153, 0));

        btn_updateList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_updateList.setText("Update");
        btn_updateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateListActionPerformed(evt);
            }
        });

        btn_deleteList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_deleteList.setText("Delete");
        btn_deleteList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteListActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("TOTAL");

        totalPriceField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalPriceField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Rs.");

        label_available.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_available.setForeground(new java.awt.Color(255, 0, 0));

        JquantitySpin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JquantitySpinPropertyChange(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Total Price");

        JunitPriceField.setEditable(false);
        JunitPriceField.setBackground(new java.awt.Color(255, 255, 255));
        JunitPriceField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JunitPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Rs.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioCash)
                                .addGap(72, 72, 72)
                                .addComponent(jRadioCheque))
                            .addComponent(jLabel15)
                            .addComponent(errorMessage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_updateList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_deleteList)
                                .addGap(82, 82, 82)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_create)
                            .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JtotalPriceField))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JnameField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JphoneField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nic_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE))
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JpartNumberField)
                                    .addComponent(brand_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label_valid))
                                            .addComponent(jLabel11))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(label_available, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JunitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JquantitySpin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_addList)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)
                                        .addComponent(model_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JcalenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JpartNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(613, 613, 613))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(tableMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tableMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nic_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(JnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(brand_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_valid))
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JpartNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JpartNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JphoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JunitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JquantitySpin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(JtotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(JcalenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_updateList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_deleteList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_available, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioCash)
                            .addComponent(jRadioCheque))
                        .addGap(26, 26, 26)
                        .addComponent(errorMessage)
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addListActionPerformed
        // TODO add your handling code here:
        //errorMessage.setText("");

        if (hasFormValidation()) {

            String payment = null;

            if (jRadioCash.isSelected()) {
                payment = "Cash";
            }

            if (jRadioCheque.isSelected()) {
                payment = "Cheque";
            }

            DefaultTableModel model = (DefaultTableModel) sale_previewTable.getModel();
            model.addRow(new String[]{
                String.valueOf(brand_combo.getSelectedItem()), String.valueOf(model_combo.getSelectedItem()), JpartNameField.getText(),
                JpartNumberField.getText(), String.valueOf(JquantitySpin.getValue()), JunitPriceField.getText(), JtotalPriceField.getText()
            });

            totalPriceField.setText(String.valueOf(getTotalPrice()));

            resetSaleForm();

            errorMessage.setForeground(new Color(0, 153, 0));
            errorMessage.setText("Fill the form and click Add to List");
            tableMessage.setText("Click any row to edit values");

        } else {

            errorMessage.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Form validation failed!",
                    "Alert!", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_btn_addListActionPerformed

    public boolean hasFormValidation() {

        if (nic_combo.getSelectedItem() == "Select NIC") {
            errorMessage.setForeground(Color.red);
            errorMessage.setText("*Please fill customer details");
            return false;
        }

        if (brand_combo.getSelectedItem() == "Select Brand") {
            errorMessage.setForeground(Color.red);
            errorMessage.setText("*Please select a Brand");
            return false;
        }

        if (JpartNumberField.getText() == "" || JpartNumberField.getText().equals("")) {
            errorMessage.setForeground(Color.red);
            errorMessage.setText("*Part Number cannot be empty");
            return false;
        }

        if (label_valid.getText() == "INVALID" || label_valid.getText().equals("INVALID")) {
            errorMessage.setForeground(Color.red);
            errorMessage.setText("*Invalid Part Number");
            return false;
        }

        if (JquantitySpin.getValue() == 0) {
            errorMessage.setForeground(Color.red);
            errorMessage.setText("*Please enter the quantity");
            return false;
        }

        return true;
    }


    private void sale_previewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sale_previewTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = sale_previewTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) sale_previewTable.getModel();

        brand_combo.setSelectedItem(model.getValueAt(selectedRow, 0).toString());
        model_combo.setSelectedItem(model.getValueAt(selectedRow, 1).toString());
        JpartNameField.setText(model.getValueAt(selectedRow, 2).toString());
        JpartNumberField.setText(model.getValueAt(selectedRow, 3).toString());
        JquantitySpin.setValue(Integer.parseInt(model.getValueAt(selectedRow, 4).toString()));
        JunitPriceField.setText(model.getValueAt(selectedRow, 5).toString());
        JtotalPriceField.setText(model.getValueAt(selectedRow, 6).toString());

    }//GEN-LAST:event_sale_previewTableMouseClicked

    private void nic_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nic_comboItemStateChanged
        // TODO add your handling code here:

        String nic = (String) nic_combo.getSelectedItem();

        SparepartBuyer buyer = getSparepartBuyerByNIC(nic);

        JnameField.setText(buyer.getName());
        JphoneField.setText(buyer.getPhone());

    }//GEN-LAST:event_nic_comboItemStateChanged

    private void brand_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brand_comboItemStateChanged
        // TODO add your handling code here:

        model_combo.removeAllItems();

        String brand = (String) brand_combo.getSelectedItem();
        ArrayList<String> itemList = new ArrayList<>();

        itemList = getAllSparepartModelsByBrand(brand);

        for (String getBrand : itemList) {

            model_combo.addItem(getBrand);
        }


    }//GEN-LAST:event_brand_comboItemStateChanged

    private void JpartNumberFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JpartNumberFieldKeyReleased
        // TODO add your handling code here:
        label_valid.setText("INVALID");
        label_valid.setForeground(Color.red);
        JunitPriceField.setText("0");
        JquantitySpin.setValue(0);

        String brand = (String) brand_combo.getSelectedItem();
        String model = (String) model_combo.getSelectedItem();
        String partNumber = (String) JpartNumberField.getText();
        ArrayList<SparepartStock> itemList = new ArrayList<SparepartStock>();

        itemList = getAllSparepartsByModelAndPartNum(brand, model, partNumber);

        for (SparepartStock item : itemList) {
            if (item.getPartNumber().equals(partNumber)) {
                label_valid.setText("VALID");
                label_valid.setForeground(new Color(0, 153, 0));

                JpartNameField.setText(item.getPartname());
                JunitPriceField.setText(String.valueOf(item.getUnitPrice()));
                JquantitySpin.setMaximum(item.getQuantity());
                label_available.setText("Max. Available: " + item.getQuantity());

            }
        }
    }//GEN-LAST:event_JpartNumberFieldKeyReleased

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed

        if (((!jRadioCash.isSelected()) && (!jRadioCheque.isSelected()))) {

            errorMessage.setForeground(Color.red);
            errorMessage.setText("*Please select the payment method");
            JOptionPane.showMessageDialog(null, "Form validation failed!",
                    "Alert!", JOptionPane.PLAIN_MESSAGE);

        } else {

            if (sale_previewTable.getRowCount() == 0) {
                errorMessage.setForeground(Color.red);
                errorMessage.setText("*Add the items to the list");
                JOptionPane.showMessageDialog(null, "Table empty!",
                        "Alert!", JOptionPane.PLAIN_MESSAGE);

            } else {

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(JcalenderField.getDate());

                String nic = nic_combo.getSelectedItem().toString();
                String total = totalPriceField.getText();
                String invoiceID = generateInvoiceID(getInvoiceIDs());
                String payment = "";

                if (jRadioCheque.isSelected()) {
                    payment = "Cheque";
                } else {
                    payment = "Cash";
                }

                CheckOutForm checkOut = new CheckOutForm(invoiceID, nic, date, payment, total);
                DefaultTableModel saleModel = (DefaultTableModel) sale_previewTable.getModel();

                String[] row = new String[7];

                DefaultTableModel invoiceModel = (DefaultTableModel) checkOut.invoice_table.getModel();
                for (int i = 0; i < saleModel.getRowCount(); i++) {
                    row[0] = (String) saleModel.getValueAt(i, 0);
                    row[1] = (String) saleModel.getValueAt(i, 1);
                    row[2] = (String) saleModel.getValueAt(i, 2);
                    row[3] = (String) saleModel.getValueAt(i, 3);
                    row[4] = (String) saleModel.getValueAt(i, 4);
                    row[5] = (String) saleModel.getValueAt(i, 5);
                    row[6] = (String) saleModel.getValueAt(i, 6);

                    invoiceModel.addRow(row);
                }

                checkOut.setVisible(true);

                errorMessage.setForeground(new Color(0, 153, 0));
                errorMessage.setText("Fill the form and click Add to List");
            }
        }


    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_updateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateListActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) sale_previewTable.getModel();

        if (sale_previewTable.getSelectedRow() == -1) {

            if (sale_previewTable.getSelectedRow() == -1) {
                errorMessage.setForeground(Color.red);
                errorMessage.setText("*Your list is empty");
            } else {
                errorMessage.setForeground(Color.red);
                errorMessage.setText("*You must select a row");
            }

        } else {

            model.setValueAt(brand_combo.getSelectedItem().toString(), sale_previewTable.getSelectedRow(), 0);
            model.setValueAt(model_combo.getSelectedItem().toString(), sale_previewTable.getSelectedRow(), 1);
            model.setValueAt(JpartNameField.getText(), sale_previewTable.getSelectedRow(), 2);
            model.setValueAt(JpartNumberField.getText(), sale_previewTable.getSelectedRow(), 3);
            model.setValueAt(String.valueOf(JquantitySpin.getValue()), sale_previewTable.getSelectedRow(), 4);
            // unit price cannot be changed here
            model.setValueAt(String.valueOf(JtotalPriceField.getText()), sale_previewTable.getSelectedRow(), 6);
            totalPriceField.setText(String.valueOf(getTotalPrice()));

            resetSaleForm();

            errorMessage.setForeground(new Color(0, 153, 0));
            errorMessage.setText("Fill the form and click Add to List");
        }

    }//GEN-LAST:event_btn_updateListActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        int state = JOptionPane.showConfirmDialog(null, "Do you want to cancel?", "Alert", JOptionPane.YES_NO_OPTION);

        if (state == 0) {

            refreshPanel();
        }

    }//GEN-LAST:event_btn_cancelActionPerformed

    private void JquantitySpinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JquantitySpinPropertyChange
        // TODO add your handling code here:

        double quantity = Double.valueOf(JquantitySpin.getValue());
        double unitPrice = Double.valueOf(JunitPriceField.getText());
        double totalPrice = unitPrice * quantity;
        JtotalPriceField.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_JquantitySpinPropertyChange

    private void btn_deleteListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteListActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) sale_previewTable.getModel();

        if (sale_previewTable.getSelectedRow() == -1) {

            if (sale_previewTable.getSelectedRow() == -1) {
                errorMessage.setForeground(Color.red);
                errorMessage.setText("*Your list is empty");
            } else {
                errorMessage.setForeground(Color.red);
                errorMessage.setText("*You must select a row");
            }

        } else {

            model.removeRow(sale_previewTable.getSelectedRow());

            resetSaleForm();

            errorMessage.setForeground(new Color(0, 153, 0));
            errorMessage.setText("Fill the form and click Add to List");
        }

    }//GEN-LAST:event_btn_deleteListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar JcalenderField;
    private javax.swing.JTextField JnameField;
    private javax.swing.JTextField JpartNameField;
    private javax.swing.JTextField JpartNumberField;
    private javax.swing.JTextField JphoneField;
    private com.toedter.components.JSpinField JquantitySpin;
    private javax.swing.JTextField JtotalPriceField;
    private javax.swing.JTextField JunitPriceField;
    private javax.swing.JComboBox<String> brand_combo;
    private javax.swing.JButton btn_addList;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_deleteList;
    private javax.swing.JButton btn_updateList;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioCash;
    private javax.swing.JRadioButton jRadioCheque;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel label_available;
    private javax.swing.JLabel label_valid;
    private javax.swing.JComboBox<String> model_combo;
    private javax.swing.JComboBox<String> nic_combo;
    private javax.swing.ButtonGroup paymentMethod;
    private javax.swing.JTable sale_previewTable;
    private javax.swing.JLabel tableMessage;
    private javax.swing.JLabel totalPriceField;
    // End of variables declaration//GEN-END:variables
}
