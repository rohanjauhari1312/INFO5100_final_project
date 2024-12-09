/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Admin.Admin;
import Organizations.Organization;
import Organizations.OrganizationDirectory;
import javax.swing.table.DefaultTableModel;
import model.Person;
/**
 *
 * @author rohanjauhari
 */
public class StockExchange extends javax.swing.JPanel {

    /**
     * Creates new form StockExchange
     */
    String organizationName="";
    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    Admin admin;
    public StockExchange(JPanel userProcessContainer, String enterprise, OrganizationDirectory organizationDirectory, Admin admin, String adminName, Person eAdmin) {
        initComponents();
        this.admin = admin;
        txtAdminName.setText(adminName);
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        txtMsg.setText(admin.messageToSEbyBF);
        txtMsg1.setText(admin.messageToSEbyIAF);
        txtMsg2.setText(admin.messageToSEbyRB);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAdminName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        organizationRole = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        organizationNames = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        organizationAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMsg1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMsg2 = new javax.swing.JTextField();
        organizationPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Optima", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Welcome Stock Exchange enterprise admin:");

        txtAdminName.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel2.setText("Organization Name:");

        jLabel3.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel3.setText("Organization Admin:");

        organizationNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "IT Department" }));
        organizationNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationNamesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel4.setText("Organization Password:");

        jLabel5.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel5.setText("Organization Role:");

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel6.setText("You can create organization here..");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Org Name", "Org Admin", "Org Password", "Org role"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel7.setText("The following Organizations within Stock Exchange exist");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel8.setText("Message from Brokerage firm");

        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel9.setText("Message from Regulatory Body");

        jLabel10.setFont(new java.awt.Font("Optima", 3, 12)); // NOI18N
        jLabel10.setText("Message from Investment Advisory firm");

        organizationPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(232, 232, 232))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(20, 20, 20)
                                            .addComponent(jButton3)
                                            .addGap(20, 20, 20)
                                            .addComponent(jButton4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                .addComponent(organizationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(organizationNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(organizationRole, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(organizationPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAdminName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6))
                                .addGap(10, 10, 10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addContainerGap(565, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {organizationAdmin, organizationNames, organizationRole});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMsg, txtMsg1, txtMsg2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(organizationNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(organizationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(organizationPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(organizationRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate)
                        .addGap(23, 23, 23)))
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationNamesActionPerformed
        // TODO add your handling code here:
        organizationName = organizationNames.getSelectedItem().toString();
    }//GEN-LAST:event_organizationNamesActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        Person p=admin.register(organizationAdmin.getText(), organizationPassword.getText(), organizationRole.getText());
        
        if (p!=null){
            p.setEnterpriseName("Stock Exchange");
            p.setOrgName(organizationName);
            p.setDesignation("Organization Admin");
            Organization o = new Organization(organizationName, p, organizationPassword.getText(), "Organization admin "+organizationRole.getText());
            organizationDirectory.newOrganization(o);
            populateTable();
            JOptionPane.showMessageDialog(this, "Organization created!");
            organizationNames.setSelectedIndex(0);
            organizationAdmin.setText("");
            organizationPassword.setText("");
            organizationRole.setText("");
        }
        else
            JOptionPane.showMessageDialog(this, "Username exists");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this) ;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout. previous (userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTable1.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow() ;
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        Organization o = (Organization) jTable1.getValueAt(selectedRowIndex, 0);
        o.setName(jTable1.getValueAt(selectedRowIndex, 0).toString());
        o.setUsername(jTable1.getValueAt(selectedRowIndex, 1).toString());
        o.setPassword(jTable1.getValueAt(selectedRowIndex, 2).toString());
        o.setRole(jTable1.getValueAt(selectedRowIndex, 3).toString());
        Person pp = o.getPerson();
        admin.deRegister(pp);
        Person p=admin.register(jTable1.getValueAt(selectedRowIndex, 1).toString(), jTable1.getValueAt(selectedRowIndex, 2).toString(), jTable1.getValueAt(selectedRowIndex, 3).toString());
        
            p.setEnterpriseName("Stock Exchange");
            p.setOrgName(organizationName);
            p.setDesignation("Organization Admin");
            
//        pp.setUsername(jTable1.getValueAt(selectedRowIndex, 1).toString());
//        pp.setPassword(jTable1.getValueAt(selectedRowIndex, 2).toString());
//        pp.setRole(jTable1.getValueAt(selectedRowIndex, 3).toString());
        JOptionPane.showMessageDialog(this, "Updates saved.");
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow() ;
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        Organization o = (Organization) jTable1.getValueAt(selectedRowIndex, 0);
        
        Person pp = (Person ) jTable1.getValueAt(selectedRowIndex, 1);
        admin.deRegister(pp);
        organizationDirectory.selfDelete(o);
        populateTable();
        JOptionPane.showMessageDialog(this, "Organization and it's admin deleted.");
//        admin.deRegister(o);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsgActionPerformed

    private void organizationPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField organizationAdmin;
    private javax.swing.JComboBox<String> organizationNames;
    private javax.swing.JPasswordField organizationPassword;
    private javax.swing.JTextField organizationRole;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtMsg1;
    private javax.swing.JTextField txtMsg2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
    model1.setRowCount(0);
    for (Organization o: organizationDirectory.getOrganizations()) {
        Object row[] = new Object [4];
        row [0] = o;
        row [1] = o.getUsername() ;
        row[3] = o.getRole();
        row[2] = o.getPassword();
        model1. addRow (row);
}
    }
}