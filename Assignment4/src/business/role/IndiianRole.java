/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.Community.Community;

import business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.adminstrative.IndiianWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class IndiianRole extends Role {

    public IndiianRole() {
        this.type = RoleType.Indiian;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Community community, Business business) {
        this.type = RoleType.Indiian;
        return new IndiianWorkAreaJPanel(userProcessContainer, account, community, business);
    }

}
