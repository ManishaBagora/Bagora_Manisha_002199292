

package ui.adminstrative;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Business business;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        managepersonbtn = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        manageEmployeeJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        userJButton.setText("Patient");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });

        managepersonbtn.setText("Person");
        managepersonbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepersonbtnActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setText("Community");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Blood Pressure Managment System");

        manageEmployeeJButton1.setText("Patient");
        manageEmployeeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageOrganizationJButton)
                            .addComponent(userJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managepersonbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmployeeJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageOrganizationJButton, managepersonbtn, userJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addComponent(manageOrganizationJButton)
                .addGap(18, 18, 18)
                .addComponent(managepersonbtn)
                .addGap(18, 18, 18)
                .addComponent(userJButton)
                .addGap(18, 18, 18)
                .addComponent(manageEmployeeJButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void managepersonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepersonbtnActionPerformed

        ManagePersonJPanel managePersonJPanel = new ManagePersonJPanel(userProcessContainer, business.getCommunityDirectory());
        userProcessContainer.add("managePersonJPanel", managePersonJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_managepersonbtnActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageCommunityJPanel manageCommunityJPanel = new ManageCommunityJPanel(userProcessContainer, business.getCommunityDirectory());
        userProcessContainer.add("manageCommunityJPanel", manageCommunityJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButton1ActionPerformed
         ManagePatientJPanel1 managePatientJPanel1 = new ManagePatientJPanel1(userProcessContainer, business.getCommunityDirectory());
        userProcessContainer.add("managePatientJPanel1", managePatientJPanel1);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton manageEmployeeJButton1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton managepersonbtn;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
    
}
