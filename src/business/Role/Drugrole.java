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
import ui.CARole.CAWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class Drugrole extends Role {

    public Drugrole() {
        this.type = RoleType.Drug;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Drug;
        Drugrole enterprize = null;
        return new CAWorkAreaJPanel(userProcessContainer, account, enterprize, business);
    }

}
