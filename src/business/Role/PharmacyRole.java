/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Organization.PharmacyOrganization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import ui.PharmacyRole.PharmacyWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class PharmacyRole extends Role {

    public PharmacyRole() {
        this.type = RoleType.Pharmacy;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Pharmacy;
        return new PharmacyWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization) organization, business);
    }

}
