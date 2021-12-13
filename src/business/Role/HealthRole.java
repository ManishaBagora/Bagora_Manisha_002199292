/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;

import business.Enterprize.HealthEnterprize;

import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import ui.BostonWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class HealthRole extends Role {
HealthEnterprize enterprize;
    public HealthRole() {
        this.type = RoleType.Health;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Health;
        return new BostonWorkAreaJPanel(userProcessContainer, account, (HealthEnterprize) enterprize, business);
    }

}
