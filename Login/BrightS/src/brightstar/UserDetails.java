package brightstar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Pasan
 */
public class UserDetails extends javax.swing.JPanel {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DatePicker DfB;
    
    public UserDetails() {
        initComponents();
        
        con = DBconnect.connect();
    
        tablelord();
    }
    
    public void tablelord()
    {
        try{
            
        String sql = "SELECT Aid,AFname,ALname,ADayofBirth,Address,Aemail,Aphone,Anic,Apass FROM admint";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        table1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch (SQLException e){
          
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nicbox = new javax.swing.JTextField();
        phonebox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idbox = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passbox = new javax.swing.JPasswordField();
        cpassbox = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lnabox1 = new javax.swing.JTextField();
        AddBox = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        nicc = new javax.swing.JLabel();
        dm1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText(" Name");

        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NIC");

        nicbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicboxActionPerformed(evt);
            }
        });
        nicbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicboxKeyReleased(evt);
            }
        });

        phonebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneboxActionPerformed(evt);
            }
        });
        phonebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneboxKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Last name");

        emailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailboxActionPerformed(evt);
            }
        });
        emailbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailboxKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Phone");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Password");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Conform Password");

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/addd.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorderPainted(false);
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

        table1.setBackground(new java.awt.Color(204, 204, 204));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FName", "LName", "DfB", "Add", "Email", "Phone", "NIC", "password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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
        table1.setRowHeight(20);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setHeaderValue("ID");
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(1).setHeaderValue("FName");
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setHeaderValue("LName");
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(3).setHeaderValue("DfB");
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(4).setHeaderValue("Add");
            table1.getColumnModel().getColumn(5).setResizable(false);
            table1.getColumnModel().getColumn(5).setHeaderValue("Email");
            table1.getColumnModel().getColumn(6).setResizable(false);
            table1.getColumnModel().getColumn(6).setHeaderValue("Phone");
            table1.getColumnModel().getColumn(7).setResizable(false);
            table1.getColumnModel().getColumn(7).setHeaderValue("NIC");
            table1.getColumnModel().getColumn(8).setResizable(false);
            table1.getColumnModel().getColumn(8).setHeaderValue("password");
        }

        jButton5.setBackground(new java.awt.Color(85, 65, 118));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/upd.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(85, 65, 118));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/dell.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Management System");
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/icons8_Exit_50px.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brightstar/images/xx (1).png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID   ::");

        idbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));

        passbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passboxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Email");

        Address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Address.setText("Address");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Date of Birth");

        lnabox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnabox1ActionPerformed(evt);
            }
        });
        lnabox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnabox1KeyReleased(evt);
            }
        });

        AddBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBoxActionPerformed(evt);
            }
        });
        AddBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddBoxKeyReleased(evt);
            }
        });

        nicc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nicc.setForeground(new java.awt.Color(204, 0, 0));

        dm1.setBackground(new java.awt.Color(102, 102, 102));
        dm1.setText("Demo");
        dm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dm1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddBox, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(nicbox)
                                    .addComponent(namebox))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(48, 48, 48))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(100, 100, 100)))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lnabox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(passbox, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                                .addComponent(emailbox))
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(phonebox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12)
                                                    .addComponent(cpassbox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Address)
                                .addGap(118, 118, 118)
                                .addComponent(jLabel13))
                            .addComponent(jLabel5)
                            .addComponent(nicc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(107, 107, 107)
                        .addComponent(dm1)
                        .addGap(200, 200, 200))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idbox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lnabox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpassbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(nicc, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void nicboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicboxActionPerformed

    private void phoneboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneboxActionPerformed

    private void emailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   
        String Fname = namebox.getText();
        String Lname = lnabox1.getText();
        Date oDate = jDateChooser1.getDate();        
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String DfB = oDateFormat.format(oDate); 
        String Add = AddBox.getText();
        String email = emailbox.getText();
        String phone = phonebox.getText();
        String nic = nicbox.getText();
        String pass = passbox.getText().toString();
        String Cpass = cpassbox.getText().toString();
        
        String type = "admin";
      
        
        
        if(Fname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "First Name ia mandotory");
        }
        else if(Lname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "last name ia mandotory");
        }
        else if(DfB.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Birthday ia mandotory");
        }
        else if(Add.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Address ia mandotory");
        }
        
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Email ia mandotory");
        }
        else if(phone.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Phone ia mandotory");
        }
        else if(nic.equals(""))
        {
            JOptionPane.showMessageDialog(null, "NIC ia mandotory");
        }
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password ia mandotory");
        }
        else if(Cpass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password ia mandotory");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Validation Success....");
        
   
        try{
             
         if (pass.equals(Cpass))
           {
               String q = "INSERT INTO admint (AFname,ALname,ADayofBirth,Address,Aemail,Aphone,Anic,Apass,type) values ('"+Fname+"','"+Lname+"','"+DfB+"','"+Add+"','"+email+"','"+phone+"','"+nic+"','"+pass+"','"+type+"')";
               pst = con.prepareStatement(q);
               pst.execute();
               tablelord();
           }
           else 
           {
               JOptionPane.showMessageDialog(jButton5, ".....Passwords are not matching.....");
           }
        }
        catch (Exception e){
            System.out.print(e);
        }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        
        int r = table1.getSelectedRow();
        
        String id = table1.getValueAt(r,0).toString();
        String Fname = table1.getValueAt(r,1).toString();
        String LName = table1.getValueAt(r,2).toString();
        String DfB = table1.getValueAt(r,3).toString();
        String Add = table1.getValueAt(r,4).toString();
        String email = table1.getValueAt(r,5).toString();
        String phone = table1.getValueAt(r,6).toString();
        String nic = table1.getValueAt(r,7).toString();
        String pass = table1.getValueAt(r,8).toString();
        
        idbox.setText(id);
        namebox.setText(Fname);
        lnabox1.setText(LName);
        jDateChooser1.setDateFormatString(DfB);
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(DfB);
        AddBox.setText(Add);
        emailbox.setText(email);
        phonebox.setText(phone);
        nicbox.setText(nic);
        passbox.setText(pass); 
    }//GEN-LAST:event_table1MouseClicked
 
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
       int x = JOptionPane.showConfirmDialog(null,"Do you really want to update");
        
       if(x==0)
       {
           String id = idbox.getText();
           String Fname = namebox.getText();
           String Lname = lnabox1.getText();
           Date oDate = jDateChooser1.getDate();        
           DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
           String DfB = oDateFormat.format(oDate);   
           String Add = AddBox.getText();
           String email = emailbox.getText();
           String phone = phonebox.getText();
           String nic = nicbox.getText();
           String pass = passbox.getText().toString();
           String cpass = cpassbox.getText().toString();
                 
           String sql = "UPDATE admint SET AFname = '"+Fname+"' ,ALname = '"+Lname+"' ,ADayofBirth = '"+DfB+"' ,Address = '"+Add+"', Aemail = '"+email+"', Aphone = '"+phone+"' , Anic = '"+nic+"', Apass = '"+pass+"'  where Aid = '"+id+"' ";
    
          
           try{
               pst = con.prepareStatement(sql);
               pst.execute();
               
                tablelord();
               
           }catch (Exception e){
               
           }
       }
       
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
      
       int x = JOptionPane.showConfirmDialog(null,"Do you want to Delete This");
        
        if(x == 0)
        {
            String id = idbox.getText();
            
            String sql = "DELETE from admint where Aid = '"+id+"'";
            
             try{
               pst = con.prepareStatement(sql);
               pst.execute();
               
               tablelord();
               
           }catch (Exception e){
               
           }
            
        }
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void emailboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailboxKeyReleased
        // TODO add your handling code here:
        
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailbox.getText());

        if (!matcher.matches()) {
            jLabel4.setText("Invalid Email");
            
        } else {
            jLabel4.setText(null);
           
        }
        
        
    }//GEN-LAST:event_emailboxKeyReleased

    private void phoneboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneboxKeyReleased
     
        Pattern pattern = Pattern.compile("^[0-9, ]+$");
        Matcher matcher = pattern.matcher(phonebox.getText());

        if (!matcher.matches() || phonebox.getText().length() != 10) {
            jLabel6.setText("Invalid Phone Number");
          
        } else {
            jLabel6.setText(null);
           
        }

    }//GEN-LAST:event_phoneboxKeyReleased

    private void passboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passboxActionPerformed

    private void lnabox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnabox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnabox1ActionPerformed

    private void lnabox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnabox1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lnabox1KeyReleased

    private void AddBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBoxActionPerformed

    private void AddBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBoxKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBoxKeyReleased

    private void nicboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicboxKeyReleased
       
    }//GEN-LAST:event_nicboxKeyReleased

    private void dm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dm1ActionPerformed
      namebox.setText("Admin");
      lnabox1.setText("tharnga");
      emailbox.setText("g@gmail.com");
      phonebox.setText("0776677338");
      AddBox.setText("yakkala");
      nicbox.setText("971413700v");
    }//GEN-LAST:event_dm1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      namebox.setText("");
      lnabox1.setText("");
      emailbox.setText("");
      phonebox.setText("");
      AddBox.setText("");
      nicbox.setText("");
      passbox.setText("");
      cpassbox.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddBox;
    private javax.swing.JLabel Address;
    private javax.swing.JPasswordField cpassbox;
    private javax.swing.JButton dm1;
    private javax.swing.JTextField emailbox;
    private javax.swing.JLabel idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnabox1;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField nicbox;
    private javax.swing.JLabel nicc;
    private javax.swing.JPasswordField passbox;
    private javax.swing.JTextField phonebox;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
