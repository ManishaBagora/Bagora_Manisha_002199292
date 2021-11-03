/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.adminstrative;

import buisness.Person.Person;
import business.Business;
import business.Community.Community;
import business.Patient.Patient;

import business.UserAccount.UserAccount;
import business.role.Role;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Business business;

    public ManageUserAccountJPanel(JPanel container, Business business) {
        initComponents();
        this.business = business;
        this.container = container;

        popOrganizationComboBox();
        
        Community community = (Community) cmbCommunity.getSelectedItem();
        if (community != null) {
            populatePersonComboBox(community);
            populateRoleComboBox(community);
        }

        popUserAccountsTable();
    }

    public void popOrganizationComboBox() {
        cmbCommunity.removeAllItems();

        for (Community community : business.getCommunityDirectory().getCommunityList()) {
            cmbCommunity.addItem(community);
        }
    }

    public void populatePersonComboBox(Community community) {
        cmbPerson.removeAllItems();

        for (Person person : community.getPersonDirectory().getPersonList()) {
            cmbPerson.addItem(person);
        }
    }

    private void populateRoleComboBox(Community community) {
        cmbRoles.removeAllItems();
        for (Role role : community.getSupportedRole()) {
            cmbRoles.addItem(role);
        }
    }
  

    public void popUserAccountsTable() {

        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        model.setRowCount(0);

        for (Community community : business.getCommunityDirectory().getCommunityList()) {
            for (UserAccount ua : community.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[5];
                row[0] = ua;
                row[1] = ua.getPassword();
                row[2]=ua.getSystolicbp();
                row[3]=ua.getDiastolicbp();
                row[4]=ua.getStatus();
                ((DefaultTableModel) tbl.getModel()).addRow(row);
            }
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
        tbl = new javax.swing.JTable();
        grpNewUser = new javax.swing.JPanel();
        btnCreateUser = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtvitalsign = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        cmbPerson = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox();
        lblCreateUser = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        lblPassword2 = new javax.swing.JLabel();
        txtsystolicbp = new javax.swing.JTextField();
        txtdiastolicbp = new javax.swing.JTextField();
        lblPassword3 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblUsersList = new javax.swing.JLabel();
        txtsearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encounter Date", "Vital Sign", "Systolic BP", "Diastolic BP", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(1).setResizable(false);
        }

        grpNewUser.setBackground(new java.awt.Color(255, 255, 255));

        btnCreateUser.setText("Create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        lblUserName.setText("Encounter Date");

        lblPassword.setText("Vital Sign");

        lblEmployee.setText("Person:");

        cmbPerson.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPersonActionPerformed(evt);
            }
        });

        lblOrganization.setText("Community");

        cmbCommunity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCommunityActionPerformed(evt);
            }
        });

        lblRole.setText("City:");

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCreateUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCreateUser.setText("New Patient:");

        lblPassword1.setText("Systolic BP:");

        lblPassword2.setText("Diastolic BP:");

        txtsystolicbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsystolicbpActionPerformed(evt);
            }
        });

        lblPassword3.setText("Status:");

        javax.swing.GroupLayout grpNewUserLayout = new javax.swing.GroupLayout(grpNewUser);
        grpNewUser.setLayout(grpNewUserLayout);
        grpNewUserLayout.setHorizontalGroup(
            grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpNewUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(grpNewUserLayout.createSequentialGroup()
                            .addComponent(lblOrganization)
                            .addGap(18, 18, 18)
                            .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(grpNewUserLayout.createSequentialGroup()
                            .addComponent(lblEmployee)
                            .addGap(18, 18, 18)
                            .addComponent(cmbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(grpNewUserLayout.createSequentialGroup()
                            .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserName)
                                .addComponent(lblRole)
                                .addComponent(lblPassword)
                                .addComponent(lblPassword1)
                                .addComponent(lblPassword2)
                                .addComponent(lblPassword3))
                            .addGap(18, 18, 18)
                            .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtvitalsign, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCreateUser)
                                .addComponent(txtsystolicbp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdiastolicbp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblCreateUser))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        grpNewUserLayout.setVerticalGroup(
            grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grpNewUserLayout.createSequentialGroup()
                .addComponent(lblCreateUser)
                .addGap(18, 18, 18)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganization)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(cmbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtvitalsign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(txtsystolicbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword2)
                    .addComponent(txtdiastolicbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(grpNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword3)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnCreateUser))
        );

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Encounter");

        lblUsersList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsersList.setText("Patient List:");

        txtsearch.setText("Search");
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle)
                        .addGap(208, 208, 208)
                        .addComponent(txtsearch)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsersList)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(grpNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle)
                    .addComponent(txtsearch))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblUsersList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(grpNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtUserName.getText();
        String password = txtvitalsign.getText();
        String systolicbp=txtsystolicbp.getText();
        String diastolicbp=txtdiastolicbp.getText();
        String status=txtstatus.getText();
        if (userName.isEmpty() && password.isEmpty()&& systolicbp.isEmpty()&& diastolicbp.isEmpty()&& status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Patient details cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Community community = (Community) cmbCommunity.getSelectedItem();
        Person person = (Person) cmbPerson.getSelectedItem();
        Role role = (Role) cmbRoles.getSelectedItem();

        community.getUserAccountDirectory().createUserAccount(userName, password,systolicbp,diastolicbp, person, role,status);

        popUserAccountsTable();

        JOptionPane.showMessageDialog(null, "Patient Details added successfully.");
        txtUserName.setText("");
        txtvitalsign.setText("");
        txtdiastolicbp.setText("");
        txtsystolicbp.setText("");
        txtstatus.setText("");
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCommunityActionPerformed
        Community community = (Community) cmbCommunity.getSelectedItem();
        if (community != null) {
            populatePersonComboBox(community);
            populateRoleComboBox(community);
        }
    }//GEN-LAST:event_cmbCommunityActionPerformed

    private void cmbPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPersonActionPerformed

    private void txtsystolicbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsystolicbpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsystolicbpActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        
    }//GEN-LAST:event_txtsearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JComboBox cmbCommunity;
    private javax.swing.JComboBox cmbPerson;
    private javax.swing.JComboBox cmbRoles;
    private javax.swing.JPanel grpNewUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblPassword3;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsersList;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtdiastolicbp;
    private javax.swing.JButton txtsearch;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtsystolicbp;
    private javax.swing.JTextField txtvitalsign;
    // End of variables declaration//GEN-END:variables
}