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
import ui.MRRole.MRWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class MRRole extends Role {

    public MRRole() {
        this.type = RoleType.MR;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.MR;
        return new MRWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
