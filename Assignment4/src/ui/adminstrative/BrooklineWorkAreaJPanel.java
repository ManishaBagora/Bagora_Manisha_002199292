/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.adminstrative;

import buisnesswq.TestWorkRequest;
import buisnesswq.WorkRequest;
import business.Business;
import business.Community.BrooklineCommunity;

import business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BrooklineWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private BrooklineCommunity community;
    private Business business;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public BrooklineWorkAreaJPanel(JPanel workArea, UserAccount account, BrooklineCommunity community, Business business) {
        initComponents();
        
        this.workArea = workArea;
        this.community = community;
        this.business = business;
        this.userAccount = account;
        
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tbldata.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((TestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        btnRequestTest = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Recipient", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbldata);
        if (tbldata.getColumnModel().getColumnCount() > 0) {
            tbldata.getColumnModel().getColumn(0).setResizable(false);
            tbldata.getColumnModel().getColumn(1).setResizable(false);
            tbldata.getColumnModel().getColumn(2).setResizable(false);
            tbldata.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRequestTest.setText("Request Test");
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Brookline Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRequestTest)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTitle)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRefresh))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRequestTest)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed
        
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("RequestTestJPanel", new RequestTestJPanel(workArea, userAccount, business));
        layout.next(workArea);
        
    }//GEN-LAST:event_btnRequestTestActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tbldata;
    // End of variables declaration//GEN-END:variables
}
