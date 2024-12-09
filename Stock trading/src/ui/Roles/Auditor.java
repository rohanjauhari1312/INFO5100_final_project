/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Roles;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Admin.Admin;

/**
 *
 * @author hardishah
 */

public class Auditor extends javax.swing.JPanel {
    HashMap <String, Boolean> auditChecks = new HashMap<>();

    /**
     * Creates new form SecurityAdvisor
     */
    Admin admin;
    public Auditor(JPanel userProcessContainer, Admin admin, String text) {
        initComponents();
        this.admin=admin;
        txtUsername.setText(text);
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
        txtUsername = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Optima", 3, 18)); // NOI18N
        jLabel1.setText("Welcome Audior");

        jCheckBox1.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox1.setText("Tax Reporting");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox2.setText("Data encryption validation");

        jCheckBox3.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox3.setText("Penetration Testing");

        jCheckBox4.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox4.setText("Load Testing");

        jCheckBox5.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox5.setText("Price accuracy");

        jCheckBox6.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox6.setText("Latency Testing");

        jCheckBox7.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox7.setText("Transaction logs");

        jCheckBox8.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox8.setText("Ease of navigation");

        jCheckBox9.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox9.setText("Data backups");

        jCheckBox10.setFont(new java.awt.Font("Optima", 2, 14)); // NOI18N
        jCheckBox10.setText("API testing");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jButton1.setText("Send report to admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jCheckBox8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox5))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        auditChecks.put(jCheckBox1.getName(),jCheckBox1.isSelected());
        auditChecks.put(jCheckBox2.getName(),jCheckBox2.isSelected());
        auditChecks.put(jCheckBox3.getName(),jCheckBox3.isSelected());
        auditChecks.put(jCheckBox4.getName(),jCheckBox4.isSelected());
        auditChecks.put(jCheckBox5.getName(),jCheckBox5.isSelected());
        auditChecks.put(jCheckBox6.getName(),jCheckBox6.isSelected());
        auditChecks.put(jCheckBox7.getName(),jCheckBox7.isSelected());
        auditChecks.put(jCheckBox8.getName(),jCheckBox8.isSelected());
        auditChecks.put(jCheckBox9.getName(),jCheckBox9.isSelected());
        auditChecks.put(jCheckBox10.getName(),jCheckBox10.isSelected());
        admin.setAuditChecks(auditChecks);
        JOptionPane.showMessageDialog(this, "Message sent successfully to admin.");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}