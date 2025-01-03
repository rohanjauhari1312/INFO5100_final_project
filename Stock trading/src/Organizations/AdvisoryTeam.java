/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Organizations;

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
 * @author tejasvenkatesh
 */
public class AdvisoryTeam extends javax.swing.JPanel {

    /**
     * Creates new form AdvisoryTeam
     */
    Person p;
    Admin admin;
    String roleName;
    JPanel userProcessContainer;
    RoleDirectory roleDirectory;
    public AdvisoryTeam(JPanel userProcessContainer, String organization, RoleDirectory roleDirectory, Admin admin, String text) {
        this.admin=admin;
        this.roleDirectory = roleDirectory;
        this.userProcessContainer = userProcessContainer;
        initComponents();
                txtAdminName.setText(text);
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

        jLabel4 = new javax.swing.JLabel();
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
        rolePassword = new javax.swing.JPasswordField();
        roleTask = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtMsg = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel4.setText("Role Password:");

        jLabel5.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel5.setText("Role task");

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Optima", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Welcome Advisory Team organization admin:");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtAdminName.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel6.setText("You can create roles here..");

        jLabel2.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel2.setText("Role Name:");

        jLabel3.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel3.setText("Role Admin:");

        roleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Role Name", "Role Admin", "Role Password", "Role task"
            }
        ));
        roleTable.setEnabled(false);
        jScrollPane1.setViewportView(roleTable);

        RoleNames.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        RoleNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Financial Advisor" }));
        RoleNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleNamesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Optima", 3, 14)); // NOI18N
        jLabel7.setText("The following Roles within Advisory team exist");

        rolePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolePasswordActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(204, 204, 204));
        btnSend.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        btnSend.setText("Send message to Customer support team");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(RoleNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rolePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleTask, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCreate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RoleNames, roleAdmin, rolePassword, roleTask});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSend, txtMsg});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnSend))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RoleNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(roleAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rolePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(20, 20, 20)
                                .addComponent(roleTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5)))))
                .addGap(20, 20, 20)
                .addComponent(btnCreate)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton3)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         p=admin.register(rolePassword.getText(), roleTask.getText(), roleAdmin.getText());
        if (p!=null){
            p.setEnterpriseName("Investment Advisory Firm");
            p.setOrgName("Advisory Team");
            p.setDesignation("System Role");
            Role r = new Role("Financial Advisor", roleAdmin.getText(),rolePassword.getText(), roleTask.getText());
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
        // TODO add your handling code here:
        roleName = RoleNames.getSelectedItem().toString();
    }//GEN-LAST:event_RoleNamesActionPerformed

    private void rolePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolePasswordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = roleTable.getSelectedRow() ;
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        Role p = (Role) roleTable.getValueAt(selectedRowIndex, 0);
//        passwords.remove(p.getUsername());
        roleDirectory.remove(p);
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        if (txtMsg.getText()==""){
            JOptionPane.showMessageDialog(this, "Empty Message");
            return;
        }
        admin.sendMessageToCSObyAT(txtMsg.getText());
        JOptionPane.showMessageDialog(this, "Message sent");
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RoleNames;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField roleAdmin;
    private javax.swing.JPasswordField rolePassword;
    private javax.swing.JTable roleTable;
    private javax.swing.JTextField roleTask;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) roleTable.getModel();
    model1.setRowCount(0);
    for (Role o: roleDirectory.getRoles()) {
        Object row[] = new Object [4];
        row [0] = o;
        row [1] = o.getUsername() ;
        row[3] = o.getRole();
        row[2] = o.getPassword();
        model1. addRow (row);
    }   
    }
}
