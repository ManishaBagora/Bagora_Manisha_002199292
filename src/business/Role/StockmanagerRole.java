/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Organization.StockManagerOrganization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import ui.stockmanagerRole.StockmanagerWorkAreaJPanel;

/**
 *
 * @author Manisha Bagora
 */
public class StockmanagerRole extends Role {

    public StockmanagerRole() {
        this.type = RoleType.Stockmanager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Stockmanager;
        return new StockmanagerWorkAreaJPanel(userProcessContainer, account, (StockManagerOrganization) organization, business);
    }

}
