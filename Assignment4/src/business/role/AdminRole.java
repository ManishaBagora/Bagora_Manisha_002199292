/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.Community.Community;

import business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.adminstrative.AdminWorkAreaJPanel;


public class AdminRole extends Role{

    public AdminRole(){
        this.type = RoleType.Boston;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Community community, Business business) {
        
        return new AdminWorkAreaJPanel(userProcessContainer, Business.getInstance());
    }

    
    
}
