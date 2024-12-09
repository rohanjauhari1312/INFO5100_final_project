/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import ui.Admin.Admin;
import ui.Roles.Role;
import ui.Roles.RoleDirectory;

/**
 *
 * @author rohanjauhari
 */
public class CustomerSupportTeam extends javax.swing.JPanel {

    /**
     * Creates new form AdvisoryTeam
     */
    Admin admin;
    String roleName;
    JPanel userProcessContainer;
    RoleDirectory roleDirectory;
    public CustomerSupportTeam(JPanel userProcessContainer, String organization, RoleDirectory roleDirectory, Admin admin, String username) {
        this.admin=admin;
        this.roleDirectory = roleDirectory;
        this.userProcessContainer = userProcessContainer;
        initComponents();
                txtAdminName.setText(username);
                txtMsg.setText(admin.messageToCSObyAT);
                txtMsg1.setText(admin.messageToCSObyCT);
                txtMsg2.setText(admin.messageToCSObyITD);
                txtMsg3.setText(admin.messageToCSObyRMT);
                populateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roleTask = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        rolePassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtAdminName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roleAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roleTable = new javax.swing.JTable();
        RoleNames = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMsg1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMsg2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMsg3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel4.setText("Role Password:");

        jLabel5.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel5.setText("Role task");

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Optima", 3, 18)); // NOI18N
        jLabel1.setText("Welcome Customer support organization admin:");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtAdminName.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Optima", 3, 18)); // NOI18N
        jLabel6.setText("You can create roles here..");

        jLabel2.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel2.setText("Role Name:");

        jLabel3.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel3.setText("Role Admin:");

        roleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Role Name", "Role Admin", "Role Password", "Role task"
            }
        ));
        jScrollPane1.setViewportView(roleTable);

        RoleNames.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        RoleNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Customer Support Agent" }));
        RoleNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleNamesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel7.setText("The following Roles within Customer Support team exist");

        jLabel8.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel8.setText("Message from Advisory team");

        jLabel9.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel9.setText("Message from Compliance Team");

        jLabel10.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel10.setText("Message from IT Department");

        jLabel11.setFont(new java.awt.Font("Optima", 2, 12)); // NOI18N
        jLabel11.setText("Message from Risk Management Team");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(RoleNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roleAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(roleTask, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rolePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMsg3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMsg, txtMsg1, txtMsg2, txtMsg3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RoleNames, roleAdmin, rolePassword, roleTask});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMsg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoleNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(roleAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(roleTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(rolePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnCreate)))
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        Person p=admin.register(rolePassword.getText(), roleTask.getText(), roleAdmin.getText());
        if (p!=null){
            p.setEnterpriseName("Brokerage Firm");
            p.setOrgName("Customer Support Department");
            p.setDesignation("System Role");
            Role r = new Role("Customer Support Agent", roleAdmin.getText(),rolePassword.getText(), roleTask.getText());
            roleDirectory.newRole(r);
            populateTable();
            JOptionPane.showMessageDialog(this, "Role created!");
            RoleNames.setSelectedIndex(0);
            rolePassword.setText("");
            roleTask.setText("");
            roleAdmin.setText("");
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

    private void RoleNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleNamesActionPerformed
        roleName = RoleNames.getSelectedItem().toString();
    }//GEN-LAST:event_RoleNamesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RoleNames;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField roleAdmin;
    private javax.swing.JTextField rolePassword;
    private javax.swing.JTable roleTable;
    private javax.swing.JPasswordField roleTask;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtMsg1;
    private javax.swing.JTextField txtMsg2;
    private javax.swing.JTextField txtMsg3;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) roleTable.getModel();
    model1.setRowCount(0);
    for (Role o: roleDirectory.getRoles()) {
        Object row[] = new Object [4];
        row [0] = o.getName();
        row [1] = o.getUsername() ;
        row[3] = o.getRole();
        row[2] = o.getPassword();
        model1. addRow (row);
}
    }
}
