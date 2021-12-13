/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Organization.PatientOrganization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import ui.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class PatientRole extends Role {

    public PatientRole() {
        this.type = RoleType.Patient;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Doctor;
        return new PatientWorkAreaJPanel(userProcessContainer, account, (PatientOrganization) organization, business);
    }

}
