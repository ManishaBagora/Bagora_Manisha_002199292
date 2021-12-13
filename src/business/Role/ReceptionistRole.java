/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;

import business.Organization.Organization;
import business.Organization.ReceptionistOrganization;
import business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.Receptionist.ReceptionistJPanel;
import ui.Receptionist.xyz;

/**
 *
 * @author Manisha Bagora
 */
public class ReceptionistRole extends Role {
xyz xyz1;
    public ReceptionistRole() {
        this.type = RoleType.Receptionist;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Receptionist;
        return new ReceptionistJPanel(userProcessContainer,xyz1, account, (ReceptionistOrganization) organization, business);
    }

}
