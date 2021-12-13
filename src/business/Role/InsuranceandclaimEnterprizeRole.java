/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Enterprize.Enterprize;
import business.Organization.Organization;
import business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.enterprize1.EnterprizeResultWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class InsuranceandclaimEnterprizeRole extends Role {

    public InsuranceandclaimEnterprizeRole() {
        this.type = RoleType.Insuranceandclaimenterprize;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Insuranceandclaimenterprize;
        Enterprize enterprize = null;
        return new EnterprizeResultWorkAreaJPanel(userProcessContainer, account, enterprize, business);
    }

}
