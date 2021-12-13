/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import ui.supplierRole.SupplierWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class SupplierRole extends Role {

    public SupplierRole() {
        this.type = RoleType.Supplier;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Supplier;
        return new SupplierWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
