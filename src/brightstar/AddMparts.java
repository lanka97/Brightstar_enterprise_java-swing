/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar;

import DBConnect.DBConnect;
import java.awt.Color;
import java.awt.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.lang.Exception;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;







/**
 *
 * @author modi
 */
public class AddMparts extends javax.swing.JPanel { 
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        
   
    /**
     * Creates new form AddSpareParts
     */
    public AddMparts() {
        this.rs = null;
        initComponents();
        JTableHeader tHeader =j1.getTableHeader();
        tHeader.setFont(new Font("Segoe UI",Font.BOLD,15));
        
        
        con=DBConnect.connect();
        tableload();
       }
    public  void tableload()
    {
        try{
          String sql ="SELECT machineid,machine,brand,model,type,quantity,unitprice,a_quantity FROM machinemg";
          pst =con.prepareStatement(sql);
          rs =pst.executeQuery();
           
          j1.setModel(DbUtils.resultSetToTableModel(rs));
     
        }
        catch(Exception e){
            
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

        paymentMethod = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tp1 = new javax.swing.JLabel();
        md1 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j1 = new javax.swing.JTable();
        model2 = new javax.swing.JComboBox<>();
        avq = new java.awt.TextField();
        s1 = new java.awt.TextField();
        dm = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mname = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        uprice1 = new java.awt.TextField();
        jc1 = new com.toedter.calendar.JCalendar();
        brandbox1 = new javax.swing.JComboBox<>();
        machineName_txt3 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        sn1 = new java.awt.TextField();
        j3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel2.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Brand:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(90, 90, 60, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Date:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 520, 50, 40);

        tp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tp1.setText("Type:");
        jPanel2.add(tp1);
        tp1.setBounds(90, 200, 50, 40);

        md1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        md1.setText("Model:");
        jPanel2.add(md1);
        md1.setBounds(80, 150, 60, 25);

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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Enter_52px.png"))); // NOI18N
        jButton1.setText("    Submit");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(460, 600, 230, 60);

        b1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Waste_50px_1.png"))); // NOI18N
        b1.setText("    Remove");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1);
        b1.setBounds(950, 600, 220, 60);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1250, 640, 86, 34);

        update1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Available_Updates_50px.png"))); // NOI18N
        update1.setText("Update");
        update1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel2.add(update1);
        update1.setBounds(710, 600, 220, 60);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Available Quantity:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 460, 150, 40);

        j1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        j1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Machine Id", "Machine", "Brand", "Model", "Type", "Serial Number", "Unit Price", "A.Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j1);
        if (j1.getColumnModel().getColumnCount() > 0) {
            j1.getColumnModel().getColumn(0).setResizable(false);
            j1.getColumnModel().getColumn(1).setResizable(false);
            j1.getColumnModel().getColumn(2).setResizable(false);
            j1.getColumnModel().getColumn(3).setResizable(false);
            j1.getColumnModel().getColumn(4).setResizable(false);
            j1.getColumnModel().getColumn(5).setResizable(false);
            j1.getColumnModel().getColumn(6).setResizable(false);
            j1.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(450, 140, 740, 350);

        model2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        model2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model", "Black", "White" }));
        model2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        model2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                model2ActionPerformed(evt);
            }
        });
        jPanel2.add(model2);
        model2.setBounds(160, 150, 280, 40);

        avq.setEditable(false);
        avq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(avq);
        avq.setBounds(160, 460, 280, 40);

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

        dm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dm.setText("Demo Button");
        dm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dm.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        dm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmActionPerformed(evt);
            }
        });
        jPanel2.add(dm);
        dm.setBounds(1050, 80, 130, 40);

        errorMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(0, 153, 0));
        errorMessage.setText("Fill The Form and Submit");
        jPanel2.add(errorMessage);
        errorMessage.setBounds(460, 500, 180, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Click Row to Get Details");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(450, 110, 170, 20);

        mname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Machine Name", "Samsung", "Toshiba", "Lenovo", "Mac" }));
        mname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel2.add(mname);
        mname.setBounds(160, 30, 280, 40);

        type1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Type1", "Type2", "Type3" }));
        type1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(type1);
        type1.setBounds(160, 210, 280, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Serial Number:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 330, 116, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Unit Price:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 390, 80, 40);

        uprice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uprice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uprice1ActionPerformed(evt);
            }
        });
        jPanel2.add(uprice1);
        uprice1.setBounds(160, 390, 280, 40);
        jPanel2.add(jc1);
        jc1.setBounds(160, 520, 280, 162);

        brandbox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        brandbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand", "Richo", "Toshiba" }));
        brandbox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brandbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandbox1ActionPerformed(evt);
            }
        });
        jPanel2.add(brandbox1);
        brandbox1.setBounds(160, 90, 280, 40);

        machineName_txt3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        machineName_txt3.setText("Machine Name :");
        jPanel2.add(machineName_txt3);
        machineName_txt3.setBounds(20, 30, 130, 25);

        jl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl2.setText("ID");
        jPanel2.add(jl2);
        jl2.setBounds(170, 40, 10, 0);

        sn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn1ActionPerformed(evt);
            }
        });
        jPanel2.add(sn1);
        sn1.setBounds(160, 330, 280, 40);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
              
                //SimpleDateFormat sdf= new  SimpleDateFormat("yyyy-MM-dd");
               // String date=sdf.format(jc1.getDate());
                
                String name = mname.getSelectedItem().toString();
                String brand = brandbox1.getSelectedItem().toString();
                String model = model2.getSelectedItem().toString();
                String type = type1.getSelectedItem().toString();
                String  val =sn1.getText();
                String unitprice = uprice1.getText();
                String avq1 = avq.getText();
                
                
                
                
                if(unitprice.isEmpty()){
                    
                    JOptionPane.showMessageDialog(null, "UnitPrice Can Not Be Empty!", "Alert", 1);
                    sn1.setForeground(Color.red);
                    }
                else if(avq1.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Available Quantity cannot be empty!", "Alert", 1);
                    avq.setForeground(Color.red);
                }
                else if(type.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Type is cannot be empty!", "Alert", 1);
                    uprice1.setForeground(Color.red);
                }
                
                else{
               
                try{
                    
                    
                    String q = "INSERT INTO machinemg(machine,brand,model,type,quantity,unitprice,a_quantity) values ('"+name+"','"+brand+"','"+model+"','"+type+"','"+val+"','"+unitprice+"','"+avq1+"')";
                    pst=con.prepareStatement(q);
                    pst.execute();
                    
                    tableload();
                    
                 
                } catch (Exception e) {
                }
         
                
                }
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
            int x =JOptionPane.showConfirmDialog(null,"Are You Sure Want To Delete"); 
            if(x==0){
                 String id = jl2.getText();
                 
                 String sql ="DELETE FROM `machinemg` WHERE machineid='"+id+"'";
                 
                  try{
                    pst=con.prepareStatement(sql);
                    pst.execute();
                    tableload();
                }catch(Exception e){
                    
                }
                 
            
            
            
            } 
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        int x =JOptionPane.showConfirmDialog(null,"Are You Sure Want To Update");
        
        if(x==0){
                
                String id =jl2.getText();
                String name = mname.getSelectedItem().toString();
                String brand = brandbox1.getSelectedItem().toString();
                String model = model2.getSelectedItem().toString();
                String type = type1.getSelectedItem().toString();
                 String  val =sn1.getText();
                String unitprice = uprice1.getText();
                String avlq = avq.getText();
                
        
                String sql ="UPDATE machinemg SET `machine`='"+name+"',`brand`='"+brand+"',`model`='"+model+"',`type`='"+type+"',`quantity`='"+val+"',`unitprice`='"+unitprice+"',`a_quantity`='"+avlq+"' WHERE machineid ='"+id+"' ";
                try{
                    pst=con.prepareStatement(sql);
                    pst.execute();
                    tableload();
                }catch(Exception e){
                    
                }
                
                
                
        
        }
        
        
        
    }//GEN-LAST:event_update1ActionPerformed
   
    
    
    
    private void dmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmActionPerformed
       mname.setSelectedItem("Toshiba");
       brandbox1.setSelectedItem("Richo");
       model2.setSelectedItem("Samsung");
       type1.setSelectedItem("E0001");
       sn1.setText("w234442");
       uprice1.setText("Rs.15000");
       
    }//GEN-LAST:event_dmActionPerformed

    private void s1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1KeyPressed

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        int row=j1.getSelectedRow();
        DefaultTableModel mode=(DefaultTableModel)j1.getModel();
        
        String id =j1.getValueAt(row, 0).toString();
        String name =j1.getValueAt(row,1).toString();
        String brand =j1.getValueAt(row,2).toString();
        String model  =j1.getValueAt(row,3).toString();
        String type =j1.getValueAt(row,4).toString();
        String qty =j1.getValueAt(row,5).toString();
        String unitprice=j1.getValueAt(row,6).toString();
        String avq1 =j1.getValueAt(row,7).toString();
        
       
        mname.setSelectedItem(name);
        brandbox1.setSelectedItem(brand);
        model2.setSelectedItem(model);
        type1.setSelectedItem(type);
        sn1.setText(qty);
        uprice1.setText(unitprice);
        avq.setText(avq1);
        jl2.setText(id);

    }//GEN-LAST:event_j1MouseClicked

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        
    }//GEN-LAST:event_mnameActionPerformed

    private void model2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_model2ActionPerformed
        if( model2.getSelectedItem().equals("Black")){
            avq.setText("1");
          }
         if( model2.getSelectedItem().equals("White")){
             
            avq.setText("1");
       
        }
    }//GEN-LAST:event_model2ActionPerformed
         public boolean validateSerialNumber(String string){
        
        if(string.length() == 10){
            
            return true;
        }
        else{
            
            return false;
        }
    }
    private void brandbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandbox1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void uprice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uprice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uprice1ActionPerformed

    private void sn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sn1ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        String val=sn1.getText();
        try{
             
        String sql ="SELECT machineid,machine,brand,model,type,unitprice,a_quantity FROM machinemg WHERE quantity LIKE'%"+val+"%' ";
        pst =con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        j1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_j3ActionPerformed
    public static String ONE;
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField avq;
    private javax.swing.JButton b1;
    private javax.swing.JComboBox<String> brandbox1;
    private javax.swing.JButton dm;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTable j1;
    private javax.swing.JButton j3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar jc1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel machineName_txt3;
    private javax.swing.JLabel md1;
    private javax.swing.JComboBox<String> mname;
    private javax.swing.JComboBox<String> model2;
    private javax.swing.ButtonGroup paymentMethod;
    private java.awt.TextField s1;
    private java.awt.TextField sn1;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private javax.swing.JLabel tp1;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JButton update1;
    private java.awt.TextField uprice1;
    // End of variables declaration//GEN-END:variables
}
