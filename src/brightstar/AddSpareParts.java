/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar;

/**
 *
 * @author modi
 */
import DBConnect.DBConnect;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;


public class AddSpareParts extends javax.swing.JPanel {
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        
    
        public AddSpareParts() {
           
            initComponents();
            JTableHeader tHeader =j2.getTableHeader();
            tHeader.setFont(new Font("Segoe UI",Font.BOLD,15));
        
        con=DBConnect.connect();
        tableloading();
        
    }
        public void tableloading()
        {
            try{
            String q="SELECT partname,partnumber,brand,model,unitprice,quantity,a_quantity FROM sparepart_stock";
            pst=con.prepareStatement(q);
            rs = pst.executeQuery(); 
            
            j2.setModel(DbUtils.resultSetToTableModel(rs));
            
            }catch (Exception e){
                
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

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        a_qty2 = new java.awt.TextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        j1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        j2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        partnum1 = new java.awt.TextField();
        sp2 = new javax.swing.JSpinner();
        brand2 = new javax.swing.JComboBox<>();
        model2 = new javax.swing.JComboBox<>();
        partname1 = new javax.swing.JComboBox<>();
        uprice2 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        s1 = new java.awt.TextField();
        j3 = new javax.swing.JButton();
        dm1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Part Name :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 30, 100, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Brand:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(60, 170, 50, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Date:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 540, 60, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Part Number:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 100, 110, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Model:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(60, 240, 55, 25);

        a_qty2.setEditable(false);
        a_qty2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        a_qty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_qty2ActionPerformed(evt);
            }
        });
        jPanel2.add(a_qty2);
        a_qty2.setBounds(150, 440, 280, 40);

        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(54, 33, 89));
        jPanel9.setAutoscrolls(true);

        jPanel12.setBackground(new java.awt.Color(85, 65, 118));
        jPanel12.setPreferredSize(new java.awt.Dimension(185, 65));

        jLabel17.setBackground(new java.awt.Color(85, 65, 118));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Machines");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(85, 65, 118));
        jPanel13.setPreferredSize(new java.awt.Dimension(185, 66));

        jLabel19.setBackground(new java.awt.Color(85, 65, 118));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Spare Parts");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(85, 65, 118));

        jLabel21.setBackground(new java.awt.Color(85, 65, 118));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Stock Report");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(0, 0, 308, 874);

        jPanel15.setBackground(new java.awt.Color(122, 72, 221));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Stock Management System");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel15);
        jPanel15.setBounds(300, -4, 1020, 140);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Machine Name :");
        jPanel8.add(jLabel25);
        jLabel25.setBounds(450, 220, 140, 25);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Brand:");
        jPanel8.add(jLabel26);
        jLabel26.setBounds(490, 290, 56, 25);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Quantity:");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(470, 500, 90, 40);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Type:");
        jPanel8.add(jLabel28);
        jLabel28.setBounds(500, 440, 70, 25);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Model:");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(490, 370, 59, 25);
        jPanel8.add(textField3);
        textField3.setBounds(590, 440, 230, 30);
        jPanel8.add(textField4);
        textField4.setBounds(590, 220, 230, 30);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(jComboBox5);
        jComboBox5.setBounds(590, 370, 231, 32);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(jComboBox6);
        jComboBox6.setBounds(590, 290, 231, 32);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(0, 0, 0, 0);

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Enter_52px.png"))); // NOI18N
        j1.setText("Submit");
        j1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        jPanel2.add(j1);
        j1.setBounds(450, 610, 220, 60);

        b1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Waste_50px_1.png"))); // NOI18N
        b1.setText("    Remove");
        b1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1);
        b1.setBounds(940, 610, 240, 60);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1250, 640, 86, 34);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(1250, 640, 86, 34);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Unit Price:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 370, 80, 40);
        jPanel2.add(jCalendar1);
        jCalendar1.setBounds(140, 500, 280, 190);

        j2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        j2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PartName", "PartNumber", "Brand", "model", "Quantity", "UnitPrice", "A_Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j2);
        if (j2.getColumnModel().getColumnCount() > 0) {
            j2.getColumnModel().getColumn(0).setResizable(false);
            j2.getColumnModel().getColumn(1).setResizable(false);
            j2.getColumnModel().getColumn(2).setResizable(false);
            j2.getColumnModel().getColumn(3).setResizable(false);
            j2.getColumnModel().getColumn(4).setResizable(false);
            j2.getColumnModel().getColumn(5).setResizable(false);
            j2.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(450, 140, 740, 450);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Available_Updates_50px.png"))); // NOI18N
        jButton8.setText("Update");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(710, 610, 210, 60);

        partnum1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(partnum1);
        partnum1.setBounds(150, 90, 280, 40);

        sp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(sp2);
        sp2.setBounds(150, 300, 280, 40);

        brand2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        brand2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand ", "Richo", "Toshiba" }));
        brand2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand2ActionPerformed(evt);
            }
        });
        jPanel2.add(brand2);
        brand2.setBounds(150, 160, 280, 40);

        model2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        model2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select  Model", "Black", "White" }));
        model2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        model2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                model2ActionPerformed(evt);
            }
        });
        jPanel2.add(model2);
        model2.setBounds(150, 230, 280, 40);

        partname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        partname1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Part Name", "Samsung", "Toshiba", "Lenovo", "Mac" }));
        partname1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        partname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partname1ActionPerformed(evt);
            }
        });
        jPanel2.add(partname1);
        partname1.setBounds(150, 20, 280, 40);

        uprice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uprice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uprice2ActionPerformed(evt);
            }
        });
        jPanel2.add(uprice2);
        uprice2.setBounds(150, 370, 280, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Quantity:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 300, 80, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Available Quantity:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 440, 150, 40);

        s1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        s1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                s1KeyPressed(evt);
            }
        });
        jPanel2.add(s1);
        s1.setBounds(830, 10, 210, 40);

        j3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        j3.setText("Search");
        j3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        jPanel2.add(j3);
        j3.setBounds(1050, 10, 130, 40);

        dm1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dm1.setText("Demo Button");
        dm1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dm1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        dm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dm1ActionPerformed(evt);
            }
        });
        jPanel2.add(dm1);
        dm1.setBounds(1050, 80, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void a_qty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_qty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_qty2ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
            String name2 =partname1.getSelectedItem().toString();
            String partnum =partnum1.getText();
            String brand=brand2.getSelectedItem().toString();
            String model=model2.getSelectedItem().toString();
            int val1 = (Integer) sp2.getValue();
            String unitprice =uprice2.getText();
            String a_quantity =a_qty2.getText();
            
            if(partnum.isEmpty()){
                    
                    JOptionPane.showMessageDialog(null, "Part Number Can Not Be Empty!", "Alert", 1);
                    partnum1.setForeground(Color.red);
                    }
                else if(unitprice.isEmpty()){
                    JOptionPane.showMessageDialog(null, "UnitPrice cannot be empty!", "Alert", 1);
                    uprice2.setForeground(Color.red);
                }
                else if(brand.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Type is cannot be empty!", "Alert", 1);
                    a_qty2.setForeground(Color.red);
                }
                else{
            
            try{
            String q ="INSERT INTO sparepart_stock(partname,partnumber,brand,model,unitprice,quantity,a_quantity)values ('"+name2+"','"+partnum+"','"+brand+"','"+model+"','"+unitprice+"','"+ val1+"','"+a_quantity+"')";
            pst=con.prepareStatement(q);
            pst.execute();
            tableloading();
            
            
            } catch (Exception e) 
            {
            }
                }
    }//GEN-LAST:event_j1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
          int x =JOptionPane.showConfirmDialog(null,"Are You Sure Want To Delete"); 
            if(x==0){
                 String partnum = partnum1.getText();
                 
                 String sql ="DELETE FROM `sparepart_stock` WHERE partnumber='"+partnum+"'";
                 
                  try{
                    pst=con.prepareStatement(sql);
                    pst.execute();
                    tableloading();
                }catch(Exception e){
                    
                }
                 
            
            
            
            }
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
               int x =JOptionPane.showConfirmDialog(null,"Are You Sure Want To Update");
        
              if(x==0){
            String name2 =partname1.getSelectedItem().toString();
            String partnum =partnum1.getText();
            String brand=brand2.getSelectedItem().toString();
            String model=model2.getSelectedItem().toString();
            int val1 = (Integer) sp2.getValue();
            String unitprice =uprice2.getText();
            String a_quantity =a_qty2.getText();
            
               String sql ="UPDATE sparepart_stock SET `partname`='"+name2+"',`brand`='"+brand+"',`model`='"+model+"',`unitprice`='"+unitprice+"',`quantity`='"+val1+"',`a_quantity`='"+a_quantity+"' WHERE partnumber ='"+partnum+"'";
                try{
                    pst=con.prepareStatement(sql);
                    pst.execute();
                    tableloading();
                }catch(Exception e){
                    
                }
                
                
                
        
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed
   
    
    
    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        int row=j2.getSelectedRow();
        DefaultTableModel mode=(DefaultTableModel)j2.getModel();
        
        
        String name2 =j2.getValueAt(row,0).toString();
        String partnum =j2.getValueAt(row,1).toString();
        String brand  =j2.getValueAt(row,2).toString();
        String model =j2.getValueAt(row,3).toString();
        String unitprice =j2.getValueAt(row,4).toString();
        String val1=j2.getValueAt(row,5).toString();
        String a_quantity =j2.getValueAt(row,6).toString();
        
       
        partname1.setSelectedItem(name2);
        partnum1.setText(partnum);
        brand2.setSelectedItem(brand);
        model2.setSelectedItem(model);
        uprice2.setText(unitprice);
        sp2.setValue((Integer.valueOf(val1)));
        a_qty2.setText(a_quantity);
       
        
    }//GEN-LAST:event_j2MouseClicked

    private void brand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand2ActionPerformed

    }//GEN-LAST:event_brand2ActionPerformed

    private void model2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_model2ActionPerformed
        if( model2.getSelectedItem().equals("Black")){
            a_qty2.setText("10");
          }
         if( model2.getSelectedItem().equals("White")){
             
            a_qty2.setText("5");
         }
    }//GEN-LAST:event_model2ActionPerformed

    private void partname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partname1ActionPerformed

    private void uprice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uprice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uprice2ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void s1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1KeyPressed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        String partnum=partnum1.getSelectedText();
        try{
             
        String sql ="SELECT partname,brand,model,unitprice,quantity,a_quantity FROM machinemg WHERE partnumber LIKE'%"+partnum+"%' ";
        pst =con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        j2.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_j3ActionPerformed

    private void dm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dm1ActionPerformed
        partname1.setSelectedItem("Printer");
        partnum1.setText("E22222");
        brand2.setSelectedItem("Richo");
        model2.setSelectedItem("White");
        uprice2.setText("Rs 20000");

    }//GEN-LAST:event_dm1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField a_qty2;
    private javax.swing.JButton b1;
    private javax.swing.JComboBox<String> brand2;
    private javax.swing.JButton dm1;
    private javax.swing.JButton j1;
    private javax.swing.JTable j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> model2;
    private javax.swing.JComboBox<String> partname1;
    private java.awt.TextField partnum1;
    private java.awt.TextField s1;
    private javax.swing.JSpinner sp2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField uprice2;
    // End of variables declaration//GEN-END:variables
}