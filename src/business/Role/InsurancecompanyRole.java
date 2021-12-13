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
import ui.InsuranceCompany.InsurancecompanyWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class InsurancecompanyRole extends Role {

    public InsurancecompanyRole() {
        this.type = RoleType.InsurancecompanyOrganization;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.InsurancecompanyOrganization;
        return new InsurancecompanyWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
