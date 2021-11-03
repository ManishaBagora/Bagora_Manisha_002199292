/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.adminstrative;


import buisness.Person.Person;
import business.Community.Community;
import business.Community.CommunityDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    private CommunityDirectory communityDir;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManagePersonJPanel(JPanel userProcessContainer,CommunityDirectory communityDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.communityDir = communityDir;
        
        populateOrganizationComboBox();
    }
    
    public void populateOrganizationComboBox(){
        cmbCommunityList.removeAllItems();
        
        for (Community community : communityDir.getCommunityList()){
            cmbCommunityList.addItem(community);
        }
    }
    
      private void populateTable(Community community){
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        
        model.setRowCount(0);
        
        for (Person person : community.getPersonDirectory().getPersonList()){
            Object[] row = new Object[4];
            row[0] = person.getId();
            row[1] = person.getName();
            row[2] = person.getCity();
            row[3]=person.getMobilenumber();
            
            model.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblOrganizationPicker = new javax.swing.JLabel();
        cmbCommunityList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        lblEmployeeList = new javax.swing.JLabel();
        lblOrganizationList1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        lblEmployeeName1 = new javax.swing.JLabel();
        lblEmployeeName2 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        txtmobilenumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Manage Person");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationPicker.setText("Select Community:");

        cmbCommunityList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCommunityListActionPerformed(evt);
            }
        });

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "City", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);
        if (tblPerson.getColumnModel().getColumnCount() > 0) {
            tblPerson.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblPerson.getColumnModel().getColumn(0).setMaxWidth(50);
            tblPerson.getColumnModel().getColumn(1).setResizable(false);
        }

        lblEmployeeList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmployeeList.setText("Person List:");

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationList1.setText("New Person:");

        lblEmployeeName.setText("Name:");

        btnCreateEmployee.setText("Create Person");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        lblEmployeeName1.setText("City:");

        lblEmployeeName2.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeList)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrganizationPicker)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOrganizationList1)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeName1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmployeeName)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateEmployee))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblEmployeeName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(568, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(26, 26, 26)
                .addComponent(lblEmployeeList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganizationPicker))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOrganizationList1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployeeName))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeName1)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmployeeName2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnCreateEmployee)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        
        Community community = (Community) cmbCommunityList.getSelectedItem();
        String name = txtPersonName.getText();
        String city=txtcity.getText();
        String mobilenumber=txtmobilenumber.getText();
        
        if (name.isEmpty()&&city.isEmpty()&&mobilenumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Person details cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        community.getPersonDirectory().createPerson(name,city,mobilenumber);
        txtPersonName.setText("");
        txtcity.setText("");
        txtmobilenumber.setText("");
        populateTable(community);
        
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCommunityListActionPerformed
        Community community = (Community) cmbCommunityList.getSelectedItem();
        if (community != null){
            populateTable(community);
        }
    }//GEN-LAST:event_cmbCommunityListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JComboBox cmbCommunityList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeList;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblEmployeeName1;
    private javax.swing.JLabel lblEmployeeName2;
    private javax.swing.JLabel lblOrganizationList1;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtmobilenumber;
    // End of variables declaration//GEN-END:variables
}