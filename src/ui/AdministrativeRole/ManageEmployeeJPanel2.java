/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import business.Employee.Employee;
import business.Enterprize.Enterprize;
import business.Enterprize.EnterprizeDirectory;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manisha Bagora
 */
public class ManageEmployeeJPanel2 extends javax.swing.JPanel {

    private EnterprizeDirectory enterprizedir;
    private JPanel userProcessContainer;
    
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel2(JPanel userProcessContainer,EnterprizeDirectory enterprizedir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprizedir = enterprizedir;
        
        
        populateEnterprizeComboBox();
     
    }
    
    public void populateEnterprizeComboBox(){
        cmbEnterprizeList.removeAllItems();
        
        for (Enterprize enterprize : enterprizedir.getenterprizeList()){
            cmbEnterprizeList.addItem(enterprize);
        }
    }
   
    
      private void populateTable(Enterprize enterprize ){
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : enterprize.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }
      private void populateTable1(Enterprize enterprize ){
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : enterprize.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
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
        cmbEnterprizeList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        lblEmployeeList = new javax.swing.JLabel();
        lblOrganizationList1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lblTitle.setText("Manage Employees");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationPicker.setText("Select Enterprize:");

        cmbEnterprizeList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprizeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterprizeListActionPerformed(evt);
            }
        });

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployees);
        if (tblEmployees.getColumnModel().getColumnCount() > 0) {
            tblEmployees.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblEmployees.getColumnModel().getColumn(0).setMaxWidth(50);
            tblEmployees.getColumnModel().getColumn(1).setResizable(false);
        }

        lblEmployeeList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmployeeList.setText("Employee List:");

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationList1.setText("New Employee:");

        lblEmployeeName.setText("Name:");

        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnCreateEmployee))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrganizationList1)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmployeeName)
                        .addGap(5, 5, 5)
                        .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrganizationPicker)
                            .addComponent(lblEmployeeList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEnterprizeList, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEnterprizeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrganizationPicker))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployeeList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrganizationList1)
                            .addComponent(lblEmployeeName))
                        .addGap(41, 41, 41)
                        .addComponent(btnCreateEmployee)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        
        Enterprize enterprize = (Enterprize) cmbEnterprizeList.getSelectedItem();
        
        String name = txtEmployeeName.getText();
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        enterprize.getEmployeeDirectory().createEmployee(name);
        txtEmployeeName.setText("");
        populateTable(enterprize);
        
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbEnterprizeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterprizeListActionPerformed
        Enterprize enterprize = (Enterprize) cmbEnterprizeList.getSelectedItem();
        if (enterprize != null){
            populateTable(enterprize);
        }
    }//GEN-LAST:event_cmbEnterprizeListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JComboBox cmbEnterprizeList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeList;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblOrganizationList1;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
