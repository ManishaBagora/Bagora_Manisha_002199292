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
import ui.ConsultantRole.ConsultantWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class ConsulatantRole extends Role {

    public ConsulatantRole() {
        this.type = RoleType.LabAssistant;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.LabAssistant;
        return new ConsultantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
