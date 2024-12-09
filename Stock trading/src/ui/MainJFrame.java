/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Organizations.OrganizationDirectory;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import enterprise.Bodies.EnterpriseDirectory;
import java.awt.CardLayout;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Person;

import ui.Admin.PersonDirectory;
import ui.Admin.Admin;
import ui.Admin.LoginAdmin;


import ui.userRoles.LoginUsers;

import ui.Admin.PasswordDirectory;
import ui.userRoles.EnterpriseAdmin;
import ui.userRoles.OrganizationAdmin;
import ui.Roles.RoleDirectory;
import ui.userRoles.RoleLogin;

/**
 *
 * @author rohanjauhari
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Admin admin;

    RoleDirectory roleDirectoryITD = new RoleDirectory();
    RoleDirectory roleDirectoryTD = new RoleDirectory();
    RoleDirectory roleDirectoryCT = new RoleDirectory();
    RoleDirectory roleDirectoryAT = new RoleDirectory();
    RoleDirectory roleDirectoryCST = new RoleDirectory();
    RoleDirectory roleDirectoryRMT = new RoleDirectory();
    
    PasswordDirectory passwords = new PasswordDirectory();
    PersonDirectory personDirectory = new PersonDirectory(passwords);
    EnterpriseDirectory enterpriseDirectory= new EnterpriseDirectory();
    OrganizationDirectory organizationDirectoryBF = new OrganizationDirectory();
    OrganizationDirectory organizationDirectoryIAF = new OrganizationDirectory();
    OrganizationDirectory organizationDirectoryRB = new OrganizationDirectory();
    OrganizationDirectory organizationDirectorySE = new OrganizationDirectory();
    public MainJFrame() throws IOException, InterruptedException {

        initComponents();
        passwords.register("admin","admin");
        Person adminPerson = new Person("admin","System Admin");
        personDirectory.newPerson(adminPerson);
        admin = new Admin(userProcessContainer,passwords,personDirectory,enterpriseDirectory);

        setSize(830,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnEnterprise = new javax.swing.JButton();
        btnOrgAdmin = new javax.swing.JButton();
        btnSystemRoles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dr. Trade");
        setBackground(new java.awt.Color(240, 240, 240));

        splitPane.setBackground(new java.awt.Color(153, 153, 255));
        splitPane.setDividerLocation(150);
        splitPane.setOpaque(false);

        controlPanel.setBackground(new java.awt.Color(153, 153, 255));

        btnAdmin.setBackground(new java.awt.Color(204, 204, 255));
        btnAdmin.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        btnAdmin.setText("System Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnUsers.setBackground(new java.awt.Color(204, 204, 255));
        btnUsers.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        btnUsers.setText("Traders");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        btnEnterprise.setBackground(new java.awt.Color(204, 204, 255));
        btnEnterprise.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        btnEnterprise.setText("Enterprise Admin");
        btnEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseActionPerformed(evt);
            }
        });

        btnOrgAdmin.setBackground(new java.awt.Color(204, 204, 255));
        btnOrgAdmin.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        btnOrgAdmin.setText("Organization Admin");
        btnOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgAdminActionPerformed(evt);
            }
        });

        btnSystemRoles.setBackground(new java.awt.Color(204, 204, 255));
        btnSystemRoles.setFont(new java.awt.Font("Optima", 1, 12)); // NOI18N
        btnSystemRoles.setText("System Roles");
        btnSystemRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemRolesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel1.setText("Who you are?");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnterprise)
                            .addComponent(btnOrgAdmin)
                            .addComponent(btnSystemRoles)
                            .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnEnterprise, btnOrgAdmin, btnSystemRoles, btnUsers});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnEnterprise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnOrgAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnSystemRoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnUsers)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setBackground(new java.awt.Color(240, 240, 240));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        LoginAdmin la = new LoginAdmin(userProcessContainer, admin, personDirectory, passwords,enterpriseDirectory);
        userProcessContainer.add("LoginAdmin",la);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        // TODO add your handling code here:
        LoginUsers lra = new LoginUsers(userProcessContainer,admin);
        userProcessContainer.add("LoginUsers",lra);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseActionPerformed
        // TODO add your handling code here:
        EnterpriseAdmin loginEAd = new EnterpriseAdmin(userProcessContainer,enterpriseDirectory,admin,organizationDirectoryBF, organizationDirectoryIAF, organizationDirectoryRB,organizationDirectorySE);
        userProcessContainer.add("EnterpriseAdmin", loginEAd);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEnterpriseActionPerformed

    private void btnOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgAdminActionPerformed
        // TODO add your handling code here:
        OrganizationAdmin loginOA = new OrganizationAdmin(userProcessContainer,roleDirectoryITD,roleDirectoryTD,roleDirectoryCT,roleDirectoryAT,roleDirectoryCST,roleDirectoryRMT,organizationDirectoryBF, organizationDirectoryIAF, organizationDirectoryRB,organizationDirectorySE, admin);
        userProcessContainer.add("OrganizationAdmin", loginOA);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrgAdminActionPerformed

    private void btnSystemRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemRolesActionPerformed
        // TODO add your handling code here:
         RoleLogin rl = new RoleLogin(userProcessContainer,roleDirectoryITD,roleDirectoryTD,roleDirectoryCT,roleDirectoryAT,roleDirectoryCST,roleDirectoryRMT, admin);
        userProcessContainer.add("RoleLogin", rl);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSystemRolesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEnterprise;
    private javax.swing.JButton btnOrgAdmin;
    private javax.swing.JButton btnSystemRoles;
    private javax.swing.JButton btnUsers;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
